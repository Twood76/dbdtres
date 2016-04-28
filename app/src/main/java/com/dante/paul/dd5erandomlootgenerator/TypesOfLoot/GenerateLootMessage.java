package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by PaulD on 2015-12-03.
 */
public class GenerateLootMessage extends DialogFragment {
    String lootMessage;

    public GenerateLootMessage() {
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle args = getArguments();
        lootMessage = args.getString("loot", "");
        String lootTitle = args.getString("loot_summary","");
        AlertDialog alert = new AlertDialog.Builder(getActivity())
                .setTitle(lootTitle)
                .setMessage(lootMessage)
//                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                    }
//                })
                .setPositiveButton("Copy and Dismiss", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ClipboardManager clipboardManager = (ClipboardManager) getActivity()
                                .getSystemService(Context.CLIPBOARD_SERVICE);
                        clipboardManager.setText(lootMessage);
                    }
})

                .create();
        return alert;
    }

}