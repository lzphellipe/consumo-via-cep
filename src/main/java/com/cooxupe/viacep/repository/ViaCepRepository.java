package com.cooxupe.viacep.repository;

import java.math.BigDecimal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooxupe.viacep.registro.ViaCepRetornoTabela;



@Repository
public interface ViaCepRepository  extends JpaRepository<ViaCepRetornoTabela, BigDecimal>{
	

}
