package interface_;
//если модификатор pablic не указан - интерфейс доступен только в приделе пакета
public interface FirstInterface{
    //все методы по умолчанию public
    public void callback(int params);
    void showStat();
    //все поля final,static,public
    final static public int digit=10;
}
