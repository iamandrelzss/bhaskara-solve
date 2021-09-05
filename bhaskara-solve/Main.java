import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada_de_Valores = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int Valor_de_A = entrada_de_Valores.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int Valor_de_B = entrada_de_Valores.nextInt();

        System.out.println("Digite o valor de C: ");
        int Valor_de_C = entrada_de_Valores.nextInt();

        Integer calcular_valor_de_Delta = ((Valor_de_B * Valor_de_B) -4 * Valor_de_A *Valor_de_C); 
        System.out.println("O Valor de Delta é: " + calcular_valor_de_Delta);

       double Valor_de_Delta_Na_Raiz = Math.sqrt(calcular_valor_de_Delta);
       
       double Valor_de_X1 = (-Valor_de_B + Valor_de_Delta_Na_Raiz /(2 * Valor_de_A));
       System.out.println("O valor de X1 é: " + Valor_de_X1);

       double Valor_de_X2 = (Valor_de_B + Valor_de_Delta_Na_Raiz /(2 * Valor_de_A));
       System.out.println("O valor de X2 é: " + Valor_de_X2);

       entrada_de_Valores.close();
    }

}