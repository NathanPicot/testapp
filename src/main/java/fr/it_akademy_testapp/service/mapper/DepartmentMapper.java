package fr.it_akademy_testapp.service.mapper;

import fr.it_akademy_testapp.domain.Department;
import fr.it_akademy_testapp.domain.Location;
import fr.it_akademy_testapp.service.dto.DepartmentDTO;
import fr.it_akademy_testapp.service.dto.LocationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Department} and its DTO {@link DepartmentDTO}.
 */
@Mapper(componentModel = "spring")
public interface DepartmentMapper extends EntityMapper<DepartmentDTO, Department> {
    @Mapping(target = "location", source = "location", qualifiedByName = "locationId")
    DepartmentDTO toDto(Department s);

    @Named("locationId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    LocationDTO toDtoLocationId(Location location);
}
