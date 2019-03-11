package cn.ssijri.springboot.controller;

import cn.ssijri.springboot.dao.DepartmentDao;
import cn.ssijri.springboot.dao.EmployeeDao;
import cn.ssijri.springboot.entities.Department;
import cn.ssijri.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collection;

/**
 * @author inta
 * @date 2019/3/7
 * @describe
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    //查询所有员工返回列表
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();

        //放在请求域中
        model.addAttribute("emps",employees);
        //thymeleaf默认会拼串
        //classpath:/templates/xxx.html
        return "emp/list";
    }

    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        //返回到添加页面
        return "emp/add";
    }

    //添加员工信息
    //employee参数能传入的原因是SpringMVC的参数绑定，注意参数内属性名和JavaBean是否一致
    @PostMapping("/emp")
    public String addEmp(Employee employee){

//        System.out.println(employee+"员工信息");
        //添加员工信息
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //来到修改页面，查出当前员工，在页面回显
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        //页面要显示所有的部门列表
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        //add页面是一个修改添加二合一的页面
        return "emp/add";
    }
    //员工修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){

        employeeDao.save(employee);
        //返回到员工信息列表
        return "redirect:/emps";
    }
}
