package com.learn.java8.functionalinterfaces;

import java.util.*;

public class Database {
    private TreeMap<String, String> database;
    private Stack<HashMap<String, String>> transactions;

    public Database() {
        database = new TreeMap<>();
        transactions = new Stack<>();
    }

    public void set(String name, String value) {
        if(!transactions.isEmpty()){
            transactions.peek().put(name, value);
        } else {
            database.put(name, value);
        }
    }

    public String get(String name) {
        return database.getOrDefault(name, "NULL");
    }

    public void delete(String name) {
        if(!transactions.isEmpty()){
            transactions.peek().remove(name);
        } else {
            database.remove(name);
        }
    }

    public int count(String value) {
        int count = 0;
        for (String val : database.values()) {
            if (val.equals(value)) {
                count++;
            }
        }
        return count;
    }

    public void begin() {
        transactions.push(new HashMap<>());
    }

    public void rollback() {
        if (noTransactionsCheck()) {
            transactions.pop();
        }
    }

    public void commit() {
        if (noTransactionsCheck()) {
            HashMap<String, String> changes = transactions.pop();
            for (String key : changes.keySet()) {
                String value = changes.get(key);
                if (value == null) {
                    database.remove(key);
                } else {
                    database.put(key, value);
                }
            }
            transactions.clear();
        }
    }

    private boolean noTransactionsCheck() {
        if (transactions == null || transactions.isEmpty()) {
            System.out.println("NO TRANSACTION");
            return false;
        } else return true;
    }



     public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode resultNode = new ListNode(head.val, head.next);
            int countOfElements = 1;
            while(head.next != null){
                head = head.next;
                countOfElements++;
            }
            int averageCountOfElements = countOfElements % 2 == 0 ? countOfElements/2 : countOfElements/2 + 1;
            while(averageCountOfElements > 0){
                resultNode = resultNode.next;
                averageCountOfElements--;
            }
            return resultNode;
        }
    }

    public static void main(String[] args) {

        int a = 5/2;
        System.out.println(a);

    }
}
