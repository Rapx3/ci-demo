package nc.indus.cidemo;

import nc.indus.cidemo.business.dto.Dog;
import nc.indus.cidemo.controller.DogController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest(DogController.class)
public class DogControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	DogController dogController;

	@Test
	public void testGetDog() throws Exception {
		//given
		Dog dog = new Dog();
		dog.setName("Hector");
		dog.setColor("brown");

		//when
		when(dogController.getDogByName("hector")).thenReturn(ResponseEntity.ok(dog));

		//then
		mockMvc.perform(get("/dogs/hector"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(jsonPath("$.name", is("Hector")))
				.andExpect(jsonPath("$.color", is("brown")));

		verify(dogController, times(1)).getDogByName("hector");
		verifyNoMoreInteractions(dogController);
	}
}
