package cuj.domain;

/**
 * Created by cujamin on 2017/1/13.
 */
public class Apple {
    private int id;
    private String name;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Apple~~"+
                " id: "+id+
                ";name: "+name+
                ";color: "+color+
                ";";
    }
}
