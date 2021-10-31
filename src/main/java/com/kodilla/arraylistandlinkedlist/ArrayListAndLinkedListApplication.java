package com.kodilla.arraylistandlinkedlist;

import java.util.*;
import java.lang.*;

class Book
{
    private String title;
    private int year;

    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public void setYear(int newYear)
    {
        year = newYear;
    }

    public Book(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
}

class ArrayListAndLinkedList
{

    public static void main (String[] args)
    {
        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(5); //0
        grades.add(4); //1
        grades.add(5); //2
        grades.add(3); //3
        grades.add(5); //4
        grades.add(2); //5
        grades.add(6); //6
        grades.add(2); //7
        grades.add(4); //8
        grades.add(4); //9
        grades.add(2); //10
        grades.add(6); //11
        grades.add(5); //12
        grades.add(4); //13
        grades.add(3); //14
        grades.add(2); //15

        int currentMax = 0;
        int maxIndex = -1;
        int currentMin = 7;
        int minIndex = -1;

        for (int i = 0; i < grades.size(); i++)
        {
            if (grades.get(i) > currentMax)
            {
                currentMax = grades.get(i);
                maxIndex = i;
            }
            if (grades.get(i) < currentMin)
            {
                currentMin = grades.get(i);
                minIndex = i;
            }
        }

        System.out.println("Max Value --> " + currentMax + " at Index --> " + maxIndex);
        grades.remove(maxIndex);
        System.out.println("Min Value --> " + currentMin + " at Index --> " + minIndex);
        grades.remove(minIndex);


        double average = 0.0;

        for (int i = 0; i < grades.size(); i++)
        {
            average += grades.get(i);
            System.out.println((i+1) + " --> " + grades.get(i));
        }
        average /= grades.size();
        System.out.print("Grades Average: ");
        System.out.println(average);

        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book("Book One", 2002));
        books.add(new Book("Book Two", 2006));
        books.add(new Book("Book Three", 1999));
        books.add(new Book("Book Four", 1985));
        books.add(new Book("Book Five", 2019));
        books.add(new Book("Book Six", 2005));
        books.add(new Book("Book Seven", 1996));
        books.add(new Book("Book Eight", 1997));
        books.add(new Book("Book Nine", 2001));

        for (Book book : books)
        {
            if (book.getYear() > 2000)
            {
                System.out.println("Title: " + book.getTitle() + " year: " + book.getYear());
            }
        }

    }
}












