package com.cooxupe.viacep.registro;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="XCXP_DADOS_RETORNO_VIACEP")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViaCepRetornoTabela {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "XCXP_DADOS_RETORNO_VIACEP_S")
    @SequenceGenerator(sequenceName = "XCXP_DADOS_RETORNO_VIACEP_S", allocationSize = 1, name = "XCXP_DADOS_RETORNO_VIACEP_S")
	@Column(name="id_controle_cep")
	private BigDecimal idControleCep;
	
	@Column(name="nr_cep")
	private BigDecimal numeroCep ;
	
	@Column(name="ds_logradouro")
	private String descricaoLogradouro;
	
	@Column(name="ds_complemento")
	private String descricaoComplemento;
	
	@Column(name="ds_bairro")
	private String descricaoBairro;
	
	@Column(name="ds_localidade")
	private String descricaoLocalidade;
	
	
	@Column(name="ds_uf")
	private String descricaoUf;
	
	@Column(name="nr_ibge")
	private String numeroIbeg;
	
	@Column(name="ds_gia")
	private String descricaoGia;
   
	@Column(name="nr_ddd")
	private String  numeroDdd;
	
	@Column(name="nr_siafi")
	private String numeroSiafi;

}

