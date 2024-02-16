package com.tobeto.demo.webapi;

@RestController("/instructors")
public class InstructorsController {

    private InstructorRepository instructorRepository;

    public InstructorsController(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @RequestMapping("/")
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @RequestMapping("/add")
    public void add() {
        Instructor instructor = new Instructor();
        instructor.setUserName("doejane");
        instructor.setEmail("doejane@gmail.com");
        instructor.setCompanyName("doecomp");
        instructorRepository.save(instructor);
    }
}