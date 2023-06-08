import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Persona } from '../Interface/persona';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private baseUrl = 'http://localhost:8080/CRUDRepo';

  constructor(private http: HttpClient) { }

  consultarPersonas(): Observable<Persona[]> {
    return this.http.get<Persona[]>(`${this.baseUrl}/ConsultarPersonas`);
  }

  crearPersona(persona: Persona): Observable<Persona> {
    return this.http.post<Persona>(`${this.baseUrl}/CrearPersonas`, persona);
  }

  modificarPersona(persona: Persona): Observable<Persona> {
    return this.http.put<Persona>(`${this.baseUrl}/ModificarPersonas`, persona);
  }

  buscarPersona(id: number): Observable<Persona> {
    return this.http.get<Persona>(`${this.baseUrl}/BuscarPersona/${id}`);
  }

  eliminarPersona(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/EliminarPersona/${id}`);
  }
}
