package cn.ssijri.springboot.mapper;

import cn.ssijri.springboot.bean.Employee;

/**
 * @author inta
 * @date 2019/3/18
 * @describe   使用非注解的配置文件方式整合mybatis
 */
//@Mapper或者MapperScan将接口扫描到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
