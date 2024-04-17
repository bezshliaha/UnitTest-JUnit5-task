package org.example.app.utils;

import org.example.app.exception.TemperatureException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppValidatorTest {

    AppValidator appValidator;

    @BeforeEach
    void setUp() {
        appValidator = new AppValidator();
    }

    @Test
    @DisplayName("Test is temperature is in bounds.")
    void test_Is_Temperature_Is_In_Bounds() throws TemperatureException {
        assertEquals("Temperature is fine. The device works normally.",
                appValidator.validateTemperature(15));
    }

    @Test
    @DisplayName("Test if invalid temperature throws exception.")
    void test_If_Invalid_Temperature_Throws_Exception() {
        assertThrows(TemperatureException.class, () -> appValidator.validateTemperature(-20),
                "No exception");
    }

    @AfterEach
    void tearDown() {
        appValidator = null;
    }
}