package com.example.exam25.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.xml.crypto.Data;

@Entity
@Table(name="book")
public class Book extends Document {
    private String author;
    private String isbn;
    private Data datePublishion;
}
