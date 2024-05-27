package br.com.agenda.cifep.controller.reserva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.cifep.dto.reserva.ReservaDTO;
import br.com.agenda.cifep.service.reserva.CreateReservaService;

@RestController
@RequestMapping("/")
public class CreateReservaController {
	
	
	@Autowired 
	CreateReservaService createReservaService;

	
	
	 
	@PostMapping("new/scheduled/reserva")
	public ResponseEntity<HttpStatus> criarReservaEventual(@RequestBody ReservaDTO reservaDTO) {
	 
		boolean reservaRealizada = createReservaService.novaReservaAgendadaEventual(reservaDTO);

	    if (reservaRealizada) {
	        return ResponseEntity.ok(HttpStatus.OK);
		    } else {
		        return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);		                
		    } 	        
		 
	}
	
	
	@PostMapping("new/scheduled-full-year/reserva")
	public ResponseEntity<HttpStatus> criarReservaAgendadaAnual(@RequestBody List<ReservaDTO> reservaDTO) {
	 
		boolean reservaRealizada = createReservaService.novaReservaAgendadaAnual(reservaDTO);

		if (reservaRealizada) {
	        return ResponseEntity.ok(HttpStatus.OK);
		    } else {
		        return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);		                
		    }	        
		 
	}
	
	
	
	
	@PostMapping("new/scheduled-multiple/reserva")
	public ResponseEntity<HttpStatus> criarReservaAgendadaMultipla(@RequestBody List<ReservaDTO>reservaDTO) {
		boolean reservaRealizada = createReservaService.createReservaMultipla(reservaDTO);
		
		if (reservaRealizada) {
	        return ResponseEntity.ok(HttpStatus.OK);
		    } else {
		        return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);		                
		    } 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PutMapping("fechar/reserva")
//	public ResponseEntity<String> finalizarReserva()
	
	
}
