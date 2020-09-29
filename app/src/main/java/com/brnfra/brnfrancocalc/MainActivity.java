package com.brnfra.brnfrancocalc;
/*
* Author: Bruno do Nascimento Franco
*
* A simple App to calc; Realize only four basic operations( + - x ÷ ) 
*
*/

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private String saida="";
private Digit dig;
private Operating make;
private Outputing out;
                                      //Tag to debug
private static final String Tag = "Debug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                                     //objs
        final TextView txtRes =  findViewById(R.id.txtRes);
        final Button btnZero =  findViewById(R.id.btnZero);
        final Button btnOne =  findViewById(R.id.btnOne);
        final Button btnTwo =  findViewById(R.id.btnTwo);
        final Button btnThree =  findViewById(R.id.btnThree);
        final Button btnFour =  findViewById(R.id.btnFour);
        final Button btnFive =  findViewById(R.id.btnFive);
        final Button btnSix =  findViewById(R.id.btnSix);
        final Button btnSeven =  findViewById(R.id.btnSeven);
        final Button btnEight =  findViewById(R.id.btnEight);
        final Button btnNine =  findViewById(R.id.btnNine);
        final Button btnDot =  findViewById(R.id.btnDot);
        final Button btnAdd =  findViewById(R.id.btnAdd);
        final Button btnSub =  findViewById(R.id.btnSub);
        final Button btnMulti =  findViewById(R.id.btnMulti);
        final Button btnDiv =  findViewById(R.id.btnDiv);
        final Button btnAC =  findViewById(R.id.btnAC);
        final Button btnEquals =  findViewById(R.id.btnEquals);

                                                   //To set functions and operations
        Operations operations = new Operations();
        Inputs number = new Inputs();
        Outputs res = new Outputs();

        operations.setOperacao(0);
        operations.setContinua(0);
        //Inputs num = new Inputs();
        number.setNumber("0");
        dig = number  ;
        out = res;
        make = operations;

                                            //listeners 0-9
        btnZero.setOnClickListener(view -> {
            Character n = '0';
            dig.passDigit(n);
            saida = number.getNumber();
                                     //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);

        });
        btnOne.setOnClickListener(view -> {
            Character n = '1';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnTwo.setOnClickListener(view -> {
            Character n = '2';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnThree.setOnClickListener(view -> {
            Character n = '3';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnFour.setOnClickListener(view -> {
            Character n = '4';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnFive.setOnClickListener(view -> {
            Character n = '5';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnSix.setOnClickListener(view -> {
            Character n = '6';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnSeven.setOnClickListener(view -> {
            Character n = '7';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnEight.setOnClickListener(view -> {
            Character n = '8';
            dig.passDigit(n);
            saida = number.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        btnNine.setOnClickListener(view -> {
            Character n = '9';
            dig.passDigit(n);
            saida = dig.getNumber();
            //digits limit
            if ( saida.length() >= 10){
                saida = saida.substring(0,10);
                Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                avisoCenter.setGravity(Gravity.CENTER,0,0);
                avisoCenter.show();

            }
            txtRes.setText(saida);
        });
        //DOT
         btnDot.setOnClickListener(view -> {

             Character n = '.';
             dig.passDigit(n);
             saida = number.getNumber();
             //digits limit
             if ( saida.length() >= 10){
                 saida = saida.substring(0,10);
                 Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                 avisoCenter.setGravity(Gravity.CENTER,0,0);
                 avisoCenter.show();

             }
             txtRes.setText(saida);
         });
        //AC RESET
        btnAC.setOnClickListener(view -> {
            make.setParcela("0");
            make.setAcumulador(0.0);
            make.setContinua(0);
            make.setOperacao(0);
            dig.reset(number);
            make.add(number);
            make.subt(number);
            make.multi(number);
            make.divid(number);
            make.setParcela("0");
            make.setAcumulador(0.0);
            make.setContinua(0);
            make.setOperacao(0);
            make.setEquals(number);
            txtRes.setText(number.getNumber());

        });
        //THE ADD
        btnAdd.setOnClickListener(view -> {
                                    //if the option is ADD just erase others signals if there is
            if ( ( saida.endsWith("-") || saida.endsWith("x") || saida.endsWith("÷") ) && (operations.getOperacao() != 1)){
                saida = saida.substring(0, saida.length() - 1);
                saida = saida.concat("+");
                 txtRes.setText(saida);
            }

            make.add(number);
            saida = out.formatOut(make.getResult()) ;
            saida=saida + "+";
            txtRes.setText(saida);


        });

        // THE SUBTRACT
        btnSub.setOnClickListener(view -> {
                                              //if the option is Sub just erase others signals if there is
            if ( ( saida.endsWith("+") || saida.endsWith("x") || saida.endsWith("÷") ) && (operations.getOperacao() != 2)){
                saida = saida.substring(0, saida.length() - 1);
                saida = saida.concat("-");
                txtRes.setText(saida);
            }

            make.subt(number);
            saida = out.formatOut(make.getResult()) ;
            saida=saida + "-";
            txtRes.setText(saida);

        });

        //THE MULTIPLY
        btnMulti.setOnClickListener(view -> {
                             //if the option is Multi just erase others signals if there is
            if ( ( saida.endsWith("+") || saida.endsWith("-") || saida.endsWith("÷") ) && (operations.getOperacao() != 3)){
                saida = saida.substring(0, saida.length() - 1);
                saida = saida.concat("x");
                txtRes.setText(saida);
            }

                make.multi(number);
            saida = out.formatOut(make.getResult()) ;
            saida=saida + "x";
            txtRes.setText(saida);


        });

        //THE DIVISION
        btnDiv.setOnClickListener(view -> {
                                   //if the option is DIV just erase others signals if there is
            if ( ( saida.endsWith("+") || saida.endsWith("x") || saida.endsWith("-") ) && (operations.getOperacao() != 4)){
                saida = saida.substring(0, saida.length() - 1);
                saida = saida.concat("÷");
                txtRes.setText(saida);
            }

            make.divid(number);
            saida = out.formatOut(make.getResult()) ;
            saida=saida + "÷";
            txtRes.setText(saida);

        });

        //EQUALS AND RESULTS
        btnEquals.setOnClickListener(view -> {
                                        //result must be generate when click on equals
                                        //final result of obj
                                        //filter to show
                                        //number != empty
                                        //restart
                                        //save the last result to next operation, just in case
            make.setEquals(number);
            make.setAcumulador(make.getResult());
             saida ="= " + out.formatOut(make.getResult()) ;
              txtRes.setText(saida);
            dig.reset(number);
            saida="";

        });

    }
}
