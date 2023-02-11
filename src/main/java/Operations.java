public class Operations {
    public int add(int a,int b) {
        return a + b;
    }

    public int sub(int a,int b) {
        return a - b;
    }
    public int mul(int a,int b) {
        return a * b;
    }
    public double div(int a,int b) {
        return a/b;
    }

    public int pow(int base,int power) {
        int result = 1;
        while (power != 0) {
            result = result * base;
            power--;
        }
        return result;
    }
}
