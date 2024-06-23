package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String answerHello() {
        return "Добро пожаловать в калькулятор";
    }


    public String plus(int num1, int num2) {
        int additionResult = num1 + num2;
        return num1 + " + " + num2 + " = " + additionResult;
    }

    public String minus(int num1, int num2) {
        int subtractionResult = num1 - num2;
        return num1 + " - " + num2 + " = " + subtractionResult;
    }

    public String multiply(int num1, int num2) {
        int multiplyResult = num1 * num2;
        return num1 + " * " + num2 + " = " + multiplyResult;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Учите математику!";
        } else {
            int divideResult = num1 / num2;
            return num1 + " / " + num2 + " = " + divideResult;
        }
    }
}
