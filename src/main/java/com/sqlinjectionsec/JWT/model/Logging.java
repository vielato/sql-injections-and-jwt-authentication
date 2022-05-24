package com.sqlinjectionsec.JWT.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "logging", schema = "public")
public class Logging {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "logging_id")
    private  int logging_id;

    @Column(name = "username", nullable = false)
    private String username;


    @Column(name = "time", nullable = false)
    private Date time;

    @Column(name = "success", nullable = false)
    private boolean success;

    public Logging(){}

    public Logging(String username, Date time, boolean success) {
        this.username = username;
        this.time = time;
        this.success = success;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
