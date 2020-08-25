package org.example;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class IntReverseTest {

    @Test
    public void testNull(){
        assertThat(IntReverse.reverse(0), equalTo(0));
    }

    @Test
    public void testNegativeSign(){
        assertThat(Integer.toString(-345), equalTo("-345"));
    }

    @Test
    public void testStandardPositive(){
        assertThat(IntReverse.reverse(543), equalTo(345));
    }

    @Test
    public void testPositiveWithZero(){
        assertThat(IntReverse.reverse(5430), equalTo(345));
    }

    @Test
    public void testNegative(){
        assertThat(IntReverse.reverse(-543), equalTo(-345));
    }

    @Test
    public void testNegativeWithLeadingZero(){
        assertThat(IntReverse.reverse(-5430), equalTo(-345));
    }

    @Test
    public void testNegativeWithWarppedZero(){
        assertThat(IntReverse.reverse(-05430), equalTo(-345));
    }

    @Test
    public void testLargeNumberReversed(){
        assertThat(IntReverse.reverse(1534236469), equalTo(0));
    }

}
