/*
Crear las siguientes clases derivadas:
** una llamada Paciente que tenga como atributos 
*** fechaPrimeraConsulta
*** medicoTratante (de tipo Médico)
*/

/* 
Los métodos que se implementarán en la clase Paciente son: 
* calcularIMC(): 
** calculará si la persona está en su peso ideal (peso en kg/ (altura^2 en m))
*** devuelve un -1 si está por debajo de su peso ideal
*** un 0 si está en su peso ideal 
*** un 1 si tiene sobrepeso. 

Puede usar constantes para devolver estos valores. 
*/

/* esMayorDeEdad (): indica si es mayor de edad, devuelve un booleano. */

/* comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. */

/* toString(): devuelve toda la información del objeto. 

Cada una de las clases debe tener su respectivo constructor. 
 */


public class Paciente extends Persona{
    //atributos//
    protected int diaPrimeraConsulta;
    protected int mesPrimeraConsulta;
    protected int annoPrimeraConsulta;
    protected String MedicoTratante;

    public Paciente(int fechaPrimeraConsulta, int mesPrimeraConsulta, int annoPrimeraConsulta, String MedicoTratante, String nombre, int edad, String RUT, char sexo, double peso, double altura) {
        super(nombre, edad, RUT, sexo, peso, altura);
        this.diaPrimeraConsulta = fechaPrimeraConsulta;
        this.mesPrimeraConsulta = mesPrimeraConsulta;
        this.annoPrimeraConsulta = annoPrimeraConsulta;
        this.MedicoTratante = MedicoTratante;
    }
    
    public Paciente () {}
    
    
    //metodos//
    
    public double calcularIMC(){
        double imc = peso/altura*altura;
        int valorImc = 0; 
        if (imc<18.5){
            return valorImc = -1;
        } else {
            if (imc>=18.5 && imc<=29.9){
                return valorImc=0;
            } else {
                return valorImc = 1; 
            }
        }
    }
    
    public String resultadoIMC(){
        String evaluacion = "";
        if (this.calcularIMC()==0){
            return evaluacion="Peso Normal";
        } else {
            if (this.calcularIMC()==1){
                return evaluacion="Sobrepeso";
            } else {
                if (this.calcularIMC()==-1){
                    return evaluacion="Bajo Peso";
                }
            }
        }
        return evaluacion;
    }
    
    public String comprobarSexo(){
        String genero = "";
        if (sexo!='H'&&sexo!='M'){
            return genero = "Hombre";
        } else {
            if (sexo=='H'){
                return genero = "Hombre";
            } else {
                if (sexo == 'M'){
                    return genero = "Mujer";
                }
            }
        }
        return genero;
    }

    
    
    public boolean esMayorDeEdad(){
        boolean mayor=false;
        if (edad>=18){
            return mayor = true;
        }else {
            return mayor = false;
        }   
    }
    
    public String mayorEdad(){
        String mayorEdad="No";
        if (this.esMayorDeEdad()==true){
            return mayorEdad="Si";
        } else {
            return mayorEdad="No";
        }
    }
    
    
    public String toString(){
        return ("\n***Ficha de Paciente***\n"+
                "Nombre del paciente; "+nombre+"\n"+
                "Edad del Paciente: "+edad+" - Mayor de edad :"+this.mayorEdad()+" \n"+
                "RUT: "+RUT+"\n"+
                "Sexo: "+this.comprobarSexo()+"\n"+
                "Peso del paciente en kilogramos: "+peso+"\n"+
                "Altura del paciente en metros: "+altura+"\n"+
                "Medico Tratante: "+this.MedicoTratante+"\n"+
                "Fecha de Primera Consulta: "+this.diaPrimeraConsulta+"/"+this.mesPrimeraConsulta+"/"+this.annoPrimeraConsulta+"\n"+
                "IMC ="+(peso/(altura*altura))+"\n"+
                "Estado IMC: "+this.resultadoIMC()
                );
    }
    
    
}