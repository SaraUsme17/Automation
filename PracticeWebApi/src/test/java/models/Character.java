package models;

import com.google.gson.annotations.SerializedName;

public class Character {

        @SerializedName("name")
        private String name;

        public Character() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

}
