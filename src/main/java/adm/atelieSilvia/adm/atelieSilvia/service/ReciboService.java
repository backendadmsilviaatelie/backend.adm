package adm.atelieSilvia.adm.atelieSilvia.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import adm.atelieSilvia.adm.atelieSilvia.model.ReciboModel;
import adm.atelieSilvia.adm.atelieSilvia.repository.ReciboRepository;

@Service
public class ReciboService {

	private final ReciboRepository reciboRepository;

	// Injeção de dependência via construtor
	public ReciboService(ReciboRepository reciboRepository) {
		this.reciboRepository = reciboRepository;
	}

	public ReciboModel save(ReciboModel recibo) {
		return reciboRepository.save(recibo);
	}
	
	public Long  lastId() {
		return reciboRepository.findUltimoId();
	}
	public Optional<ReciboModel> findReciboById(Long id) {
		return reciboRepository.findById(id);
	}
}