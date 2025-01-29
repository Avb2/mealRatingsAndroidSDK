package com.example.contractorcalculator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class RateMealDialog extends DialogFragment  {
    public int id;

    public RateMealDialog(int id) {
        this.id = id;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        String[] ratings = {"1", "2", "3", "4", "5"};

        return new AlertDialog.Builder(getActivity())
                .setTitle("Rate Meal")
                .setItems(ratings, (dialog, which) -> {
                    TextView txt = getActivity().findViewById(this.id);
                    txt.setText(ratings[which]);
                })
                .create();
    }

}
