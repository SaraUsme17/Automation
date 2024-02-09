package models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Person {
    @SerializedName("name")
    private String name;
    @SerializedName("skin_color")
    private String skin_color;
    @SerializedName("films")
    private List<String> films;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
