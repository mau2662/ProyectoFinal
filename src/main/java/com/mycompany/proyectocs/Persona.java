package com.mycompany.proyectocs;

import javax.swing.JOptionPane;

public abstract class Persona {

    protected String cedula;
    protected String Nombre;
    protected String Apellido;
    protected int edad;
    protected String telefono;
    protected String correo;

    //Metodos Abstractos
    public void pedir_datos() {

        this.cedula = JOptionPane.showInputDialog(null, "Digite la cédula: ");
        this.Nombre = JOptionPane.showInputDialog(null, "Digite el nombre: ");
        this.Apellido = JOptionPane.showInputDialog(null, "Digite el apellido: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad: "));
        this.telefono = JOptionPane.showInputDialog(null, "Digite el teléfono: ");
        this.correo = JOptionPane.showInputDialog(null, "Digite el correo: ");

    }

    public void mostrar_datos() {

        JOptionPane.showMessageDialog(null, "Cédula: " + this.cedula + "\nNombre: " + this.Nombre + "\nApellido: " + this.Apellido 
                + "\nEdad: " + this.edad + "\nTeléfono: " + this.telefono + "\nCorreo: " + this.correo);

    }

    //Constructores
    public Persona(String cedula, String primer_Nombre, String segundo_Nombre, String primer_Apellido, String segundo_Apellido, int edad, String telefono, String correo) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persona() {
        this.cedula = "";
        this.Nombre = "";
        this.Apellido = "";
        this.edad = 0;
        this.telefono = "";
        this.correo = "";
    }

    //Encapsuladores
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
