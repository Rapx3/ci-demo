package nc.indus.ci.demo.service


import nc.indus.ci.demo.dto.Dog
import org.springframework.stereotype.Component

@Component
class DogService {

    fun getDogByName(name: String): Dog {
        return Dog(name = name)
    }
}
