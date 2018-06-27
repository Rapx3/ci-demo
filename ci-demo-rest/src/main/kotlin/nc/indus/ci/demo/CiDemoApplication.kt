package nc.indus.ci.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object CiDemoApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(CiDemoApplication::class.java, *args)
    }
}
