package cuj.spring.aop.demo.controller;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 17:02
 * @Description:
 */
public class UserVo {
    private String id;
    private String name;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
