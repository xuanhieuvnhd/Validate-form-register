package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 50,message = "Nhap it nhat 2 ky tu và khong qua 50 ki tu")
    private String firstName;
    @NotEmpty
    @Size(min = 2, max = 50,message = "Nhap it nhat 2 ky tu và khong qua 50 ki tu")
    private String lastName;

    @NotEmpty
    @Size(min = 10, max = 10,message = "Nhap so nguyen tu 0 den 9,khong qua 10 ki tu")
    @Pattern(regexp = "^[0]{1}[0-9]{9}$")
    private String phoneNumber;

    @Min(value = 18,message = "Lon hon hoac bang 18")
    @Max(value = 100,message = "Nho hon hoac bang 100")
    private int age;

    @NotEmpty
    @Email
    private String email;

    public User() {
    }

    public User(@NotEmpty @Size(min = 2, max = 50) String firstName, @NotEmpty @Size(min = 2, max = 50) String lastName, @NotEmpty @Size(min = 10, max = 10) @Pattern(regexp = "^[0]{1}[0-9]{9}$") String phoneNumber, @Min(18) @Max(100) int age, @NotEmpty @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
