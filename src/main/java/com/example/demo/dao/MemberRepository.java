package com.example.demo.dao;

import com.example.demo.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    //translates to sql SELECT * whatever email passed
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Member> findMemberByEmail(String email);


}
