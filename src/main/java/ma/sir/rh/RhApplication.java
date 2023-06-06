package  ma.sir.rh;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.rh.bean.core.*;
import ma.sir.rh.service.facade.admin.*;

import ma.sir.rh.zynerator.security.common.AuthoritiesConstants;
import ma.sir.rh.zynerator.security.bean.User;
import ma.sir.rh.zynerator.security.bean.Permission;
import ma.sir.rh.zynerator.security.bean.Role;
import ma.sir.rh.zynerator.security.service.facade.UserService;
import ma.sir.rh.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.rh.required.facade")
public class RhApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(RhApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Absence.edit"));
        permissions.add(new Permission("Absence.list"));
        permissions.add(new Permission("Absence.view"));
        permissions.add(new Permission("Absence.add"));
        permissions.add(new Permission("Absence.delete"));
        permissions.add(new Permission("Abonne.edit"));
        permissions.add(new Permission("Abonne.list"));
        permissions.add(new Permission("Abonne.view"));
        permissions.add(new Permission("Abonne.add"));
        permissions.add(new Permission("Abonne.delete"));
        permissions.add(new Permission("Employee.edit"));
        permissions.add(new Permission("Employee.list"));
        permissions.add(new Permission("Employee.view"));
        permissions.add(new Permission("Employee.add"));
        permissions.add(new Permission("Employee.delete"));
        permissions.add(new Permission("Conge.edit"));
        permissions.add(new Permission("Conge.list"));
        permissions.add(new Permission("Conge.view"));
        permissions.add(new Permission("Conge.add"));
        permissions.add(new Permission("Conge.delete"));
        permissions.add(new Permission("TypeAbsence.edit"));
        permissions.add(new Permission("TypeAbsence.list"));
        permissions.add(new Permission("TypeAbsence.view"));
        permissions.add(new Permission("TypeAbsence.add"));
        permissions.add(new Permission("TypeAbsence.delete"));
        permissions.add(new Permission("UniteAdministrative.edit"));
        permissions.add(new Permission("UniteAdministrative.list"));
        permissions.add(new Permission("UniteAdministrative.view"));
        permissions.add(new Permission("UniteAdministrative.add"));
        permissions.add(new Permission("UniteAdministrative.delete"));
        permissions.add(new Permission("TypeConge.edit"));
        permissions.add(new Permission("TypeConge.list"));
        permissions.add(new Permission("TypeConge.view"));
        permissions.add(new Permission("TypeConge.add"));
        permissions.add(new Permission("TypeConge.delete"));
        permissions.add(new Permission("PayementSalaire.edit"));
        permissions.add(new Permission("PayementSalaire.list"));
        permissions.add(new Permission("PayementSalaire.view"));
        permissions.add(new Permission("PayementSalaire.add"));
        permissions.add(new Permission("PayementSalaire.delete"));
        permissions.add(new Permission("Contrat.edit"));
        permissions.add(new Permission("Contrat.list"));
        permissions.add(new Permission("Contrat.view"));
        permissions.add(new Permission("Contrat.add"));
        permissions.add(new Permission("Contrat.delete"));
        permissions.add(new Permission("CategorieEmployee.edit"));
        permissions.add(new Permission("CategorieEmployee.list"));
        permissions.add(new Permission("CategorieEmployee.view"));
        permissions.add(new Permission("CategorieEmployee.add"));
        permissions.add(new Permission("CategorieEmployee.delete"));
        permissions.add(new Permission("Pointage.edit"));
        permissions.add(new Permission("Pointage.list"));
        permissions.add(new Permission("Pointage.view"));
        permissions.add(new Permission("Pointage.add"));
        permissions.add(new Permission("Pointage.delete"));
        permissions.add(new Permission("TypeContrat.edit"));
        permissions.add(new Permission("TypeContrat.list"));
        permissions.add(new Permission("TypeContrat.view"));
        permissions.add(new Permission("TypeContrat.add"));
        permissions.add(new Permission("TypeContrat.delete"));
    }

}


