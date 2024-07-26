package com.ntd.aritmetic.calculator.domain.repository;

import com.ntd.aritmetic.calculator.domain.entity.UserEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
