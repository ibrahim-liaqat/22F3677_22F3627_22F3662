import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class tester {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    void testButtonInputs() {
        calculator.sevenbutton.doClick();
        assertEquals("7", calculator.DisplayLabel.getText());
        calculator.eightbutton.doClick();
        assertEquals("78", calculator.DisplayLabel.getText());
        calculator.clearbutton.doClick();
        assertEquals("", calculator.DisplayLabel.getText());
    }
    @Test
    void testAddition() {
        calculator.sevenbutton.doClick();
        calculator.plusbutton.doClick();
        calculator.fivebutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("12", calculator.DisplayLabel.getText());
    }
    @Test
    void testAddition2() {
        calculator.sevenbutton.doClick();
        calculator.plusbutton.doClick();
        calculator.threebutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("10", calculator.DisplayLabel.getText());
    }
    @Test
    void testSubtraction() {
        calculator.ninebutton.doClick();
        calculator.minbutton.doClick();
        calculator.threebutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("6", calculator.DisplayLabel.getText());
    }
    @Test
    void testSubtraction2() {
        calculator.ninebutton.doClick();
        calculator.minbutton.doClick();
        calculator.fourbutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("5", calculator.DisplayLabel.getText());
    }
  

    @Test
    void testMultiplication() {
        calculator.fourbutton.doClick();
        calculator.mulbutton.doClick();
        calculator.twobutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("8", calculator.DisplayLabel.getText());
    }
    @Test
    void testMultiplication2() {
        calculator.fourbutton.doClick();
        calculator.mulbutton.doClick();
        calculator.onebutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("4", calculator.DisplayLabel.getText());
    }
    @Test
    void testMultiplicationinvalid() {
        calculator.fourbutton.doClick();
        calculator.mulbutton.doClick();
        calculator.onebutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("4", calculator.DisplayLabel.getText());
    }

    @Test
    void testDivision() {
        calculator.eightbutton.doClick();
        calculator.subbutton.doClick();
        calculator.twobutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("4", calculator.DisplayLabel.getText());
    }
    @Test
    void testDivision2() {
        calculator.eightbutton.doClick();
        calculator.subbutton.doClick();
        calculator.fourbutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("2", calculator.DisplayLabel.getText());
    }
    @Test
    void testDivisioninvalid() {
        calculator.eightbutton.doClick();
        calculator.subbutton.doClick();
        calculator.zerobutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("Infinity", calculator.DisplayLabel.getText());
    }
    @Test
    public void testEqualWithoutOperator() {
        calculator.DisplayLabel.setText("5");
        calculator.plusbutton.doClick(); 
        calculator.equelbutton.doClick();
        assertEquals("10", calculator.DisplayLabel.getText());
    }
    @Test
    public void testEqualWithoutequalOperator() {
        calculator.DisplayLabel.setText("5");
        calculator.plusbutton.doClick();  
        assertEquals("5", calculator.DisplayLabel.getText());
    }
    @Test
    void testDecimalInput() {
        calculator.fivebutton.doClick();
        calculator.dotbutton.doClick();
        calculator.fivebutton.doClick();
        calculator.plusbutton.doClick();
        calculator.fourbutton.doClick();
        calculator.dotbutton.doClick();
        calculator.fivebutton.doClick();
        calculator.equelbutton.doClick();
        assertEquals("10", calculator.DisplayLabel.getText());
    }
}
