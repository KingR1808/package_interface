package default_if;

public interface MyIF {
    void getNum();
    //используем ключевое слово default
    default String sayHello() {
        return "Hello";
    }
}
class Myclass implements MyIF{

    @Override
    public void getNum() {

    }
    //этот метод не обязательно переопределять
    @Override
    public String sayHello() {
        return "Hello from MyClass";
    }
}
