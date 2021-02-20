package interface_;

abstract class Incomplete implements FirstInterface {
    //можем не реализовывть интерфейс, это может сделать наследник данного класса
}
class Child extends Incomplete{
    //данный клас должен реализовать интерфес или быть абстрактным
    @Override
    public void callback(int params) {

    }

    @Override
    public void showStat() {

    }
}
