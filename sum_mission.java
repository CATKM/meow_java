package meow;

public class sum_mission {
    public static void main(String[] args) {
        int x;
        int sum = 0;
        for (x=1; x <= 100; x++) {
            sum = sum + x;
        }
        System.out.println("1 부터 100까지 더한 수는 " + sum + "입니다.");
    }
}
