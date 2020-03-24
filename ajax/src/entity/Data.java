package entity;
//实体类
public class Data {
    String keyword;
    String msg;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Data{" +
                "keyword='" + keyword + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
