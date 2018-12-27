package com.aliyuncs.utils;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class XmlUtils {

    public static Document getDocument(String payload)
        throws ParserConfigurationException, SAXException, IOException {
        if (payload == null || payload.length() < 1) { return null; }

        StringReader sr = new StringReader(payload);
        InputSource source = new InputSource(sr);

        Document doc = null;

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            doc = builder.parse(source);
        } finally {
            IOUtils.closeQuietly(source.getByteStream());
        }

        return doc;
    }

    public static Element getRootElementFromString(String payload)
        throws ParserConfigurationException, SAXException, IOException {
        Document doc = getDocument(payload);
        if (doc == null) {
            return null;
        }
        return doc.getDocumentElement();
    }

    public static List<Element> getChildElements(Element parent, String tagName) {
        if (null == parent) { return null; }
        NodeList nodes = parent.getElementsByTagName(tagName);
        List<Element> elements = new ArrayList<Element>();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getParentNode() == parent) { elements.add((Element)node); }
        }

        return elements;
    }

    public static List<Element> getChildElements(Element parent) {
        if (null == parent) { return null; }

        NodeList nodes = parent.getChildNodes();
        List<Element> elements = new ArrayList<Element>();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) { elements.add((Element)node); }
        }

        return elements;
    }
}