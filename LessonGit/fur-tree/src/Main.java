import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, enter height the fur tree:");
        int y = new Scanner(System.in).nextInt();
        int x = y*2-1;
        System.out.println("Here is Your fur tree!");
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++){
                if (j<x/2-i||j>x/2+i){
                    System.out.print("#");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}