/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.XmlUtils;

public class InternalEndpointsParser implements IEndpointsProvider {

    private final static String BUNDLED_ENDPOINTS_RESOURCE_PATH = "/com/aliyuncs/endpoints/endpoints.xml";

    private static List<Endpoint> parseEndpoints(final InputStream input) throws IOException,
        ParserConfigurationException, SAXException {
        Document document = XmlUtils.getDocument(new InputSource(input), null);
        NodeList endpointNodes = document.getElementsByTagName("Endpoint");
        List<Endpoint> endpoints = new ArrayList<Endpoint>();
        for (int i = 0; i < endpointNodes.getLength(); i++) {
            Element endpoint = (Element)endpointNodes.item(i);
            Set<String> regionIds = new HashSet<String>();
            List<ProductDomain> products = new ArrayList<ProductDomain>();
            NodeList regionNodes = endpoint.getElementsByTagName("RegionId");
            NodeList productNodes = endpoint.getElementsByTagName("Product");
            for (int j = 0; j < regionNodes.getLength(); j++) {
                regionIds.add(((Element)regionNodes.item(j)).getTextContent());
            }
            for (int j = 0; j < productNodes.getLength(); j++) {
                Element element = (Element)(productNodes.item(j));
                NodeList productNames = element.getElementsByTagName("ProductName");
                NodeList domainNames = element.getElementsByTagName("DomainName");
                for (int k = 0; k < productNames.getLength(); k++) {
                    String productName = ((Element)productNames.item(k)).getTextContent();
                    String domainName = ((Element)domainNames.item(k)).getTextContent();
                    products.add(new ProductDomain(productName, domainName));
                }
            }
            endpoints.add(new Endpoint(endpoint.getAttribute("name"), regionIds, products));
        }
        return endpoints;
    }

    public List<Endpoint> getEndpoints() throws ClientException {
        InputStream stream = this.getClass().getResourceAsStream(BUNDLED_ENDPOINTS_RESOURCE_PATH);
        try {
            return parseEndpoints(stream);
        } catch (IOException e) {
            throw new ClientException("SDK.MissingEndpointsFile", "Internal endpoints file is missing.");
        } catch (ParserConfigurationException e) {
            throw new ClientException("SDK.InvalidEndpointsFile", "Internal endpoints file is missing.");
        } catch (SAXException e) {
            throw new ClientException("SDK.EndpointsFileMalformed", "Internal endpoints file is missing.");
        }
    }

    @Override
    public Endpoint getEndpoint(String region, String product) throws ClientException {
        InputStream stream = this.getClass().getResourceAsStream(BUNDLED_ENDPOINTS_RESOURCE_PATH);
        try {
            List<Endpoint> internalEndpoints = parseEndpoints(stream);
            for (Endpoint endpoint : internalEndpoints) {
                for (String regionId : endpoint.getRegionIds()) {
                    if (regionId.equals(region)) {
                        for (ProductDomain productDomain : endpoint.getProductDomains()) {
                            if (productDomain.getProductName().equals(product)) {
                                Set<String> regionSet = new HashSet<String>();
                                regionSet.add(region);

                                List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
                                productDomains.add(productDomain);
                                Endpoint resultEndpoint = new Endpoint(endpoint.getName(), regionSet, productDomains);
                                return resultEndpoint;
                            }
                        }
                    }
                }
            }
            return null;
        } catch (IOException e) {
            throw new ClientException("SDK.MissingEndpointsFile", "Internal endpoints file is missing.");
        } catch (ParserConfigurationException e) {
            throw new ClientException("SDK.InvalidEndpointsFile", "Internal endpoints file is missing.");
        } catch (SAXException e) {
            throw new ClientException("SDK.EndpointsFileMalformed", "Internal endpoints file is missing.");
        }
    }

    @Override
    public Endpoint getEndpoint(String region, String product, String serviceCode, String endpointType,
                                Credential credential, LocationConfig locationConfig) throws ClientException {
        throw new UnsupportedOperationException();
    }

}
