package com.libraryChallenge;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public void checkout() {
        System.out.println("checkout");

     }
      public void returnItem() {
          System.out.println("return");


     }


}
