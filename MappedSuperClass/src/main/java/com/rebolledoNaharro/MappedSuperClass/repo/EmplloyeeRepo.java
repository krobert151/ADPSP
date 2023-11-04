package com.rebolledoNaharro.MappedSuperClass.repo;

import com.rebolledoNaharro.MappedSuperClass.modals.Employee;
import com.rebolledoNaharro.MappedSuperClass.modals.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.spi.LocaleNameProvider;

@Repository
public interface EmplloyeeRepo extends JpaRepository<Employee, Long> {


}
