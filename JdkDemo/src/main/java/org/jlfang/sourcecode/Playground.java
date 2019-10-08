package org.jlfang.sourcecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cris
 * @description
 * @date 2019/9/4
 */
public class Playground extends Yard{

    static{
        System.out.println("Hi from static block");

    }

    public Playground(){
        System.out.println("Playground");
    }

    public static void main(String[] args) {

        Playground playground = new Playground();
        System.out.println(playground.index);
        System.out.println("Hi from main method");

    }
}
