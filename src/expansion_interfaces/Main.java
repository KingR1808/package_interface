package expansion_interfaces;
interface A{
    void method1();
    void method2();
}
interface B extends A{
    void method3();
    void method4();
}
//олжен реализовать все методы по иерархии
class ITest implements B{

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method1");
    }

    @Override
    public void method3() {
        System.out.println("method1");
    }

    @Override
    public void method4() {
        System.out.println("method1");
    }
}
class ITest2 implements A{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
public class Main {
}
