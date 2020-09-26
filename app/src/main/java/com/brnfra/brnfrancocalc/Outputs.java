package com.brnfra.brnfrancocalc;

import static java.lang.Math.abs;
import static java.lang.Math.floor;

public class Outputs implements Outputing {

    //show outputs and results
    public String formatOut(double number){

                            //int reach on overflow at 2^31 -1(dez dígitos calculadora chega a 12 no visor) type long - é mais adequado
                            //
                            //if number is a iteger filter to show
        long intNum;
        String show;

        try {
                                //fractino of number
            if ( abs(number) < 1e-100)  return "0";

                            // integer tratment to show above eleven digits
            if ( abs(number) > 1e+7 ){

                show = String.format("%(1.2e",number);
                return show;

            }
            if (floor(number) == number) {
                                   // res is a integer
                intNum = (long)number;
                show = Long.toString(intNum);

                if ( abs(number) > 1e+7 ) {
                    show = String.format("%(1.2e",number);

                    return show;
                }
               // show = String.format("%3E",intNum);
                return show;
            } else {
                                //number , if its not a integer

                if ( abs(number) < 1e-2) {
                    show = String.format("%1.2e",number);
                    return show;
                }else {
                    if(abs(number) > 1e+7){
                        show = String.format("%(1.2e",number);
                        return show;
                    }
                    show = Double.toString(number);

                    return show;
                }
            }
        }catch (Throwable e){


            return "E-"+e.getMessage();
        }

    }

}
