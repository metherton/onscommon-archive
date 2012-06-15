package com.ethertons.domain;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testEquals() throws Exception {

        Person person1 = new Person();
        person1.setId(1);
        person1.setFullname("John Smith");
        Person person2 = new Person();
        person2.setId(1);
        person2.setFullname("John Smith");
        assertThat(person1, Matchers.is(person2));
    }
}
