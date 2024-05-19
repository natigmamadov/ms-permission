package com.example.msingresspermission.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckPermissionDto {

    private Long userId;
    private String permissionName;
    private String productName;
}
