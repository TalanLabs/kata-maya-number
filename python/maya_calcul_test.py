import unittest
from maya_calcul import add, multiply, division, subtract


class MayaCalculTest(unittest.TestCase):

    def simple_addition(self):
        num1 = ["o...", "....", "....", "...."]
        num2 = ["o...", "....", "....", "...."]
        expected = ["oo..", "....", "....", "...."]

        self.assertEqual(add(num1, num2), expected)

    def addition_with_carry(self):
        num1 = ["ooo.", "____", "____", "____"]
        num2 = ["ooo.", "....", "....", "...."]

        expected = [
            "o...", "....", "....", "....",
            "o...", "....", "....", "...."
        ]

        self.assertEqual(add(num1, num2), expected)

    def simple_multiplication(self):
        num1 = ["....", "____", "....", "...."]
        num2 = ["....", "____", "....", "...."]

        expected = [
            "o...", "....", "....", "....",
            "....", "____", "....", "...."
        ]

        self.assertEqual(multiply(num1, num2), expected)

    def simple_subtraction(self):
        num1 = ["oo..", "____", "....", "...."]
        num2 = ["oo..", "____", "....", "...."]

        expected = ["....", "____", "....", "...."]

        self.assertEqual(subtract(num1, num2), expected)

    def more_complex_substraction(self):
        num1 = [
            "o...", "____", "....", "....",
            "ooo.", "....", "....", "...."
        ]

        num2 = ["oo..", "____", "....", "...."]

        expected = [
            "....", "____", "....", "....",
            "o...", "____", "____", "____",
        ]

        self.assertEqual(subtract(num1, num2), expected)

    def simple_division(self):
        num1 = ["ooo.", "____", "....", "...."]
        num2 = ["oooo", "....", "....", "...."]

        expected = ["oo..", "....", "....", "...."]

        self.assertEqual(division(num1, num2), expected)

    def more_complex_division(self):
        num1 = [
            "oooo", "....", "....", "....",
            "ooo.", "____", "....", "....",
            ".oo.", "o..o", ".oo.", "...."
        ]

        num2 = ["....", "____", "____", "...."]

        expected = [
            "ooo.", "____", "....", "....",
            "o...", "____", "____", "____"
        ]

        self.assertEqual(division(num1, num2), expected)
