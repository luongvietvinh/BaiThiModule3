package model;

public class Product {
//    id int AI PK
//    name varchar(100)
//    price double
//    soluong int
//    mausac varchar(50)
//    depcription varchar(255)
//    idcategory

    private int id;
    private String name;
    private double price;
    private int soluong;
    private String mausac;
    private String depcription;
    private int idcategory;
    private String nameCategory;

    public Product(int id, String name, double price,
                   int soluong, String mausac, String depcription, int idcategory, String nameCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.soluong = soluong;
        this.mausac = mausac;
        this.depcription = depcription;
        this.idcategory = idcategory;
        this.nameCategory = nameCategory;
    }

    public Product(int id, String name, Double price, int soluong, String mausac, String depcription, String namecategory) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.soluong = soluong;
        this.mausac = mausac;
        this.depcription = depcription;
        this.nameCategory = namecategory;
    }

    public Product(String name, Double price, int soluong, String mausac, String depcription, int idCategory) {

        this.name = name;
        this.price = price;
        this.soluong = soluong;
        this.mausac = mausac;
        this.depcription = depcription;
        this.idcategory = idCategory;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getDepcription() {
        return depcription;
    }

    public void setDepcription(String depcription) {
        this.depcription = depcription;
    }

    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
