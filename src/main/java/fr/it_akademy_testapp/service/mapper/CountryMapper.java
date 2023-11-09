package fr.it_akademy_testapp.service.mapper;

import fr.it_akademy_testapp.domain.Country;
import fr.it_akademy_testapp.domain.Region;
import fr.it_akademy_testapp.service.dto.CountryDTO;
import fr.it_akademy_testapp.service.dto.RegionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Country} and its DTO {@link CountryDTO}.
 */
@Mapper(componentModel = "spring")
public interface CountryMapper extends EntityMapper<CountryDTO, Country> {
    @Mapping(target = "region", source = "region", qualifiedByName = "regionId")
    CountryDTO toDto(Country s);

    @Named("regionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RegionDTO toDtoRegionId(Region region);
}
