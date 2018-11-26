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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RegisterUserRequest extends RpcAcsRequest<RegisterUserResponse> {
	
	public RegisterUserRequest() {
		super("dms-enterprise", "2018-11-01", "RegisterUser", "dmsenterprise");
	}

	private String roleNames;

	private Long uid;

	private String userNick;

	private Long tid;

	public String getRoleNames() {
		return this.roleNames;
	}

	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
		if(roleNames != null){
			putQueryParameter("RoleNames", roleNames);
		}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
		if(userNick != null){
			putQueryParameter("UserNick", userNick);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	@Override
	public Class<RegisterUserResponse> getResponseClass() {
		return RegisterUserResponse.class;
	}

}
