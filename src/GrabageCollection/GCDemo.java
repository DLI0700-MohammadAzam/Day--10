package GrabageCollection;

public class GCDemo {

    String name;

    public GCDemo(String name) {
        this.name = name;
        System.out.println("Created " + name);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("GC is deleted " + name);
    }
}
