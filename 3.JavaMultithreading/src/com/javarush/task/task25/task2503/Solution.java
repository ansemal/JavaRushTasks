package com.javarush.task.task25.task2503;

/* 
Свой enum
*/

public class Solution {
    /**
     * Output:
     * <p/>
     * Available Amount
     * Account Number
     * Bank Name
     * --------------------
     * Available Amount
     * Bank Name
     */
    public static void main(String[] args) {

        Column.configureColumns(Column.Amount, Column.AccountNumber, Column.BankName);

        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }

        System.out.println("--------------------");
        Column.AccountNumber.hide();

        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }
    }
}
/*
Реализуй интерфейс Columnable у Column, описание методов смотрите в джавадоках.
Реализуй логику метода Column.getVisibleColumns.
Метод Column.configureColumns уже реализован, его не меняй.
Создавать дополнительные поля нельзя.
Метод main не участвует в тестировании.
Requirements:
1. Интерфейс Columnable менять нельзя.
2. Класс Column должен реализовывать интерфейс Columnable.
3. Создавать дополнительные поля в классе Column нельзя.
4. Метод Column.configureColumns реализован. Менять его не нужно.
5. Метод Column.getVisibleColumns должен возвращать список отображаемых колонок в скофигурированом порядке.
6. Метод Column.getColumnName должен возвращать полное имя колонки.
7. Метод Column.isShown должен возвращать true, если колонка видимая, иначе false.
8. Метод Column.hide должен скрывать колонку и сдвигать индексы остальных отображаемых колонок.
 */
