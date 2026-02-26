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

package com.aliyuncs.mns.model.v20210319;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutEventNotificationRequest extends RpcAcsRequest<PutEventNotificationResponse> {
	   

	private String agent;

	private String consoleSessionId;

	private String endpoint;

	private String productName;

	private String identifier;

	private String resource;

	private String eventType;
	public PutEventNotificationRequest() {
		super("mns", "2021-03-19", "PutEventNotification");
		setMethod(MethodType.POST);
	}

	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
		if(agent != null){
			putQueryParameter("Agent", agent);
		}
	}

	public String getConsoleSessionId() {
		return this.consoleSessionId;
	}

	public void setConsoleSessionId(String consoleSessionId) {
		this.consoleSessionId = consoleSessionId;
		if(consoleSessionId != null){
			putQueryParameter("ConsoleSessionId", consoleSessionId);
		}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putQueryParameter("Endpoint", endpoint);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putQueryParameter("Resource", resource);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	@Override
	public Class<PutEventNotificationResponse> getResponseClass() {
		return PutEventNotificationResponse.class;
	}

}
