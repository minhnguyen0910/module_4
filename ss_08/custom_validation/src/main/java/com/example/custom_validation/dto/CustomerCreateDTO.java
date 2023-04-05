package com.example.custom_validation.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CustomerCreateDTO implements Validator {

    Integer id;
    @NotBlank(message = "name không được để trống")
    String name;
    @NotNull
    String date;
    @NotNull(message = "email không được để trống")
    @Email(message = "sai định dạng Ex:minh@gmail.com")
    String email;
    String gender;
    @NotNull(message = "không được để trống")
    String phone;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerCreateDTO customerCreateDTO = (CustomerCreateDTO) target;
        if (customerCreateDTO.phone.matches("^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$")) {
            errors.rejectValue("phone", "", "không đúng format Ex:0981234567");
        }

    }

    public CustomerCreateDTO() {
    }

    public CustomerCreateDTO(Integer id, String name, String date, String email, String gender, String phone) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
