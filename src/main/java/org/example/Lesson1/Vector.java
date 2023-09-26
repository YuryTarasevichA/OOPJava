package org.example.Lesson1;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    /**
     * @ApiNote "Метод вычисляющий длинну метода"
     * @return длинна вектора
     */
    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * @param vector2 с которым происходит умножение
     * @return скалярное произведение
     * @ApiNote: метод вычисляющий скалярное произведение
     */
    public double scal(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     *
     * @param vector2 принимает в качестве параметра вектор на который делается векторное произведение
     * @return новый вектор векторного произведения vector1 на vector2
     */
    public Vector vprod(Vector vector2) {
        return new Vector(y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }
//    @Override
//    public String toString() {
//        return
//    }

    /**
     * Метод вычисляющий угол между векторами
     * @param vector1 Принимается в качестве значения
     * @return Скалярное произведение
     */
    public double angle(Vector vector1) {
        double v = length() * vector1.length(); // ToDo
        return scal(vector1)/ v;
    }
}
