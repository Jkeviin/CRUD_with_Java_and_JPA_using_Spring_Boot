package com.example.PruebaCRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Humano")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Se utiliza para generar automáticamente valores únicos para el campo "id"

    @Column(name = "id")
    private int id;
    // El campo "id" representa la identificación única de la persona

    @Column(name = "nombre")
    private String nombre;
    // El campo "nombre" representa el nombre de la persona

    @Column(name = "apellido")
    private String apellido;
    // El campo "apellido" representa el apellido de la persona

    @Column(name = "email")
    private String email;
    // El campo "email" representa la dirección de correo electrónico de la persona

    @Column(name = "edad")
    private int edad;
    // El campo "edad" representa la edad de la persona

    @Column(name = "sexo")
    private String sexo;
    // El campo "sexo" representa el género de la persona

    @Column(name = "clave")
    private int clave;
    // El campo "clave" representa una clave numérica asociada a la persona

    public int getId() {
        return id;
    }
    // Método getter para obtener el valor del campo "id"

    public void setId(int id) {
        this.id = id;
    }
    // Método setter para establecer el valor del campo "id"

    public String getNombre() {
        return nombre;
    }
    // Método getter para obtener el valor del campo "nombre"

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método setter para establecer el valor del campo "nombre"

    public String getApellido() {
        return apellido;
    }
    // Método getter para obtener el valor del campo "apellido"

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // Método setter para establecer el valor del campo "apellido"

    public String getEmail() {
        return email;
    }
    // Método getter para obtener el valor del campo "email"

    public void setEmail(String email) {
        this.email = email;
    }
    // Método setter para establecer el valor del campo "email"

    public int getEdad() {
        return edad;
    }
    // Método getter para obtener el valor del campo "edad"

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Método setter para establecer el valor del campo "edad"

    public String getSexo() {
        return sexo;
    }
    // Método getter para obtener el valor del campo "sexo"

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Método setter para establecer el valor del campo "sexo"

    public int getClave() {
        return clave;
    }
    // Método getter para obtener el valor del campo "clave"

    public void setClave(int clave) {
        this.clave = clave;
    }
    // Método setter para establecer el valor del campo "clave"
}
