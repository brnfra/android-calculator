package com.brnfra.brnfrancocalc;

import java.util.Objects;

public class Inputs implements Digit {
    /*
     * memory
     * result
     * num1
     * num2
     * dif recebimento entre num1 e num2
     * set digits to double number
     * receive dig by dig and mount the number
     *
     * */

    private String number;

    public void setNumber(String num) {
        this.number = num;
    }

    public String getNumber() {
        return number;
    }

    //digits concat
    public void passDigit(Character num) {
        int dotCount, zeroCount;
        dotCount = 0;
        zeroCount = 0;
        // number = "";
        try {
            if (number.equals("")) {
                number = "0";
            } else {
                dotCount = dotCounter(number);
                zeroCount = zeroCounter(number);
            }
        } catch (Throwable e) {
            number = "0";
        }
        switch (num) {
            case '0':
                String n = "0";

                //zero filter
                if ((dotCount == 0) && (zeroCount == 0) && (!number.equals("0"))) {
                    // number = "";
                    number = number.concat(n);

                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                        n = number;
                    }
                } else if (dotCount == 1) {
                    number = number.concat(n);

                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 12);

                        n = number;
                    }
                    //not 0 and zero count not 0 and dot count not 0
                } else if ((!number.equals("0") & zeroCount != 0) & dotCount == 0) {
                    number = number.concat("0");
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);

                        n = number;
                    }

                }
                if (number.equals("00") || number.equals("000") || number.equals("0000")) {
                    number = "0";
                }

                break;
            case '1':
                n = "1";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //1
                break;
            case '2':
                n = "2";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //2
                break;
            case '3':
                n = "3";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //3
                break;
            case '4':
                n = "4";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //4
                break;
            case '5':
                n = "5";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //5
                break;
            case '6':
                n = "6";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //6
                break;
            case '7':
                n = "7";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //7
                break;
            case '8':
                n = "8";

                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //8
                break;
            case '9':
                n = "9";
                if (Objects.equals(number, "") || Objects.equals(number, "0")) {
                    number = n;
                } else {
                    number = number.concat(n);
                    //digits limit
                    if (number.length() > 11) {
                        number = number.substring(0, 11);
                    }
                }
                //9
                break;
            case '.':

                dotCount = dotCounter(number);
                zeroCount = zeroCounter(number);
                //proibido pre cast
                //how many times "." will show and filter it
                if (dotCount == 0) {
                    //add a dot to first digit, just in case
                    if ((zeroCount == 0) & (Objects.equals(number, ""))) {
                        number = number.concat("0.");

                    } else {
                        number = number.concat(".");

                    }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
    }

    //number dot counter (fracionaries operations)
    public int dotCounter(String numberWord) {
        int count = 0;
        char dot = '.';
        for (int i = 0; i < numberWord.length(); i++) {
            if (numberWord.charAt(i) == dot) count++;
        }
        return count;
    }

    //zero counter
    public int zeroCounter(String numberWord) {
        int count = 0;
        char zero = '0';
        for (int i = 0; i < numberWord.length(); i++) {
            if (numberWord.charAt(i) == zero) count++;
        }
        return count;
    }

    public void reset(Inputs input) {
        setNumber("");
    }

    public double getDoubleOfNumber(){
        double n = 0.0;
        try {
            if (!Objects.equals(getNumber(),"")) {
                 n = Double.valueOf(this.number);
            }else{
                n = 0.0;
            }
        }catch (Throwable e){
            return 0.0;
        }

        return n;
    }
}
