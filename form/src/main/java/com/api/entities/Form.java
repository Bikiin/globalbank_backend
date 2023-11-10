package com.api.entities;

import java.time.LocalDate;
import org.json.JSONObject;

public class Form {
    private String name;
    private String lastname;
    private LocalDate dirthDate;

    public Form(JSONObject form){
        this.name = form.getString("name");
        this.lastname = form.getString("lastname");
        this.dirthDate = LocalDate.parse(form.getString("dirthDate"));
    }

    public JSONObject toJson(){
        JSONObject form = new JSONObject(); 
        form.put("name", this.name);
        form.put("lastname", this.lastname);
        form.put("dirthDate", this.dirthDate);
        return form;
    }
}
