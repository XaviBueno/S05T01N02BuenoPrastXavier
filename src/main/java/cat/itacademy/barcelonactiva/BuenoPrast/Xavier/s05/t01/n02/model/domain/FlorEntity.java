package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.domain;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n02.model.dto.FlorDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="flors")
public class FlorEntity {
	
	@Id
	@Column(name=" pk_FlorID")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long  pk_FlorID;
	
	@Column(name="nomFlor")
	
	private String nomFlor;
	
	@Column(name="paisFlor")
	
	private String paisFlor;
	
	public FlorEntity(FlorDto florDto) {
		this.pk_FlorID=florDto.getPk_FlorID();
		this.nomFlor=florDto.getNomFlor();
		this.paisFlor=florDto.getPaisFlor();
		
	}
	

}
