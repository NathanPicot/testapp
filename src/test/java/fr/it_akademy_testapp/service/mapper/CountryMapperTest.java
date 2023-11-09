package fr.it_akademy_testapp.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class CountryMapperTest {

    private CountryMapper countryMapper;

    @BeforeEach
    public void setUp() {
        countryMapper = new CountryMapperImpl();
    }
}
