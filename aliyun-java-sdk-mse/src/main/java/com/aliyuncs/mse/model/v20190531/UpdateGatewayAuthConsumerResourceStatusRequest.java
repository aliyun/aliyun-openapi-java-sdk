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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayAuthConsumerResourceStatusRequest extends RpcAcsRequest<UpdateGatewayAuthConsumerResourceStatusResponse> {
	   

	private String gatewayUniqueId;

	private Long consumerId;

	private String idList;

	private Boolean resourceStatus;

	private String acceptLanguage;
	public UpdateGatewayAuthConsumerResourceStatusRequest() {
		super("mse", "2019-05-31", "UpdateGatewayAuthConsumerResourceStatus", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public Long getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
		if(consumerId != null){
			putQueryParameter("ConsumerId", consumerId.toString());
		}
	}

	public String getIdList() {
		return this.idList;
	}

	public void setIdList(String idList) {
		this.idList = idList;
		if(idList != null){
			putQueryParameter("IdList", idList);
		}
	}

	public Boolean getResourceStatus() {
		return this.resourceStatus;
	}

	public void setResourceStatus(Boolean resourceStatus) {
		this.resourceStatus = resourceStatus;
		if(resourceStatus != null){
			putQueryParameter("ResourceStatus", resourceStatus.toString());
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<UpdateGatewayAuthConsumerResourceStatusResponse> getResponseClass() {
		return UpdateGatewayAuthConsumerResourceStatusResponse.class;
	}

}
