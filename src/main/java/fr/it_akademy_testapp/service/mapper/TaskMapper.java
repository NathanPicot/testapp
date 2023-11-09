package fr.it_akademy_testapp.service.mapper;

import fr.it_akademy_testapp.domain.Task;
import fr.it_akademy_testapp.service.dto.TaskDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {}
