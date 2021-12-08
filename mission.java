package meow;

public class mission {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for(x=2; x <= 9; x++) {
            for(y=1; y <=9; y++) {
                int num = x * y;
                System.out.println(x + "x" + y + "=" + num);
            }
        }
    }
}
