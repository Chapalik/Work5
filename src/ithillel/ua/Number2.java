package ithillel.ua;

public class Number2 {

    public static void main(String[] args) {

        int sum = 1;
        for (int i = 1; i < 100; i++) {
            sum *= i;
            if (sum > 1000) {
                System.out.println("break....");
                break;
            }
        }
        System.out.println(sum);
    }
}
