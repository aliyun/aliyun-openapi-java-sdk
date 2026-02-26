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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTopicConfigRequest extends RpcAcsRequest<UpdateTopicConfigResponse> {
	   

	private String description;

	private String iotInstanceId;

	private String topicFullName;

	private Boolean enableBroadcast;

	private Boolean enableProxySubscribe;

	private String productKey;

	private String codec;

	private String operation;
	public UpdateTopicConfigRequest() {
		super("Iot", "2018-01-20", "UpdateTopicConfig", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getTopicFullName() {
		return this.topicFullName;
	}

	public void setTopicFullName(String topicFullName) {
		this.topicFullName = topicFullName;
		if(topicFullName != null){
			putQueryParameter("TopicFullName", topicFullName);
		}
	}

	public Boolean getEnableBroadcast() {
		return this.enableBroadcast;
	}

	public void setEnableBroadcast(Boolean enableBroadcast) {
		this.enableBroadcast = enableBroadcast;
		if(enableBroadcast != null){
			putQueryParameter("EnableBroadcast", enableBroadcast.toString());
		}
	}

	public Boolean getEnableProxySubscribe() {
		return this.enableProxySubscribe;
	}

	public void setEnableProxySubscribe(Boolean enableProxySubscribe) {
		this.enableProxySubscribe = enableProxySubscribe;
		if(enableProxySubscribe != null){
			putQueryParameter("EnableProxySubscribe", enableProxySubscribe.toString());
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

	public String getCodec() {
		return this.codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
		if(codec != null){
			putQueryParameter("Codec", codec);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<UpdateTopicConfigResponse> getResponseClass() {
		return UpdateTopicConfigResponse.class;
	}

}
