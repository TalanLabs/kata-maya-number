package com.talan.dojo.maya;

import com.talan.dojo.maya.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("one simple addition")
    void simpleAddition() {
        String[] num1 = new String[]{"o...", "....", "....", "...."};
        String[] num2 = new String[]{"o...", "....", "....", "...."};
        String[] expected = new String[]{"oo..", "....", "....", "...."};
        
        Assertions.assertArrayEquals(Solution.add(num1, num2), expected);
    }

    @Test
    @DisplayName("addition with carry")
    void additionWithCarry() {
        String[] num1 = new String[]{"ooo.", "____", "____", "____"};
        String[] num2 = new String[]{"ooo.", "....", "....", "...."};
        String[] expected = new String[]{ 
                "o...", "....", "....", "....",
                "o...", "....", "....", "...."
        };

        Assertions.assertArrayEquals(Solution.add(num1, num2), expected);
    }

    @Test
    @DisplayName("a simple multiplication")
    void simpleMultiplication() {
        String[] num1 = new String[]{"....", "____", "....", "...."};
        String[] num2 = new String[]{"....", "____", "....", "...."};
        String[] expected = new String[]{
                "o...", "....", "....", "....",
                "....", "____", "....", "...."
        };

        Assertions.assertArrayEquals(Solution.multiply(num1, num2), expected);
    }

    @Test
    @DisplayName("a simple subtraction")
    void simpleSubtraction() {
        String[] num1 = new String[]{"o...", "....", "....", "...."};
        String[] num2 = new String[]{"o...", "....", "....", "...."};
        String[] expected = new String[]{"....", "____", "....", "...."};

        Assertions.assertArrayEquals(Solution.subtract(num1, num2), expected);
    }

    @Test
    @DisplayName("a more complex subtraction")
    void complexSubtraction() {
        String[] num1 = new String[]{
                "o...", "____", "....", "....",
                "ooo.", "....", "....", "...."
        };
        String[] num2 = new String[]{"oo..", "____", "....", "...."};
        String[] expected = new String[]{
                "....", "____", "....", "....",
                "o...", "____", "____", "____"
        };

        Assertions.assertArrayEquals(Solution.subtract(num1, num2), expected);
    }

    @Test
    @DisplayName("a simple division")
    void simpleDivision() {
        String[] num1 = new String[]{"ooo.", "____", "....", "...."};
        String[] num2 = new String[]{"oooo", "....", "....", "...."};
        String[] expected = new String[]{"oo..", "....", "....", "...."};

        Assertions.assertArrayEquals(Solution.divide(num1, num2), expected);
    }

    @Test
    @DisplayName("a more complex division")
    void complexDivision() {
        String[] num1 = new String[]{
                "oooo", "....", "....", "....",
                "ooo.", "____", "....", "....",
                ".oo.", "o..o", ".oo.", "...."
        };
        String[] num2 = new String[]{"....", "____", "____", "...."};
        String[] expected = new String[]{
                "ooo.", "____", "....", "....",
                "o...", "____", "____", "____"
        };

        Assertions.assertArrayEquals(Solution.divide(num1, num2), expected);
    }



}
