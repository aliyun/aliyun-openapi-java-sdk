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
public class OpsSetImageBidRelRequest extends RpcAcsRequest<OpsSetImageBidRelResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private String operator;

	private Long authAliUid;

	private Boolean authType;

	private String bid2Privilege;

	private Long imageOwner;

	private String auditParamStr;
	public OpsSetImageBidRelRequest() {
		super("Ecsops", "2016-04-01", "OpsSetImageBidRel", "ecs");
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

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Long getAuthAliUid() {
		return this.authAliUid;
	}

	public void setAuthAliUid(Long authAliUid) {
		this.authAliUid = authAliUid;
		if(authAliUid != null){
			putQueryParameter("AuthAliUid", authAliUid.toString());
		}
	}

	public Boolean getAuthType() {
		return this.authType;
	}

	public void setAuthType(Boolean authType) {
		this.authType = authType;
		if(authType != null){
			putQueryParameter("AuthType", authType.toString());
		}
	}

	public String getBid2Privilege() {
		return this.bid2Privilege;
	}

	public void setBid2Privilege(String bid2Privilege) {
		this.bid2Privilege = bid2Privilege;
		if(bid2Privilege != null){
			putQueryParameter("Bid2Privilege", bid2Privilege);
		}
	}

	public Long getImageOwner() {
		return this.imageOwner;
	}

	public void setImageOwner(Long imageOwner) {
		this.imageOwner = imageOwner;
		if(imageOwner != null){
			putQueryParameter("ImageOwner", imageOwner.toString());
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
	public Class<OpsSetImageBidRelResponse> getResponseClass() {
		return OpsSetImageBidRelResponse.class;
	}

}
