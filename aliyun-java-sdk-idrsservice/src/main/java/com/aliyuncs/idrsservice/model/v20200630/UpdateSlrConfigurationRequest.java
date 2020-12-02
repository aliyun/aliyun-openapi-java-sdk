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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idrsservice.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateSlrConfigurationRequest extends RpcAcsRequest<UpdateSlrConfigurationResponse> {
	   

	private String mqInstanceId;

	private String mqGroupId;

	private List<String> mqEvents;

	private String mqEndpoint;

	private String mqTopic;

	private Boolean mqSubscribe;
	public UpdateSlrConfigurationRequest() {
		super("idrsservice", "2020-06-30", "UpdateSlrConfiguration", "idrsservice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMqInstanceId() {
		return this.mqInstanceId;
	}

	public void setMqInstanceId(String mqInstanceId) {
		this.mqInstanceId = mqInstanceId;
		if(mqInstanceId != null){
			putQueryParameter("MqInstanceId", mqInstanceId);
		}
	}

	public String getMqGroupId() {
		return this.mqGroupId;
	}

	public void setMqGroupId(String mqGroupId) {
		this.mqGroupId = mqGroupId;
		if(mqGroupId != null){
			putQueryParameter("MqGroupId", mqGroupId);
		}
	}

	public List<String> getMqEvents() {
		return this.mqEvents;
	}

	public void setMqEvents(List<String> mqEvents) {
		this.mqEvents = mqEvents;	
		if (mqEvents != null) {
			for (int i = 0; i < mqEvents.size(); i++) {
				putQueryParameter("MqEvent." + (i + 1) , mqEvents.get(i));
			}
		}	
	}

	public String getMqEndpoint() {
		return this.mqEndpoint;
	}

	public void setMqEndpoint(String mqEndpoint) {
		this.mqEndpoint = mqEndpoint;
		if(mqEndpoint != null){
			putQueryParameter("MqEndpoint", mqEndpoint);
		}
	}

	public String getMqTopic() {
		return this.mqTopic;
	}

	public void setMqTopic(String mqTopic) {
		this.mqTopic = mqTopic;
		if(mqTopic != null){
			putQueryParameter("MqTopic", mqTopic);
		}
	}

	public Boolean getMqSubscribe() {
		return this.mqSubscribe;
	}

	public void setMqSubscribe(Boolean mqSubscribe) {
		this.mqSubscribe = mqSubscribe;
		if(mqSubscribe != null){
			putQueryParameter("MqSubscribe", mqSubscribe.toString());
		}
	}

	@Override
	public Class<UpdateSlrConfigurationResponse> getResponseClass() {
		return UpdateSlrConfigurationResponse.class;
	}

}
