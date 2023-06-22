import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1;
        System.out.printf("Digite o número em metros para transformar em cm: ");
        n1 = ler.nextInt();
        System.out.println(n1 + " São " + (n1*100) + " Centimetros");
    }
}
