package com.endava.security.config;

import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.endava.security.config.ApplicationUserPermission.*;

public enum ApplicationUserRole {
  //  USER,ADMIN, MANAGER

    // Con Authorities
    USER(Sets.newHashSet()),
    MANAGER(Sets.newHashSet(CLIENT_READ)),
    ADMIN(Sets.newHashSet(CLIENT_READ, CLIENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<GrantedAuthority> getGrantedAuthorities(){
        final Set<GrantedAuthority> authorities = getPermissions().stream().map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }

}
