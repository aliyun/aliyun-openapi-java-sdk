/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.alinlp.model.v20200629;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetWeChEcomRequest extends RpcAcsRequest<GetWeChEcomResponse> {
	   

	private String wordVectorDelimiter;

	private String type;

	private String uuid;

	private String delimiter;

	private String text;

	private String token;

	private String serviceCode;

	private String size;

	private String wordDelimiter;

	private String operation;
	public GetWeChEcomRequest() {
		super("alinlp", "2020-06-29", "GetWeChEcom", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWordVectorDelimiter() {
		return this.wordVectorDelimiter;
	}

	public void setWordVectorDelimiter(String wordVectorDelimiter) {
		this.wordVectorDelimiter = wordVectorDelimiter;
		if(wordVectorDelimiter != null){
			putBodyParameter("WordVectorDelimiter", wordVectorDelimiter);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putBodyParameter("Uuid", uuid);
		}
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
		if(delimiter != null){
			putBodyParameter("Delimiter", delimiter);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size);
		}
	}

	public String getWordDelimiter() {
		return this.wordDelimiter;
	}

	public void setWordDelimiter(String wordDelimiter) {
		this.wordDelimiter = wordDelimiter;
		if(wordDelimiter != null){
			putBodyParameter("WordDelimiter", wordDelimiter);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putBodyParameter("Operation", operation);
		}
	}

	@Override
	public Class<GetWeChEcomResponse> getResponseClass() {
		return GetWeChEcomResponse.class;
	}

}
