package model;

public class Category {
    private int idcategory;
    private String name;

    public Category(int idcategory, String name) {
        this.idcategory = idcategory;
        this.name = name;
    }

    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
