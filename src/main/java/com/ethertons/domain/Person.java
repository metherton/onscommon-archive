package com.ethertons.domain;

public class Person {


    private int personId;
    private String fullname;

    public void setId(int personId) {
        this.personId = personId;
    }

    public int getId() {
        return personId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (fullname != null ? !fullname.equals(person.fullname) : person.fullname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return fullname != null ? fullname.hashCode() : 0;
    }
}
