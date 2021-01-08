package com.techtalentsouth.techtalentblog.blogpost;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// makes this a DB object as well as a class
@Entity
public class BlogPost {
    // Sets the ID as primary key
    @Id
    // Allows the underlying database to set the value for the field
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String blogEntry;
    private ArrayList<String> blogTags;

    public BlogPost() {
        // empty contructor needed
    }

    public BlogPost(String title, String author, String blogEntry, ArrayList<String> blogTags) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
        this.blogTags = blogTags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    public Long getId() {
        return id;
    }

    public ArrayList<String> getBlogTags() {
        return blogTags;
    }

    public void setBlogTags(ArrayList<String> blogTags) {
        this.blogTags = blogTags;
    }

    @Override
    public String toString() {
        return "BlogPost [id=" + id + ",author=" + author + ", blogEntry=" + blogEntry + ",  title=" + title
                + ", blogTags=" + blogTags + "]";
    }

}
