/*
Crear las siguientes clases derivadas:
** otra clase llamada Medico que herede de Persona y tenga como atributo adicional:
*** precioConsulta
*** especialidad. 


Cada una de las clases debe tener su respectivo constructor. 
 */

/**
 *
 * @author danielcortes
 */
public class Medico extends Persona {
    protected int precioConsulta;
    protected String especialidad;

    public Medico(int precioConsulta, String especialidad, String nombre, int edad, String RUT, char sexo, double peso, double altura) {
        super(nombre, edad, RUT, sexo, peso, altura);
        this.precioConsulta = precioConsulta;
        this.especialidad = especialidad;
    }
    
    public Medico(){}

    
    public String consulta() {
        return ("Especialidad :"+especialidad+"\n"+
                "Valor a pagar por consulta: "+precioConsulta);
    }
    
    
    
}
