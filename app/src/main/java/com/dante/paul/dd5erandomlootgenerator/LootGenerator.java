package com.dante.paul.dd5erandomlootgenerator;

import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class LootGenerator extends AppCompatActivity {
    public static boolean adVersion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO set adVersion based on in-app billing status and delete the below line
        adVersion = true;
        setContentView(R.layout.activity_loot_generator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //TODO need to test shared preferences
        setupSharedPreferences();
        //TODO need to setup internal storage to save treasure
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Treasure"));
        tabLayout.addTab(tabLayout.newTab().setText("Items"));
        tabLayout.addTab(tabLayout.newTab().setText("Spells"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount(),adVersion);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {


            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setupInternalStorage() {
        //TODO grab existing treasure sets, if they exist
        //TODO setup viewing and deleting old treasure sets (front and backend)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_loot_generator, menu);
        return true;
    }
    private void setupSharedPreferences() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("LootGenPref",MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(!sharedPreferences.contains("loaded"))
            editor.putBoolean("loaded",false);
        if(!sharedPreferences.contains("premium"))
            editor.putBoolean("premium", false);
        if(!sharedPreferences.contains("newestTreasure"))
            editor.putInt("newestTreasure",1);
        //TODO check with google for premium status
        //TODO stop table loading if loaded, so also need to save tables... maybe. Need to see if
        // this makes sense to do
        editor.commit();
    }
    public boolean about(MenuItem item){
        //handle click "about" in menu
        String aboutSummary, about;
        aboutSummary = "D&D 5e Loot Generator v1.9";
        about = "Developed by Paul Dante to help save DMs some time. \r\n \r\nPlease rate and provide feedback of how I can improve this app.\r\n \r\nIf you like the app and would like to make a donation: PayPal.Me/PDante \n" +
                " \nBackground image of scroll provided by www.myfreetextures.com";
        DialogFragment how = new GenerateAboutMessage();
        Bundle args = new Bundle();

        args.putString("about_summary", aboutSummary);
        args.putString("about", about);
        how.setArguments(args);
        how.show(getFragmentManager(), "tag");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean testLocal(){
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("LootGenPref",MODE_PRIVATE);
        return sharedPreferences.contains("loaded");
    }
}
