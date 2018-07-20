package com.enihsyou.test;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MainTest {

    private static final int OFFSET = 10;

    private Main main;

    @Before
    public void setUp() {
        main = new Main(OFFSET);
    }

    @Test
    public void add() {
        assertThat(main.add(1, 2), IsNot.not(3));
    }

    @Test
    public void add2() {
        assertThat(main.add(1, 2), IsEqual.equalTo(OFFSET + 3));
    }
}
