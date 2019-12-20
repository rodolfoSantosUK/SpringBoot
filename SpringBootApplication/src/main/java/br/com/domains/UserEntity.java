package br.com.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "Usuarios")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue
    private Long id;

    @Column(nullable = true, length = 50)
    private String userId;

    @Column(nullable = true, length = 50)
    private String firstName;

    @Column(nullable = true, length = 50)
    private String lastName;

    @Column(nullable = true, length = 50)
    private String email;

    @Column(nullable = true)
    private String encryptedPassword;

    private String emailVerificationToken;

    @Column(nullable = true, columnDefinition = "boolean default false")
    private Boolean emailVerificationStatus = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }

    public UserEntity() {
    }
}
