package adm.atelieSilvia.adm.atelieSilvia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admAtelie/api/health")
public class HealthController {
	
	   @GetMapping
	    public ResponseEntity<?> health() {
	        return ResponseEntity.ok("{\"status\":\"ok\"}");
	    }

}
