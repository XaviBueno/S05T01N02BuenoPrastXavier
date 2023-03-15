package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.dto.FlorDto;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.repositories.FlorsRepository;


@Service

public class FlorsServicesImpl implements FlorsServices {
	
	@Autowired 
	private FlorsRepository florsRepository;

	@Override
	public FlorEntity desarFlor(FlorDto flor) {
		
		
		
		return florsRepository.save(new FlorEntity(flor));
		
	}

}
