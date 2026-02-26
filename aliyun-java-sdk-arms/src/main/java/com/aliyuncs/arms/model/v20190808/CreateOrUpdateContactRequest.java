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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateContactRequest extends RpcAcsRequest<CreateOrUpdateContactResponse> {
	   

	private Long contactId;

	private Long reissueSendNotice;

	private String corpUserId;

	private String contactName;

	private String resourceGroupId;

	private String dingRobotUrl;

	private String phone;

	private String email;

	private Boolean isEmailVerify;
	public CreateOrUpdateContactRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateContact", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getContactId() {
		return this.contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
		if(contactId != null){
			putBodyParameter("ContactId", contactId.toString());
		}
	}

	public Long getReissueSendNotice() {
		return this.reissueSendNotice;
	}

	public void setReissueSendNotice(Long reissueSendNotice) {
		this.reissueSendNotice = reissueSendNotice;
		if(reissueSendNotice != null){
			putBodyParameter("ReissueSendNotice", reissueSendNotice.toString());
		}
	}

	public String getCorpUserId() {
		return this.corpUserId;
	}

	public void setCorpUserId(String corpUserId) {
		this.corpUserId = corpUserId;
		if(corpUserId != null){
			putBodyParameter("CorpUserId", corpUserId);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putBodyParameter("ContactName", contactName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDingRobotUrl() {
		return this.dingRobotUrl;
	}

	public void setDingRobotUrl(String dingRobotUrl) {
		this.dingRobotUrl = dingRobotUrl;
		if(dingRobotUrl != null){
			putQueryParameter("DingRobotUrl", dingRobotUrl);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putBodyParameter("Phone", phone);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putBodyParameter("Email", email);
		}
	}

	public Boolean getIsEmailVerify() {
		return this.isEmailVerify;
	}

	public void setIsEmailVerify(Boolean isEmailVerify) {
		this.isEmailVerify = isEmailVerify;
		if(isEmailVerify != null){
			putBodyParameter("IsEmailVerify", isEmailVerify.toString());
		}
	}

	@Override
	public Class<CreateOrUpdateContactResponse> getResponseClass() {
		return CreateOrUpdateContactResponse.class;
	}

}
