package org.bad.learningjava;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by didierbaczynski on 2016-03-02.
 */
public class MapNumberTest {
    @Test
    public void testMapNumber() throws Exception {
        MapNumber mapTest = new MapNumber();
        assertThat("trois",is(equalTo(mapTest.getNumberWord(2))));
    }
}