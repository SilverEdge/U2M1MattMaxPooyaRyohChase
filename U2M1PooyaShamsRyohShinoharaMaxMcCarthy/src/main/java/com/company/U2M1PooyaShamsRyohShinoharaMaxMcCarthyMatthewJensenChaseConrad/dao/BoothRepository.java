package com.company.U2M1PooyaShamsRyohShinoharaMaxMcCarthyMatthewJensenChaseConrad.dao;

import com.company.U2M1PooyaShamsRyohShinoharaMaxMcCarthyMatthewJensenChaseConrad.model.Booth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoothRepository extends JpaRepository <Booth, Integer> {
}
