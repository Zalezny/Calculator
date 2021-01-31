package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonC, buttonDot, buttonSub, buttonAdd, buttonMulti, buttonDiv, buttonEqual;

    TextView EditText;

    Float mValueOne, mValueTwo, Value, FirstReplayNumber;



    boolean mAddition, mMultiplication, mDivision, mSubtract, RestartValue, isDot,
            replayDiv, replayAdd, replaySub, replayMulti;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText = findViewById(R.id.textView);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonC = findViewById(R.id.buttonC);
        buttonDot = findViewById(R.id.buttonDot);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonEqual = findViewById(R.id.buttonEqual);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (RestartValue == true) {
                    EditText.setText("0"); //set 0 when EditText doesn't Multiplication or orders
                } else {
                    EditText.setText(EditText.getText() + "0");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }


        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("1");
                }
                else{
                    EditText.setText(EditText.getText() + "1");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("2");
                }
                else{
                    EditText.setText(EditText.getText() + "2");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("3");
                }
                else{
                    EditText.setText(EditText.getText() + "3");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("4");
                }
                else{
                    EditText.setText(EditText.getText() + "4");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("5");
                }
                else{
                    EditText.setText(EditText.getText() + "5");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("6");
                }
                else{
                    EditText.setText(EditText.getText() + "6");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("7");
                }
                else{
                    EditText.setText(EditText.getText() + "7");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("8");
                }
                else{
                    EditText.setText(EditText.getText() + "8");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (RestartValue == true) {
                    EditText.setText("9");
                }
                else{
                    EditText.setText(EditText.getText() + "9");
                }
                RestartValue = false;
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().toString().trim().length() > 0) { // EditText without String - crash
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mMultiplication = true;
                    isDot = false;
                    EditText.setText(null);
                } else { //crash Multiplication on the start without number
                    EditText.setText(null);
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDot = false;
                if (EditText.getText().toString().trim().length() > 0) {
                    if(EditText == null) {
                        EditText.setText(" ");

                    }else {
                        mValueOne = Float.parseFloat(EditText.getText() + "");
                        mAddition = true;
                        EditText.setText(null);
                    }
                } else {
                    EditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDot = false;
                if (EditText.getText().toString().trim().length() > 0) {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mSubtract = true;
                    EditText.setText(null);
                } else {
                    EditText.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDot = false;
                if (EditText.getText().toString().trim().length() > 0) {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mDivision = true;
                    EditText.setText(null);
                } else {
                    EditText.setText(null);
                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().toString().trim().length() > 0) { // check EdiText isEmpty or not (in this case is empty, so allow)
                    if (RestartValue == false) { // doesnt allow for dot after equals

                        if (isDot == false) { //check is dot on EditText? In this case isn't
                            EditText.setText(EditText.getText() + ".");
                            isDot = true; // show dot in the EditText
                        } else {
                            EditText.getText();
                        }
                    } else {
                        EditText.getText();
                    }
                }else {
                    EditText.setText(null);
                }


            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (EditText.getText().toString().trim().length() > 0) {
                    isDot = false;
                    RestartValue = true;
                    mValueTwo = Float.parseFloat(EditText.getText() + "");

                    if (replayAdd == true) {
                        FirstReplayNumber = Float.parseFloat(EditText.getText() + "");
                        EditText.setText(FirstReplayNumber + Value + "");

                    }

                    if (mAddition == true) {
                        Value = mValueTwo;
                        EditText.setText(mValueOne + mValueTwo + "");
                        mAddition = false;
                        isDot = false;
                        replayAdd = true;
                    }

                    if (replaySub == true) {
                        FirstReplayNumber = Float.parseFloat(EditText.getText() + "");
                        EditText.setText(FirstReplayNumber - Value + "");

                    }

                    if (mSubtract == true) {
                        Value = mValueTwo;
                        EditText.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                        replaySub = true;
                    }

                    if (replayMulti == true) {
                        FirstReplayNumber = Float.parseFloat(EditText.getText() + "");
                        EditText.setText(FirstReplayNumber * Value + "");

                    }

                    if (mMultiplication == true) {
                        Value = mValueTwo; //Value for replayMulti
                        EditText.setText(mValueOne * mValueTwo + "");
                        mMultiplication = false;
                        replayMulti = true;
                    }

                    if (replayDiv == true) {
                        FirstReplayNumber = Float.parseFloat(EditText.getText() + "");
                        EditText.setText(FirstReplayNumber / Value + "");

                    }
                    if (mDivision == true) {
                        Value = mValueTwo;
                        EditText.setText(mValueOne / mValueTwo + "");
                        mDivision = false;

                        replayDiv = true;
                    }


                } else {
                    EditText.getText();
                }
                }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(" ");
                replayAdd = false;
                replaySub = false;
                replayMulti = false;
                replayDiv = false;
            }
        });




    }
}