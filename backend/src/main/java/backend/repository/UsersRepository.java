package backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,UUID> {
    
    Users findByUsername(String username);

    Users findByEmail(String email);
}
