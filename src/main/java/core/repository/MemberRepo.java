package core.repository;

import core.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Long> {


    boolean existsByUSERNAME(String username);
}
