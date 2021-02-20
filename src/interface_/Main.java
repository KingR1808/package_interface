package interface_;

public class Main {
    public static void main(String[] args) {
        //имее доступ только к методам которіе реализуем от данного интерфейса
        FirstInterface f1=new FirstClass();
        f1.callback(5);
        //error f1.test();
    }
}
//сначала наследование потом реализация,
// можем указать интерфейсы через запятую
class FirstClass implements FirstInterface{
    @Override
    public void callback(int params) {
        System.out.println("Callback "+params);
    }
    public void test(){
        System.out.println("test");
    }

    @Override
    public void showStat() {
        System.out.println("statistic");
    }
}