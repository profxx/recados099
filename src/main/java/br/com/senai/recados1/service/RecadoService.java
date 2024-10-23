package br.com.senai.recados1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.recados1.entity.Recado;
import br.com.senai.recados1.repository.RecadoRepository;

@Service
public class RecadoService {

	@Autowired
	private RecadoRepository recadoRepository;
	
	public List<Recado> findAll(){
		return recadoRepository.findAll();
	}
	public Recado findById(Long id) {
		return recadoRepository.findById(id).orElse(null);
	}
	public Recado insertNew(Recado recado) {
		return recadoRepository.save(recado);
	}
	public Recado update(Long id, Recado recadoAlterado) {
		Recado recadoAtual = findById(id);
		recadoAtual.setMensagem(recadoAlterado.getMensagem());
		recadoAtual.setLida(recadoAlterado.getLida());
		return recadoRepository.save(recadoAtual);
	}
	public Boolean deleteById(Long id) {
		Recado recado = findById(id);
		if (recado == null) {
			return false;
		}else {
			recadoRepository.deleteById(id);
			return true;
		}
	}
	
	
	
	
	
}
