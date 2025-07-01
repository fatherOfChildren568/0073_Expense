package view;

public class ExpenseView {
    // declear
    private String header;
    private String body;

    //setHeader
    public void setHeader(String header) {
        this.header = header;
    }

    //setBody 
    public void setBody(String body) {
        this.body = body;
    }

    //display 
    public void display(){
        System.out.print(header);
        System.out.print(body);
    }
}
