package com.pluralsight.abstractfactory;

import com.pluralsight.abstractfactory.card.CreditCard;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {
        String xml = "<document><body><stock>AAPL</stock></body> </document>";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document document = factory.parse(byteArrayInputStream);

        document.getDocumentElement().normalize();

        System.out.println("Root element: " + document.getDocumentElement().getNodeName());
        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());


        CreditCardFactory abstractCreditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard creditCard1 = abstractCreditCardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(creditCard1.getClass());

        abstractCreditCardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard2 = abstractCreditCardFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard2.getClass());

    }
}
