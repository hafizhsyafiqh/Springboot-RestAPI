package net.syafiqh.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.syafiqh.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
