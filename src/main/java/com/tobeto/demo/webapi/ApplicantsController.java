package com.tobeto.demo.webapi;

import com.tobeto.demo.dataaccess.ApplicantRepository;

@RestController("/applicants")
public class ApplicantsController {

    private ApplicantRepository applicantRepository;

    public ApplicantsController(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @RequestMapping("/")
    public List<Applicant> findAll() {
        return applicantRepository.findAll();
    }

    @RequestMapping("/add")
    public void add() {
        Applicant applicant = new Applicant();
        applicant.setUserName("doejane");
        applicant.setEmail("doejane@gmail.com");
        applicant.setAbout("Software Developer");
        applicantRepository.save(applicant);
    }
}