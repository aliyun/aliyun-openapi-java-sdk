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

package com.aliyuncs.amqp_open.model.v20191212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.amqp_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBindingRequest extends RpcAcsRequest<CreateBindingResponse> {
	   

	private String argument;

	private String destinationName;

	private String sourceExchange;

	private String bindingKey;

	private String bindingType;

	private String instanceId;

	private String virtualHost;
	public CreateBindingRequest() {
		super("amqp-open", "2019-12-12", "CreateBinding", "onsproxy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArgument() {
		return this.argument;
	}

	public void setArgument(String argument) {
		this.argument = argument;
		if(argument != null){
			putBodyParameter("Argument", argument);
		}
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
		if(destinationName != null){
			putBodyParameter("DestinationName", destinationName);
		}
	}

	public String getSourceExchange() {
		return this.sourceExchange;
	}

	public void setSourceExchange(String sourceExchange) {
		this.sourceExchange = sourceExchange;
		if(sourceExchange != null){
			putBodyParameter("SourceExchange", sourceExchange);
		}
	}

	public String getBindingKey() {
		return this.bindingKey;
	}

	public void setBindingKey(String bindingKey) {
		this.bindingKey = bindingKey;
		if(bindingKey != null){
			putBodyParameter("BindingKey", bindingKey);
		}
	}

	public String getBindingType() {
		return this.bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
		if(bindingType != null){
			putBodyParameter("BindingType", bindingType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getVirtualHost() {
		return this.virtualHost;
	}

	public void setVirtualHost(String virtualHost) {
		this.virtualHost = virtualHost;
		if(virtualHost != null){
			putBodyParameter("VirtualHost", virtualHost);
		}
	}

	@Override
	public Class<CreateBindingResponse> getResponseClass() {
		return CreateBindingResponse.class;
	}

}
