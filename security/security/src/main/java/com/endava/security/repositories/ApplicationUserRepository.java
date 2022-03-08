package com.endava.security.repositories;

import com.endava.security.config.ApplicationUser;

import java.util.Optional;

public interface ApplicationUserRepository {
    Optional<ApplicationUser> getUserByUsername(String username);
}
