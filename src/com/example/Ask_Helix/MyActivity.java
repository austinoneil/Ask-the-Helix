package com.example.Ask_Helix;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println("Done with onCreate.");
    }

    public void action(View view)
    {
        EditText editText=(EditText) findViewById(R.id.editText);
        String message="";
        String input = editText.getText().toString();
        if(input.toLowerCase().contains("democracy".trim()))
        {
            message="Democracy=Domecracy.";
        }
        else if(input.toLowerCase().contains("anarchy".trim()))
        {
            message="Anarchy is the only way (unless you're in the Safari Zone.)";
        }
        else if(input.toLowerCase().contains("dome".trim()))
        {
            message="The dome sucks.  LONG LIVE THE HELIX!";
        }
        else
        {
            message=selectMessage();
        }
        TextView textView = (TextView)this.findViewById(R.id.textView);
        textView.setText(message);
    }

    public String selectMessage()
    {
        Random r = new Random();
        String[] stringSet={
            "Definitely",
            "Definitely not",
            "Probably",
            "Probably not",
            "Yes",
            "No",
            "Ask again"
        };
        return stringSet[r.nextInt(stringSet.length)];
    }
}
