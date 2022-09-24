// Write a program to add sum of all natural number from 1 to 50

public class SumNatural {

    public static void main(String[] args) {

        int num = 50, sum = 0;

        for(int i = 1; i <= num; i++){
        sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
