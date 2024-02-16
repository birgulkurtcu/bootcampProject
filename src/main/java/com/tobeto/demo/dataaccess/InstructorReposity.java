package com.tobeto.demo.dataaccess;

import com.tobeto.demo.entities.Instructer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorReposity extends JpaRepository<Instructer,Integer> {
}
