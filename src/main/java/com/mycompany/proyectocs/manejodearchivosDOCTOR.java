/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class manejodearchivosDOCTOR {
    private String ruta;
    private String nombre_archivo;
    private Doctor obj_doctor;
    public String id;

    public manejodearchivosDOCTOR(String ruta, String nombre_archivo, Doctor obj_doctor, String id) {
        this.ruta = ruta;
        this.nombre_archivo = nombre_archivo;
        this.obj_doctor = obj_doctor;
        this.id = id;
    }
    
    public manejodearchivosDOCTOR(Doctor obj_doctor) {
        this.ruta = "";
        this.nombre_archivo = "Doctores.txt";
        this.obj_doctor = obj_doctor;
        this.id = "";
    }
    public manejodearchivosDOCTOR() {
        this.ruta = "";
        this.nombre_archivo = "Doctores.txt";
        this.obj_doctor = new Doctor();
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

    public Doctor getObj_doctor() {
        return obj_doctor;
    }

    public void setObj_doctor(Doctor obj_doctor) {
        this.obj_doctor = obj_doctor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void agregaDoctor(){
        try{   
            
            File file = new File (this.ruta+this.nombre_archivo);
            
            if (!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(this.obj_doctor.getNombre()+","+this.obj_doctor.getApellido()+","+this.obj_doctor.getEdad()+","+this.obj_doctor.getCarnet()+","+this.obj_doctor.getCedula()
            +","+this.obj_doctor.getCorreo()+","+this.obj_doctor.getTelefono()+","+this.obj_doctor.getDepartamento());
            
            bw.flush();
            bw.newLine();
            bw.close();
            
            JOptionPane.showMessageDialog(null, "Doctor ingresado");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
  public void eliminaDoctor(){
        try{
        String regi;
        int valida = 0;
        
        File temp = new File (this.ruta+"Temp.txt");
        File db = new File (this.ruta + this.nombre_archivo);
        
        BufferedWriter bw = new BufferedWriter (new FileWriter(temp));
        BufferedReader br= new BufferedReader(new FileReader(db));
        
        while ((regi=br.readLine())!=null){
            if(regi.contains(id)){
                valida = 1;
            }else{
                bw.write(regi);
                bw.flush();
                bw.newLine();
            }    
        }
        br.close();
        bw.close();
        db.delete();
        temp.renameTo(db);
       
        if(valida==1){
            JOptionPane.showMessageDialog(null, "Se ha eliminado el doctor");
        
        }else{
            JOptionPane.showMessageDialog(null, "Doctor no encontrado");
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }      
  }

public void editarDoctor(){
    try{
        String regi;
        int valida = 0;
        
        File temp = new File (this.ruta+"Temp.txt");
        File db = new File (this.ruta + this.nombre_archivo);
        
        BufferedWriter bw = new BufferedWriter (new FileWriter(temp));
        BufferedReader br= new BufferedReader(new FileReader(db));
        
        while ((regi=br.readLine())!=null){
            if(regi.contains(id)){
                valida = 1;
                this.obj_doctor.setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre "));
                this.obj_doctor.setApellido(JOptionPane.showInputDialog("Ingrese el nuevo nombre "));
                this.obj_doctor.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la nueva edad ")));
                this.obj_doctor.setCarnet(JOptionPane.showInputDialog("Ingrese el nuevo numero de carnet "));
                this.obj_doctor.setCedula(id);
                this.obj_doctor.setCorreo(JOptionPane.showInputDialog("Digite el nuevo correo "));
                this.obj_doctor.setTelefono(JOptionPane.showInputDialog("Digite el nuevo numero telefonico "));
                this.obj_doctor.setDepartamento(JOptionPane.showInputDialog("Digite el nuevo departamento "));
            }else{
                bw.write(regi);
                bw.flush();
                bw.newLine();
            }    
        }
        br.close();
        bw.close();
        db.delete();
        temp.renameTo(db);
       
        if(valida==1){
            JOptionPane.showMessageDialog(null, "Se ha actualizado la data  del doctor");
        
        }else{
            JOptionPane.showMessageDialog(null, "Doctor no encontrado");
        }
        
        }catch(Exception e){
            e.printStackTrace();
        } 
}
}
