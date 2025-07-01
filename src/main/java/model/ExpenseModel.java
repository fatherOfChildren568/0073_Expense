package model;

public class ExpenseModel {
    // declear
    private int id;
    private String date;
    private double money;
    private String content;

    // constructor no parameter
    public ExpenseModel() {
    }

    // constructor have parameters
    public ExpenseModel(int id, String date, double money, String content) {
        this.id = id;
        this.date = date;
        this.money = money;
        this.content = content;
    }

    // getId
    public int getId() {
        return id;
    }

    // setId
    public void setId(int id) {
        this.id = id;
    }

    // getDate
    public String getDate() {
        return date;
    }

    // setDate
    public void setDate(String date) {
        this.date = date;
    }

    // getMoney
    public double getMoney() {
        return money;
    }

    // setMoney
    public void setMoney(double money) {
        this.money = money;
    }

    // getContent
    public String getContent() {
        return content;
    }

    // setContent
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("%-5s%-13s%-8s%-15s\n", id, date, money, content);
    }

}
