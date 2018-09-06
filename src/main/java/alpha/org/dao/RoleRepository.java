package alpha.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alpha.org.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
