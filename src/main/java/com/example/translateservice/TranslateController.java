package com.example.translateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/translate")
public class TranslateController {

    @Autowired
    private TranslateService translateservice;

    @GetMapping
    public String translate(@RequestParam String text, @RequestParam String language) {
        return translateservice.translate(text, language);
    }
}
