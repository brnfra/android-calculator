package com.brnfra.brnfrancocalc;
/*
* Author: Bruno do Nascimento Franco
* RU 2575362
*  App calculadora simples; Realiza as 4 operações básicas(=,+-x/)
*
* */

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
                                            //logs para debugar
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

                                                   //funções especiais e operações
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
                                                //filtrando entrada de zeros
                dotCount = operacoes.dotCounter(number);
                zeroCount = operacoes.zeroCounter(number);


                if( dotCount == 0 && zeroCount == 0){
                   // number = "";
                    number = number.concat(n);
                    saida = saida.concat(n);
                                                //limitando o tamanho do numero
                    if ( number.length() > 11){
                        number = number.substring(0,11);
                        n=number;
                    }
                }else if(dotCount == 1) {
                    number = number.concat(n);
                    saida = saida.concat(n);
                                                //limitando o tamanho do numero
                    if ( number.length() > 11){
                        number = number.substring(0,12);
                        Toast avisoCenter = Toast.makeText(getApplicationContext(),"Limite de dígitos",Toast.LENGTH_SHORT);
                        avisoCenter.setGravity(Gravity.CENTER,0,0);
                        avisoCenter.show();
                        n=number;
                    }


                }else if((!number.equals("0") & zeroCount != 0) & dotCount == 0){
                    number = number.concat("0");
                                                 //limitando o tamanho do numero
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
                                                    //limitando o tamanho do numero
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
                                                    //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
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
                        //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                            //Toast de aviso de limite numerico
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
                                                    //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                         //Toast de aviso de limite numerico
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
                        //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                            //Toast de aviso de limite numerico
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
                                                    //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                    //Toast de aviso de limite numerico
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
                                                    //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                    //Toast de aviso de limite numerico
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
                                                 //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                                                //Toast de aviso de limite numerico
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
                        //limitando o tamanho do numero
                        if ( number.length() > 11){
                            number = number.substring(0,11);
                            //Toast de aviso de limite numerico
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
                       * deve conter apenas um ponto
                      * recebe para teste a string na tela do user
                      */

                    int dotCount,zeroCount;
                                                      //proibido pre cast
                                                      //number = txtRes.getText().toString();
                                                      //contar quantas vezes "." aparece e filtrar
                dotCount = operacoes.dotCounter(number);
                zeroCount = operacoes.zeroCounter(number);
                    if(dotCount == 0){
                                                     //adiciona ponto aos primeiros digitos
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
                                                  //AC apaga characteres ou reinicializa
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number="";
                saida="";
                txtRes.setText(number);
                operacoes.setResult(0);
               // operacoes.setParcela("0");
                operacoes.setAcumulador(0);
                operacoes.setContinua(0);
                operacoes.setOperacao(0);
            }
        });

        //A SOMA
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                        //se a opcao eh SOMA apague outros sinais se houver
                if ( ( saida.endsWith("-") || saida.endsWith("x") || saida.endsWith("÷") ) && (operacoes.getOperacao() != 1)){

                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("+");
                     txtRes.setText(saida);
                }
                                        //é soma
                operacoes.setOperacao(1);
                                        //parcela
                int continua = operacoes.getContinua();
                                        //sucessivas operacoes
                                        //seta tipo de operacao
                if(operacoes.getOperacao() == 5){

                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());
                    saida =operacoes.showResult(operacoes.getParcela()) ;
                    saida=saida + "+";
                    txtRes.setText(saida);
                    operacoes.setOperacao(1);

                }
                                        //vide class operacoes
                                        //flag Continua se vem da operação de igaldade ou click +
                if( (operacoes.getContinua() == 0) & (!Objects.equals(number, ""))) {

                    operacoes.setParcela(number);

                                        //primeira parcela
                    operacoes.setResult(operacoes.getParcela());
                    operacoes.setAcumulador(operacoes.getParcela());
                    operacoes.setContinua(continua+1);

                    saida =operacoes.showResult(operacoes.getParcela()) ;
                                        //numeros negativos
                    if(operacoes.getResult() < 0){
                        saida = ""+operacoes.getResult();

                        saida = "(" + saida + ")" + "+";
                        txtRes.setText(saida);

                    }else {
                        saida = saida.concat("+");
                        txtRes.setText(saida);

                    }

                }else if (!number.equals("")){
                                        //parcela 2 em diante
                    operacoes.setParcela(number);
                    operacoes.add();

                                            //saida com muitos digitos
                    if (saida.length() > 9){
                        saida = operacoes.getResult()+"+";
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

        //{ A SUBTRAÇÃO
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                     //se a opcao eh subtrac apague outros sinais se houver
                if ( ( saida.endsWith("+") || saida.endsWith("x") || saida.endsWith("÷") ) && (operacoes.getOperacao() != 2)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("-");
                    txtRes.setText(saida);
                }
                                    //é subtracao
                operacoes.setOperacao(2);

                int continua = operacoes.getContinua();
                                    //sucessivas operacoes
                                    //vide class operacoes
                if(operacoes.getOperacao() == 5){
                    number = "";
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());
                    saida =operacoes.showResult(operacoes.getParcela()) ;
                    operacoes.setOperacao(2);
                }


                                            //vide class operacoes
                                            //flag Continua se vem da operação de igaldade ou click +
                if( (operacoes.getContinua() == 0) & (!Objects.equals(number, ""))) {
                    operacoes.setParcela(number);
                    operacoes.setResult(operacoes.getParcela());
                    operacoes.setAcumulador(operacoes.getParcela());
                    operacoes.setContinua(continua+1);

                    saida =operacoes.showResult(operacoes.getParcela()) ;
                                            //numeros negativos
                    if(operacoes.getResult() < 0){
                        saida = ""+operacoes.getResult();
                        saida = "(" + saida + ")" + "-";
                        txtRes.setText(saida);
                    }else {
                        saida = saida.concat("-");
                        txtRes.setText(saida);
                    }


                }else if (!number.equals("")){

                    operacoes.setParcela(number);
                    operacoes.subt();
                                    //saida mais l;egivel
                    if (saida.length() > 9){
                        saida = operacoes.getResult()+"-";
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


                }

                number = "";
                operacoes.setParcela("0");
            }
        });

        //A MULTIPLICAÇÃO
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                 //se a opcao eh multi apague outros sinais se houver
                if ( ( saida.endsWith("+") || saida.endsWith("-") || saida.endsWith("÷") ) && (operacoes.getOperacao() != 3)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("x");
                    txtRes.setText(saida);
                }
                                            //vide class operacoes
                int continua = operacoes.getContinua();
                if(operacoes.getOperacao() == 5){
                    number = "";
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());

                }
                operacoes.setOperacao(3);

                                            //vide class operacoes
                                         //flag Continua se vem da operação de igaldade ou click +
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
                                            //saida mais legivel
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
                                        //se a opcao eh divisao apague outros sinais se houver
                if ( ( saida.endsWith("+") || saida.endsWith("x") || saida.endsWith("-") ) && (operacoes.getOperacao() != 4)){
                    saida = saida.substring(0, saida.length() - 1);
                    saida = saida.concat("÷");
                    txtRes.setText(saida);
                }
                int continua = operacoes.getContinua();
                                         //vide class operacoes

                if(operacoes.getOperacao() == 5){
                    number = "";
                    number = String.valueOf(operacoes.getAcumulador()) ;
                    operacoes.setResult(operacoes.getAcumulador());

                }
                operacoes.setOperacao(4);

                                       //seta parcela e inicializa atributo result
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
                    //saida mais legivel
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

                                            //fornecido em cada função para o obj
                                            //resultado deve ser gerado quando clicar no igual
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

                                            //recebe valor final do obj
                                            //converte para exibir
                saida = "= "+operacoes.showResult(operacoes.getResult());
                txtRes.setText(saida);
                                            //reiniciando
                                            //guarda valor do resultado na parcela e zera result
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