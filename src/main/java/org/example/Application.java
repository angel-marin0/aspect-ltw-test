package org.example;

import ch.qos.logback.classic.Logger;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", Application.class.getSimpleName());
        Document document = new Document();
        document.open();
        document.close();
        document.resetPageCount();
    }
}