package secondPack;

//import pack.MyClass;

public class Test extends pack.MyClass {
    void show(){
        //a - не доступна так-как она приватная
        //d - не доступна так-как мы в другом пакете 
        System.out.println(b+" "+c);
    }
}
