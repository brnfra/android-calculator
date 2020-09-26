package com.brnfra.brnfrancocalc;
/*
* Author: Bruno do Nascimento Franco
*
* A simple App to calc; Realize only four basic operations( + - x ÷ ) 
*
*/

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

//String number="";

String saida="";
Digit dig;
Operating make;
Outputing out;
                                      //Tag to debug
private static final String Tag = "Debug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                                     //objs
        final TextView txtRes = (TextView) findViewById(R.id.txtRes);
        Button btnZero = (Button) findViewById(R.id.btnZero);
        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnEight = (Button) findViewById(R.id.btnEight);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnDot = (Button) findViewById(R.id.btnDot);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnMulti = (Button) findViewById(R.id.btnMulti);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnAC = (Button) findViewById(R.id.btnAC);
        Button btnEquals = (Button) findViewById(R.id.btnEquals);

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
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Character n = '9';
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
            }


        });
        //DOT
         btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
            }
        });
        //AC restart
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
            saida="";
            txtRes.setText(number.getNumber());
            //make.setResult(0.0);

        });


        //A SOMA
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
            /*
                                    //is add
            functions.setOperacao(1);
                                    //portion
            int continua = functions.getContinua();
                                    // sequential operations
                                    //set type of operation
            if(functions.getOperacao() == 5){
                number.setNumber(String.valueOf(functions.getAcumulador()));
                functions.setResult(functions.getAcumulador());

                txtRes.setText(saida);
                functions.setOperacao(1);
            }
                                    //see class operations
                                    //flag Continue after click +(se vem da operação de igaldade ou click +)
            if( (functions.getContinua() == 0) & (!Objects.equals(number.getNumber(), ""))) {
                functions.setParcela(number.getNumber());
                                    //first part
                functions.setResult(functions.getParcela());
                functions.setAcumulador(functions.getParcela());
                functions.setContinua(continua+1);

                saida =out.formatOut(functions.getParcela()) ;
                                    //negative numbers
                if(functions.getResult() < 0){
                    saida = ""+ functions.getResult();
                    saida = "(" + saida + ")" + "+";
                    txtRes.setText(saida);

                }else {
                    saida = saida.concat("+");
                    txtRes.setText(saida);

                }

            }else if ((!Objects.equals(number.getNumber(),"")) && (functions.getOperacao() == 1)){
//                    Log.d(Tag,"Click soma = ");
//                    Log.d(Tag,"Number = "+number);
//                    Log.d(Tag,"parcela = "+operacoes.getParcela());
//                    Log.d(Tag,"Operacao = "+operacoes.getOperacao());
                                    //portion 2 and so on
                functions.setParcela(number.getNumber());
                functions.add();
                                        //output have a lot of digits
                if (saida.length() > 9){
                    saida = "+"+ functions.getResult();
                    txtRes.setText(saida);
                }else{
                    if(functions.getResult() < 0){
                        saida = ""+ functions.getResult();
                        saida = "(" + saida + ")" + "+";
                        txtRes.setText(saida);
                    }else {
                        saida = saida.concat("+");
                        txtRes.setText(saida);
                    }
                }
                functions.setContinua(continua+1);
            }
            number.setNumber("");
            functions.setParcela("0");*/

        });

          // A SUBTRAÇÃO
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
            /*
                                //it is SUB
            functions.setOperacao(2);

            int continua = functions.getContinua();
                                   // sequential operations
                                    //set type of operation
            if(functions.getOperacao() == 5){
                //number.setNumber("");
                number.setNumber(String.valueOf(functions.getAcumulador()));
                functions.setResult(functions.getAcumulador());
                saida =out.formatOut(functions.getParcela()) ;
                saida=saida + "-";
                txtRes.setText(saida);
                functions.setOperacao(2);
            }
                                    //see class operations
                                    //flag Continue after click +(se vem da operação de igaldade ou click +)
            if( (functions.getContinua() == 0) & (!Objects.equals(number.getNumber(), ""))) {
                functions.setParcela(number.getNumber());
                functions.setResult(functions.getParcela());
                functions.setAcumulador(functions.getParcela());
                functions.setContinua(continua+1);

                saida =out.formatOut(functions.getParcela()) ;
                                         //negative numbers
                if(functions.getResult() < 0){
                    saida = ""+ functions.getResult();
                    saida = "(" + saida + ")" + "-";
                    txtRes.setText(saida);
                }else {
                    saida = saida.concat("-");
                    txtRes.setText(saida);
                }

            }else if (!Objects.equals(number.getNumber(),"") && (functions.getOperacao() == 2)){
//debug
//Log.d(Tag,"Click sub = ");
//Log.d(Tag,"Number = "+number);
//Log.d(Tag,"parcela = "+operacoes.getParcela());
//Log.d(Tag,"Operacao = "+operacoes.getOperacao());

                functions.setParcela(number.getNumber());
                functions.subt();
                                //output have a lot of digits
                if (saida.length() > 9){
                    saida = "-"+ functions.getResult();
                    txtRes.setText(saida);
                }else{
                    if(functions.getResult() < 0){
                        saida = ""+ functions.getResult();
                        saida = "(" + saida + ")" + "-";
                        txtRes.setText(saida);
                    }else {
                        saida = saida.concat("-");
                        txtRes.setText(saida);
                    }
                }
                functions.setContinua(continua+1);
            }
            number.setNumber("");
            functions.setParcela("0");

            */


        });

        //A MULTIPLICAÇÃO
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
            /*
            int continua = functions.getContinua();
            if(functions.getOperacao() == 5){
                number.setNumber("");
                number.setNumber(String.valueOf(functions.getAcumulador()));
                functions.setResult(functions.getAcumulador());
                saida =out.formatOut(functions.getParcela()) ;
                saida=saida + "x";
                txtRes.setText(saida);
                functions.setOperacao(3);
            }
                                            //it is MULT
            functions.setOperacao(3);
                                        //see class operations
                                    //flag Continue after click +(se vem da operação de igaldade ou click +)
            if( (functions.getContinua() == 0) & (!Objects.equals(number.getNumber(), ""))) {
                 functions.setParcela(number.getNumber());
                 functions.setAcumulador(1);
                 functions.setResult(1);
                 functions.multi();
                 functions.setContinua(continua+1);
                 saida =out.formatOut(functions.getParcela()) ;

                if(functions.getResult() < 0){
                    saida = ""+ functions.getResult();
                    saida = "(" + saida + ")" + "x";
                    txtRes.setText(saida);
                }else {
                    saida = saida.concat("x");
                    txtRes.setText(saida);
                }

            }else if (!Objects.equals(number.getNumber(), "")){
                                        //pega result anterior e armazena na parcela
                functions.setParcela(number.getNumber());
                functions.multi();
                                         //output have a lot of digits
                if (saida.length() > 9){
                    saida = functions.getResult()+"x";
                    txtRes.setText(saida);
                }else{

                    if(functions.getResult() < 0){
                        saida = ""+ functions.getResult();
                        saida = "(" + saida + ")" + "x";
                        txtRes.setText(saida);
                    }else {
                        saida = saida.concat("x");
                        txtRes.setText(saida);
                    }
                }
            }
            number.setNumber("");
            functions.setParcela("0");
            */

        });

        //A DIVISÃO
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
            /*
            int continua = functions.getContinua();
            if(functions.getOperacao() == 5){
                number.setNumber("");
                number.setNumber(String.valueOf(functions.getAcumulador()));
                functions.setResult(functions.getAcumulador());
                saida =out.formatOut(functions.getParcela()) ;
                saida=saida + "÷";
                txtRes.setText(saida);
                functions.setOperacao(4);
            }
                                          //it is DIV
            functions.setOperacao(4);

                                   //see class operations
                                    //flag Continue after click +(se vem da operação de igaldade ou click +)
            if( (functions.getContinua() == 0) & (!Objects.equals(number.getNumber(), ""))) {
                functions.setParcela(number.getNumber());
                functions.setResult(functions.getParcela());
                functions.setAcumulador(functions.getParcela());
                functions.setContinua(continua+1);
                saida =out.formatOut(functions.getParcela()) ;

                if(functions.getResult() < 0){

                    saida = ""+ functions.getResult();
                    saida = "(" + saida + ")" + "÷";
                    txtRes.setText(saida);

                }else {
                   saida = saida.concat("÷");
                    txtRes.setText(saida);

                }

            }else if (!Objects.equals(number.getNumber(), "")){

                functions.setParcela(number.getNumber());
                functions.divid();
                functions.setContinua(continua+1);
                                                    //output have a lot of digits
                if (saida.length() > 9){
                    saida = functions.getResult()+"÷";
                    txtRes.setText(saida);

                }else{

                    if(functions.getResult() < 0){
                        saida = ""+ functions.getResult();
                        saida = "(" + saida + ")" + "÷";
                        txtRes.setText(saida);

                    }else {
                        saida = saida.concat("÷");
                        txtRes.setText(saida);
                    }
                }
            }
            number.setNumber("");
            functions.setParcela("0");
            */

        });

        //Equals
        btnEquals.setOnClickListener(view -> {
                                        //result must be generate when click on equals
                                        //final result of obj
                                        //filter to show
                                        //number != empty

            saida = "= " + out.formatOut(make.getResult());
            txtRes.setText(saida);
                                        //restart
                                        //save the last result to next operation, just in case
            if(Objects.equals(out.formatOut(make.getResult()), "0")){
                make.setOperacao(0);
                //make.setResult(dig.getDoubleOfNumber());

            }else{
                dig.setNumber(String.valueOf(make.getResult()));
               // make.setParcela(String.valueOf(make.getResult()));
                make.setAcumulador(make.getResult());
                //make.setOperacao(5);
                make.setResult(dig.getDoubleOfNumber());

                saida ="= " + out.formatOut(make.getResult()) ;

                txtRes.setText(saida);
            }

            dig.reset(number);
            saida="";
            make.setResult(0);

        });

    }
}
