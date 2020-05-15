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

package com.aliyuncs.onsmqtt.model.v20191211;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendMessageRequest extends RpcAcsRequest<SendMessageResponse> {
	   

	private String mqttTopic;

	private String instanceId;

	private String payload;

	private String receiptId;
	public SendMessageRequest() {
		super("OnsMqtt", "2019-12-11", "SendMessage", "onsmqtt");
		setMethod(MethodType.POST);
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

	public String getReceiptId() {
		return this.receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
		if(receiptId != null){
			putQueryParameter("ReceiptId", receiptId);
		}
	}

	@Override
	public Class<SendMessageResponse> getResponseClass() {
		return SendMessageResponse.class;
	}

}
