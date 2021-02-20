package static_methods_inf;
interface Sinf{
    //cтатические методы не наследываются и не реализуются
    static int getNum() {
        return 0;
    }

    default void Intoduce() {
        sayHello();
    }
    //доступен только внутри интерфейса
    private void sayHello() {
        System.out.println("Hello");
    }
}

public class Main{
    public static void main(String[] args) {
        int num=Sinf.getNum();
        System.out.println(num);
    }
}
