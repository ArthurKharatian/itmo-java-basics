package lesson3;

import lesson2.Color;

public class Sun {
    private static Sun sun;
    private Color color;
    private Integer size;

    private Sun() {

    }

    public static Sun getSun() {
        if (sun == null) {
            sun = new Sun();
        }

        return sun;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}