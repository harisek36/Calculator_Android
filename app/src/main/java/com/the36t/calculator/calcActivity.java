package com.the36t.calculator;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calcActivity extends AppCompatActivity {


    String runningNumber = "";
    String leftValue = "";
    String rightValue = "";
    Operations currentOPeration;
    int result = 0;

    public enum Operations {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, EQUAL
    }

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);


        Button oneButton = (Button) findViewById(R.id.oneButton);
        Button twoButton = (Button) findViewById(R.id.twoButton);
        Button threeButton = (Button) findViewById(R.id.threeButton);
        Button fourButton = (Button) findViewById(R.id.fourButton);
        Button fiveButton = (Button) findViewById(R.id.fiveButton);
        Button sixButton = (Button) findViewById(R.id.sixButton);
        Button sevenButton = (Button) findViewById(R.id.sevenButton);
        Button eightButton = (Button) findViewById(R.id.eightButton);
        Button nineButton = (Button) findViewById(R.id.nineButton);
        Button zeroButton = (Button) findViewById(R.id.zeroButton);
        Button dotButton = (Button) findViewById(R.id.dotButton);
        Button clearButton = (Button) findViewById(R.id.clearButton);
        Button addButton = (Button) findViewById(R.id.addButton);
        Button subButton = (Button) findViewById(R.id.subtractButton);
        Button mulButton = (Button) findViewById(R.id.multiplyButton);
        Button divButton = (Button) findViewById(R.id.divideButton);
        Button equalButton = (Button) findViewById(R.id.equalButton);

        resultView = (TextView) findViewById(R.id.answer);


        resultView.setText("");

        //setting up onclick listner

        oneButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
                                             numberPressed(1);

                                         }
                                     }
        );
        twoButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
                                             numberPressed(2);
                                         }
                                     }
        );
        threeButton.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                                               numberPressed(3);
                                           }
                                       }
        );
        fourButton.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
                                              numberPressed(4);
                                          }
                                      }
        );
        fiveButton.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
                                              numberPressed(5);
                                          }
                                      }
        );
        sixButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
                                             numberPressed(6);
                                         }
                                     }
        );
        sevenButton.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                                               numberPressed(7);
                                           }
                                       }
        );
        eightButton.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                                               numberPressed(8);
                                           }
                                       }
        );
        nineButton.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
                                              numberPressed(9);
                                          }
                                      }
        );
        zeroButton.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View v) {
                                              numberPressed(0);
                                          }
                                      }
        );
        addButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
                        processOperation(Operations.ADD);
                                         }
                                     }
        );
        subButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
processOperation(Operations.SUBTRACT);
                                         }
                                     }
        );
        mulButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
processOperation(Operations.MULTIPLY);
                                         }
                                     }
        );
        divButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {
processOperation(Operations.DIVIDE);
                                         }
                                     }
        );
        dotButton.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                         }
                                     }
        );
        clearButton.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                                               leftValue = "";
                                               rightValue= "";
                                                result = 0;
                                               runningNumber = "0";
                                               currentOPeration = null;
                                               resultView.setText(runningNumber);
                                           }
                                       }
        );
        equalButton.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                    processOperation(Operations.EQUAL);
                                           }
                                       }
        );

    }
        void numberPressed(int number){
        runningNumber += String.valueOf(number);
        resultView.setText(runningNumber);
        }

        void processOperation(Operations operations){

            if(currentOPeration != null){
                if(runningNumber != ""){
                    rightValue = runningNumber;
                    runningNumber = "";
                    switch(currentOPeration){
                        case ADD:
                            result = Integer.parseInt(leftValue) + Integer.parseInt(rightValue);
                            break;
                        case SUBTRACT:
                            result = Integer.parseInt(leftValue) - Integer.parseInt(rightValue);
                            break;
                        case MULTIPLY:
                            result = Integer.parseInt(leftValue) * Integer.parseInt(rightValue);
                            break;
                        case DIVIDE:
                            result = Integer.parseInt(leftValue) / Integer.parseInt(rightValue);
                            break;
                    }

                    leftValue = String.valueOf(result);
                    resultView.setText(leftValue);
                }
            }else{
                leftValue = runningNumber;
                runningNumber = "";
            }
            currentOPeration = operations;
        }
    }


