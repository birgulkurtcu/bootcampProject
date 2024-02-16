package com.tobeto.demo.webapi;

@RestController("/employees")
public class EmployeesController {

    private EmployeeRepository employeeRepository;

    public EmployeesController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @RequestMapping("/add")
    public void add() {
        Employee employee = new Employee();
        employee.setUserName("brgl");
        employee.setEmail("brgl@gmail.com");
        employee.setPosition("Information Technologies");
        employeeRepository.save(employee);
    }
}@RestController("/employees")
public class EmployeesController {

    private EmployeeRepository employeeRepository;

    public EmployeesController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @RequestMapping("/add")
    public void add() {
        Employee employee = new Employee();
        employee.setUserName("doejane");
        employee.setEmail("doejane@gmail.com");
        employee.setPosition("Information Technologies");
        employeeRepository.save(employee);
    }
}
