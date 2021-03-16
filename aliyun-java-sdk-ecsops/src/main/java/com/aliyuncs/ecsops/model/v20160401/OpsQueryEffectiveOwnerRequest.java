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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEffectiveOwnerRequest extends RpcAcsRequest<OpsQueryEffectiveOwnerResponse> {
	   

	private Long resourceOwnerId;

	private String effectiveOwnerType;

	private String resourceOwnerBid;

	private String auditParamStr;
	public OpsQueryEffectiveOwnerRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryEffectiveOwner", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getEffectiveOwnerType() {
		return this.effectiveOwnerType;
	}

	public void setEffectiveOwnerType(String effectiveOwnerType) {
		this.effectiveOwnerType = effectiveOwnerType;
		if(effectiveOwnerType != null){
			putQueryParameter("EffectiveOwnerType", effectiveOwnerType);
		}
	}

	public String getResourceOwnerBid() {
		return this.resourceOwnerBid;
	}

	public void setResourceOwnerBid(String resourceOwnerBid) {
		this.resourceOwnerBid = resourceOwnerBid;
		if(resourceOwnerBid != null){
			putQueryParameter("ResourceOwnerBid", resourceOwnerBid);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryEffectiveOwnerResponse> getResponseClass() {
		return OpsQueryEffectiveOwnerResponse.class;
	}

}
