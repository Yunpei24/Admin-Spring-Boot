package sn.admin.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.admin.admin.entities.AppRoleEntity;


public interface AppRoleRepository  extends JpaRepository<AppRoleEntity, Integer> {
    AppRoleEntity findById(int id);
    AppRoleEntity findByIdAndName(int id, String name);
}
