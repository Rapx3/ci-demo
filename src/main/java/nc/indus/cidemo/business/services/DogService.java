package nc.indus.cidemo.business.services;

import nc.indus.cidemo.business.dto.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogService {

    public Dog getDogByName(String name) {
        Dog dog = new Dog();
        dog.setName(name);

        return dog;
    }
}
