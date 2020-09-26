package com.brnfra.brnfrancocalc;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machnumbere (host).
 *
 * @see <a href="http://d.android.com/tools/testnumberg">Testnumberg documentation</a>
 */

public class AndroidBtnTest {
    private Inputs number;
    private Outputs res;
    private Operations make;
    private Digit dig;
    private Operating op;
    private Outputing out;

    @Before
    public void startObj() {
        this.number = new Inputs();
        this.res = new Outputs();
        this.make = new Operations();

        this.dig=number;
        this.out=res;
        this.op=make;
    }

    public void reset(){
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
        dig.reset(number);
        make.setResult(0.0);
        make.setEquals(number);
    }

    @Test
    public void btnDigitTest() {

                          //zero-nnumbere-zero
    dig.passDigit('0');
    dig.passDigit('1');
    dig.passDigit('2');
    dig.passDigit('3');
    dig.passDigit('4');
    dig.passDigit('5');
    dig.passDigit('6');
    dig.passDigit('7');
    dig.passDigit('8');
    dig.passDigit('9');
    dig.passDigit('0');
    assertEquals("1234567890",number.getNumber() );
                        //reset
    number.setNumber("0");
                            //dot test
    dig.passDigit('.');
    dig.passDigit('1');
    dig.passDigit('0');
    dig.passDigit('5');
    assertEquals("0.105",number.getNumber());

     number.setNumber("123.");
     dig.passDigit('5');
     assertEquals("123.5",number.getNumber());
                            //double dot
     number.setNumber("72");
     dig.passDigit('.');
     dig.passDigit('.');
     assertEquals("72.",number.getNumber());
        number.setNumber("0");
        //dot test
        dig.passDigit('0');
        dig.passDigit('0');
        dig.passDigit('.');
        dig.passDigit('0');
        assertEquals("0.0",number.getNumber());
    }

    @Test
    public void btnResultsTest() {
        number.setNumber("");
        assertEquals("0", out.formatOut(make.getResult()) );
        number.setNumber("0");
        assertEquals("0", out.formatOut(0) );
        number.setNumber("0.9");
        assertEquals("0.9", out.formatOut(0.9) );
        number.setNumber("0.000009");
        assertEquals("9.00e-06", out.formatOut(0.000009) );
        number.setNumber("98765432167.56");
        assertEquals("9.88e+10", out.formatOut(98765432167.56) );
        number.setNumber("987654321678");
        assertEquals("9.88e+11", out.formatOut(987654321678.0) );
    }

    @Test
    public void addTest(){
        dig.passDigit('1');
        dig.passDigit('0');
        dig.passDigit('.');
        dig.passDigit('3');
        op.add(number);
        dig.passDigit('0');
        dig.passDigit('1');
        dig.passDigit('3');
        op.add(number);
        assertEquals("23.3",out.formatOut(make.getResult()));
        reset();
        dig.reset(number);
        dig.setNumber("10");
        op.add(number);
        dig.setNumber("32");
        make.setEquals(number);
        assertEquals("42",out.formatOut(make.getResult()));
    }

    @Test
    public void subtTest(){
        dig.setNumber("103");
        op.subt(number);
        dig.passDigit('0');
        dig.passDigit('0');
        dig.passDigit('3');
        op.subt(number);
        dig.setNumber("103");
        op.subt(number);
        assertEquals(-3.0,op.getResult(),0.00001);
        reset();
        dig.reset(number);
        dig.setNumber("50");
        op.subt(number);
        assertEquals("50",out.formatOut(make.getResult()));
        dig.setNumber("32");
        make.setEquals(number);
        //assertEquals("18",out.formatOut(make.getResult()));
    }
    @Test
    public void multiTest(){

        dig.passDigit('1');
        dig.passDigit('0');
        dig.passDigit('3');
        op.multi(number);
        assertEquals("103",out.formatOut(make.getResult()));
        dig.passDigit('0');
        dig.passDigit('0');
        dig.passDigit('3');
        op.multi(number);
        assertEquals(309.0,op.getResult(),0.00001);
        reset();
        dig.reset(number);
        dig.setNumber("10");
        op.multi(number);
        dig.setNumber("32");
        make.setEquals(number);
        assertEquals("320",out.formatOut(make.getResult()));

    }
    @Test
    public void dividTest(){

        dig.passDigit('0');
        dig.passDigit('9');
        dig.passDigit('9');
        op.divid(number);
        dig.passDigit('0');
        dig.passDigit('0');
        dig.passDigit('3');
        op.divid(number);
        assertEquals(33.0, op.getResult(), 0.00001);
        reset();
        dig.reset(number);
        dig.setNumber("32");
        op.divid(number);
        dig.setNumber("10");
        make.setEquals(number);
        assertEquals("3.2",out.formatOut(make.getResult()));
    }
    
    @Test
    public void equalsTest(){
//TODO make test equals value saved to next operation
        dig.passDigit('1');         //1
        op.add(number);                //1  +
        dig.passDigit('3');         //1  +  3
        op.add(number);                //4  +
        dig.passDigit('1');         //4  -  1
        op.subt(number);               //3  -
        dig.passDigit('2');         //3  -  2
        op.multi(number);              //3  *  2
        dig.passDigit('2');         //6  *  2
        op.divid(number);              //6  /  2
        assertEquals("3",out.formatOut(make.getResult()));
        make.setAcumulador(make.getResult());
        assertEquals(3.0,make.getAcumulador(),0.0001);
        dig.setNumber(String.valueOf(make.getResult()));
        assertEquals("3.0",dig.getNumber());



    }

    @Test
    public void resetTest(){
        dig.passDigit('1');
        dig.passDigit('0');
        dig.passDigit('3');
        dig.reset(number);
        assertEquals("",number.getNumber());
    }
    @Test
    public void acTest(){
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
        make.setResult(0.0);
        assertEquals("0",out.formatOut(make.getResult()));
    }


}