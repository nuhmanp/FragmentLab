package com.example.nparamban2595.fragmentlab;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nparamban2595 on 7/7/2016.
 */
public class TextFragment extends Fragment{
    private static TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment,
                container, false);
        //finding textview element
        textview = (TextView) view.findViewById(R.id.textView1);

        return view;
    }
    //change text
    public void changeText(int fontsize, String text)
    {
        //set font size
        textview.setTextSize(fontsize);
        //set new text
        textview.setText(text);
    }

}