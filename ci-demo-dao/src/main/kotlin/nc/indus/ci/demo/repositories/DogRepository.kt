package nc.indus.ci.demo.repositories

import nc.indus.ci.demo.entities.DogEntity
import org.springframework.data.jpa.repository.JpaRepository

interface DogRepository : JpaRepository<DogEntity, Long>
