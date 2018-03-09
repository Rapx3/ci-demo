package nc.indus.cidemo.controller;

import nc.indus.cidemo.business.dto.Dog;
import nc.indus.cidemo.business.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    DogService dogService;

    @RequestMapping("/{name}")
    Dog getDogByName(@RequestAttribute(name = "name") String name) {
        return dogService.getDogByName(name);
    }

}
