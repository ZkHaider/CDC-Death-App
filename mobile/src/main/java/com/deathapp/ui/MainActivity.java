package com.deathapp.ui;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.deathapp.R;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.RadialPickerLayout;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity  {

    private static final int NO_OF_EDIT_TEXT = 8;
    private EditText[] mEditTexts;
    private Button mButton;
    private CheckBox mode24Hours;
    private CheckBox modeDarkTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        mEditTexts = new EditText[NO_OF_EDIT_TEXT];

        mEditTexts[0] = (EditText) findViewById(R.id.firstName);
        mEditTexts[1] = (EditText) findViewById(R.id.lastName);
        mEditTexts[2] = (EditText) findViewById(R.id.dateOfDate);
        mEditTexts[3] = (EditText) findViewById(R.id.placeOfDeath);
        mEditTexts[4] = (EditText) findViewById(R.id.causeOfDeathOne);
        mEditTexts[5] = (EditText) findViewById(R.id.causeOfDeathTwo);
        mEditTexts[6] = (EditText) findViewById(R.id.causeOfDeathThree);
        mEditTexts[7] = (EditText) findViewById(R.id.causeOfDeathFour);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
