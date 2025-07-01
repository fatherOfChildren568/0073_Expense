package main;

import java.util.Scanner;

import constant.Message;
import utility.Validator;
import controller.ExpenseController;
import dto.DTO;

public class Main {
    public static void main(String[] args) {
        // declear
        DTO dto = new DTO();
        ExpenseController expenseController = new ExpenseController();
        Scanner sc = new Scanner(System.in);
        int autoId = 1;
        // loop when exist
        while (true) {
            try {
                // display menu
                menu();
                // input choice
                int choice = Integer.parseInt(sc.nextLine());
                // check valid choice
                if (!Validator.isLimitInRange(choice, 1, 4)) {
                    System.out.println(Message.ERROR_CHOICE_LIMIT_IN_RANGE);
                    continue;
                }
                // handle choice
                switch (choice) {
                    // add new expense
                    case 1:
                        // input money
                        System.out.print(Message.PROMPT_MONEY);
                        double money = Double.parseDouble(sc.nextLine());
                        // check valid money
                        if (!Validator.isValidDouble(money)) {
                            System.out.println(Message.ERROR_INVALID_MONEY);
                            continue;
                        }
                        // input content
                        System.out.print(Message.PROMPT_CONTENT);
                        String content = sc.nextLine();
                        // check is valid content
                        if (!Validator.isValidString(content)) {
                            System.out.println(Message.ERROR_INVALID_STRING);
                            continue;
                        }

                        // set data for dto
                        dto.setId(autoId);
                        dto.setMoney(money);
                        dto.setContent(content);

                        // set data for controller
                        expenseController.setInput(dto);
                        // add new expense
                        expenseController.addExpense();
                        autoId++;
                        break;
                    // display all expenses
                    case 2:
                        expenseController.displayAllExpense();
                        break;
                    //delete expense by id
                    case 3:
                        //display list expense
                        expenseController.displayAllExpense();
                        int sizeOfList = expenseController.getSizeOfListExpenses();
                        //input id
                        System.out.print(Message.PROMPT_ID);
                        int id = Integer.parseInt(sc.nextLine());
                        //check valid id
                        if(!Validator.isLimitInRange(id, 1, sizeOfList)){
                            System.out.print(Message.ERROR_INVALID_ID);
                            continue;
                        }

                        //set data for dto
                        dto.setId(id);
                        //set data for controller
                        expenseController.setInput(dto);
                        //delete
                        expenseController.deleteExpense();
                        break;
                    case 4:
                        System.exit(0);
                        sc.close();
                        break;

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static void menu() {
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.print("Choice: ");
    }
}
