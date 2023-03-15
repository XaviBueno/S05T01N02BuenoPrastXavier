package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.services;


import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.dto.FlorDto;


public interface FlorsServices {
	
	FlorEntity desarFlor(FlorDto flor);
	

}
