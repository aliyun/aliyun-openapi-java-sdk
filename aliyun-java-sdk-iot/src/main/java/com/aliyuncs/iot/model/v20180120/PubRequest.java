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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PubRequest extends RpcAcsRequest<PubResponse> {
	   

	private List<UserProp> userProps;

	private String messageContent;

	private Integer qos;

	private String correlationData;

	private String iotInstanceId;

	private String responseTopic;

	private String topicFullName;

	private String productKey;
	public PubRequest() {
		super("Iot", "2018-01-20", "Pub");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UserProp> getUserProps() {
		return this.userProps;
	}

	public void setUserProps(List<UserProp> userProps) {
		this.userProps = userProps;	
		if (userProps != null) {
			for (int depth1 = 0; depth1 < userProps.size(); depth1++) {
				putQueryParameter("UserProp." + (depth1 + 1) + ".Value" , userProps.get(depth1).getValue());
				putQueryParameter("UserProp." + (depth1 + 1) + ".Key" , userProps.get(depth1).getKey());
			}
		}	
	}

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
		if(messageContent != null){
			putQueryParameter("MessageContent", messageContent);
		}
	}

	public Integer getQos() {
		return this.qos;
	}

	public void setQos(Integer qos) {
		this.qos = qos;
		if(qos != null){
			putQueryParameter("Qos", qos.toString());
		}
	}

	public String getCorrelationData() {
		return this.correlationData;
	}

	public void setCorrelationData(String correlationData) {
		this.correlationData = correlationData;
		if(correlationData != null){
			putQueryParameter("CorrelationData", correlationData);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getResponseTopic() {
		return this.responseTopic;
	}

	public void setResponseTopic(String responseTopic) {
		this.responseTopic = responseTopic;
		if(responseTopic != null){
			putQueryParameter("ResponseTopic", responseTopic);
		}
	}

	public String getTopicFullName() {
		return this.topicFullName;
	}

	public void setTopicFullName(String topicFullName) {
		this.topicFullName = topicFullName;
		if(topicFullName != null){
			putQueryParameter("TopicFullName", topicFullName);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public static class UserProp {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<PubResponse> getResponseClass() {
		return PubResponse.class;
	}

}
