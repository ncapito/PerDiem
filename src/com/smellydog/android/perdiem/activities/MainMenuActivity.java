package com.smellydog.android.perdiem.activities;

import com.smellydog.android.perdiem.R;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainMenuActivity extends BaseActivity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.mainmenu);

        ListView menuList = (ListView) findViewById(R.id.main_menu_options_LV);
        
        //Get menu options...
        String[] items = getResources().getStringArray(R.array.menu_items);
        //for each menu apply the menu template
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapt);
        
        
        //Setup the transitions...
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {

                // Note: if the list was built "by hand" the id could be used.
                // As-is, though, each item has the same id

                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();

                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_today))) {
                    // Launch the Game Activity
                    startActivity(new Intent(MainMenuActivity.this, TodayActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_calendar))) {
                    // Launch the Help Activity
                    startActivity(new Intent(MainMenuActivity.this, CalendarActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    // Launch the Settings Activity
                    startActivity(new Intent(MainMenuActivity.this, SettingsActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_exit))) {
                    // Launch the Scores Activity
                		finish(); 
                }

            }
        });

    }

}
	