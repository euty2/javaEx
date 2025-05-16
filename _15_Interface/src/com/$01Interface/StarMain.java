package com.$01Interface;
/*
 *              StarUnit
 *      |           |           |
 *    Marine      Scv         Zealot
 */
/* [객체지향의 3대속성]
 * 1) 캡슐화(encapsulation)
 * 2) 상속성(inheritance)
 * 3) 다형성(polymorphism)
 */
public class StarMain {
    public static void allUnitWalk(StarUnit[] units){
        for(StarUnit unit : units)
            unit.walk();
    }
    public static void allUnitAttack(StarUnit[] units){
        for(StarUnit unit : units)
            unit.attack();
    }
    public static void allUnitDie(StarUnit[] units){
        for(StarUnit unit : units)
            unit.die();
    }
    public static void main(String[] args) {
        StarUnit[] units = new StarUnit[]{
            new Marine(),
            new Scv(),
            new Zealot()
        };

        allUnitWalk(units);
        System.out.println("-------------------------------------");
        allUnitAttack(units);
        System.out.println("-------------------------------------");
        allUnitDie(units);
    }
}
