package com.dante.paul.dd5erandomlootgenerator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by PaulD on 2015-12-11.
 */
public class GenerateAboutMessage extends DialogFragment {
    String aboutMessage;

    public GenerateAboutMessage(){}

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle args = getArguments();
        aboutMessage = args.getString("about", "");
        String aboutTitle = args.getString("about_summary","");
        AlertDialog alert = new AlertDialog.Builder(getActivity())
                .setTitle(aboutTitle)
                .setMessage(aboutMessage)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })

                .create();
        return alert;
    }

}
