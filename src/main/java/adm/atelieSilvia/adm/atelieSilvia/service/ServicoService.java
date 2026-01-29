package adm.atelieSilvia.adm.atelieSilvia.service;

import org.springframework.stereotype.Service;

import adm.atelieSilvia.adm.atelieSilvia.model.ClienteModel;
import adm.atelieSilvia.adm.atelieSilvia.model.ServicoModel;
import adm.atelieSilvia.adm.atelieSilvia.repository.ClienteRepository;
import adm.atelieSilvia.adm.atelieSilvia.repository.ServicoRepository;

@Service
public class ServicoService {

	private ServicoRepository servicoRepository;

	public ServicoModel save(ServicoModel servico) {
		return servicoRepository.save(servico);
	}

}
