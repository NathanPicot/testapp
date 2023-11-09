package fr.it_akademy_testapp.service.mapper;

import fr.it_akademy_testapp.domain.Country;
import fr.it_akademy_testapp.domain.Location;
import fr.it_akademy_testapp.service.dto.CountryDTO;
import fr.it_akademy_testapp.service.dto.LocationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Location} and its DTO {@link LocationDTO}.
 */
@Mapper(componentModel = "spring")
public interface LocationMapper extends EntityMapper<LocationDTO, Location> {
    @Mapping(target = "country", source = "country", qualifiedByName = "countryId")
    LocationDTO toDto(Location s);

    @Named("countryId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CountryDTO toDtoCountryId(Country country);
}
