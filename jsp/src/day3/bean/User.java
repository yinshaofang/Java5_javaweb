package day3.bean;
//实体类
public class User {
  Integer id;
  String name;
  Double money;

    public User() {
    }

    public User(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
