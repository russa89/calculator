package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String answerHello() {
        return "Добро пожаловать в калькулятор";
    }


    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int additionResult = num1 + num2;
        return num1 + " + " + num2 + " = " + additionResult;
    }

    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int subtractionResult = num1 - num2;
        return num1 + " - " + num2 + " = " + subtractionResult;
    }

    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int multiplyResult = num1 * num2;
        return num1 + " * " + num2 + " = " + multiplyResult;
    }

    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int divideResult = num1 / num2;
        return num1 + " / " + num2 + " = " + divideResult;
    }
}
