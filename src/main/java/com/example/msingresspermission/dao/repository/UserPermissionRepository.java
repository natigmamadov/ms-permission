package com.example.msingresspermission.dao.repository;

import com.example.msingresspermission.dao.entity.UserPermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserPermissionRepository extends JpaRepository<UserPermissionEntity,Long> {
    Optional<UserPermissionEntity> findByUserIdAndPermissionNameAndProductName(
            Long id,
            String permissionName,
            String productName);
}
