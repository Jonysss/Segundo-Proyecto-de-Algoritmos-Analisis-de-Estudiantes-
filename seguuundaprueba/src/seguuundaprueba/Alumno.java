/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguuundaprueba;

/**
 *
 * @author Jhonathan Sn
 */
public class Alumno {



private String nombre;// estos son los objetos que utilicé o variables.
private String apellido;
private String carne;
private int edad;
private String sexo;
private String carrera;
private int totalcreditos;
private int cantidadcurosap;
private int semestrecursoap;
private String nombreap;
private int codigocursoap;
private int zonaobtenidaap;
private int notaexamenap;
private String fechaap;
private int cantidadcursore;
private int semestrecursore;
private int codigocursorep;
private String nombrere;
private int zonaobtenidare;
private int notaexamenre;
private String fecharep;



public Alumno(){//aquí lo que hice fue hacer controladores que definen que tipo de varibales son
nombre = "";
apellido = "";
carne = "";
edad = 0;
sexo = "";
carrera = "";
totalcreditos = 0;
cantidadcurosap = 0;
semestrecursoap = 0;
nombreap = "";
codigocursoap = 0;
zonaobtenidaap = 0;
notaexamenap = 0;
fechaap = "";
cantidadcursore = 0;
semestrecursore = 0;
codigocursorep = 0;
nombrere = "";
zonaobtenidare = 0;
notaexamenre = 0;
fecharep = "";

}

//aquí hice un controlador de descarga que almacena los datos
public Alumno(String nombre, String apellido, String carne, int edad, String sexo, String carrera,
int totalcreditos, int cantidadcurosap,int semestrecursoap, String nombreap, int codigocursoap, int zonaobtenidaap,
int notaexamenap, String fechaap, int cantidadcursore, int semestrecursore, int codigocursorep, String nombrere,
int zonaobtenidare, int notaexamenre, String fecharep){

//realicé la igualacion de las variables
this.nombre = nombre;
this.apellido = apellido;
this.carne = carne;
this.edad = edad;
this.sexo = sexo;
this.carrera = carrera;
this.totalcreditos = totalcreditos;
this.cantidadcurosap = cantidadcurosap;
this.semestrecursoap = semestrecursoap;
this.nombreap = nombreap;
this.codigocursoap = codigocursoap;
this.zonaobtenidaap = zonaobtenidaap;
this.notaexamenap = notaexamenap;
this.fechaap = fechaap;
this.cantidadcursore = cantidadcursore;
this.semestrecursore = semestrecursore;
this.codigocursorep = codigocursorep;
this.nombrere = nombrere;
this.zonaobtenidare = zonaobtenidare;
this.notaexamenre = notaexamenre;
this.fecharep = fecharep;


}

//creacion de los getters y setters de las varibles de retorno y lector

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
    
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   public int getTotalcreditos() {
        return totalcreditos;
    }

    public void setTotalcreditos(int totalcreditos) {
        this.totalcreditos = totalcreditos;
    } 
    
     public int getCantidadcurosap() {
        return cantidadcurosap;
    }

    public void setCantidadcurosap(int cantidadcurosap) {
        this.cantidadcurosap = cantidadcurosap;
    }

   

    public int getSemestrecursoap() {
        return semestrecursoap;
    }

    public void setSemestrecursoap(int semestrecursoap) {
        this.semestrecursoap = semestrecursoap;
    }

    public String getNombreap() {
        return nombreap;
    }

    public void setNombreap(String nombreap) {
        this.nombreap = nombreap;
    }

    public int getCodigocursoap() {
        return codigocursoap;
    }

    public void setCodigocursoap(int codigocursoap) {
        this.codigocursoap = codigocursoap;
    }

    public int getZonaobtenidaap() {
        return zonaobtenidaap;
    }

    public void setZonaobtenidaap(int zonaobtenidaap) {
        this.zonaobtenidaap = zonaobtenidaap;
    }

    public int getNotaexamenap() {
        return notaexamenap;
    }

    public void setNotaexamenap(int notaexamenap) {
        this.notaexamenap = notaexamenap;
    }

    public String getFechaap() {
        return fechaap;
    }

    public void setFechaap(String fechaap) {
        this.fechaap = fechaap;
    }

    public int getCantidadcursore() {
        return cantidadcursore;
    }

    public void setCantidadcursore(int cantidadcursore) {
        this.cantidadcursore = cantidadcursore;
    }

    public int getSemestrecursore() {
        return semestrecursore;
    }

    public void setSemestrecursore(int semestrecursore) {
        this.semestrecursore = semestrecursore;
    }

    public int getCodigocursorep() {
        return codigocursorep;
    }

    public void setCodigocursorep(int codigocursorep) {
        this.codigocursorep = codigocursorep;
    }

    public String getNombrere() {
        return nombrere;
    }

    public void setNombrere(String nombrere) {
        this.nombrere = nombrere;
    }

    public int getZonaobtenidare() {
        return zonaobtenidare;
    }

    public void setZonaobtenidare(int zonaobtenidare) {
        this.zonaobtenidare = zonaobtenidare;
    }

    public int getNotaexamenre() {
        return notaexamenre;
    }

    public void setNotaexamenre(int notaexamenre) {
        this.notaexamenre = notaexamenre;
    }

    public String getFecharep() {
        return fecharep;
    }

    public void setFecharep(String fecharep) {
        this.fecharep = fecharep;
    }

    
    
}

    
  