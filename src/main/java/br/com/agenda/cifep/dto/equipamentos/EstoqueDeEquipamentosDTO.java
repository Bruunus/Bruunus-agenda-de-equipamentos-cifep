package br.com.agenda.cifep.dto.equipamentos;

import br.com.agenda.cifep.model.Agenda;
import br.com.agenda.cifep.model.Reserva;

public class EstoqueDeEquipamentosDTO {

private Long id;
	
	 
	private String descricao;
		 
	private Integer quantidade;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	
	
	
}
