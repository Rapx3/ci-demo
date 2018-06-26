package nc.indus.ci.demo.mapper;

import nc.indus.ci.demo.dto.Dog;
import nc.indus.ci.demo.entities.DogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DogMapper {

	@Mapping(source = "name", target = "name")
	@Mapping(source = "color", target = "color")
	Dog toDto(DogEntity dogEntity);
}
