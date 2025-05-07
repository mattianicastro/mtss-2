////////////////////////////////////////////////////////////////////
// Mattia Nicastro 2111024
// Samuele Vendramin 2111934
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    // ===== Test validi (Right) =====

    @Test
    public void convert_ShouldReturnI_WhenInputIs1() {
        // Arrange
        int input = 1;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convert_ShouldReturnIV_WhenInputIs4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void convert_ShouldReturnIX_WhenInputIs9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void convert_ShouldReturnXL_WhenInputIs40() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void convert_ShouldReturnXC_WhenInputIs90() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void convert_ShouldReturnCD_WhenInputIs400() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void convert_ShouldReturnCM_WhenInputIs900() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void convert_ShouldReturnM_WhenInputIs1000() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    // ===== Test limiti (Boundary & Error) =====

    @Test
    public void convert_ShouldThrowException_WhenInputIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    public void convert_ShouldThrowException_WhenInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
    }

    @Test
    public void convert_ShouldThrowException_WhenInputIsAbove1000() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(1001);
        });
    }

    @Test
    public void convert_ShouldReturnX_WhenInputIs10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void convert_ShouldReturnL_WhenInputIs50() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void convert_ShouldReturnC_WhenInputIs100() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void convert_ShouldReturnD_WhenInputIs500() {
        assertEquals("D", IntegerToRoman.convert(500));
    }
}
