package fr.it_akademy_testapp.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class TaskMapperTest {

    private TaskMapper taskMapper;

    @BeforeEach
    public void setUp() {
        taskMapper = new TaskMapperImpl();
    }
}
