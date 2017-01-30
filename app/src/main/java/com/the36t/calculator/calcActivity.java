package com.the36t.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calcActivity extends AppCompatActivity {

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

        TextView resultView = (TextView)findViewById(R.id.answer);

        //setting up onclick listner

        oneButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

            }
        }
        );
        twoButton.setOnClickListener(new View.OnClickListener(){

                                          @Override
                                          public void onClick(View v){

                                          }
                                      }
        );
        threeButton.setOnClickListener(new View.OnClickListener(){

                                           @Override
                                           public void onClick(View v){

                                           }
                                       }
        );
        fourButton.setOnClickListener(new View.OnClickListener(){

                                          @Override
                                          public void onClick(View v){

                                          }
                                      }
        );
        fiveButton.setOnClickListener(new View.OnClickListener(){

                                          @Override
                                          public void onClick(View v){

                                          }
                                      }
        );
        sixButton.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){

                                         }
                                     }
        );
        sevenButton.setOnClickListener(new View.OnClickListener(){

                                           @Override
                                           public void onClick(View v){

                                           }
                                       }
        );
        eightButton.setOnClickListener(new View.OnClickListener(){

                                           @Override
                                           public void onClick(View v){

                                           }
                                       }
        );
        nineButton.setOnClickListener(new View.OnClickListener(){

                                          @Override
                                          public void onClick(View v){

                                          }
                                      }
        );
        zeroButton.setOnClickListener(new View.OnClickListener(){

                                          @Override
                                          public void onClick(View v){

                                          }
                                      }
        );
        addButton.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){

                                         }
                                     }
        );
        subButton.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){

                                         }
                                     }
        );
        mulButton.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){

                                         }
                                     }
        );
        divButton.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){

                                         }
                                     }
        );
        dotButton.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){

                                         }
                                     }
        );
        clearButton.setOnClickListener(new View.OnClickListener(){

                                           @Override
                                           public void onClick(View v){

                                           }
                                       }
        );
        equalButton.setOnClickListener(new View.OnClickListener(){

                                           @Override
                                           public void onClick(View v){

                                           }
                                       }
        );
    }
}
