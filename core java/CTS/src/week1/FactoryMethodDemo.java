package week1;

interface Document {
    void open();
}

class WordDoc implements Document {
    public void open() {
        System.out.println("Opening Word Document.");
    }
}

class PdfDoc implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}

class ExcelDoc implements Document {
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}

abstract class DocFactory {
    public abstract Document create();
}

class WordFactory extends DocFactory {
    public Document create() {
        return new WordDoc();
    }
}

class PdfFactory extends DocFactory {
    public Document create() {
        return new PdfDoc();
    }
}

class ExcelFactory extends DocFactory {
    public Document create() {
        return new ExcelDoc();
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DocFactory f1 = new WordFactory();
        Document d1 = f1.create();
        d1.open();

        DocFactory f2 = new PdfFactory();
        Document d2 = f2.create();
        d2.open();

        DocFactory f3 = new ExcelFactory();
        Document d3 = f3.create();
        d3.open();
    }
}

