package com.rebolledonaharro._PractRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotellaRepo extends JpaRepository<Botella,Long> {

}
