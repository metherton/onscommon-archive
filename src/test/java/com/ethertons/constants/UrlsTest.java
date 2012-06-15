package com.ethertons.constants;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UrlsTest {

    @Test
    public void urlConstantsAreCorrect() throws Exception {
        assertThat(Urls.HOST, is("http://localhost:8080"));
    }
}
