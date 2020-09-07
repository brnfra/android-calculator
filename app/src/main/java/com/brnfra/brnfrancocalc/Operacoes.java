package com.brnfra.brnfrancocalc;
/*
* Author: Bruno do Nascimento Franco
* RU 2575362
* A simple App to calc; Realize only four basic operations( + - x ÷ ) 
* Class with the main functionalities of calculator
*/
import static java.lang.Math.abs;
import static java.lang.Math.floor;

public class Operacoes {
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
    public void setResult(double result) {
        double res=getParcela();
        if(this.operacao == 0 || this.operacao == 5){
            this.result = res;
        }
        this.result = result;
    }
    //Portion
    public double getParcela() {
        return parcela;
    }
    public void setParcela(String parcela) {

        double par;
        try {
             //convert string to double
            if(!parcela.equals("")) {
                par = Double.valueOf(parcela);
                this.parcela = par;
            }
        } catch (Throwable e) {
            e.printStackTrace();
                    //try -0xE
            this.parcela = -999999;
        }

    }
     //ADD
    public void add(){
        double num1;
        num1 = getParcela();         //Parcela saved
        this.result += num1;
        this.acumulador += num1;

    }
     //SUB
    public void subt(){
        double num1, num2, num3;
        num1 = getParcela();         //Parcela saved
        num2 = this.result;
        num3 = this.acumulador;
        this.result = num2 - num1 ;
        this.acumulador = num3 - num1 ;
    }
    //MULTI
    public void multi(){
        double num1;
        num1 = getParcela();         //Parcela saved
        this.result = num1*this.result;
        this.acumulador = num1*this.acumulador;
    }
    //DIVID
    public void divid(){
        double num1, num2, num3;
        num1 = getParcela();         //Parcela saved
        num2 = this.result;
        num3 = this.acumulador;

                                    //exceptions
        try {
            //div por zero
            this.result = num2 / num1;
            this.acumulador = num3 / num1 ;
        }catch (Throwable e){
            this.result = 0;
           // showExceptions("Infinity");


        }
    }
    //number dot counter (fracionaries operations)
    public int dotCounter(String numberWord){
        int count =0;
        char dot = '.';
        for(int i=0; i < numberWord.length(); i++){
            if(numberWord.charAt(i) ==  dot) count++;
        }
        return count;
    }
    //zero counter
    public int zeroCounter(String numberWord){
        int count =0;
        char zero = '0';
        for(int i=0; i < numberWord.length(); i++){
            if(numberWord.charAt(i) ==  zero) count++;
        }
        return count;
    }
    //show outputs and results 
    public String showResult(double number){

                            //int chega no overflow em 2^31 -1(dez dígitos calculadora chega a 12 no visor) type long - é mais adequado
                            //
                            //if number is a iteger filter to show 
        long intNum;
        String show;

        try {
                                //fractino of number
            if ( abs(number) < 1e-100)  return "0";

                            // integer tratment to show above eleven digits
            if ( abs(number) > 1e+11 ){
                show = String.format("%(1.3e",number);
                return show;

            }
            if (floor(number) == number) {
                                   // res is a integer
                intNum = (long)number;
                show = Long.toString(intNum);

                if ( abs(number) > 1e+10 ) {
                    show = String.format("%(1.3e",number);

                    return show;
                }
               // show = String.format("%3E",intNum);
                return show;
            } else {
                                //number , if its not a integer

                if ( abs(number) < 1e-2) {
                    show = String.format("%(1.2e",number);
                    return show;
                }else {
                    show = String.format("%3.4f", number);

                    return show;
                }
            }
        }catch (Throwable e){
               operacao =0;
               continua=0;
               result=0;
               parcela =0;
               acumulador=0;

            return "E-"+e.getMessage();
        }

    }

}
