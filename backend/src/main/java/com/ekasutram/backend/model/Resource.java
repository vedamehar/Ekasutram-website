package com.ekasutram.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String chapterName;
    private String pdfUrl;

    public Resource() {
        // Required by JPA
    }

    public Resource(String subject, String chapterName, String pdfUrl) {
        this.subject = subject;
        this.chapterName = chapterName;
        this.pdfUrl = pdfUrl;
    }

    public Long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getChapterName() {
        return chapterName;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }
}
