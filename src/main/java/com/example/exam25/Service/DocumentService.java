package com.example.exam25.Service;

import com.example.exam25.Dao.DocumentDao;
import com.example.exam25.Entity.Document;
import com.example.exam25.Entity.Magazine;
import com.example.exam25.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    private DocumentDao documentDao=new DocumentDao();
    private List<Document> documentlist=new ArrayList<>();
    public List<Document> getAllDocuments()
    {
     return documentlist= documentDao.getAllDocuments();
    }

    public void ajouterMagazine(Magazine magazine) {
        documentDao.AjouterStudent(magazine);

    }
    public Document getDocumentById(Long id) {
        return documentDao.getDocumentById(id);
    }
}
