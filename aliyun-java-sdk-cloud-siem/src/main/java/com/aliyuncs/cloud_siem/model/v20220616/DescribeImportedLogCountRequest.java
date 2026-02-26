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
public class DescribeImportedLogCountRequest extends RpcAcsRequest<DescribeImportedLogCountResponse> {
	   

	private String roleFor;

	private String roleType;
	public DescribeImportedLogCountRequest() {
		super("cloud-siem", "2022-06-16", "DescribeImportedLogCount", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(String roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor);
		}
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType);
		}
	}

	@Override
	public Class<DescribeImportedLogCountResponse> getResponseClass() {
		return DescribeImportedLogCountResponse.class;
	}

}
