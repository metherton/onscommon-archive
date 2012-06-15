package com.ethertons.domain;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private PersonDetailsToCompare personDetailsToCompare;

    @Before
    public void setUp() {

        personDetailsToCompare = new PersonDetailsToCompare().resetDetails();
    }

    @Test
    public void twoPersonsAreEqualOnSetup() throws Exception {
        Person firstPerson = personDetailsToCompare.getFirstPerson();
        Person secondPerson = personDetailsToCompare.getSecondPerson();

        assertThat(firstPerson, is(secondPerson));
    }

    @Test
    public void personsAreNotEqualIfDifferentId() throws Exception {
        Person firstPerson = personDetailsToCompare.getFirstPerson();
        Person secondPerson = personDetailsToCompare.getSecondPerson();

        firstPerson.setId(2);

        assertThat(firstPerson, is(not(secondPerson)));

    }

    @Test
    public void personsAreNotEqualIfDifferentFullname() throws Exception {
        Person firstPerson = personDetailsToCompare.getFirstPerson();
        Person secondPerson = personDetailsToCompare.getSecondPerson();

        firstPerson.setFullname("John Jones");

        assertThat(firstPerson, is(not(secondPerson)));

    }

    @Test
    public void personsAreNotEqualIfIdsAreBothZero() throws Exception {
        Person firstPerson = personDetailsToCompare.getFirstPerson();
        Person secondPerson = personDetailsToCompare.getSecondPerson();

        firstPerson.setId(0);
        secondPerson.setId(0);

        assertThat(firstPerson, is(not(secondPerson)));
    }



    private class PersonDetailsToCompare {
        private Person firstPerson;
        private Person secondPerson;

        public Person getFirstPerson() {
            return firstPerson;
        }

        public Person getSecondPerson() {
            return secondPerson;
        }

        public PersonDetailsToCompare resetDetails() {
            firstPerson = new Person();
            secondPerson = new Person();

            firstPerson.setId(1);
            secondPerson.setId(1);
            firstPerson.setFullname("John Smith");
            secondPerson.setFullname("John Smith");
            return this;
        }
    }
}
