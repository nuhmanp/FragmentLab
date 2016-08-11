package com.example.nparamban2595.fragmentlab;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * Created by nparamban2595 on 7/7/2016.
 */
public class ToolbarFragment  extends Fragment implements SeekBar.OnSeekBarChangeListener {
    //seek bar value
    private static int seekvalue = 10;
    private static EditText edittext;
    //activity call back
    ToolbarListener activityCallback;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCallback = (ToolbarListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement ToolbarListener");
        }
    }

    //interface for toolbar listener
    public interface ToolbarListener {
        public void onButtonClick(int position, String text);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.toolbar_fragment,
                container, false);
        //edit text from layout
        edittext = (EditText) view.findViewById(R.id.editText1);
        //seekbar element
        final SeekBar seekbar =
                (SeekBar) view.findViewById(R.id.seekBar1);
        //onseek bar change listener
        seekbar.setOnSeekBarChangeListener(this);
        //button 1
        final Button button =
                (Button) view.findViewById(R.id.button1);
        //onclick listener for button 1
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }
    //onbutton clicked event handling
    public void buttonClicked (View view) {
        activityCallback.onButtonClick(seekvalue,
                edittext.getText().toString());
    }


    //seekbar changes
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seekvalue = progress;

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}