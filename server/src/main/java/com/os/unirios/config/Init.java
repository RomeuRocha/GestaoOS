package com.os.unirios.config;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.os.unirios.entities.ERole;
import com.os.unirios.entities.Role;
import com.os.unirios.entities.User;
import com.os.unirios.repositories.RoleRepository;
import com.os.unirios.repositories.UserRepository;

@Configuration
public class Init implements CommandLineRunner {

    @Autowired
    RoleRepository repo;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        // salvar roles se não houver
        List<Role> roles = repo.findAll();

        if (roles.size() == 0) {
            Role admin = new Role( ERole.ROLE_ADMIN);
            Role user = new Role(ERole.ROLE_USER);
            Role moderator = new Role( ERole.ROLE_MODERATOR);
            repo.saveAll(Arrays.asList(admin, user, moderator));
        }

        Optional<User> u = userRepository.findByUsername("master");

        if (u.isEmpty()) {

            User user = new User( "master", "master@teste.com", "1");
            
            //incluir todos os perfis ao usuário master
            user.getRoles().addAll(repo.findAll());
            
            // criptografar a senha
            user.setPassword(passwordEncoder.encode(user.getPassword()));

            userRepository.save(user);
        }

        
    }

}
