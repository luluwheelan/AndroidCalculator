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
    private TextView expression, result, one, two, three,
        four, five, six, seven, eight, nine, zero,
    mul, minus, dot, equal, plus, divide;
    private String input = "";//save input from user
    private Float operand1, operand2;
    private char operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUIElement();
        clearScreen();


//Number click event
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('1');
                expression.setText(input);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('2');
                expression.setText(input);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('3');
                expression.setText(input);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('4');
                expression.setText(input);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('5');
                expression.setText(input);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('6');
                expression.setText(input);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('7');
                expression.setText(input);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('8');
                expression.setText(input);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('9');
                expression.setText(input);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                input = inputString('0');
                expression.setText(input);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();

                //only one dot allowed
                if(input.contains(".")){
                    input = expression.getText().toString();
                }else {
                    //concat input string
                    input = inputString('.');
                    expression.setText(input);
                }

            }
        });

//        Operator click event
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateOperator('+');

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateOperator('-');
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateOperator('*');
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateOperator('/');
            }
        });
        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(CheckInput(input))//validate operands and operator
                {
                    //input=input+"="+String.valueOf(compute(input));
                    result.setText(String.valueOf(compute(input)));//display result
                }
                else //show error
                {
                    result.setText("Error");
                    expression.setText("");
                }
            }
        });
    }

    //if result has a value then clear everything and get ready for a new task
    public void clearScreen(){
        if(result.getText().toString().trim().length() > 0){
            expression.setText("");
            result.setText("");
            input = "";
        }
    }

    public boolean CheckInput(String input)    //validate input
    {
        if(input.length()<=2)//input length more than 2 chars
        {
            return false;
        }
        if(input.indexOf(operator, 1)==-1) //if does not have a operator, return false
        {
            return false;
        }

        if(input.endsWith(String.valueOf(operator))) //if input string ends with a operator, return false
        {
            return false;
        }
        return true;
    }

    private void setUIElement(){
        // Assign variables
        expression = findViewById(R.id.expression);
        result = findViewById(R.id.result);

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
    }

    public void validateOperator(char inputOperator){
        //if input a operator without a operand or result has value, show error
        //this application does not support continue calculate.
        //when a result presented, any number input will start a new task.
        if(input.length()<=0 || result.length()>0){
            result.setText("Error");
            expression.setText("");
        }
        else{
            operator=inputOperator;
            input = inputString(inputOperator);
            expression.setText(input);
        }
    }

    //concat input
    public String inputString(char c)
    {
        input=input+String.valueOf(c);
        return input;
    }

    //calculate and return result
    private float compute(String input){
        int indexOfOperator;
        indexOfOperator=input.indexOf(operator,1); //get index from input string
        if(input.length()>=3)
        {
            operand1=Float.parseFloat(input.substring(0, indexOfOperator));
            operand2=Float.parseFloat(input.substring(indexOfOperator + 1, input.length()));
        }
        switch (operator)
        {
            case '+':
                operand1=operand1+operand2;
                break;
            case '-':
                operand1=operand1-operand2;
                break;
            case '*':
                operand1=operand1*operand2;
                break;
            case '/':
                if(operand2!=0)
                {
                    operand1=operand1/operand2;
                }
                else
                {
                    operand1=0f;
                    result.setText("Error");
                }
                break;
            default:
                break;
        }
        return operand1;         //return result
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
