import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';
=======
>>>>>>> e34892db9a137a6b87961e9e6d3e807ba627cd47

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
<<<<<<< HEAD
persona: persona= new persona("","","");
  
constructor(public personaService: PersonaService) { }

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona= data})
=======

  constructor() { }

  ngOnInit(): void {
>>>>>>> e34892db9a137a6b87961e9e6d3e807ba627cd47
  }

}
