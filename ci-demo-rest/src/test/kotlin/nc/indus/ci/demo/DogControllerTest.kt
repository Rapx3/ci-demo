package nc.indus.ci.demo

import nc.indus.ci.demo.controller.DogController
import nc.indus.ci.demo.dto.Dog
import nc.indus.ci.demo.service.DogService
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@ExtendWith(SpringExtension::class)
@WebMvcTest(DogController::class)
class DogControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var dogService: DogService

    @Test
    @Throws(Exception::class)
    fun testGetDog() {
        //given
        val dog = Dog("Hector", "brown")

        //when
        `when`(dogService.getDogByName("hector")).thenReturn(dog)

        //then
        mockMvc.perform(get("/dogs/hector"))
                .andExpect(status().isOk)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.name", `is`("Hector")))
                .andExpect(jsonPath("$.color", `is`("brown")))
    }
}