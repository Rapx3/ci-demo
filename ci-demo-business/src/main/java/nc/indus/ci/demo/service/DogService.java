package nc.indus.ci.demo.service;


import nc.indus.ci.demo.dto.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogService {

	public Dog getDogByName(String name) {
		Dog dog = new Dog();
		dog.setName(name);

		return dog;
	}
}
