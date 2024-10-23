package br.com.senai.recados1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.recados1.entity.Recado;

@Repository
public interface RecadoRepository extends JpaRepository<Recado, Long>{

}
