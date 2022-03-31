package com.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ch, i;
        String bn;
        float p;
        Book b = new Book();
        System.out.println(b);
        List<Book> l;
        do {
            System.out.println("1:Insert Book in Library\n2:Update the Book Price\n3:Delete the Book \n4:Fetch Book From Library\n5:Exit\nEnter your choice::");
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter Book Details==>Book name,author name and price");
                    b = new Book();
                    b.setBname(br.readLine());
                    b.setAname(br.readLine());
                    b.setPrice(Float.parseFloat(br.readLine()));
                    i = BookDao.insertBook(b);
                    if (i > 0) {
                        System.out.println("Record added Successfully");
                    } else {
                        System.out.println("Try Again");
                        System.out.println("Try Again");
                    }
                    break;
                case 2:
                    System.out.println("Update Book Details in Library==> Book name and price==>");
                    b = new Book();
                    bn = br.readLine();
                    p = Float.parseFloat(br.readLine());
                    i = BookDao.updateBook(bn, p);
                    break;
                case 3:
                    System.out.println("Delete Book from Library==> Book name");
                    b = new Book();
                    bn = br.readLine();
                    i = BookDao.deleteBook(bn);
                    break;
                case 4:
                    System.out.println("Fetch Details From Library");
                    l = BookDao.fetchBooks();
                    for (Book list : l) {
                        System.out.println(list);
                    }
                    System.out.println(l);
                    break;

                case 5:
                    System.exit(0);
                    break;

            }
        } while (true);
    }
}
