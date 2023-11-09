package fr.it_akademy_testapp.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class JobHistoryMapperTest {

    private JobHistoryMapper jobHistoryMapper;

    @BeforeEach
    public void setUp() {
        jobHistoryMapper = new JobHistoryMapperImpl();
    }
}
