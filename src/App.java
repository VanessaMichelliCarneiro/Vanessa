public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    System.out.print("Texto que não quebra linha");
    System.outprintln("Texto que nao quebra linha");

    //%s - substitui no texto um valor de String
    System.out.printf("Vai imprimir %s. %s. %s\n", "Um texto" , "Qualquer" , "Pessoal");

    //%d - substitui o coringa %d por um número inteiro no texto
    System.out.printf("Minha idade é: %d", 33);

    //%f - substitui o coringa %f por um número flutuante
    System.out.printf("\nO valor de PI é: %f" , 3.1415f);

    // %2.f - substitui o coringa %2.f por um número flutuante
    //com duas casas decimais
    System.out.printf("\nO valor de PI é %2.f" , 3.1415);

    //%b - substitui o coringa %b por um valor booleano
    System.out.printf("\nEsse valor é %b" , true);
    System.out.printf("\nEsse valor é %b" , false);

    //%c - substitui o coringa %c por um caractere
    System.out.printf("\nO caractere é: %c" , 'A');
    System.out.printf("\nO caractere é: %c" , '5');
    System.out.printf("\nO caractere é: %c" , '*');
    System.out.printf("\nO caractere é: %c" , '\\');
    System.out.printf("\nO caractere é: %c" , '\"');

    //printf com todos os tipos usando variáveis
    String texto = "Alguma Coisa";
    int numeroInteiro = 1;
    float numeroQuebrado = 123.232f;
    boolean valorVerdadeiro = true;
    char umCaractere = '°';
    System.out.printf("\n%s, %d, %2f, %b, %c",
            texto, numeroInteiro, numeroQuebrado,
            valorVerdadeiro, umCaractere);
            







}