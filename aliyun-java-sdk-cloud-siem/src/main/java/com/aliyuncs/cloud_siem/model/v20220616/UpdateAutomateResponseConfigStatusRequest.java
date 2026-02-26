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
public class UpdateAutomateResponseConfigStatusRequest extends RpcAcsRequest<UpdateAutomateResponseConfigStatusResponse> {
	   

	private Long roleFor;

	private Integer roleType;

	private String ids;

	private Boolean inUse;
	public UpdateAutomateResponseConfigStatusRequest() {
		super("cloud-siem", "2022-06-16", "UpdateAutomateResponseConfigStatus", "cloud-siem");
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

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putBodyParameter("Ids", ids);
		}
	}

	public Boolean getInUse() {
		return this.inUse;
	}

	public void setInUse(Boolean inUse) {
		this.inUse = inUse;
		if(inUse != null){
			putBodyParameter("InUse", inUse.toString());
		}
	}

	@Override
	public Class<UpdateAutomateResponseConfigStatusResponse> getResponseClass() {
		return UpdateAutomateResponseConfigStatusResponse.class;
	}

}
