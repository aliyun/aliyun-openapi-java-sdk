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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutomateResponseConfigPlayBooksRequest extends RpcAcsRequest<DescribeAutomateResponseConfigPlayBooksResponse> {
	   

	private Long roleFor;

	private String autoResponseType;

	private Integer roleType;

	private String entityType;
	public DescribeAutomateResponseConfigPlayBooksRequest() {
		super("cloud-siem", "2022-06-16", "DescribeAutomateResponseConfigPlayBooks", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public String getAutoResponseType() {
		return this.autoResponseType;
	}

	public void setAutoResponseType(String autoResponseType) {
		this.autoResponseType = autoResponseType;
		if(autoResponseType != null){
			putBodyParameter("AutoResponseType", autoResponseType);
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putBodyParameter("EntityType", entityType);
		}
	}

	@Override
	public Class<DescribeAutomateResponseConfigPlayBooksResponse> getResponseClass() {
		return DescribeAutomateResponseConfigPlayBooksResponse.class;
	}

}
