////////////////////////////////////////////////////////////////////
// Mattia Nicastro 2111024
// Samuele Vendramin 2111934
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void print_shouldReturnAsciiArtFor1() {
        // Arrange
        int input = 1;

        // Act
        String output = RomanPrinter.print(input);

        // Assert
        assertTrue(output.contains("|_   _|")); // parte della lettera I
    }

    @Test
    public void print_shouldReturnAsciiArtFor5() {
        // Arrange
        int input = 5;

        // Act
        String output = RomanPrinter.print(input);

        // Assert
        assertTrue(output.contains("\\ \\    / /")); // parte della lettera V
    }

    @Test
    public void print_shouldReturnAsciiArtFor10() {
        // Arrange
        int input = 10;

        // Act
        String output = RomanPrinter.print(input);

        // Assert
        assertTrue(output.contains("__   __")); // parte della lettera X
    }

    @Test
    public void print_shouldReturnAsciiArtFor4() {
        // Arrange
        int input = 4;

        // Act
        String output = RomanPrinter.print(input);

        // Assert
        assertTrue(output.contains("|_   _|")); // parte di I
        assertTrue(output.contains("\\ \\    / /")); // parte di V
    }

    @Test
    public void print_shouldReturnAsciiArtFor1000() {
        // Arrange
        int input = 1000;

        // Act
        String output = RomanPrinter.print(input);

        // Assert
        assertTrue(output.contains("|  \\/  |")); // parte della lettera M
    }

    @Test
    public void print_shouldThrowExceptionForZero() {
        // Arrange & Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(0);
        });

        assertEquals("Input must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void print_shouldThrowExceptionForNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(-10);
        });

        assertEquals("Input must be between 1 and 1000", exception.getMessage());
    }

    @Test
    public void print_shouldThrowExceptionForInputAbove1000() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.print(1001);
        });

        assertEquals("Input must be between 1 and 1000", exception.getMessage());
    }
}
