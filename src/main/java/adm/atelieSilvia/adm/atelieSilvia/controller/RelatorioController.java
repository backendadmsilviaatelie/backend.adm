package adm.atelieSilvia.adm.atelieSilvia.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import adm.atelieSilvia.adm.atelieSilvia.model.ReciboModel;
import adm.atelieSilvia.adm.atelieSilvia.service.ReciboService;

public class RelatorioController {

	ReciboService reciboService;
	
	@GetMapping("/buscaPorPeriodo")
	public ResponseEntity<List<ReciboModel>> buscaPorPeriodo(
	        @RequestParam("dataInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicial,
	        @RequestParam("dataFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFinal) {

	    return ResponseEntity.ok(
	        reciboService.findReciboPorPeriodo(dataInicial, dataFinal)
	    );
	}
}
