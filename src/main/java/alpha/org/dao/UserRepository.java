package alpha.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alpha.org.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String str);
}
