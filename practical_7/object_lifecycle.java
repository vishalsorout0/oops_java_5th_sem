
class Demo {
    Demo() {
        System.out.println("Object constructed.");
    }

    void use() {
        System.out.println("Object is being used.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object cleanup method called.");
        super.finalize();
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.use();

        obj = null;

        System.out.println("Object reference removed.");
        System.gc();

        System.out.println("End of program.");
    }
}

class Demo {
    Demo() {
        System.out.println("Object constructed.");
    }

    void use() {
        System.out.println("Object is being used.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object cleanup method called.");
        super.finalize();
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.use();

        obj = null;

        System.out.println("Object reference removed.");
        System.gc();

        System.out.println("End of program.");
    }
}
