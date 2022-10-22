package com.souldev.security.security.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MainUser implements UserDetails {
    private String userName;
    private String email;
    private String password;
    private Date fechaNacimiento;
    private String sexo;
    private String nombres;
    private String apellidos;
    private String fotoPerfil;
    private Collection<? extends GrantedAuthority> authorities;


    public MainUser(String userName, String email, String password, Date fechaNacimiento, String sexo, String nombres, String apellidos, String fotoPerfil,
            Collection<? extends GrantedAuthority> authorities) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo=sexo;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.fotoPerfil=fotoPerfil;
        this.authorities = authorities;
    }

    public static MainUser build(User user){
        List<GrantedAuthority> authorities = user.getRoles().stream().map(role-> new SimpleGrantedAuthority(role.getRoleName().name())).collect(Collectors.toList());
        return new MainUser(user.getUserName(), user.getEmail(), user.getPassword(),user.getFechaNacimiento(),user.getSexo(),user.getNombres(), user.getApellidos(),
                user.getFotoPerfil(),authorities);
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    public String getEmail() {
        return email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }
}
