package com.teksystems;

public class ClubMember {
    String name;
    String location;
    String favoriteLanguage;

    public ClubMember(String name, String location, String favoriteLanguage) {
        this.name = name;
        this.location = location;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

}
