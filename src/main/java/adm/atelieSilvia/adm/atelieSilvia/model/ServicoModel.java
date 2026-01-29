package adm.atelieSilvia.adm.atelieSilvia.model;


import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "adm_servico")
public class ServicoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "adm_servico_id")
	private Long idServicoAdm;

	@Column(name = "adm_servico_servico")
	private String nomeServicoadm;

	@Column(name = "adm_servico_valor")
	private double valorServicoAdm;

}
