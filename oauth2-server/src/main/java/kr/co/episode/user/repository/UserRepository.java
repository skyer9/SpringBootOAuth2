package kr.co.episode.user.repository;

import kr.co.episode.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.userName = :username")
    User findByUsername(@Param("username") String username);
}
