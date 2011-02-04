package com.smellydog.android.perdiem;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;

public class PerDiem extends Activity
{
	TableLayout table;
	Button viewButton;
	Button createButton;
	Button updateButton;
	Button exitButton;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        table = (TableLayout) findViewById(R.id.Table);
        viewButton = (Button) findViewById(R.id.ViewButton);
        createButton = (Button) findViewById(R.id.CreateButton);
        updateButton = (Button) findViewById(R.id.UpdateButton);
        exitButton = (Button) findViewById(R.id.ExitButton);
    }
}
