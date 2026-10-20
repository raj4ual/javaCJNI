public class App {
    // Load the native library. The OS will look for libmycalculator.so (Linux/macOS) or mycalculator.dll (Windows)
    static {
        System.loadLibrary("mycalculator"); 
    }

    // Declare a native method that accepts two integers and returns an integer
    public native int addNumbers(int a, int b);

    public static void main(String[] args) {
        App app = new App();
        int num1 = 40;
        int num2 = 2;
        
        // Invoke the native method
        int result = app.addNumbers(num1, num2);
        System.out.println("Result from C implementation: " + result);
    }
}
