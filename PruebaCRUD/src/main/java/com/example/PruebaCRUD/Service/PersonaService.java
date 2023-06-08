package com.example.PruebaCRUD.Service;

import com.example.PruebaCRUD.Entity.Persona; // Importa la clase Persona del paquete com.example.PruebaCRUD.Entity.

import java.util.List; // Importa la clase List del paquete java.util.

public interface PersonaService {

    public List<Persona> ConsultarPersona(); // Método que declara una lista de personas y devuelve la lista completa de personas.

    public Persona crearPersonaPersona(Persona persona); // Método que crea una nueva persona y la guarda en la base de datos.

    public Persona modificarPersona(Persona persona); // Método que modifica una persona existente en la base de datos.

    public Persona BuscarPersona(int id); // Método que busca una persona por su ID en la base de datos y devuelve la persona encontrada.

    public void EliminarPersona(int id); // Método que elimina una persona de la base de datos dado su ID.
}
