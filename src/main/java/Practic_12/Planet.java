package Practic_12;

public enum Planet {

    Mercury(3, 2439, "Меркурий"),
    Venus(5, 6051, "Венера"),
    Earth(6, 6371, "Земля"),
    Mars(7, 3389, "Марс"),
    Jupiter(317 * 6, 69911, "Юпитер"),
    Saturn(95 * 6, 60268, "Сатурн"),
    Uranus(9, 25360, "Уран"),
    Neptune(1, 24600, "Нептун"),
    Pluto(1, 1356, "Плутон"),
    ;

    final int weight;
    final int radius;
    final String name;

    Planet(int weight, int radius, String name) {
        this.weight = weight;
        this.radius = radius;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }
}
