package com.capgemini.calculator.operations;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class DivisionTest {

    Division division = new Division();

    @Test
    void executeDivision() {
        assertEquals(0.5, division.executeOperation(1,2));
    }

    @Test
    void divisionThrowsError() {
        assertThrows(ArithmeticException.class, () -> division.executeOperation(1,0));
    }
}