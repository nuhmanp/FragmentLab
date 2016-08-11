package com.example.nparamban2595.fragmentlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity  extends FragmentActivity implements ToolbarFragment.ToolbarListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //calling ToolbarFragment interface of onbuttonClick
    public void onButtonClick(int fontsize, String text) {


        //calling change text properties method of Text fragment
        new TextFragment().changeText(fontsize, text);
    }

}
