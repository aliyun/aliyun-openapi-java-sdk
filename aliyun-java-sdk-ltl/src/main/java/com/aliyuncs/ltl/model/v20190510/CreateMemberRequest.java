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

package com.aliyuncs.ltl.model.v20190510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ltl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMemberRequest extends RpcAcsRequest<CreateMemberResponse> {
	   

	private String apiVersion;

	private String remark;

	private String bizChainId;

	private String memberUid;

	private String memberContact;

	private String memberPhone;

	private String memberName;
	public CreateMemberRequest() {
		super("ltl", "2019-05-10", "CreateMember");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		if(apiVersion != null){
			putQueryParameter("ApiVersion", apiVersion);
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

	public String getBizChainId() {
		return this.bizChainId;
	}

	public void setBizChainId(String bizChainId) {
		this.bizChainId = bizChainId;
		if(bizChainId != null){
			putQueryParameter("BizChainId", bizChainId);
		}
	}

	public String getMemberUid() {
		return this.memberUid;
	}

	public void setMemberUid(String memberUid) {
		this.memberUid = memberUid;
		if(memberUid != null){
			putQueryParameter("MemberUid", memberUid);
		}
	}

	public String getMemberContact() {
		return this.memberContact;
	}

	public void setMemberContact(String memberContact) {
		this.memberContact = memberContact;
		if(memberContact != null){
			putQueryParameter("MemberContact", memberContact);
		}
	}

	public String getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
		if(memberPhone != null){
			putQueryParameter("MemberPhone", memberPhone);
		}
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
		if(memberName != null){
			putQueryParameter("MemberName", memberName);
		}
	}

	@Override
	public Class<CreateMemberResponse> getResponseClass() {
		return CreateMemberResponse.class;
	}

}
