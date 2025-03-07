import java.util.Scanner;

public class CategoriaDoAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis declaradas.
        String categoria;
        int idade;

        // Valor da variável idade.
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        // Condições para categorias.
        if (idade < 5 ) {
            categoria = "Idade invalida para a competição.";
            System.out.println (categoria);
        } else if (idade <= 10 ) {
            categoria = "Infantil";
            System.out.println ("Sua categoria é: " + categoria);
        } else if (idade <= 15 ) {
            categoria = "Juvenil";
            System.out.println ("Sua categoria é: " + categoria);
        } else if (idade <= 19 ) {
            categoria = "Júnior";
            System.out.println ("Sua categoria é: " + categoria);
        } else if ( idade <= 40 ) {
            categoria = "Adulto";
            System.out.println ("Sua categoria é: " + categoria);
        } else {
            categoria = "Master";
            System.out.println ("Sua categoria é: " + categoria);
        }
        scanner.close();
    }
}
