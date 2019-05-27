import java.util.Scanner;

/*
Luego, crear una clase ejecutable que haga lo siguiente: 
Pedir por teclado el nombre, Rut, la edad, sexo, peso, altura, fechaPrimeraConsulta, medicoTratante, precioConsulta, especialidad. 
Crear 1 objeto de la clase anterior que deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje. Indicar si es mayor de edad. Por último, mostrar la información del objeto. 
Debe entregar el código formal del programa y la impresión de pantalla que muestra su ejecución. 
/**
 *
 * @author danielcortes
 */

public class Main {
    public static void main (String []args ){
        
        Scanner entrada = new Scanner (System.in);
        Scanner entrada2= new Scanner (System.in);
        
        Paciente personaUno= new Paciente();
        Medico personaDos=new Medico();
        
        System.out.println("Ingrese nombre del paciente");
        personaUno.nombre=(entrada.nextLine());
        
        System.out.println("Ingrese RUT del paciente");
        personaUno.RUT=(entrada.nextLine());
        
        System.out.println("Ingrese edad del paciente");
        personaUno.edad=(entrada.nextInt());
        
        System.out.println("Ingrese Sexo del paciente (M = Mujer / H = Hombre)");
        personaUno.sexo=(entrada.next().charAt(0));
        
        System.out.println("Ingrese peso del paciente en kilos");
        personaUno.peso=(entrada.nextDouble());
        
        System.out.println("Ingrese altura del paciente en metros");
        personaUno.altura=(entrada.nextDouble());
        
        System.out.println("Ingrese fecha de Primera Consulta (DD/MM/AA)");
        personaUno.diaPrimeraConsulta=(entrada.nextInt());
        personaUno.mesPrimeraConsulta=(entrada.nextInt());
        personaUno.annoPrimeraConsulta=(entrada.nextInt());
        
        System.out.println("Nombre del médico Tratante :");
        personaDos.nombre=(entrada2.nextLine());
        personaUno.MedicoTratante=personaDos.nombre;
        
        
        System.out.println("Ingrese el valor de la consulta en CLP");
        personaDos.precioConsulta=(entrada.nextInt());
        
        
        System.out.println("Ingrese especialidad ; "); 
        personaDos.especialidad=(entrada2.nextLine());
        
        System.out.println(personaUno.toString());
        System.out.println(personaDos.consulta());
        
    }
    
}
