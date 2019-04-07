package com.example.lu_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Declare variables
    TextView expression, result, one, two, three,
        four, five, six, seven, eight, nine, zero,
    mul, minus, dot, equal, plus, divide;
    String input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Assign variables
        expression = findViewById(R.id.expression);
        result = findViewById(R.id.result);
        expression.setText("");
        result.setText("");

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);

        mul = findViewById(R.id.mul);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        divide = findViewById(R.id.divide);

//Number click event
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + ".");
            }
        });

//        Operator click event
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clearScreen();
                input = expression.getText().toString();
                expression.setText(input + "/");
            }
        });


//        public void clearScreen(){
//            expression = expression.getText().toString();
//            if(processor.contains(developedBy)){
//                tvProcessor.setText("");
//                tvResult.setText("");
//            }
//            developedCounter = 0;
//        }

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
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
