public class NumberSwap {
  
    public static void main(String [] Args){
        int a = 10;
        int b = 20;
        System.out.println("Before Swap a = "+ a + " and b = "+ b);

        int c = a*b;
        a = c/a;
        b = c/b;
        System.out.println("Before Swap a = "+ a + " and b = "+ b);
    }
}
