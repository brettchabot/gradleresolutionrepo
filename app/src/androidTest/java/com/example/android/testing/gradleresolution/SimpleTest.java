package com.example.android.testing.gradleresolution;


import androidx.test.platform.tracing.Tracing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleTest {
    @Test
    public void empty() {
        Tracing.getInstance();
    }
}
