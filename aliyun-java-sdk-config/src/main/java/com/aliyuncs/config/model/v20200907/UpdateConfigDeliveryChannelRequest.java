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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateConfigDeliveryChannelRequest extends RpcAcsRequest<UpdateConfigDeliveryChannelResponse> {
	   

	private Boolean nonCompliantNotification;

	private String clientToken;

	private Boolean configurationSnapshot;

	private String description;

	private String deliveryChannelTargetArn;

	private String deliveryChannelCondition;

	private Boolean configurationItemChangeNotification;

	private String deliveryChannelName;

	private String deliveryChannelId;

	private String oversizedDataOSSTargetArn;

	private Long status;
	public UpdateConfigDeliveryChannelRequest() {
		super("Config", "2020-09-07", "UpdateConfigDeliveryChannel");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getNonCompliantNotification() {
		return this.nonCompliantNotification;
	}

	public void setNonCompliantNotification(Boolean nonCompliantNotification) {
		this.nonCompliantNotification = nonCompliantNotification;
		if(nonCompliantNotification != null){
			putQueryParameter("NonCompliantNotification", nonCompliantNotification.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getConfigurationSnapshot() {
		return this.configurationSnapshot;
	}

	public void setConfigurationSnapshot(Boolean configurationSnapshot) {
		this.configurationSnapshot = configurationSnapshot;
		if(configurationSnapshot != null){
			putQueryParameter("ConfigurationSnapshot", configurationSnapshot.toString());
		}
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

	public String getDeliveryChannelTargetArn() {
		return this.deliveryChannelTargetArn;
	}

	public void setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
		this.deliveryChannelTargetArn = deliveryChannelTargetArn;
		if(deliveryChannelTargetArn != null){
			putQueryParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
		}
	}

	public String getDeliveryChannelCondition() {
		return this.deliveryChannelCondition;
	}

	public void setDeliveryChannelCondition(String deliveryChannelCondition) {
		this.deliveryChannelCondition = deliveryChannelCondition;
		if(deliveryChannelCondition != null){
			putQueryParameter("DeliveryChannelCondition", deliveryChannelCondition);
		}
	}

	public Boolean getConfigurationItemChangeNotification() {
		return this.configurationItemChangeNotification;
	}

	public void setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
		this.configurationItemChangeNotification = configurationItemChangeNotification;
		if(configurationItemChangeNotification != null){
			putQueryParameter("ConfigurationItemChangeNotification", configurationItemChangeNotification.toString());
		}
	}

	public String getDeliveryChannelName() {
		return this.deliveryChannelName;
	}

	public void setDeliveryChannelName(String deliveryChannelName) {
		this.deliveryChannelName = deliveryChannelName;
		if(deliveryChannelName != null){
			putQueryParameter("DeliveryChannelName", deliveryChannelName);
		}
	}

	public String getDeliveryChannelId() {
		return this.deliveryChannelId;
	}

	public void setDeliveryChannelId(String deliveryChannelId) {
		this.deliveryChannelId = deliveryChannelId;
		if(deliveryChannelId != null){
			putQueryParameter("DeliveryChannelId", deliveryChannelId);
		}
	}

	public String getOversizedDataOSSTargetArn() {
		return this.oversizedDataOSSTargetArn;
	}

	public void setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
		this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
		if(oversizedDataOSSTargetArn != null){
			putQueryParameter("OversizedDataOSSTargetArn", oversizedDataOSSTargetArn);
		}
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<UpdateConfigDeliveryChannelResponse> getResponseClass() {
		return UpdateConfigDeliveryChannelResponse.class;
	}

}
