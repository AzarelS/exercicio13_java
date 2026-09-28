import java.util.Scanner;

/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double credito, SB;
        
        System.out.println("Inssira o seu salario bruto:");
        SB = sc.nextDouble();
        System.out.println("Insira o valor de credito desejado:");
        credito = sc.nextDouble();
        
        if (credito < 0.3*SB) {
            System.out.println("A prestacao foi concedida");
        }
        else {
            System.out.println("A prestacao nao sera concedida");
        }
        
        
        
        
    }
}
