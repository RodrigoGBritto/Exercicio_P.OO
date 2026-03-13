package funcoes.entidades;

public class Exercicio00 {



    public void mensagem(){
        System.out.println("IFTO - Colinas");
    }

    //realtivo ao exercicio 01
    public void aloMundo(){
        System.out.println("Aló Mundo!");
    }
    //realtivo ao exercicio 02
    public void mostrarNumeroInteiro(int numero){
        System.out.println("Este e um número inteiro: " + numero);
    }
    //relativo ao exercicio 03
    public void mostrarNumeroReal(float numero){
        System.out.println("Este numero real é: " + numero);
    }
    //relativo ao exercicio 04
    public void mostrarNome(String nome){
        System.out.println("Eu sou: " + nome);
    }
    //relativo ao exercicio 125
    public float maiorDeDois(float n1, float n2){
        if(n1>=n2){
            return n1;
        }else
            return n2;}

    //exexicio_127
    public double fahrenheitParaCelsius(double F){
        System.out.println("--");
        double celsius;
        celsius =  (F - 32)*5.0/9.0;
        return celsius;

    }



}

