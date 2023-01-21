package poo.clases;

public class vehiculo {

    // 1. atributos

    String fabricantes;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int speed;

    // 2. constructores

    public vehiculo(){

    }
    public vehiculo(String fabricantes, String modelo, double cc, int year, boolean sport){
        this.fabricantes = fabricantes;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
    }
    public vehiculo(String fabricantes, String modelo){
        this.fabricantes = fabricantes;
        this.modelo = modelo;
    }
    // 3. metodos (comportamiento)

    public void acelerar(int quantity){
        this.speed += quantity;
    }
}
