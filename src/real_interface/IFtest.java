package real_interface;

public class IFtest {
    public static void main(String[] args) {
        //fixed
        FixedStack fixedStack=new FixedStack(5);
        for (int i = 0; i <5 ; i++) fixedStack.push(i);
        for (int i = 0; i <5 ; i++) System.out.println(fixedStack.pop());
        //dynamic
        DynStack dynStack1=new DynStack(5);
        DynStack dynStack2=new DynStack(3);

        //динамически увеличиается размер каждого стека
        for (int i = 0; i <10 ; i++) dynStack1.push(i);
        for (int i = 0; i <5 ; i++) dynStack2.push(i);

        for (int i = 0; i <10 ; i++) System.out.println(dynStack1.pop());
        for (int i = 0; i <5 ; i++) System.out.println(dynStack2.pop());
    }
}
