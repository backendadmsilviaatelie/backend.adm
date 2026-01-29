package adm.atelieSilvia.adm.atelieSilvia.model;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "adm_recibo")
public class ReciboModel {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "adm_recibo_id")
	private Long idReciboAdm;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adm_cliente_id", nullable = false)
	private ClienteModel cliente;
	
	@Column(name = "adm_recibo_data_pag")
	private LocalDate dataPagReciboAdm;

	@Column(name = "adm_recibo_valor_total")
	private Double valorTotalReciboAdm;

	@Column(name = "adm_recibo_forma_pagamento")
	private String formaPagamentoReciboAdm;

	@Column(name = "adm_recibo_data_entrada")
	private LocalDate dataEntradaReciboAdm;

	@Column(name = "adm_recibo_data_saida")
	private LocalDate dataSaidaReciboAdm;
	
	@Column(name = "adm_recibo_inf_add")
	private String infAddReciboAdm;

	// Construtor padrão exigido pelo JPA
	public ReciboModel() {
	}

	// Getters e Setters (omitidos para brevidade, mas devem estar aqui)

	public Long getIdReciboAdm() {
		return idReciboAdm;
	}

	public void setIdReciboAdm(Long idReciboAdm) {
		this.idReciboAdm = idReciboAdm;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataPagReciboAdm() {
		return dataPagReciboAdm;
	}

	public void setDataPagReciboAdm(LocalDate dataPagReciboAdm) {
		this.dataPagReciboAdm = dataPagReciboAdm;
	}

	public Double getValorTotalReciboAdm() {
		return valorTotalReciboAdm;
	}

	public void setValorTotalReciboAdm(Double valorTotalReciboAdm) {
		this.valorTotalReciboAdm = valorTotalReciboAdm;
	}

	public String getFormaPagamentoReciboAdm() {
		return formaPagamentoReciboAdm;
	}

	public void setFormaPagamentoReciboAdm(String formaPagamentoReciboAdm) {
		this.formaPagamentoReciboAdm = formaPagamentoReciboAdm;
	}

	public LocalDate getDataEntradaReciboAdm() {
		return dataEntradaReciboAdm;
	}

	public void setDataEntradaReciboAdm(LocalDate dataEntradaReciboAdm) {
		this.dataEntradaReciboAdm = dataEntradaReciboAdm;
	}

	public LocalDate getDataSaidaReciboAdm() {
		return dataSaidaReciboAdm;
	}

	public void setDataSaidaReciboAdm(LocalDate dataSaidaReciboAdm) {
		this.dataSaidaReciboAdm = dataSaidaReciboAdm;
	}

	public String getInfAddReciboAdm() {
		return infAddReciboAdm;
	}

	public void setInfAddReciboAdm(String infAddReciboAdm) {
		this.infAddReciboAdm = infAddReciboAdm;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ReciboModel that = (ReciboModel) o;
		return idReciboAdm != null && Objects.equals(idReciboAdm, that.idReciboAdm);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReciboAdm);
	}
	 @Override
	public String toString() {
		return "ReciboModel{" +
				"idReciboAdm=" + idReciboAdm +
				", dataPagReciboAdm=" + dataPagReciboAdm +
				", valorTotalReciboAdm=" + valorTotalReciboAdm +
				// Adicione outros campos importantes para depuração
				'}';
	}
}
