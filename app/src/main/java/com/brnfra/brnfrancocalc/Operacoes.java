package com.brnfra.brnfrancocalc;
/*
 * Author: Bruno do Nascimento Franco
 * RU 2575362
 *  App calculadora simples; Realiza as 4 operações básicas(=,+-x/)
 *  Classe com pas principais funcionalidades da calculadora
 * */
import static java.lang.Math.abs;
import static java.lang.Math.floor;

public class Operacoes {
    private double result, parcela, acumulador;
    private int operacao, continua;

    /*
    * codigo das operacoes
    * soma = 1
    * subtracao = 2
    * multiplicacao = 3
    * divisao =4
    * op = 5 operacao apos o resultado
    * Acumulador = armazena valor para proximas operacoes
    * continua = flag de operações contínuas
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
    //OPERAÇAO
    public int getOperacao() {
        return operacao;
    }
    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
      //RESULTADO
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
    //PARCELA
    public double getParcela() {
        return parcela;
    }
    public void setParcela(String parcela) {

        double par;
        try {
             //converte string para double
            if(!parcela.equals("")) {
                par = Double.valueOf(parcela);
                this.parcela = par;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            this.parcela = -999999;
        }

    }
     //ADD
    public void add(){
        double num1;
        num1 = getParcela();         //Parcela armazenada
        this.result += num1;
        this.acumulador += num1;

    }
     //SUB
    public void subt(){
        double num1, num2, num3;
        num1 = getParcela();         //Parcela armazenada
        num2 = this.result;
        num3 = this.acumulador;
        this.result = num2 - num1 ;
        this.acumulador = num3 - num1 ;
    }
    //MULTI
    public void multi(){
        double num1;
        num1 = getParcela();         //Parcela armazenada
        this.result = num1*this.result;
        this.acumulador = num1*this.acumulador;
    }
    //DIVID
    public void divid(){
        double num1, num2, num3;
        num1 = getParcela();         //Parcela armazenada
        num2 = this.result;
        num3 = this.acumulador;

                                    //tratamento
        try {
            //div por zero
            this.result = num2 / num1;
            this.acumulador = num3 / num1 ;
        }catch (Throwable e){
            this.result = 0;
           // showExceptions("Infinity");


        }
    }
    //conta pontos no numero(operacoes fracionarias)
    public int dotCounter(String numberWord){
        int count =0;
        char dot = '.';
        for(int i=0; i < numberWord.length(); i++){
            if(numberWord.charAt(i) ==  dot) count++;
        }
        return count;
    }
    //conta zeros no numero
    public int zeroCounter(String numberWord){
        int count =0;
        char zero = '0';
        for(int i=0; i < numberWord.length(); i++){
            if(numberWord.charAt(i) ==  zero) count++;
        }
        return count;
    }
    //mostra saidas e resultados
    public String showResult(double number){

                            //int chega no overflow em 2^31 -1 long -e mais adequado
                            //
                            //recebe number se number for inteiro
        long intNum;
        String show;

        try {

            if ( abs(number) < 1e-100)  return "0";

            //tratamento de inteiros acima de 11 digitos
            if ( abs(number) > 1e+11 ){
                show = String.format("%(1.3e",number);
                return show;

            }
            if (floor(number) == number) {
                // res é um inteiro
                intNum = (long)number;
                show = Long.toString(intNum);

                if ( abs(number) > 1e+10 ) {
                    show = String.format("%(1.3e",number);

                    return show;
                }
               // show = String.format("%3E",intNum);
                return show;
            } else {
                                //number caso nao seja inteiro

                if ( abs(number) < 1e-2) {
                    show = String.format("%(1.2e",number);
                    return show;
                }else {
                    show = String.format("%3.4f", number);

                    return show;
                }
            }
        }catch (Throwable e){
            //private double result, parcela, acumulador;
            //private int operacao, continua;
               operacao =0;
               continua=0;
               result=0;
               parcela =0;
               acumulador=0;

            return "E-"+e.getMessage();
        }

    }

}
