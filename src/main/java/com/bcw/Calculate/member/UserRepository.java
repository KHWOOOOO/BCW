package com.bcw.Calculate.member;

import com.bcw.Calculate.member.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserTable, Long> {

}
