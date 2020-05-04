package ru.gothmog.ws.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer",schema = "book_dbo")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "email", length = 64)
    private String email;
    @Column(name = "first_name",length = 100)
    private String firstName;
    @Column(name = "last_name",length = 100)
    private String lastName;
    @Column(name = "address",length = 128)
    private String address;
    @Column(name = "city",length = 32)
    private String city;
    @Column(name = "country",length = 64)
    private String country;
    @Column(name = "registr_on")
    private LocalDateTime registrOn;
    @Column(name = "pswd", length = 16)
    private String password;
    @Column(name = "phone",length = 15)
    private String phone;
    @Column(name = "zipcode",length = 6)
    private String zipcode;

    public String getFullName (){
        return getFirstName() + " " + getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getRegistrOn() {
        return registrOn;
    }

    public void setRegistrOn(LocalDateTime registrOn) {
        this.registrOn = registrOn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
