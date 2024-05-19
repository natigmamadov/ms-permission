package com.example.msingresspermission.controller;

import com.example.msingresspermission.model.CheckPermissionDto;
import com.example.msingresspermission.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/permission")
public class PermissionController {

    private final PermissionService permissionService;

    @PostMapping("check")
    public boolean checkPermission(@RequestBody CheckPermissionDto dto){
        return permissionService.checkPermission(dto);
    }
}
