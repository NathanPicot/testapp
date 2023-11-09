package fr.it_akademy_testapp.service.mapper;

import fr.it_akademy_testapp.domain.Region;
import fr.it_akademy_testapp.service.dto.RegionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Region} and its DTO {@link RegionDTO}.
 */
@Mapper(componentModel = "spring")
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {}
