package it.antoniocaccamo.poc.dtos;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PocDTO {
    
    private Integer id;
    private String name;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public PocDTO id(Integer id) {
        setId(id);
        return this;
    }

    public PocDTO name(String name) {
        setName(name);
        return this;
    }

}
