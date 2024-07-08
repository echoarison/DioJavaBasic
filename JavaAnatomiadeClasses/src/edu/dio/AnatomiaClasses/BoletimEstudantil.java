package edu.dio.AnatomiaClasses;
public class BoletimEstudantil {
    public static void main(String[] args) {
        //declarando variavel
        int mediaFinal = 6;

        //condição if
        if(mediaFinal < 6){
            System.out.println("Reprovado, tenta na próxima!");
        }else if(mediaFinal == 6){
            System.out.println("Ficou na média, mas passou!");
        }else{
            System.out.println("Aprovado, muito bem!");
        }
    }
}
