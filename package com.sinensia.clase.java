package com.sinensia.clase.volei;

/**
 * Vamos a crear una clase de un jugador de voleibol
 * Clase: Jugador de voleibol
 * CONSTANTES:(las definimos con final)
 * estatura, nombre y edad del jugador
 * Cualidades del jugador que pueden fluctuar:
 * posición y numero de camiseta
 */
public class JugadorVoleibol{

    final double estatura;

    final double salto;

    final String nombre;

    final int edad;

    private String posicion;

    private int numeroCamiseta;

    Public JugadorVoleibol(double estatura, double salto, String nombre, int edad, String posicion, int numeroCamiseta){
        this.estatura=estatura;
        this.salto=salto;
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
        this.numeroCamiseta=numeroCamiseta;
    }

    //Definimos algunos metodos getter y setter
    //getters
    public String getNombre(){
        return nombre;
    }
    public int getNumeroCamiseta(){
        return numeroCamiseta;
    }
    //setters(solo a posicion y numero camiseta puesto que lo demás son constantes)
    public int setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta=numeroCamiseta;
    }
    public String setPosicion(String posicion){
        this.posicion=posicion;
    }
    //vamos a crear un metodo para hallar el alcance del jugador
    public double alcance(){
        return estatura+salto;
    }
    //metodo para ver los datos relevantes(voleibolisticamente)
    public void datos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Alcance: "+ alcance + "m");
        System.out.println("Posición: "+posicion);
    }
    //creamos el main
    public static void main(String[] args){
        JugadorVoleibol jugador = new JugadorVoleibol(1.78, 0.34, "Rocío Jurado", 21, "Opuesta", 33);
        jugador.datos¨();
    }
}

//Hacemos una clase hijo para jugadoras mujeres
public class Jugadora extends JugadorVoleibol {
    //Definimos una constante static para indicar que esta clase solo toma jugadoras de genero femenino
    public static final String GENERO = "femenino"

    //El constructor usa super y accede al de la superclase
    public Jugadora(double estatura, double salto, String nombre, int edad, String posicion, int numeroCamiseta){
        super(estatura, salto, nombre, edad, posicion, numeroCamiseta)
    }

    //Empleamos override para sacar los datos relevantes de la jugadora añadiendo genero a datos, llamandolo de la clasd padre
    @override
    public void datos(){
        super.datos();
        System.out.println(GENERO);
    }
}
