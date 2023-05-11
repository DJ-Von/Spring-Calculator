package ru.neoflex.practice.db;

import javax.persistence.*;

@Entity
@Table(name = "calculations")
public class Calc {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "a")
    private double a;
    @Column(name = "b")
    private double b;
    @Column(name = "sign")
    private String sign;
    @Column(name = "result")
    private double result;
    public Calc(double a, double b, String sign, double result){
        this.a = a;
        this.b = b;
        this.sign = sign;
        this.result = result;
    }
    public Calc(){}
    public void setId(Long id) {this.id = id;}
    public double getA() {return a;}
    public double getB() {return b;}
    public String getSign() {return sign;}
    public double getResult() {return result;}
}
