package cl.cbarros.security.repo;

import cl.cbarros.security.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository <Role, Long> {

    Role findByName(String roleName );

}
