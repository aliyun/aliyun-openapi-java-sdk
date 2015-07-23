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
package com.aliyuncs.threaded;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ICredentialProvider;
import com.aliyuncs.utils.XmlUtils;

public class FiledCredentialProvider implements ICredentialProvider {

	private static ICredentialProvider provider = null;
	private static Credential credential= null;
	private final static String BOUNDLED_CREDENTIAL_PROVIDER = "/com/aliyuncs/sample/credential.xml";
	
	private FiledCredentialProvider() {
		
	}
	
	private static Credential parseCredential(final InputStream input) 
            throws IOException, ParserConfigurationException, SAXException {
		credential = new Credential();
        Document document = XmlUtils.getDocument(new InputSource(input), null);
        NodeList keyNodes = document.getElementsByTagName("AccessKeyId");
        NodeList secretNodes = document.getElementsByTagName("AccessSecret");
        if (0 != keyNodes.getLength())
        	credential.setAccessKeyId(((Element) keyNodes.item(0)).getTextContent());
        if (0 != secretNodes.getLength())
        	credential.setAccessSecret(((Element) secretNodes.item(0)).getTextContent());;
        
        return credential;
    }
	
	public static ICredentialProvider getICredentialProvider() {
		if (null == provider) {
			provider = new FiledCredentialProvider();
			provider.fresh();
		}
		return provider;
	}
	
	public synchronized Credential fresh(){
		if (null != credential)
			return credential;
		InputStream stream = 
				this.getClass().getResourceAsStream(BOUNDLED_CREDENTIAL_PROVIDER);
		try {
			return parseCredential(stream);
		} catch (IOException e) {
			throw new RuntimeException("Missing boundled credential.");
		} catch (ParserConfigurationException e) {
			throw new RuntimeException("Credential file is not predefined.");
		} catch (SAXException e) {
			throw new RuntimeException("Credential file is malformed.");
		}
	}

}
