package com.oackcliffsoftworks.fiveradiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup mRadioGroups;
    RadioButton mRadioButton;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadioGroups = findViewById(R.id.RadioGroupL);

        mTextView = findViewById(R.id.selectionTextView);

        mRadioGroups.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mRadioButton= mRadioGroups.findViewById(checkedId);

                boolean checked = (mRadioButton).isChecked();


                switch (checkedId) {
                    case R.id.Radio1:
                        if (checked)
                            mTextView.setText(R.string.tRadio1);
                        break;
                    case R.id.Radio2:
                        if (checked)
                            mTextView.setText(R.string.tRadio2);
                        break;
                    case R.id.Radio3:
                        if (checked)
                            mTextView.setText(R.string.tRadio3);
                        break;
                    case R.id.Radio4:
                        if (checked)
                            mTextView.setText(R.string.tRadio4);
                        break;
                }
            }


        });
    }


}
