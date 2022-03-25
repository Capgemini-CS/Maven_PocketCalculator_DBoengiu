package com.capgemini.calculator.operations;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SubtractionTest {

    Subtraction subtraction = new Subtraction();

    @Test
    void executeSubtraction() {
        assertEquals(-1, subtraction.executeOperation(1,2));
    }
}