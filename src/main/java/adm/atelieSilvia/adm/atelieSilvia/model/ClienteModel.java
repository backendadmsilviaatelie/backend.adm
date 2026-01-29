package adm.atelieSilvia.adm.atelieSilvia.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "adm_cliente")
public class ClienteModel {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adm_cliente_id")
	private Long idClienteAdm;

	@Column(name = "adm_cliente_nome")
	private String nomeClienteAdm;

	@Column(name = "adm_cliente_telefone")
	private String telefoneClienteAdm;

	@Column(name = "endereco_cliente_telefone")
	private String enderecoClienteAdm;
	
	@Column(name = "info_cliente_telefone")
	private String infClienteAdm;
	
	// Construtor padrão exigido pelo JPA
		public ClienteModel() {
		}
	
	public Long getIdClienteAdm() {
		return idClienteAdm;
	}

	public void setIdClienteAdm(Long idClienteAdm) {
		this.idClienteAdm = idClienteAdm;
	}

	public String getNomeClienteAdm() {
		return nomeClienteAdm;
	}

	public void setNomeClienteAdm(String nomeClienteAdm) {
		this.nomeClienteAdm = nomeClienteAdm;
	}

	public String getTelefoneClienteAdm() {
		return telefoneClienteAdm;
	}

	public void setTelefoneClienteAdm(String telefoneClienteAdm) {
		this.telefoneClienteAdm = telefoneClienteAdm;
	}

	public String getEnderecoClienteAdm() {
		return enderecoClienteAdm;
	}

	public void setEnderecoClienteAdm(String enderecoClienteAdm) {
		this.enderecoClienteAdm = enderecoClienteAdm;
	}

	public String getInfClienteAdm() {
		return infClienteAdm;
	}

	public void setInfClienteAdm(String infClienteAdm) {
		this.infClienteAdm = infClienteAdm;
	}
	
	

}
