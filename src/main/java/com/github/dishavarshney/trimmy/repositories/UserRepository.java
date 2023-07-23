/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.dishavarshney.trimmy.repositories;

import com.github.dishavarshney.trimmy.entity.Users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Disha Varshney
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    public Optional<Users> findByUsername(String username);

    public Optional<Users> findByToken(String token);
}
