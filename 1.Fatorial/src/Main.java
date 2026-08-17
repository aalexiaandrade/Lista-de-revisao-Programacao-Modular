import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 4;
        int fatorial = 0;

        for (int i = 0; i<num1; i++){
            fatorial += (num1*(num1-1));
            num1-=1;
            if(num1==0)
                break;
        }
        System.out.println(fatorial);

    }
}