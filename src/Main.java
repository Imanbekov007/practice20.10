import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        reversesan(scanner.nextInt());

    }public static void reversesan(int san){
        int esan=0;
        while(san !=0){

            int kaldyk=san %10;
            esan = esan*10 + kaldyk;
            san /=10;
        }

        System.out.println(esan);
    }
}
