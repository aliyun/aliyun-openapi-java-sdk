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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRobotv2IntentRequest extends RpcAcsRequest<UpdateRobotv2IntentResponse> {
	   

	private Long resourceOwnerId;

	private String intentContent;

	private String remark;

	private Long robotId;

	private String intentName;

	private Long id;

	private String resourceOwnerAccount;

	private String prodCode;

	private String ruleContent;

	private Long ownerId;
	public UpdateRobotv2IntentRequest() {
		super("Dyvms", "2017-06-20", "UpdateRobotv2Intent", "dyvms");
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

	public String getIntentContent() {
		return this.intentContent;
	}

	public void setIntentContent(String intentContent) {
		this.intentContent = intentContent;
		if(intentContent != null){
			putQueryParameter("IntentContent", intentContent);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getRobotId() {
		return this.robotId;
	}

	public void setRobotId(Long robotId) {
		this.robotId = robotId;
		if(robotId != null){
			putQueryParameter("RobotId", robotId.toString());
		}
	}

	public String getIntentName() {
		return this.intentName;
	}

	public void setIntentName(String intentName) {
		this.intentName = intentName;
		if(intentName != null){
			putQueryParameter("IntentName", intentName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public String getRuleContent() {
		return this.ruleContent;
	}

	public void setRuleContent(String ruleContent) {
		this.ruleContent = ruleContent;
		if(ruleContent != null){
			putQueryParameter("RuleContent", ruleContent);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<UpdateRobotv2IntentResponse> getResponseClass() {
		return UpdateRobotv2IntentResponse.class;
	}

}
