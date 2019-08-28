package com.dante.paul.dd5erandomlootgenerator;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
// Class which extends FragmentActivity that is Base class for activities that use the support
// library action bar features. Starts the app and controls tab selection.
public class LootGenerator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loot_generator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Treasure"));
        tabLayout.addTab(tabLayout.newTab().setText("Items"));
        tabLayout.addTab(tabLayout.newTab().setText("Spells"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
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
        Dice d = new Dice();
        if(d.roll(3)==1) {
            AlertDialog popup = callPremiumReminder();
            popup.show();
        }
    }
    private AlertDialog callPremiumReminder() {
        final TextView message = new TextView(this);
        final SpannableString s =
                new SpannableString(this.getText(R.string.dialog_message));
        Linkify.addLinks(s, Linkify.WEB_URLS);
        message.setText(s);
        message.setTextColor(Color.WHITE);
        message.setLinkTextColor(Color.BLUE);
        message.setMovementMethod(LinkMovementMethod.getInstance());

        return new AlertDialog.Builder(this, AlertDialog.THEME_TRADITIONAL)
                .setTitle(R.string.dialog_title)
                .setCancelable(true)
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton(R.string.dialog_action_dismiss, null)
                .setView(message)
                .create();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_loot_generator, menu);
        return true;
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

}
