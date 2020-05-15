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
public class CreateExchangeRequest extends RpcAcsRequest<CreateExchangeResponse> {
	   

	private Boolean internal;

	private String exchangeName;

	private String instanceId;

	private String alternateExchange;

	private Boolean autoDeleteState;

	private String exchangeType;

	private String virtualHost;
	public CreateExchangeRequest() {
		super("amqp-open", "2019-12-12", "CreateExchange", "onsproxy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getInternal() {
		return this.internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
		if(internal != null){
			putBodyParameter("Internal", internal.toString());
		}
	}

	public String getExchangeName() {
		return this.exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
		if(exchangeName != null){
			putBodyParameter("ExchangeName", exchangeName);
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

	public String getAlternateExchange() {
		return this.alternateExchange;
	}

	public void setAlternateExchange(String alternateExchange) {
		this.alternateExchange = alternateExchange;
		if(alternateExchange != null){
			putBodyParameter("AlternateExchange", alternateExchange);
		}
	}

	public Boolean getAutoDeleteState() {
		return this.autoDeleteState;
	}

	public void setAutoDeleteState(Boolean autoDeleteState) {
		this.autoDeleteState = autoDeleteState;
		if(autoDeleteState != null){
			putBodyParameter("AutoDeleteState", autoDeleteState.toString());
		}
	}

	public String getExchangeType() {
		return this.exchangeType;
	}

	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
		if(exchangeType != null){
			putBodyParameter("ExchangeType", exchangeType);
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
	public Class<CreateExchangeResponse> getResponseClass() {
		return CreateExchangeResponse.class;
	}

}
