package controller;

import java.util.ArrayList;
import java.util.List;

import constant.Message;
import dto.DTO;
import model.ExpenseModel;
import utility.GetLocalDate;
import view.ExpenseView;

public class ExpenseController {
    // declear
    private DTO input = new DTO();
    private List<ExpenseModel> listExpenses = new ArrayList<>();
    private ExpenseView expenseView = new ExpenseView();

    // set input
    public void setInput(DTO input) {
        this.input = input;
    }

    // add new expense
    public void addExpense() {
        // get input data
        int id = input.getId();
        double money = input.getMoney();
        String content = input.getContent();

        // add new expense
        listExpenses.add(new ExpenseModel(id, GetLocalDate.getDate(), money, content));
    }

    // display all expenses
    public void displayAllExpense() {
        // create variable to store data
        StringBuilder sb = new StringBuilder();
        // loop in list expenses to get data
        for (ExpenseModel expenseModel : listExpenses) {
            sb.append(expenseModel);
        }
        // set header
        expenseView.setHeader(Message.HEADER_LIST_EXPENSES);
        // set body
        expenseView.setBody(sb.toString());
        // display
        expenseView.display();
    }

    // getSizeOfListExpenses
    public int getSizeOfListExpenses() {
        return listExpenses.size();
    }

    // deleteExpense
    public void deleteExpense() {
        // get id need delete
        int id = input.getId();
        // loop in list expenses
        for (int i = 0; i < listExpenses.size(); i++) {
            ExpenseModel expenseModel = listExpenses.get(i);
            // find expense have id
            if (expenseModel.getId() == id) {
                // delete
                listExpenses.remove(expenseModel);
            }
        }
    }

}
