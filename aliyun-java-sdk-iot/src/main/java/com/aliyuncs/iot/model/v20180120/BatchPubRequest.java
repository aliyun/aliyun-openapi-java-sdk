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
public class BatchPubRequest extends RpcAcsRequest<BatchPubResponse> {
	   

	private String messageContent;

	private List<String> deviceNameNs;

	private Integer qos;

	private String iotInstanceId;

	private String topicShortName;

	private String productKey;
	public BatchPubRequest() {
		super("Iot", "2018-01-20", "BatchPub", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getDeviceNameNs() {
		return this.deviceNameNs;
	}

	public void setDeviceNameNs(List<String> deviceNameNs) {
		this.deviceNameNs = deviceNameNs;	
		if (deviceNameNs != null) {
			for (int i = 0; i < deviceNameNs.size(); i++) {
				putQueryParameter("DeviceName.N." + (i + 1) , deviceNameNs.get(i));
			}
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getTopicShortName() {
		return this.topicShortName;
	}

	public void setTopicShortName(String topicShortName) {
		this.topicShortName = topicShortName;
		if(topicShortName != null){
			putQueryParameter("TopicShortName", topicShortName);
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

	@Override
	public Class<BatchPubResponse> getResponseClass() {
		return BatchPubResponse.class;
	}

}
