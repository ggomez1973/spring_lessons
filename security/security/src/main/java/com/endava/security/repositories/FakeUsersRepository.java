package com.endava.security.repositories;

import com.endava.security.config.ApplicationUser;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.endava.security.config.ApplicationUserRole.*;

@Repository
public class FakeUsersRepository implements ApplicationUserRepository {
    private final PasswordEncoder passwordEncoder;

    public FakeUsersRepository(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public Optional<ApplicationUser> getUserByUsername(String username) throws UsernameNotFoundException {
        return getApplicationUsers().stream().filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers(){
        List<ApplicationUser> applicationUsers = new ArrayList<>();
        applicationUsers.add(new ApplicationUser("ggomez", passwordEncoder.encode("123456"), USER.getGrantedAuthorities(),true,true,true,true));
        applicationUsers.add(new ApplicationUser("lizy", passwordEncoder.encode("123pass"), MANAGER.getGrantedAuthorities(),true,true,true,true));
        applicationUsers.add(new ApplicationUser("llando", passwordEncoder.encode("password"), ADMIN.getGrantedAuthorities(),true,true,true,true));
        return applicationUsers;
    }
}
