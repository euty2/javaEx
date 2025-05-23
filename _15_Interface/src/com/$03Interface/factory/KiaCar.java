package com.$03Interface.factory;

import com.$03Interface.order.ParentCar;

public class KiaCar extends ParentCar {
    @Override
    public void turnOn() {
        System.out.println(this.getClass() + " - 시동이 부드럽게 잘 걸린다~");
        delay();
    }
    @Override
    public void turnOff() {
        System.out.println(this.getClass() + " - 시동이 부드럽게 잘 Off~");
        delay();
    }
    @Override
    public void accel() {
        System.out.println(this.getClass() + " - 엑셀이 터보로 동작된다~");
        delay();
    }
    @Override
    public void footBreak() {
        System.out.println(this.getClass() + " - 브레이크가 부드럽게 동작된다~");
        delay();
    }
}
