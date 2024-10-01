package com.example.translateservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TranslateServiceApplicationTests {

	@Test
	void testTranslate() {
		TranslateService translateService = new TranslateService();
		String result = translateService.translate("Hello", "es");
		assertEquals("Translated text to es: Hello", result);
	}
}
