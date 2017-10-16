package com.cllfst.dao;


import com.cllfst.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description of the file UserRepository.java <br>
 *
 * @author ahmed ksentini
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserByIdUser(Long id);
    //void removeUserByIdUser(Long id);
    User findUserByUsername(String username);
    void deleteUserByUsername(String username);

}
