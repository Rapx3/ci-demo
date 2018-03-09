package nc.indus.cidemo.controller;

import nc.indus.cidemo.business.dto.Dog;
import nc.indus.cidemo.business.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class DogController {

	@Autowired
	DogService dogService;

	@GetMapping("/{name}")
	public ResponseEntity<Dog> getDogByName(@PathVariable("name") String name) {
		return ResponseEntity.ok(dogService.getDogByName(name));
	}

}
