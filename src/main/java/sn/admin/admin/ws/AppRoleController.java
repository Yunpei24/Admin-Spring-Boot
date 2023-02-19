package sn.admin.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.admin.admin.dao.AppRoleRepository;
import sn.admin.admin.entities.AppRoleEntity;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/roles")
public class AppRoleController {
   private AppRoleRepository appRoleRepository;
   @PostMapping(path = "/save")
   public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){

       return appRoleRepository.save(appRoleEntity);
   }
   @GetMapping(path = "/all")
   public List<AppRoleEntity> getAll(){
       return appRoleRepository.findAll();
   }
    @GetMapping(path = "/login")
    public AppRoleEntity login(@RequestParam int id, @RequestParam String name){

       return appRoleRepository.findByIdAndName(id, name);
    }

}
