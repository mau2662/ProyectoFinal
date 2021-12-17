package com.mycompany.proyectocs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class manejodearchivosPACIENTE {

    private String ruta;
    private String nombre_archivo;
    private Paciente obj_paciente;
    public String id;

    public manejodearchivosPACIENTE(String ruta, String nombre_archivo, Paciente obj_paciente, String id) {
        this.ruta = ruta;
        this.nombre_archivo = nombre_archivo;
        this.obj_paciente = obj_paciente;
        this.id = id;
    }

    public manejodearchivosPACIENTE(Paciente obj_paciente) {
        this.ruta = "";
        this.nombre_archivo = "Pacientes.txt";
        this.obj_paciente = obj_paciente;
        this.id = "";
    }

    public manejodearchivosPACIENTE() {
        this.ruta = "";
        this.nombre_archivo = "Pacientes.txt";
        this.obj_paciente = new Paciente();
        this.id = "";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public Paciente getObj_paciente() {
        return obj_paciente;
    }

    public void setObj_paciente(Paciente obj_paciente) {
        this.obj_paciente = obj_paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void agregaPaciente() {

        try {

            File file = new File(this.ruta + this.nombre_archivo);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(this.obj_paciente.getNombre() + "," + this.obj_paciente.getApellido() + "," + this.obj_paciente.getEdad()
                    + "," + this.obj_paciente.getCedula() + "," + this.obj_paciente.getCorreo() + "," + this.obj_paciente.getTelefono()+
                    "," + this.obj_paciente.getMedicamentos() + "," + this.obj_paciente.getPadecimientos());
            
            //FALTARIA UN METODO PARA AGREGAR PADECIMIENTOS Y MEDICAMENTOS DEL PACIENTE. UNA VEZ ESTE DEFINIDO COMO SE ALMACENARAN ESTOS DATOS,
            //SE DEBE AGREGAR AQUI PARA AÑADIRLO A CADA PACIENTE NUEVO.

            bw.flush();
            bw.newLine();
            bw.close();

            JOptionPane.showMessageDialog(null, "Paciente ingresado");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void eliminapaciente() {

        try {
            String registro;
            int valida = 0;

            File temp = new File(this.ruta + "Temp.txt");
            File db = new File(this.ruta + this.nombre_archivo);

            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            BufferedReader br = new BufferedReader(new FileReader(db));

            while ((registro = br.readLine()) != null) {
                if (registro.contains(id)) {
                    valida = 1;

                } else {
                    bw.write(registro);
                    bw.flush();
                    bw.newLine();

                }

            }
            br.close();
            bw.close();
            db.delete();
            temp.renameTo(db);

            if (valida == 1) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado el paciente.");
            } else {
                JOptionPane.showMessageDialog(null, "Doctor no encontrado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void editarpaciente() {
        
        try{
        String registro;
        int valida = 0;

        File temp = new File(this.ruta + "Temp.txt");
        File db = new File(this.ruta + this.nombre_archivo);

        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        BufferedReader br = new BufferedReader(new FileReader(db));

        while ((registro = br.readLine()) != null) {
            if (registro.contains(id)) {
                valida = 1;
                this.obj_paciente.setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre "));
                this.obj_paciente.setApellido(JOptionPane.showInputDialog("Ingrese el nuevo apellido "));
                this.obj_paciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad ")));
                this.obj_paciente.setCedula(JOptionPane.showInputDialog("Ingrese la nueva cedula "));
                this.obj_paciente.setCorreo(JOptionPane.showInputDialog("Ingrese el nuevo correo "));
                this.obj_paciente.setTelefono(JOptionPane.showInputDialog("Ingrese el nuevo telefono "));
                this.obj_paciente.setPadecimientos("Digite el padecimiento del paciente");
                this.obj_paciente.setMedicamentos("Digite el medicamento recetado");
                
                bw.write(this.obj_paciente.getNombre()+ "," + this.obj_paciente.getApellido() + "," + this.obj_paciente.getEdad() + "," + this.obj_paciente.getCedula()
                + "," + this.obj_paciente.getCorreo() + ","+ this.obj_paciente.getTelefono()+ ","+ this.obj_paciente.getPadecimientos() + 
                        ","+ this.obj_paciente.getMedicamentos());
                
                bw.flush();
                bw.newLine();
                

            } else {
                bw.write(registro);
                bw.flush();
                bw.newLine();

            }

        }
        br.close();
        bw.close();
        db.delete();
        temp.renameTo(db);

        if (valida == 1) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado el paciente.");
        } else {
            JOptionPane.showMessageDialog(null, "Doctor no encontrado");
        }

    }
    catch (Exception e) {
            e.printStackTrace();
    }
}

}
