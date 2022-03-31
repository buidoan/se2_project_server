package com.example.se2_project_server.model;

public class JwtResponse {
private  String jwtType;

    public String getJwtType() {
        return jwtType;
    }

    public void setJwtType(String jwtType) {
        this.jwtType = jwtType;
    }

    private User user;
    private String jwtToken;

    public JwtResponse(User user, String jwtToken,String jwtType) {
        this.user = user;
        this.jwtToken = jwtToken;
        this.jwtType=jwtType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
