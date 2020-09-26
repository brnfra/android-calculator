package com.brnfra.brnfrancocalc;

public interface Operating {

     void add(Inputs number);
     void subt(Inputs number);
     void multi(Inputs number);
     void divid(Inputs number);
     void setContinua(int continua);
     void setOperacao(int operacao);
     double getResult();
     void setEquals(Inputs number);
     void setAcumulador(double acumulador);
     void setParcela(String parcela);

}
