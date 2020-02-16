package a_module1.controlFlow;
public class ControlFlow {
//	http://www.pythontutor.com/visualize.html#mode=edit
//	show debugging
    public static void main(String[] args) {
        System.out.println("start main");
        method1();
        method2();
        method3();
        System.out.println("end main");
    }

    // access modifier
    // private - only this class can access
    // public - everyone can access
    
    
     static void method1() {
        System.out.println("enter method1");
       // System.out.newLine(); we can not call private methods from other classes
        method2();
        System.out.println("end method1");
    }

    public static void method2() {
        System.out.println("enter/end method2");
    }

    public static void method3() {
        System.out.println("enter method3");
        method1();
        System.out.println("end method3");
    }
}
