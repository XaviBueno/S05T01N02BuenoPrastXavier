package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.dto.FlorDto;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.repositories.FlorsRepository;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.services.FlorsServicesImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RestController

@Data

@AllArgsConstructor
public class FlorsControllers {
	
	
	@Autowired
	public FlorsRepository florsRepository;
	@Autowired
	FlorsServicesImpl florsServicesImpl;
	
	@PostMapping("/flor/add")
	
	ResponseEntity<String> crearFlor(@RequestBody FlorDto florDto){
		
		FlorEntity florEntity;
		
		florEntity=florsRepository.findByNomFlor(florDto.getNomFlor());
		if(florEntity==null) {
			florsServicesImpl.desarFlor(florDto);
			return new ResponseEntity<String>("Flor creada",HttpStatus.CREATED);
			
		}
		else {
			return new ResponseEntity<String>("La flor ja existeix",HttpStatus.BAD_REQUEST);
			
		}
		
	}
	
	
	@PutMapping ("/flor/add")
	ResponseEntity<String> acualitzarFlor(@RequestBody FlorDto florDto){
		FlorEntity florEntity;
		
		florEntity=florsRepository.findByNomFlor(florDto.getNomFlor());
		if(florEntity!=null) {
			florsServicesImpl.desarFlor(florDto);
			return new ResponseEntity<String>("Flor modificada",HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<String>("La flor no existeix",HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/flor/delete/{id}")
	
	ResponseEntity<String> esborrarFlor(@PathVariable  long id){
		
		
		
		
	}

}
