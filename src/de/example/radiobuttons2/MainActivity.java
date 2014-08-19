package de.example.radiobuttons2;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	private boolean android = false;
	private boolean appleios = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkradiobutton();
    }


    private void checkradiobutton() {
		RadioGroup rg = (RadioGroup)findViewById(R.id.radiogroup);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton1);
				RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton2);
				if (rb1.isChecked()== true) {
					android = true;
					appleios = false;
					Toast.makeText(getApplicationContext(), "Android angeklickt", Toast.LENGTH_LONG).show();
				} else if (rb2.isChecked()== true) {
					android = false;
					appleios = true;
					Toast.makeText(getApplicationContext(), "Apple iOS", Toast.LENGTH_LONG).show();
				}
			}
		});
		
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
