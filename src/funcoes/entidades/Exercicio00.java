package funcoes.entidades;

public class Exercicio00 {

    public void mensagem(){
        System.out.println("IFTO - Colinas");
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

