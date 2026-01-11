package JavaCodes.Practice.KeyFeatureTask;

public class Book {
    private String name;
    private int id;
    private Type type;
    private int pageNo;

    public Book() {
    }

    public Book(String name, int id, Type type, int pageNo) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.pageNo = pageNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Book(" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type=" + type +
                ", pageNo=" + pageNo +
                ')';
    }
}
