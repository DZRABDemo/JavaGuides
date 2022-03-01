public class Hello {
    public native void sayHello();
    static {
        System.loadLibrary("HelloImpl");
    }

    public static void main(String[] args) {
        new Hello().sayHello();
    }
}
