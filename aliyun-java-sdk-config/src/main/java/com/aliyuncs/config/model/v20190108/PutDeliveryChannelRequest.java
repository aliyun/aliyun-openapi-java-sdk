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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PutDeliveryChannelRequest extends RpcAcsRequest<PutDeliveryChannelResponse> {
	   

	private String clientToken;

	private String description;

	private String deliveryChannelTargetArn;

	private String deliveryChannelCondition;

	private String deliveryChannelAssumeRoleArn;

	private String deliveryChannelName;

	private String deliveryChannelId;

	private String deliveryChannelType;

	private Integer status;
	public PutDeliveryChannelRequest() {
		super("Config", "2019-01-08", "PutDeliveryChannel", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getDeliveryChannelTargetArn() {
		return this.deliveryChannelTargetArn;
	}

	public void setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
		this.deliveryChannelTargetArn = deliveryChannelTargetArn;
		if(deliveryChannelTargetArn != null){
			putBodyParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
		}
	}

	public String getDeliveryChannelCondition() {
		return this.deliveryChannelCondition;
	}

	public void setDeliveryChannelCondition(String deliveryChannelCondition) {
		this.deliveryChannelCondition = deliveryChannelCondition;
		if(deliveryChannelCondition != null){
			putBodyParameter("DeliveryChannelCondition", deliveryChannelCondition);
		}
	}

	public String getDeliveryChannelAssumeRoleArn() {
		return this.deliveryChannelAssumeRoleArn;
	}

	public void setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
		this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
		if(deliveryChannelAssumeRoleArn != null){
			putBodyParameter("DeliveryChannelAssumeRoleArn", deliveryChannelAssumeRoleArn);
		}
	}

	public String getDeliveryChannelName() {
		return this.deliveryChannelName;
	}

	public void setDeliveryChannelName(String deliveryChannelName) {
		this.deliveryChannelName = deliveryChannelName;
		if(deliveryChannelName != null){
			putBodyParameter("DeliveryChannelName", deliveryChannelName);
		}
	}

	public String getDeliveryChannelId() {
		return this.deliveryChannelId;
	}

	public void setDeliveryChannelId(String deliveryChannelId) {
		this.deliveryChannelId = deliveryChannelId;
		if(deliveryChannelId != null){
			putBodyParameter("DeliveryChannelId", deliveryChannelId);
		}
	}

	public String getDeliveryChannelType() {
		return this.deliveryChannelType;
	}

	public void setDeliveryChannelType(String deliveryChannelType) {
		this.deliveryChannelType = deliveryChannelType;
		if(deliveryChannelType != null){
			putBodyParameter("DeliveryChannelType", deliveryChannelType);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<PutDeliveryChannelResponse> getResponseClass() {
		return PutDeliveryChannelResponse.class;
	}

}
