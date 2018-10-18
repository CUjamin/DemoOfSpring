package cuj.dao.user;

/**
 * Created by cujamin on 2018/10/13.
 */
public class UserDo {
    private int id;
    private String name;
    private int age;
    private String fid;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "UserDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fid='" + fid + '\'' +
                '}';
    }
}
