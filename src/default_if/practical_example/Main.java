package default_if.practical_example;

public class Main {
    public static void main(String[] args) {
        FixedStack fixedStack=new FixedStack(5);
        //не имеем доступа так-как не реализовали метод
        //FixedStack.clear();
        IntStack intStack= new FixedStack(5);
        intStack.clear();

    }
}
interface IntStack {
    void push(int item);
    int pop();
    default void clear(){
        System.out.println("method is not working");
    }
}
class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    FixedStack(int size){
        stck=new int[size];
        tos=-1;
    }
    @Override
    public void push(int item) {
        if(tos==stck.length-1) System.out.println("Full");
        else stck[++tos]=item;
    }

    @Override
    public int pop() {
        if(tos<0) {
            System.out.println("Empty");
            return 0;
        }
        else return stck[tos--];
    }
}