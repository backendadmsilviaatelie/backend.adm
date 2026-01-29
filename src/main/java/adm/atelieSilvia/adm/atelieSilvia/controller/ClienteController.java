package adm.atelieSilvia.adm.atelieSilvia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import adm.atelieSilvia.adm.atelieSilvia.model.ClienteModel;
import adm.atelieSilvia.adm.atelieSilvia.repository.ClienteRepository;
import adm.atelieSilvia.adm.atelieSilvia.service.ClienteService;

@CrossOrigin
@RestController
@RequestMapping("/admAtelie/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/save")
	public ResponseEntity<ClienteModel> save(@RequestBody ClienteModel cliente) {
		return ResponseEntity.ok(clienteService.save(cliente));
	}
	
    @GetMapping("/find")
    public ResponseEntity<List<ClienteModel>> find(@RequestParam String nomeCliente) {
     
        return ResponseEntity.ok(clienteService.find(nomeCliente));
    }
    
    @PostMapping("/update")
	public ResponseEntity<ClienteModel> update(@RequestBody ClienteModel cliente) {
		return ResponseEntity.ok(clienteService.save(cliente));
	}
}


