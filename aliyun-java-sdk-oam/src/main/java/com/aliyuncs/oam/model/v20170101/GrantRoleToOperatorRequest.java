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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GrantRoleToOperatorRequest extends RpcAcsRequest<GrantRoleToOperatorResponse> {
	   

	private String toOperatorName;

	private String roleName;

	private String userType;

	private String gmtExpired;
	public GrantRoleToOperatorRequest() {
		super("Oam", "2017-01-01", "GrantRoleToOperator");
		setMethod(MethodType.POST);
	}

	public String getToOperatorName() {
		return this.toOperatorName;
	}

	public void setToOperatorName(String toOperatorName) {
		this.toOperatorName = toOperatorName;
		if(toOperatorName != null){
			putQueryParameter("ToOperatorName", toOperatorName);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}

	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
		if(gmtExpired != null){
			putQueryParameter("GmtExpired", gmtExpired);
		}
	}

	@Override
	public Class<GrantRoleToOperatorResponse> getResponseClass() {
		return GrantRoleToOperatorResponse.class;
	}

}
