package com.example.translateservice;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {

    public String translate(String text, String targetLanguage) {
        // Implementar traducción simple (dummy)
        return "Translated text to " + targetLanguage + ": " + text;
    }
}
