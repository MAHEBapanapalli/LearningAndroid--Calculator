package com.example.calculator_bapanapalli;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editInput;

    Button button1, button2, button3, addButton, button4, button5, button6, button7, subtractButton,
            mulButton, dotButton, clearButton, divButton, eqlButton, button8, button9, button10;

    float input1, input2;

    boolean addition;
    boolean subtraction;
    boolean division;
    boolean multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput = (EditText) findViewById(R.id.editInput);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        addButton = (Button) findViewById(R.id.addButton);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button6);
        button6 = (Button) findViewById(R.id.button7);
        subtractButton = (Button) findViewById(R.id.subtractButton);
        button7 = (Button) findViewById(R.id.button9);
        button8 = (Button) findViewById(R.id.button10);
        button9 = (Button) findViewById(R.id.button11);
        mulButton = (Button) findViewById(R.id.mulButton);
        button10 = (Button) findViewById(R.id.button13);
        dotButton = (Button) findViewById(R.id.dotButton);
        clearButton = (Button) findViewById(R.id.clearButton);
        divButton = (Button) findViewById(R.id.divButton);
        eqlButton = (Button) findViewById(R.id.eqlButton);

        //when button 1 clicked this method sets 1 in editInput
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "1");//set 1 number in edit text
            }
        });
        //when button 2 clicked this method sets 2 in editInput
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "2");//set 2 number in edit text
            }
        });
        //when button 3 clicked this method sets 3 in editInput
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "3");//set 3 number in edit text
            }
        });
        //when button 4 clicked this method sets addition to true
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Float.parseFloat(editInput.getText() + "");//set addition in edit text
                addition = true;
                editInput.setText("");
            }
        });
        //when button 4 clicked this method sets 4 in editInput
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "4");//set 4 number in edit text
            }
        });

        //when button 5 clicked this method sets 5 in editInput
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "5");//set 5 number in edit text
            }
        });
        //when button 6 clicked this method sets 6 in editInput
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "6");//set 6 number in edit text
            }
        });
        //when subtractButton  clicked this method sets subtraction to true
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Float.parseFloat(editInput.getText() + "");//set subtraction in edit text
                subtraction = true;
                editInput.setText("");
            }
        });
        //when button 7 clicked this method sets 7 in editInput
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "7");//set 7 number in edit text
            }
        });
        //when button 8 clicked this method sets 8 in editInput
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "8");//set 8 number in edit text
            }
        });
        //when button 9 clicked this method sets 9 in editInput
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "9");//set 9 number in edit text
            }
        });
        //when mulButton clicked this method sets multiplication as true
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Float.parseFloat(editInput.getText() + "");//set multiplication in edit text
                multiplication = true;
                editInput.setText("");
            }
        });
        //when button 10 clicked this method sets 0 in editInput
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + "0");//set 0 number in edit text
            }
        });
        //when dotButton clicked this method sets the dot in editInput
        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText(editInput.getText() + ".");//set dot in edit text
            }
        });
        //when clearButton clicked this method clears the editInput
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editInput.setText("");//erase everything in the editInput
            }
        });
        //when divButton clicked this method performs division operation by making division value as true
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Float.parseFloat(editInput.getText() + "");//set division in edit text
                division = true;
                editInput.setText("");
            }
        });
        //when eqlButton clicked this method performs arthimetic operation according to the user actions
        eqlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input2 = Float.parseFloat(editInput.getText() + "");
                if (addition == true) {
                    editInput.setText(input1 + input2 + "");//adding two numbers
                    addition = false;
                }
                if (subtraction == true) {
                    editInput.setText(input1 - input2 + "");//subtracting two numbers
                    subtraction = false;
                }
                if (division == true) {
                    editInput.setText(input1 / input2 + "");//dividing two numbers
                    division = false;
                }
                if (multiplication == true) {
                    editInput.setText(input1 * input2 + "");//multiplying two numbers
                    multiplication = false;
                }
            }
        });
    }
}
