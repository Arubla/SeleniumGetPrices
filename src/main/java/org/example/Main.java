package org.example;

public class Main {
    public static void main(String[] args) {
        String searchString = "Pathfinder 2e Core Rulebook";
        BookShopOrgDriver bookshop = new BookShopOrgDriver();

        bookshop.findPrice(searchString);

    }
}