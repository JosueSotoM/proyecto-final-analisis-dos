package com.souldev.security.security.dtos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class NewUser {

    @NotBlank
    private String userName;
    @Email
    private String email;
    @NotBlank
    private String password;
    private Date fechaNacimiento;
    private String sexo;
    private String nombres;
    private String apellidos;
    private String fotoPerfil;
    private Set<String> roles = new HashSet<>();
    public NewUser() {
    }
    public NewUser(@NotBlank String userName, @Email String email, @NotBlank String password, Date fechaNacimiento,
            String sexo, String nombres, String apellidos, String fotoPerfil,
            Set<String> roles) {

        this.userName = userName;
        this.email = email;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fotoPerfil = fotoPerfil;
        this.roles = roles;
    }
  
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<String> getRoles() {
        return roles;
    }
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
