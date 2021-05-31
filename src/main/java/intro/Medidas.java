// 1 - Pacote
package intro;

// 2 - Referências as bibliotecas

// - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Meu primeiro código em Java!!");

    }
    public void calcularAreaModoextenso(String[] args){
        int largura;
        int comprimento;
        int resultado;
        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de "+largura+ "m e o comprimento de "+comprimento+ "m a área é de: "+resultado+ " m²");



    }
    public void calcularAreaModoCompacto(String[] args){
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de "+largura+ "m e o comprimento de "+comprimento+ "m a área é de: "+largura*comprimento+ "m²");

    }



}
