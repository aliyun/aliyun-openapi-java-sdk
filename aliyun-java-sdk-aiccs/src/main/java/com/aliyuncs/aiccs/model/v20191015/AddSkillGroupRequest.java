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
public class AddSkillGroupRequest extends RpcAcsRequest<AddSkillGroupResponse> {
	   

	private String outerDepartmentType;

	private String outerGroupId;

	private String outerGroupType;

	private String outerDepartmentId;

	private String outerGroupName;
	public AddSkillGroupRequest() {
		super("aiccs", "2019-10-15", "AddSkillGroup");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getOuterGroupId() {
		return this.outerGroupId;
	}

	public void setOuterGroupId(String outerGroupId) {
		this.outerGroupId = outerGroupId;
		if(outerGroupId != null){
			putQueryParameter("OuterGroupId", outerGroupId);
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

	public String getOuterDepartmentId() {
		return this.outerDepartmentId;
	}

	public void setOuterDepartmentId(String outerDepartmentId) {
		this.outerDepartmentId = outerDepartmentId;
		if(outerDepartmentId != null){
			putQueryParameter("OuterDepartmentId", outerDepartmentId);
		}
	}

	public String getOuterGroupName() {
		return this.outerGroupName;
	}

	public void setOuterGroupName(String outerGroupName) {
		this.outerGroupName = outerGroupName;
		if(outerGroupName != null){
			putQueryParameter("OuterGroupName", outerGroupName);
		}
	}

	@Override
	public Class<AddSkillGroupResponse> getResponseClass() {
		return AddSkillGroupResponse.class;
	}

}
