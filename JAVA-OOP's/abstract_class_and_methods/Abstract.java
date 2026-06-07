package abstract_class_and_methods;

abstract class Base2 {
    public Base2() {
        System.out.print("Constructor of Base 2");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract void hello(); // Abstract class
}

class Base3 extends Base2 {
    void hello() { // Body of abstract
        System.out.println("Hello from base 3 for abstract class from base2");
    }
}

// abstraction using interface

interface Interface1 {
    void helloFromInterface();
}

class ExtendingInterface implements Interface1 {
    public void helloFromInterface() {
        System.out.println("hello");
    }
}

interface Interface2 extends Interface1 {
    void helloFromInterface();
}

public class Abstract {
    public static void main(String[] args) {

        // we cannot make objects of abstract classes

        // examples

        /*
         * ------------------------------------------------------------
         * WE CANNOT CREATE OBJECTS OF INTERFACES AND ABSTRACT CLASSES
         * ------------------------------------------------------------
         */

        // Base2 b2 = new Base3(); --allowed

        // Base3 b3 = new Base3(); --allowed

        // ExtendingInterface e1 =new ExtendingInterface(); --allowed

        // Interface1 i1 = new ExtendingInterface(); --allowed

        // Interface1 i1 = new Interface1(); -- error

        // Interface1 i1 = new Interface2(); --error

        // Interface2 i2 =new Interface2() ; --error

        // Base2 b2 = new Base2(); --error
    }
}