package cn.ssijri.springboot.mapper;

import cn.ssijri.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author inta
 * @date 2019/3/17
 * @describe
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Integer id);
}
