package com.mycompany.proyectocs;

import javax.swing.JOptionPane;

public class Doctor extends Persona {

    private String carnet;
    private String departamento;
    public int numero;

    //Métodos
    @Override
    public void pedir_datos() {

        this.cedula = JOptionPane.showInputDialog(null, "Digite la cédula: ");
        this.Nombre = JOptionPane.showInputDialog(null, "Digite el nombre: ");
        this.Apellido = JOptionPane.showInputDialog(null, "Digite el apellido: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad: "));
        this.telefono = JOptionPane.showInputDialog(null, "Digite el teléfono: ");
        this.correo = JOptionPane.showInputDialog(null, "Digite el correo: ");
        this.carnet = JOptionPane.showInputDialog(null, "Digite el carnet: ");
        this.departamento = JOptionPane.showInputDialog(null, "Digite el departamento: ");

    }

    @Override
    public void mostrar_datos() {

        JOptionPane.showMessageDialog(null,"-DATOS DEL DOCTOR-\n" + "Cédula: " + this.cedula + "\nNombre: " + this.Nombre + "\nApellido: " + this.Apellido
                + "\nEdad: " + this.edad + "\nTeléfono: " + this.telefono + "\nCorreo: " + this.correo 
                + "\nCarnet: " + this.carnet + "\nDepartamento: " + this.departamento);

    }

    //Constructores
    public Doctor(String carnet, String departamento, String cedula, String primer_Nombre, String segundo_Nombre, String primer_Apellido, String segundo_Apellido, int edad, String telefono, String correo) {
        super(cedula, primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, edad, telefono, correo);
        this.carnet = carnet;
        this.departamento = departamento;
    }

    public Doctor() {
        super();
        this.carnet = "";
        this.departamento = "";
    }

    //Encapsuladores
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
