import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/Interface/persona';
import { ApiService } from 'src/app/services/api.service';


@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  styleUrls: ['./personas.component.css']
})
export class PersonasComponent implements OnInit {
  personas: Persona[] = [];
  personaSeleccionada: Persona | null = null;

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    this.consultarPersonas();
  }

  consultarPersonas() {
    this.apiService.consultarPersonas().subscribe(
      personas => {
        this.personas = personas;
      },
      error => {
        console.log('Error al consultar las personas:', error);
      }
    );
  }

  buscarPersona(id: number) {
    this.apiService.buscarPersona(id).subscribe(
      persona => {
        this.personaSeleccionada = persona;
      },
      error => {
        console.log('Error al buscar la persona:', error);
      }
    );
  }

  eliminarPersona(id: number) {
    this.apiService.eliminarPersona(id).subscribe(
      () => {
        this.consultarPersonas();
      },
      error => {
        console.log('Error al eliminar la persona:', error);
      }
    );
  }

  crearPersona(persona: Persona) {
    this.apiService.crearPersona(persona).subscribe(
      () => {
        this.consultarPersonas();
      },
      error => {
        console.log('Error al crear la persona:', error);
      }
    );
  }

  modificarPersona(persona: Persona) {
    this.apiService.modificarPersona(persona).subscribe(
      () => {
        this.consultarPersonas();
      },
      error => {
        console.log('Error al modificar la persona:', error);
      }
    );
  }
}
