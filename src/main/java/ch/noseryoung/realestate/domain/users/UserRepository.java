package ch.noseryoung.realestate.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository  extends JpaRepository<User, UUID> {
    List<User> findByNameLike(String nameCriteria);
}
