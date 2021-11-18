package com.mycompany.proyectocs;

import javax.swing.JOptionPane;

public class Paciente extends Persona {

    private String medicamentos; //Deberia ser cambiado a un ARRAYLIST
    private String padecimientos;
    
    //Métodos
    @Override
    public void pedir_datos() {

        this.cedula = JOptionPane.showInputDialog(null, "Digite la cédula: ");
        this.Nombre = JOptionPane.showInputDialog(null, "Digite el nombre: ");
        this.Apellido = JOptionPane.showInputDialog(null, "Digite el apellido: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad: "));
        this.telefono = JOptionPane.showInputDialog(null, "Digite el teléfono: ");
        this.correo = JOptionPane.showInputDialog(null, "Digite el correo: ");
        this.medicamentos = JOptionPane.showInputDialog(null, "Digite los medicamentos: ");
        this.padecimientos = JOptionPane.showInputDialog(null, "Digite los padecimientos: ");

    }

    public void mostrar_datos() {

        JOptionPane.showMessageDialog(null,"-DATOS DEL PACIENTE-\n" + "Cédula: " + this.cedula + "\nNombre: " + this.Nombre + "\nApellido: " + this.Apellido 
                + "\nEdad: " + this.edad + "\nTeléfono: " + this.telefono + "\nCorreo: " + this.correo 
                + "\nMedicamentos: " + this.medicamentos + "\nPadecimientos: " + this.padecimientos);

    }

    //Constructores
    public Paciente(String medicamentos, String padecimiento, String cedula, String primer_Nombre, String segundo_Nombre, String primer_Apellido, String segundo_Apellido, int edad, String telefono, String correo) {
        super(cedula, primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, edad, telefono, correo);
        this.medicamentos = medicamentos;
        this.padecimientos = padecimientos;
    }

    public Paciente() {
        super();
        this.medicamentos = "";
        this.padecimientos = "";
    }

    //Encapsuladores
    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimiento) {
        this.padecimientos = padecimiento;
    }

}
