package org.jlfang.sourcecode;

/**
 * @author Cris
 * @description
 * @date 2019/9/29
 */
public class Yard {

    public int index = 1;

    static{
        System.out.println("Hi from Yard static block");

    }

    Yard(){
        index++;
        System.out.println("Yard");

    }

}
