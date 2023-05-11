package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
@Tag(name = "Калькулятор", description = "Позволяет складывать и вычитать числа")
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    @Operation(
            summary = "Сложение",
            description = "Позволяет вычислить сумму двух чисел"
    )
    public int plus(@PathVariable int a,
                    @PathVariable int b){
        return a+b;
    }
    @GetMapping("/minus/{a}/{b}")
    @Operation(
            summary = "Вычитание",
            description = "Позволяет вычислить разность двух чисел"
    )
    public int minus(@PathVariable int a,
                     @PathVariable int b){
        return a-b;
    }
    @GetMapping("/multiple/{a}/{b}")
    @Operation(
            summary = "Умножение",
            description = "Позволяет вычислить произвдение двух чисел"
    )
    public int multiple(@PathVariable int a,
                     @PathVariable int b){
        return a*b;
    }
    @GetMapping("/divide/{a}/{b}")
    @Operation(
            summary = "Деление",
            description = "Позволяет вычислить частное двух чисел"
    )
    public int divide(@PathVariable int a,
                        @PathVariable int b){
        if(b==0)
            return 0;
        return a/b;
    }
}
