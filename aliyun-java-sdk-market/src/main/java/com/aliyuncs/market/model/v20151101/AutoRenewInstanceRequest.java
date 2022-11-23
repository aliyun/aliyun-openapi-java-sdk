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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AutoRenewInstanceRequest extends RpcAcsRequest<AutoRenewInstanceResponse> {
	   

	private String type;

	private Long ownerId;

	private Integer autoRenewDuration;

	private String autoRenewCycle;

	private Long orderBizId;
	public AutoRenewInstanceRequest() {
		super("Market", "2015-11-01", "AutoRenewInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putBodyParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getAutoRenewDuration() {
		return this.autoRenewDuration;
	}

	public void setAutoRenewDuration(Integer autoRenewDuration) {
		this.autoRenewDuration = autoRenewDuration;
		if(autoRenewDuration != null){
			putBodyParameter("AutoRenewDuration", autoRenewDuration.toString());
		}
	}

	public String getAutoRenewCycle() {
		return this.autoRenewCycle;
	}

	public void setAutoRenewCycle(String autoRenewCycle) {
		this.autoRenewCycle = autoRenewCycle;
		if(autoRenewCycle != null){
			putBodyParameter("AutoRenewCycle", autoRenewCycle);
		}
	}

	public Long getOrderBizId() {
		return this.orderBizId;
	}

	public void setOrderBizId(Long orderBizId) {
		this.orderBizId = orderBizId;
		if(orderBizId != null){
			putBodyParameter("OrderBizId", orderBizId.toString());
		}
	}

	@Override
	public Class<AutoRenewInstanceResponse> getResponseClass() {
		return AutoRenewInstanceResponse.class;
	}

}
