package nc.indus.ci.demo.controller

import nc.indus.ci.demo.dto.Dog
import nc.indus.ci.demo.service.DogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dogs")
class DogController {

    @Autowired
    lateinit var dogService: DogService

    /**
     * This return a dog
     *
     * @param name
     * @return a [Dog]
     */
    @GetMapping("/{name}")
    fun getDogByName(@PathVariable("name") name: String): ResponseEntity<Dog> {
        return ResponseEntity.ok(dogService.getDogByName(name))
    }

}
