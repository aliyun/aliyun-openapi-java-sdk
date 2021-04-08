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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateOuterAccountRequest extends RpcAcsRequest<UpdateOuterAccountResponse> {
	   

	private String ext;

	private String outerAccountName;

	private String outerDepartmentId;

	private String avatar;

	private String outerAccountType;

	private String realName;

	private String outerDepartmentType;

	private String outerGroupIds;

	private String outerGroupType;

	private String outerAccountId;
	public UpdateOuterAccountRequest() {
		super("aiccs", "2019-10-15", "UpdateOuterAccount");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExt() {
		return this.ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
		if(ext != null){
			putQueryParameter("Ext", ext);
		}
	}

	public String getOuterAccountName() {
		return this.outerAccountName;
	}

	public void setOuterAccountName(String outerAccountName) {
		this.outerAccountName = outerAccountName;
		if(outerAccountName != null){
			putQueryParameter("OuterAccountName", outerAccountName);
		}
	}

	public String getOuterDepartmentId() {
		return this.outerDepartmentId;
	}

	public void setOuterDepartmentId(String outerDepartmentId) {
		this.outerDepartmentId = outerDepartmentId;
		if(outerDepartmentId != null){
			putQueryParameter("OuterDepartmentId", outerDepartmentId);
		}
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
		if(avatar != null){
			putQueryParameter("Avatar", avatar);
		}
	}

	public String getOuterAccountType() {
		return this.outerAccountType;
	}

	public void setOuterAccountType(String outerAccountType) {
		this.outerAccountType = outerAccountType;
		if(outerAccountType != null){
			putQueryParameter("OuterAccountType", outerAccountType);
		}
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
		if(realName != null){
			putQueryParameter("RealName", realName);
		}
	}

	public String getOuterDepartmentType() {
		return this.outerDepartmentType;
	}

	public void setOuterDepartmentType(String outerDepartmentType) {
		this.outerDepartmentType = outerDepartmentType;
		if(outerDepartmentType != null){
			putQueryParameter("OuterDepartmentType", outerDepartmentType);
		}
	}

	public String getOuterGroupIds() {
		return this.outerGroupIds;
	}

	public void setOuterGroupIds(String outerGroupIds) {
		this.outerGroupIds = outerGroupIds;
		if(outerGroupIds != null){
			putQueryParameter("OuterGroupIds", outerGroupIds);
		}
	}

	public String getOuterGroupType() {
		return this.outerGroupType;
	}

	public void setOuterGroupType(String outerGroupType) {
		this.outerGroupType = outerGroupType;
		if(outerGroupType != null){
			putQueryParameter("OuterGroupType", outerGroupType);
		}
	}

	public String getOuterAccountId() {
		return this.outerAccountId;
	}

	public void setOuterAccountId(String outerAccountId) {
		this.outerAccountId = outerAccountId;
		if(outerAccountId != null){
			putQueryParameter("OuterAccountId", outerAccountId);
		}
	}

	@Override
	public Class<UpdateOuterAccountResponse> getResponseClass() {
		return UpdateOuterAccountResponse.class;
	}

}
