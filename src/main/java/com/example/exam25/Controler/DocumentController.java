package com.example.exam25.Controler;

import com.example.exam25.Entity.Document;
import com.example.exam25.Entity.Magazine;
import com.example.exam25.Entity.User;
import com.example.exam25.Service.DocumentService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;
@Named("DocumentBean")
@SessionScoped
public class DocumentController implements Serializable {
    private DocumentService documentService = new DocumentService();
private Document document=new Document();
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    public void addMagazin(Magazine magazine) {
        documentService.ajouterMagazine(magazine);

    }

    public Document getDocumentById(Long id) {
        return documentService.getDocumentById(id);
    }


}