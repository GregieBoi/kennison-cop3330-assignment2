package org.example.ex26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    // couldn't figure out how to test main/methods that require user input

    @Test
    @DisplayName("testCaclulateMonthsUntilPaidOff")
    void calculateMonthsUntilPaidOff() {

        assertEquals("70", PaymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}