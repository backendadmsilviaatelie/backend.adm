package adm.atelieSilvia.adm.atelieSilvia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adm.atelieSilvia.adm.atelieSilvia.model.ReciboModel;
import adm.atelieSilvia.adm.atelieSilvia.model.ServicoModel;
import adm.atelieSilvia.adm.atelieSilvia.service.ReciboService;
import adm.atelieSilvia.adm.atelieSilvia.service.ServicoService;

@CrossOrigin
@RestController
@RequestMapping("/admAtelie/api/recibo")
public class ReciboContoller {

	@Autowired
	private ReciboService reciboService;

	@PostMapping("/save")
	public ResponseEntity<ReciboModel> save(@RequestBody ReciboModel recibo) {
		return ResponseEntity.ok(reciboService.save(recibo));
	}
	
	@GetMapping("/lastId")
	public ResponseEntity<Long> lastId() {
		return ResponseEntity.ok(reciboService.lastId());
	}
	
	@GetMapping("/findById")
	public ResponseEntity<Optional<ReciboModel>> FindRecibo(Long id) {
		return ResponseEntity.ok(reciboService.findReciboById(id));
	}
}
