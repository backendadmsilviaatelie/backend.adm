package adm.atelieSilvia.adm.atelieSilvia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adm.atelieSilvia.adm.atelieSilvia.model.ClienteModel;
import adm.atelieSilvia.adm.atelieSilvia.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public ClienteModel save(ClienteModel cliente) {
		return clienteRepository.save(cliente);
	}
	
	
	public List<ClienteModel> find(String nome) {
		return clienteRepository.findByNomeClienteAdmContaining(nome);
	}

}
