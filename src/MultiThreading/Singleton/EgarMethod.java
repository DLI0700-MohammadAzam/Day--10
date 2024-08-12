package MultiThreading.Singleton;

public class EgarMethod {

    private static EgarMethod instance = new EgarMethod();
    private EgarMethod(){}

    public static EgarMethod getInstance()
    {
        return instance;
    }


}

class Demo
{
    public static void main(String[] args) {
        EgarMethod obj1 = EgarMethod.getInstance();
        EgarMethod obj2 = EgarMethod.getInstance();
        System.out.println(obj1+"\n"+obj2);
    }
}
