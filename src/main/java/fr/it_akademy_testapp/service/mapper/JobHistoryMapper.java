package fr.it_akademy_testapp.service.mapper;

import fr.it_akademy_testapp.domain.Department;
import fr.it_akademy_testapp.domain.Employee;
import fr.it_akademy_testapp.domain.Job;
import fr.it_akademy_testapp.domain.JobHistory;
import fr.it_akademy_testapp.service.dto.DepartmentDTO;
import fr.it_akademy_testapp.service.dto.EmployeeDTO;
import fr.it_akademy_testapp.service.dto.JobDTO;
import fr.it_akademy_testapp.service.dto.JobHistoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link JobHistory} and its DTO {@link JobHistoryDTO}.
 */
@Mapper(componentModel = "spring")
public interface JobHistoryMapper extends EntityMapper<JobHistoryDTO, JobHistory> {
    @Mapping(target = "job", source = "job", qualifiedByName = "jobId")
    @Mapping(target = "department", source = "department", qualifiedByName = "departmentId")
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    JobHistoryDTO toDto(JobHistory s);

    @Named("jobId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    JobDTO toDtoJobId(Job job);

    @Named("departmentId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DepartmentDTO toDtoDepartmentId(Department department);

    @Named("employeeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmployeeDTO toDtoEmployeeId(Employee employee);
}
