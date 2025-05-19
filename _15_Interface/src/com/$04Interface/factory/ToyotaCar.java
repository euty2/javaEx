package com.$04Interface.factory;

import com.$04Interface.order.ParentCar;

public class ToyotaCar extends ParentCar {
    @Override
    public void turnOn() {
        System.out.println(this.getClass() + " - エンジンの動きが安定している");
        delay();
    }
    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " - エンジンの動きが安定している");
        delay();
    }
    @Override
    public void accel() {
        System.out.println(this.getClass() + " - エクセルの性能は安定しています。");
        delay();
    }
    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " - ブレーキが安定して動作する ...");
        delay();
    }
}
