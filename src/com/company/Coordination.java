package com.company;

import java.util.Objects;

class Coordination {

    int x = 0;
    int y = 0;

    public Coordination(int posX, int posY) {
        this.x = posX;
        this.y = posY;
    }


    public Coordination() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordination position = (Coordination) o;
        return x == position.x && y == position.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }


}
