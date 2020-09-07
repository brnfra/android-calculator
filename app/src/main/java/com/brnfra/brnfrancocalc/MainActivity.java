package com.brnfra.brnfrancocalc;
/*
* Author: Bruno do Nascimento Franco
* RU 2575362
* A simple App to calc; Realize only four basic operations( + - x ÷ ) 
*
*/

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

String number="";
String saida="";
                                            //Tag to debug
private static final String Tag = "Leituras";
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
        final Operacoes operacoes = new Operacoes();
        operacoes.setOperacao(0);
        operacoes.setContinua(0);

                                           //listeners
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "0";
                if(Objects.equals(number, ""))number=n;
                int  dotCount, zeroCount=0;
                                                //zero filter
                dotCount = operacoes.dotCounter(number);
                zeroCount = operacoes.zeroCounter(number);


                if( dotCount == 0 && zeroCount == 0){
                   // number = "";
                    number = number.concat(n);
                    saida = saida.concat(n);
                                                //digits limit
                    if ( number.length() > 11){
                        number = number.substring(0,11);
                        n=number;
                    }
                }else if(dotCount == 1) {
                    number = number.concat(n);
                    saida = saida.concat(n);
                                                //digits limit
                    if ( number.length() > 11){
                        number = number.substring(0,12);
                        Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                        avisoCenter.setGravity(Gravity.CENTER,0,0);
                        avisoCenter.show();
                        n=number;
                    }


                }else if((!number.equals("0") & zeroCount != 0) & dotCount == 0){
                    number = number.concat("0");
                                                 //digits limit
                    if ( number.length() > 11){
                        number = number.substring(0,11);
                        Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                        avisoCenter.setGravity(Gravity.CENTER,0,0);
                        avisoCenter.show();
                        n=number;
                    }

                    saida = saida.concat(n);
                }

                //0

                txtRes.setText(saida);

            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = "1";
                if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                    //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //1
                saida = saida.concat(n);
                txtRes.setText(saida);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "2";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                          //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                            //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //2
                saida = saida.concat(n);
                txtRes.setText(saida);

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "3";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                         //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                          //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //3
                saida = saida.concat(n);
                txtRes.setText(saida);

            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "4";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                     //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                         //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                 //4
                saida = saida.concat(n);
                txtRes.setText(saida);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "5";
                if (operacoes.getParcela() == 0 & operacoes.getOperacao() != 0 & Objects.equals(number, "") ){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                            //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                             //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //5
                saida = saida.concat(n);
                txtRes.setText(saida);

            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "6";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                     //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                     //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //6
                saida = saida.concat(n);
                txtRes.setText(saida);

            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "7";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(Objects.equals(number, "")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                     //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                      //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //7
                saida = saida.concat(n);
                txtRes.setText(saida);

            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = "8";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;

                }else{
                    if(number.equals("")){
                        number=n;

                    }else{
                        number = number.concat(n);
                                                             //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                              //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }

                    }

                }
                //8
                saida = saida.concat(n);
                txtRes.setText(saida);

            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = "9";
                 if (operacoes.getContinua() == 0 & operacoes.getOperacao() != 0){
                    number=n;
                }else if(Objects.equals(number, "")){
                        number=n;


                    }else{
                        number = number.concat(n);
                                                          //digits limit
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                            //advise to digit limit (Toast)
                            Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                            avisoCenter.setGravity(Gravity.CENTER,0,0);
                            avisoCenter.show();
                        }


                    }
                //Nine
                saida = saida.concat(n);
                txtRes.setText(saida);

            }


        });
        //DOT
         btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                      /*
                       * it must have only one dot
                      *
                      */

                    int dotCount,zeroCount;
                                                      //proibido pre cast
                                                      //number = txtRes.getText().toString();
                                                      //how many times "." will show and filter it
                dotCount = operacoes.dotCounter(number);
                zeroCount = operacoes.zeroCounter(number);
                    if(dotCount == 0){
                                                     //add a dot to first digit, just in case
                        if((zeroCount == 0) & (Objects.equals(number, ""))) {
                            number = number.concat("0.");
                            saida = saida.concat(number);


                        }else{
                            number = number.concat(".");
                            saida = saida.concat(number);

                        }
                    }
                txtRes.setText(saida);
            }
        });
                                                  //AC restart
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number="";
                saida="";
                txtRes.setText(number);
                operacoes.setResult(0);
                operacoes.setParcela("0");
                operacoes.setAcumulador(0);
                operacoes.setContinua(0);
                operacoes.setOperacao(0);
            }
        });

        //A SOMA
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                        //if the option is ADD just erase others signals if there is 
                if ( ( saida.endsWith("-") || saida.endsWith("x") || saida.endsWith("÷") ) && (operacoes.getOperacao() != 1)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("+");
                     txtRes.setText(saida);
                }
                                        //is add
                operacoes.setOperacao(1);
                                        //portion
                int continua = operacoes.getContinua();
                                        // sequential operations
                                        //set type of operation 
                if(operacoes.getOperacao() == 5){
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());
                    saida =operacoes.showResult(operacoes.getParcela()) ;
                    saida=saida + "+";
                    txtRes.setText(saida);
                    operacoes.setOperacao(1);
                }
                                        //see class operations
                                        //flag Continue after click +(se vem da operação de igaldade ou click +)
                if( (operacoes.getContinua() == 0) & (!Objects.equals(number, ""))) {
                    operacoes.setParcela(number);
                                        //first part
                    operacoes.setResult(operacoes.getParcela());
                    operacoes.setAcumulador(operacoes.getParcela());
                    operacoes.setContinua(continua+1);

                    saida =operacoes.showResult(operacoes.getParcela()) ;
                                        //negative numbers
                    if(operacoes.getResult() < 0){
                        saida = ""+operacoes.getResult();
                        saida = "(" + saida + ")" + "+";
                        txtRes.setText(saida);

                    }else {
                        saida = saida.concat("+");
                        txtRes.setText(saida);

                    }

                }else if ((!number.equals("")) && (operacoes.getOperacao() == 1)){
//                    Log.d(Tag,"Click soma = ");
//                    Log.d(Tag,"Number = "+number);
//                    Log.d(Tag,"parcela = "+operacoes.getParcela());
//                    Log.d(Tag,"Operacao = "+operacoes.getOperacao());
                                        //portion 2 and so on
                    operacoes.setParcela(number);
                    operacoes.add();
                                            //output have a lot of digits
                    if (saida.length() > 9){
                        saida = "+"+operacoes.getResult();
                        txtRes.setText(saida);
                    }else{
                        if(operacoes.getResult() < 0){
                            saida = ""+operacoes.getResult();
                            saida = "(" + saida + ")" + "+";
                            txtRes.setText(saida);
                        }else {
                            saida = saida.concat("+");
                            txtRes.setText(saida);
                        }
                    }
                    operacoes.setContinua(continua+1);
                }
                number = "";
                operacoes.setParcela("0");
            }
        });

          // A SUBTRAÇÃO
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                                  //if the option is Sub just erase others signals if there is 
                if ( ( saida.endsWith("+") || saida.endsWith("x") || saida.endsWith("÷") ) && (operacoes.getOperacao() != 2)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("-");
                    txtRes.setText(saida);
                }
                                    //it is SUB
                operacoes.setOperacao(2);

                int continua = operacoes.getContinua();
                                       // sequential operations
                                        //set type of operation 
                if(operacoes.getOperacao() == 5){
                    //number = "";
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());
                    saida =operacoes.showResult(operacoes.getParcela()) ;
                    saida=saida + "-";
                    txtRes.setText(saida);
                    operacoes.setOperacao(2);
                }
                                        //see class operations
                                        //flag Continue after click +(se vem da operação de igaldade ou click +)
                if( (operacoes.getContinua() == 0) & (!Objects.equals(number, ""))) {
                    operacoes.setParcela(number);
                    operacoes.setResult(operacoes.getParcela());
                    operacoes.setAcumulador(operacoes.getParcela());
                    operacoes.setContinua(continua+1);

                    saida =operacoes.showResult(operacoes.getParcela()) ;
                                             //negative numbers
                    if(operacoes.getResult() < 0){
                        saida = ""+operacoes.getResult();
                        saida = "(" + saida + ")" + "-";
                        txtRes.setText(saida);
                    }else {
                        saida = saida.concat("-");
                        txtRes.setText(saida);
                    }


                }else if (!number.equals("") && (operacoes.getOperacao() == 2)){
//debug
//Log.d(Tag,"Click sub = ");
//Log.d(Tag,"Number = "+number);
//Log.d(Tag,"parcela = "+operacoes.getParcela());
//Log.d(Tag,"Operacao = "+operacoes.getOperacao());

                    operacoes.setParcela(number);
                    operacoes.subt();
                                    //output have a lot of digits
                    if (saida.length() > 9){
                        saida = "-"+operacoes.getResult();
                        txtRes.setText(saida);
                    }else{
                        if(operacoes.getResult() < 0){
                            saida = ""+operacoes.getResult();
                            saida = "(" + saida + ")" + "-";
                            txtRes.setText(saida);
                        }else {
                            saida = saida.concat("-");
                            txtRes.setText(saida);
                        }
                    }
                    operacoes.setContinua(continua+1);
                }
                number = "";
                operacoes.setParcela("0");
            }
        });

        //A MULTIPLICAÇÃO
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                 //if the option is Multi just erase others signals if there is 
                if ( ( saida.endsWith("+") || saida.endsWith("-") || saida.endsWith("÷") ) && (operacoes.getOperacao() != 3)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("x");
                    txtRes.setText(saida);
                }
                                            
                int continua = operacoes.getContinua();
                if(operacoes.getOperacao() == 5){
                    number = "";
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());
                    saida =operacoes.showResult(operacoes.getParcela()) ;
                    saida=saida + "x";
                    txtRes.setText(saida);
                    operacoes.setOperacao(3);
                }
                                                //it is MULT
                operacoes.setOperacao(3);
                                            //see class operations
                                        //flag Continue after click +(se vem da operação de igaldade ou click +)
                if( (operacoes.getContinua() == 0) & (!Objects.equals(number, ""))) {
                     operacoes.setParcela(number);
                     operacoes.setAcumulador(1);
                     operacoes.setResult(1);
                     operacoes.multi();
                     operacoes.setContinua(continua+1);
                     saida =operacoes.showResult(operacoes.getParcela()) ;

                    if(operacoes.getResult() < 0){
                        saida = ""+operacoes.getResult();
                        saida = "(" + saida + ")" + "x";
                        txtRes.setText(saida);
                    }else {
                        saida = saida.concat("x");
                        txtRes.setText(saida);
                    }

                }else if (!Objects.equals(number, "")){
                                            //pega result anterior e armazena na parcela
                    operacoes.setParcela(number);
                    operacoes.multi();
                                             //output have a lot of digits
                    if (saida.length() > 9){
                        saida = operacoes.getResult()+"x";
                        txtRes.setText(saida);
                    }else{

                        if(operacoes.getResult() < 0){
                            saida = ""+operacoes.getResult();
                            saida = "(" + saida + ")" + "x";
                            txtRes.setText(saida);
                        }else {
                            saida = saida.concat("x");
                            txtRes.setText(saida);
                        }
                    }
                }
                number = "";
                operacoes.setParcela("0");
            }
        });
        //A DIVISÃO
        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                                       //if the option is DIV just erase others signals if there is 
                if ( ( saida.endsWith("+") || saida.endsWith("x") || saida.endsWith("-") ) && (operacoes.getOperacao() != 4)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("÷");
                    txtRes.setText(saida);
                }
              
                int continua = operacoes.getContinua();
                if(operacoes.getOperacao() == 5){
                    number = "";
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());
                    saida =operacoes.showResult(operacoes.getParcela()) ;
                    saida=saida + "÷";
                    txtRes.setText(saida);
                    operacoes.setOperacao(4);
                }
                                              //it is DIV
                operacoes.setOperacao(4);

                                       //see class operations
                                        //flag Continue after click +(se vem da operação de igaldade ou click +)
                if( (operacoes.getContinua() == 0) & (!Objects.equals(number, ""))) {
                    operacoes.setParcela(number);
                    operacoes.setResult(operacoes.getParcela());
                    operacoes.setAcumulador(operacoes.getParcela());
                    operacoes.setContinua(continua+1);
                    saida =operacoes.showResult(operacoes.getParcela()) ;

                    if(operacoes.getResult() < 0){

                        saida = ""+operacoes.getResult();
                        saida = "(" + saida + ")" + "÷";
                        txtRes.setText(saida);

                    }else {
                       saida = saida.concat("÷");
                        txtRes.setText(saida);

                    }

                }else if (!Objects.equals(number, "")){

                    operacoes.setParcela(number);
                    operacoes.divid();
                    operacoes.setContinua(continua+1);
                                                        //output have a lot of digits
                    if (saida.length() > 9){
                        saida = operacoes.getResult()+"÷";
                        txtRes.setText(saida);

                    }else{

                        if(operacoes.getResult() < 0){
                            saida = ""+operacoes.getResult();
                            saida = "(" + saida + ")" + "÷";
                            txtRes.setText(saida);

                        }else {
                            saida = saida.concat("÷");
                            txtRes.setText(saida);
                        }
                    }
                }
                number = "";
                operacoes.setParcela("0");
            }
        });

        //Equals
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                            //result must be generate when click on equals 
                switch (operacoes.getOperacao()) {
                    case 0:

                        operacoes.setOperacao(0);
                        operacoes.setContinua(0);

                        break;

                    case 1:

                        if (operacoes.getContinua() >= 2) {
                            operacoes.setParcela(number);
                            operacoes.add();
                            operacoes.setContinua(0);

                        } else {
                            operacoes.setParcela(number);
                            operacoes.add();
                            operacoes.setContinua(0);
                        }

                        break;
                    case 2:
                        if (operacoes.getContinua() >= 2) {
                            operacoes.setParcela(number);
                            operacoes.subt();
                            operacoes.setContinua(2);

                        } else {
                            operacoes.setParcela(number);
                            operacoes.subt();
                            operacoes.setContinua(0);
                        }
                        break;
                    case 3:
                        if (operacoes.getContinua() >= 2) {
                            operacoes.setParcela(number);
                            operacoes.multi();
                            operacoes.setContinua(2);

                        } else {
                            operacoes.setParcela(number);
                            operacoes.multi();
                            operacoes.setContinua(0);
                        }

                        break;
                    case 4:
                        if (operacoes.getContinua() >= 2) {
                            operacoes.setParcela(number);
                            operacoes.divid();
                            operacoes.setContinua(2);

                        } else {
                            operacoes.setParcela(number);
                            operacoes.divid();
                            operacoes.setContinua(0);
                        }
                        break;

                }

                                            // final result of obj
                                            //filter to show
                saida = "= "+operacoes.showResult(operacoes.getResult());
                txtRes.setText(saida);
                                            //restart
                                            //save the last result to next operation, just in case
                if(number.equals("")){
                    operacoes.setOperacao(0);
                }else{
                    operacoes.setParcela(String.valueOf(operacoes.getResult()));
                    operacoes.setAcumulador(operacoes.getResult());
                    operacoes.setOperacao(5);
                }
                number="";
                saida="";
                operacoes.setResult(0);

            }
        });

    }
}
