package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.db.Calc;
import ru.neoflex.practice.repository.CalcRep;

@RestController
@RequestMapping(value = "", produces = "application/json")
@OpenAPIDefinition(
        info = @Info(
                title = "Описание контроллера CalcController",
                description = "Практическое задание",
                contact = @Contact(
                        name = "Котрунцев Глеб",
                        email = "kotruntsev.gleb@yandex.ru",
                        url = "https://github.com/DJ-Von"
                )
        )
)
@Tag(name = "Калькулятор", description = "Позволяет складывать, вычитать, умножать и делить числа")
public class CalcController {
    @Autowired
    private CalcRep calcRep;
    @GetMapping("/plus/{a}/{b}")
    @Operation(
            summary = "Сложение",
            description = "Позволяет вычислить сумму двух чисел"
    )
    public double plus(@PathVariable double a,
                    @PathVariable double b){
        calcRep.save(new Calc(a, b, "+", a+b));
        return a+b;
    }
    @GetMapping("/minus/{a}/{b}")
    @Operation(
            summary = "Вычитание",
            description = "Позволяет вычислить разность двух чисел"
    )
    public double minus(@PathVariable double a,
                     @PathVariable double b){
        calcRep.save(new Calc(a, b, "-", a-b));
        return a-b;
    }
    @GetMapping("/multiple/{a}/{b}")
    @Operation(
            summary = "Умножение",
            description = "Позволяет вычислить произведение двух чисел"
    )
    public double multiple(@PathVariable double a,
                     @PathVariable double b){
        calcRep.save(new Calc(a, b, "*", a*b));
        return a*b;
    }
    @GetMapping("/divide/{a}/{b}")
    @Operation(
            summary = "Деление",
            description = "Позволяет вычислить частное двух чисел"
    )
    public double divide(@PathVariable double a, @PathVariable double b){
        if(b==0) {
            calcRep.save(new Calc(a, b, "/", 0));
            return 0;
        }
        calcRep.save(new Calc(a, b, "/", a/b));
        return a/b;
    }
    @GetMapping("/get-all-calculations")
    @Operation(
            summary = "Вывод всех операций",
            description = "Позволяет просмотреть все операции"
    )
    public String getAllCalculations(){
        Iterable<Calc> all = calcRep.findAll();
        StringBuilder sb = new StringBuilder();
        all.forEach(p -> sb.append(p.getA() + p.getSign() + p.getB() + " = " + p.getResult() + "\n"));
        return sb.toString();
    }
}
