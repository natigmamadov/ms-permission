package com.example.msingresspermission.service;

import com.example.msingresspermission.dao.entity.UserPermissionEntity;
import com.example.msingresspermission.dao.repository.UserPermissionRepository;
import com.example.msingresspermission.model.CheckPermissionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionService {
    private final UserPermissionRepository userPermissionRepository;

    public boolean checkPermission(CheckPermissionDto dto) {
        var userPermissionEntity =
                userPermissionRepository.findByUserIdAndPermissionNameAndProductName(
                        dto.getUserId(),
                        dto.getPermissionName(),
                        dto.getProductName());
        return userPermissionEntity.isPresent();
    }
}
