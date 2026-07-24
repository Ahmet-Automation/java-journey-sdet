package com.donau.static_keyword;

public class MyClass {

    public static int staticVar;  // "0"
    public int instanceVar;

    public static void main(String[] args) {
        System.out.println(staticVar);
      //  System.out.println(instanceVar); // // Note: Non-static field 'instanceVar' cannot be referenced directly from a static context.

       // instanceMethod ()；
        staticMethod();
    }

    public void instanceMethod() {

        System.out.println(staticVar);
        System.out.println(instanceVar);

    }

    public static void staticMethod() {

    }

}
