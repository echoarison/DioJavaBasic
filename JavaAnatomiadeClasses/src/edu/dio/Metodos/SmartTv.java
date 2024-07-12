package edu.dio.Metodos;

public class SmartTv{
    //declarando variaveis
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume()
    {
        ++volume; // aumentando +1
    }

    public void abaixarVolume()
    {
        --volume; //diminuindo -1
    }

}