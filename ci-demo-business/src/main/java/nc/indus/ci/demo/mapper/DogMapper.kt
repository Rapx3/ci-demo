package nc.indus.ci.demo.mapper

import nc.indus.ci.demo.dto.Dog
import nc.indus.ci.demo.entities.DogEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface DogMapper {

    @Mapping(source = "name", target = "name")
    fun toDto(dogEntity: DogEntity): Dog
}
