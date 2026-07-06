class Calc {

    // This just have add and sub feature

    public int add(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a > b ? a - b : b - a;
    }
}

class AdvCalc extends Calc {

    // as it extends the Calc so it has all features
    // In case if it would not have extended Calc and if we would have created obj
    // for AdvCalc and called add, sub method then it would have given errors

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return b != 0 ? a / b : null;
    }
}

class VeryAdvCalc extends AdvCalc {

    /*
     * Now as it extends AdvCalc and AdvCalc extends Calc so this class has feature
     * of all 5 methods
     * In case if it would have extended just Calc for example
     * "Class VeryAdvCalc extends Calc" then it would have just add, sub and power
     * methods and would not have mult and div methods
     */

    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

public class Calculator {
    public static void main(String args[]) {

        VeryAdvCalc obj = new VeryAdvCalc();

        obj.add(5, 10);
        obj.sub(5, 6);
        obj.mult(5, 6);
        obj.div(3, 4);
        obj.power(5, 2);

        /*
        As we can see above the VeryAdvCalc has all 5 method access but it would have not if we would not have extended the features or if we would not have used inheritance
        */

    }
}