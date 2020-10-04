package com.brnfra.brnfrancocalc;
/*
* Author: Bruno do Nascimento Franco
* * A simple App to calc; Realize only four basic operations( + - x ÷ ) 
* Class with the main functionalities of calculator
*/
import android.util.Log;

import java.util.Objects;

public class Operations implements Operating {
    private double result, parcela, acumulador;
    private int operacao, continua;

    /*
    * Operations code
    * Add = 1
    * Subtract = 2
    * Multiply = 3
    * Divide =4
    * op code = 5 operation after result
    * Acumulador = save the last result 
    * continue flag = flag continue operations
    * */
    //Tag to debug
    private static final String Tag = "Debug";
    public int getContinua() {
        return continua;
    }
    public void setContinua(int continua) {
        this.continua = continua;
    }
    public double getAcumulador() {
        return acumulador;
    }
    public void setAcumulador(double acumulador) {
        this.acumulador = acumulador;
    }
    //Operation
    public int getOperacao() {
        return operacao;
    }
    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
      //RESULT
    public double getResult() {
        return result;
    }
    public void setResult(Double value){
        this.result = value;
    }
                                                   //Part
    public double getParcela() {
        return parcela;
    }
    public void setParcela(String parcela) {

        try {
             //convert string to double
            if(!parcela.equals("")) {
               this.parcela = Double.valueOf(parcela);
            }
        } catch (Throwable e) {
            e.printStackTrace();
                    //try -0xE
            // TODO SHOW HEXADECIMAL FOR INPUT ERROR
            this.parcela = -999999;
        }

    }
    //ADD
    public void add(Inputs number){
                                        //is add

                                //portion
        int continua = getContinua();
                                // sequential operations
                                //set type of operation

        if(getOperacao() == 5){
           /* number.setNumber(String.valueOf(getAcumulador()));*/
          //  number.setNumber(String.valueOf(getAcumulador()));
            setOperacao(1);
            return;
        }
        setOperacao(1);
                                //see class operations
        //flag Continue after click +(se vem da operação de igaldade ou click +)
        if( (getContinua() == 0) && (!Objects.equals(number.getNumber(), ""))) {
            setParcela(number.getNumber());
            //first part
            //setResult(getParcela());
            setAcumulador(getParcela());
            setContinua(continua+1);
            this.result = getParcela();
        }else if ((!Objects.equals(number.getNumber(),"")) && (getContinua() > 0)){
            setParcela(number.getNumber());
                                     //Parcela saved
            this.result += parcela;
            this.acumulador = this.result;
            setContinua(continua+1);
        }
        number.setNumber("");
        setParcela("0");
    }
     //SUB
    public void subt(Inputs number){
                            // sequential operations
                            //set type of operation
        if(getOperacao() == 5){
            //
            // number.setNumber(String.valueOf(getAcumulador()));
          //  setResult(getAcumulador());

            //number.setNumber(String.valueOf(getAcumulador()));

            setOperacao(2);
            //setEquals(number);
        }
        setOperacao(2);
        int continua = getContinua();
        //see class operations
        //flag Continue after click +(se vem da operação de igaldade ou click +)
        if( (continua == 0) ) {
            setParcela(number.getNumber());
            setResult(getParcela());
            setAcumulador(getParcela());
            setContinua(continua+1);
           // this.result = getParcela();
        }else if ((!Objects.equals(number.getNumber(),"")) && (getContinua() > 0)){
            setParcela(number.getNumber());
            this.result = this.result  - this.parcela;
           // this.result = this.result - getParcela();
            this.acumulador = this.result ;
                  //  Log.d(Tag,"Click subt Log = ");
                //   Log.d(Tag,"result = "+ this.result );
               //    Log.d(Tag,"parcela = "+getParcela());
                //   Log.d(Tag,"acumulador = "+this.acumulador);
            setContinua(continua+1);
        }
        number.reset(number);
        setParcela("0");

    }
    //MULTI
    public void multi(Inputs number){

        int continua = getContinua();
        if(getOperacao() == 5){
            this.result = this.acumulador;
            //number.setNumber(String.valueOf(getAcumulador()));
           // setResult(getAcumulador());
            setOperacao(3);
            //setContinua(0);
        }
        //it is MULT
        setOperacao(3);
        //see class operations
        //flag Continue after click +(se vem da operação de igaldade ou click +)
        if( (getContinua() == 0) & (!Objects.equals(number.getNumber(), ""))) {
            setParcela(number.getNumber());
            setAcumulador(1);
            this.result = getParcela()*this.acumulador;
            setContinua(continua+1);

        }else if (!Objects.equals(number.getNumber(), "")){
            //pega result anterior e armazena na parcela
            setParcela(number.getNumber());
            this.result =  this.result*getParcela();
            this.acumulador = this.result;
            setContinua(continua+1);
        }
        number.reset(number);
        setParcela("0");
    }
    //DIVID
    public void divid(Inputs number){
        int continua = getContinua();

        if(getOperacao() == 5){
            /* number.setNumber(String.valueOf(getAcumulador()));*/
            setEquals(number);
            setOperacao(4);
            return;
        }
        //it is DIV
        setOperacao(4);
        //see class operations
        //flag Continue after click +(se vem da operação de igaldade ou click +)
        if( (getContinua() == 0) & (!Objects.equals(number.getNumber(), "0"))) {
            setParcela(number.getNumber());
            setAcumulador(getParcela());
            setContinua(continua+1);
            this.result = getParcela();

        }else if (!Objects.equals(number.getNumber(), "")){
            setParcela(number.getNumber());
            try {
                //div por zero
                this.result = this.result / getParcela();
                //this.result = this.result / getParcela();
                this.acumulador = this.result ;

            }catch (Throwable e){
                this.result = 0;
            }
            setContinua(continua+1);
        }
        number.reset(number);
        setParcela("0");
    }
    //EQUALS
    public void setEquals(Inputs number) {

        switch (getOperacao()) {

            case 1:
                add(number);
                setOperacao(5);
                setContinua(1);
                break;
            case 2:
                subt(number);
                setOperacao(5);
                setContinua(1);
                break;
            case 3:
                multi(number);
                setOperacao(5);
                setContinua(1);
                break;
            case 4:
                divid(number);
                setOperacao(5);
                setContinua(1);
                break;
        }
    }
}
//                    Log.d(Tag,"Click soma = ");
//                    Log.d(Tag,"Number = "+number);
//                    Log.d(Tag,"parcela = "+operacoes.getParcela());
//                    Log.d(Tag,"Operacao = "+operacoes.getOperacao());
//portion 2 and so on