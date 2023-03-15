package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.repositories;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.domain.FlorEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlorsRepository extends JpaRepository<FlorEntity, Long>{
	
	

	FlorEntity findByNomFlor(String nomFlor);

}
