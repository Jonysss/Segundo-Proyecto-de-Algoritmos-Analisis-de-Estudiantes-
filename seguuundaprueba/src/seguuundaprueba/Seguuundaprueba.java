/*
 Jonathan Oswaldo Sequen Iquité.
Carné: 7590-12-16756

Realización de segundo proyecto.

 */
package seguuundaprueba;

import java.util.Scanner;

/**
 *
 * @author Jhonathan Sn
 */
public class Seguuundaprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here//la clase main que se ejecuta en el programa.
        String nombre;//creamos variables para asignarle datos
  String apellido;
  String carne;
  int edad;
  String sexo;
  String carrera;
  int totalcreditos;
  int cantidadcurosap;
  int semestrecursoap;
    String nombreap;
    int codigocursoap;
    int zonaobtenidaap;
    int notaexamenap;
    String fechaap;
    int cantidadcursore;
    int semestrecursore;
    int codigocursorep;
    String nombrere;
    int zonaobtenidare;
    int notaexamenre;
    String fecharep;
  int Opcion;
  int Opcion1;
  
  Scanner teclado = new Scanner(System.in);//creamo un objeto de tipo Scanner para capturar los datos
  Scanner Tec=new Scanner(System.in);
  Alumno alumnos[][] = new Alumno[1][1];//Utilicé esta libreria para la clase Scanener para guardar las opciones digitadas.
        do{
            System.out.println("-----------------------------------------" +// El System.out.println para mostrar los mensajes en pantalla
                    "\n   Análisis de datos de Estudiantes " +
                    "\n-----------------------------------------" +
                    "\n1-Ingreso de datos" +
                    "\n2-Análisis de datos" +
                    "\n3-Salir" +
                    
                    "\nIngrese una Opción: " );
            Opcion=Tec.nextInt();// esta linea es para guardar la opcion seleccionada
            switch (Opcion){//el switch me funcion para la selleccion de lo que tenemos en el menú.
                
                case 1: {
                for(int fila=0; fila<1; fila++){//guadar objetos en la matriz.
    
   for(int col=0; col<1; col++){
      System.out.print("introduzca el nombre del estudiante: ");//solicitud de ingreso de datos para el usuario
      nombre = teclado.nextLine();
      System.out.print("introduzca el apellido del estudiante: ");
      apellido = teclado.nextLine();
      System.out.print("introduzca el carne del estudiante: ");
      carne = teclado.nextLine();
      System.out.print("introduzca la edad del estudiante: ");
      edad = teclado.nextInt();
      System.out.print("introduzca el sexo del  estudiante: ");
      sexo = teclado.nextLine();
      System.out.print("introduzca la carrera del estudiante: ");
      carrera = teclado.nextLine();
      System.out.print("introduzca el total de créditos obtenidos del estudiante: ");
      totalcreditos = teclado.nextInt();
      System.out.print("introduzca la cantidad de cursos aprobados  del estudiante: ");
      cantidadcurosap = teclado.nextInt();
      System.out.print("introduzca el semestre al que pertence el curso: ");
      semestrecursoap = teclado.nextInt();
      System.out.print("introduzca el nombre del curso: ");
      nombreap = teclado.nextLine();
      System.out.print("introduzca el codigo del curso ");
      codigocursoap = teclado.nextInt();
       System.out.print("introduzca la zona obtenida: ");
      zonaobtenidaap = teclado.nextInt();
      System.out.print("introduzca la nota de examen final: ");
      notaexamenap = teclado.nextInt();
      System.out.print("introduzca la fecha de aprobacion del curso: ");
      fechaap = teclado.nextLine();
      System.out.print("introduzca la cantidad de cursos reprobados: ");
      cantidadcursore = teclado.nextInt();
      System.out.print("introduzca el semestre al que pertence el curso: ");
      semestrecursore = teclado.nextInt();
      System.out.print("introduzca el nombre del curso: ");
      nombrere = teclado.nextLine();
      System.out.print("introduzca el codigo del curso ");
      codigocursorep = teclado.nextInt();
       System.out.print("introduzca la zona obtenida: ");
      zonaobtenidare = teclado.nextInt();
      System.out.print("introduzca la nota de examen final: ");
      notaexamenre = teclado.nextInt();
      System.out.print("introduzca la fecha en que se reprobó el curso del curso: ");
      fecharep = teclado.nextLine();
       teclado.nextLine();//este es un buffer para no repetir bucles.
      Alumno miAlumnosActual = new Alumno(nombre, apellido, carne, edad, sexo, carrera, totalcreditos, cantidadcurosap,
              semestrecursoap, nombreap, codigocursoap, zonaobtenidaap, notaexamenap, fechaap, cantidadcursore,
      semestrecursore, codigocursorep, nombrere, zonaobtenidare, notaexamenre, fecharep);
      
      alumnos[fila][col] = miAlumnosActual;//donde almacena los datos para posteriormente mostrarlos
       
   }
  }
         
    }//utilice los casos de eleccion y en ellos se ejecuta una opcion diferente
                case 2:{
                   
         System.out.println("-----------------------------------------" +// El System.out.println para mostrar los mensajes en pantalla
                    "\n   Análisis de datos de Estudiantes / Ejecute la opcion que desee " +
                    "\n-----------------------------------------" +
                    "\n1-Datos personales de estudiantes" +
                    "\n2-Cantidad de estudiantes masculinos y femeninos" +
                    "\n3-mejor promedio de cada carrera" +
                    "\n4-datos academicos de estudiantes" +
                    "\n5-constancia de cursos aprobados" +
                    "\n6-Salir" +
                    "\nIngrese una Opción: " );
            Opcion1=Tec.nextInt();// esta linea es para guardar la opcion seleccionada
            switch (Opcion1){ 
            //cada opcion que se ejecuta al seleccionar en el menú
            case 1: {
            for(int fila=0; fila<1; fila++){
            
            for(int col=0; col<1; col++){
            System.out.print("DATOS PERSONALES DE LOS ESTUDIATES" + fila +" " + col);
      System.out.println(". Contenido: ");
      System.out.println("Nombre: " + alumnos[fila][col].getNombre());
       System.out.println("Apellido: " + alumnos[fila][col].getApellido());
       System.out.println("Edad: " + alumnos[fila][col].getEdad());
       System.out.println("sexo: " + alumnos[fila][col].getSexo());
            
            
            }
            
            }
            
            }//cada opcion que se ejecuta al seleccionar en el menú
            case 2: { 
            
            for(int fila=0; fila<1; fila++){
            
            for(int col=0; col<1; col++){
            System.out.print("CANTIDAD DE ESTUDIANTE MASCULINOS Y FEMENINOS" + fila +" " + col);
      System.out.println(". Contenido: ");
       System.out.println("Nombre: " + alumnos[fila][col].getNombre());
       System.out.println("sexo: " + alumnos[fila][col].getSexo());
            
            
            }
            
            }
            
            } //cada opcion que se ejecuta al seleccionar en el menú
            case 3: {
            
            for(int fila=0; fila<1; fila++){
            
            for(int col=0; col<1; col++){
            System.out.print("PROMEDIO DE DATOS DE LOS ESTUDIANTES: " + fila +" " + col);
      System.out.println(". Contenido: ");
      System.out.println("carrera: " + alumnos[fila][col].getCarrera());
      System.out.println("Zona obtenida por el estudiante: " + alumnos[fila][col].getZonaobtenidaap());
       System.out.println("Nombre: " + alumnos[fila][col].getNombre());
       System.out.println("Apellido: " + alumnos[fila][col].getApellido());
            
            
            }
            
            }
            
            }//cada opcion que se ejecuta al seleccionar en el menú
            case 4:{
            for(int fila=0; fila<1; fila++){
            
            for(int col=0; col<1; col++){
            System.out.print("datos academicos de esutudiantes: " + fila +" " + col);
      System.out.println("Nombre: " + alumnos[fila][col].getNombre());
      System.out.println("Apellido: " + alumnos[fila][col].getApellido());
      System.out.println("Carne: " + alumnos[fila][col].getCarne());
      System.out.println("carrera: " + alumnos[fila][col].getCarrera());
      System.out.println("Total créditos obtenidos: " + alumnos[fila][col].getTotalcreditos());
       System.out.println("Total de cursos aprobados: " + alumnos[fila][col].getCantidadcurosap());
       System.out.println("Total de cursos reprobados: " + alumnos[fila][col].getCantidadcursore());

            }
            
            }
            
            }//cada opcion que se ejecuta al seleccionar en el menú
            case 5:{
            for(int fila=0; fila<1; fila++){
            
            for(int col=0; col<1; col++){
            System.out.print("Constancia de cursos aprobados: " + fila +" " + col);
       System.out.println("El numero de carne es: " + alumnos[fila][col].getCarne());     
            
      System.out.println("Nombre: " + alumnos[fila][col].getNombre());
      System.out.println("Apellido: " + alumnos[fila][col].getApellido());
      System.out.println("carrera: " + alumnos[fila][col].getCarrera());
      System.out.println("Total créditos obtenidos: " + alumnos[fila][col].getTotalcreditos());
       System.out.println("Total de cursos aprobados: " + alumnos[fila][col].getCantidadcurosap());
       System.out.println("Nombre del curso: " + alumnos[fila][col].getNombreap());
       System.out.println("fecha de aprobacion del curso: " + alumnos[fila][col].getFechaap());
       System.out.println("zona obtenida por el estudiante: " + alumnos[fila][col].getZonaobtenidare());
       System.out.println("nota de examen final obtenida: " + alumnos[fila][col].getNotaexamenap());
       System.out.println("nota de examen final obtenida: " + alumnos[fila][col].getNotaexamenap());

            }
            
            }
            
            }
            }          
         } 
            }
        }while(Opcion!=3);//el while lo utilice para que me siga mostrando los menus.
    }
    
}
