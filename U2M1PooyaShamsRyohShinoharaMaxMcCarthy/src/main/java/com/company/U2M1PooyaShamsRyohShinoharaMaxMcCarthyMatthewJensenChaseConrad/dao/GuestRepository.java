package com.company.U2M1PooyaShamsRyohShinoharaMaxMcCarthyMatthewJensenChaseConrad.dao;

import com.company.U2M1PooyaShamsRyohShinoharaMaxMcCarthyMatthewJensenChaseConrad.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest,Integer> {
}
