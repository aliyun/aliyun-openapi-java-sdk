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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.onsmqtt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendMessageRequest extends RpcAcsRequest<SendMessageResponse> {
	   

	private String mqttTopic;

	private String instanceId;

	private String payload;
	public SendMessageRequest() {
		super("OnsMqtt", "2020-04-20", "SendMessage", "onsmqtt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMqttTopic() {
		return this.mqttTopic;
	}

	public void setMqttTopic(String mqttTopic) {
		this.mqttTopic = mqttTopic;
		if(mqttTopic != null){
			putQueryParameter("MqttTopic", mqttTopic);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getPayload() {
		return this.payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
		if(payload != null){
			putQueryParameter("Payload", payload);
		}
	}

	@Override
	public Class<SendMessageResponse> getResponseClass() {
		return SendMessageResponse.class;
	}

}
