package com.sqlinjectionsec.JWT.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "users", schema = "public",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable=false, updatable=false)
    private int id;

    @Column(name = "username", insertable=false, updatable=false)
    private String username;

    @Column(name = "password", insertable=false, updatable=false)
    private String password;

    @Column(name = "description", insertable=false, updatable=false)
    private String description;

    @Column(name = "failed_attempts")
    private int failedAttempts;

    @Column(name = "locked")
    private boolean locked;

    @Column(name = "lock_time")
    private Date lockTime;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "pwd_last_modified")
    private Date lastModified;

    public User(){}

    public User(String username, String password) {
        this(username, password, "");
    }

    public User(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFailedAttempt() {
        return failedAttempts;
    }

    public void setFailedAttempt(int failedAttempt) {
        this.failedAttempts = failedAttempt;
    }

    public boolean isLocked() {
        return locked;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}
