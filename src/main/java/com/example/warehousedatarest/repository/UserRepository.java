package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.User;
import com.example.warehousedatarest.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByFirstNameAndLastNameAndPhoneNumber( String first_name, String last_name, String phone_number);
    boolean existsByPhoneNumber(String phone_number);
}
