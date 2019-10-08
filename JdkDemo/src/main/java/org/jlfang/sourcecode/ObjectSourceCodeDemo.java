package org.jlfang.sourcecode;

import static java.lang.System.*;

/**
 * @author Cris
 * @description
 * @date 2019/8/26
 */
public class ObjectSourceCodeDemo {
    public static void main(String[] args) {

        new Outer().sayHi();

    }
}

class Outer{
    public Outer(){
        out.println("I'm Outer Class");
    }
    public void sayHi(){
        out.println(new Inner().name);
        out.println("Hi, Outer");
    }

    class  Inner{
        String name = "inner";
        public Inner(){
            out.println("I'm Inner Class");
        }
        public void sayHi(){
            out.println("Hi, Inner.");
        }
    }
}
