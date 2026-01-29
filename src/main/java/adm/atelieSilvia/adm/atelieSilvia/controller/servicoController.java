package adm.atelieSilvia.adm.atelieSilvia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adm.atelieSilvia.adm.atelieSilvia.model.ClienteModel;
import adm.atelieSilvia.adm.atelieSilvia.model.ServicoModel;
import adm.atelieSilvia.adm.atelieSilvia.service.ClienteService;
import adm.atelieSilvia.adm.atelieSilvia.service.ServicoService;

@CrossOrigin
@RestController
@RequestMapping("/admAtelie/api/servico")
public class servicoController {

	private ServicoService servicoService;

	@PostMapping("/save")
	public ResponseEntity<ServicoModel> save(@RequestBody ServicoModel servico) {
		return ResponseEntity.ok(servicoService.save(servico));
	}
}
