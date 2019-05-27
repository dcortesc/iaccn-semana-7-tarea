/*
**una clase llamada Persona
***sus atributos son: 
**** nombre, 
**** edad, 
**** RUT, 
**** sexo (H hombre, M mujer)
**** peso
**** altura. 

No se quiere acceder directamente a ellos. Piense qué modificador de acceso es el más adecuado, también su tipo. 

Crear constructor 

 */

/**
 *
 * @author danielcortes
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String RUT; 
    protected char sexo;
    protected double peso;
    protected double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String RUT, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.RUT = RUT;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }    
    
}

