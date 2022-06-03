import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        int fatorial = numero;

        while(numero>1) {
            fatorial = fatorial * (numero-1); 
            numero--;
        }
        System.out.println(fatorial);
    }
}
