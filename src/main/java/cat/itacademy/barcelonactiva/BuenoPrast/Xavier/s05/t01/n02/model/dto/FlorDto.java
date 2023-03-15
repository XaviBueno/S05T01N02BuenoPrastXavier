package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.dto;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.domain.FlorEntity;


import java.util.ArrayList;
import java.util.Arrays;

import lombok.Data;


@Data

public class FlorDto {
	
	private final ArrayList<String> paisos =new ArrayList<String>(Arrays.asList(
			"Alemania",
			"Bélgica",
			"Croacia",
			"Dinamarca",
			"España",
			"Francia",
			"Irlanda",
			"Letonia",
			"Luxemburgo",
			"PaísesBajos",
			"Suecia",
			"Bulgaria",
			"Eslovaquia",
			"Estonia",
			"Grecia",
			"Malta",
			"Polonia",
			"RepúblicaCheca",
			"Austria",
			"Chipre",
			"Eslovenia",
			"Finlandia",
			"Hungría",
			"Italia",
			"Lituania",
			"Portugal",
			"Rumanía"));
	
	private long  pk_FlorID;
	
	private String nomFlor;
		
	private String paisFlor;
	
	private String tipusFlor;
	

	
	
}
	
	

