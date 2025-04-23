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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUsersRequest extends RpcAcsRequest<CreateUsersResponse> {
	   

	private String autoLockTime;

	private Boolean isLocalAdmin;

	private List<Users> userss;

	private String password;

	private String passwordExpireDays;
	public CreateUsersRequest() {
		super("eds-user", "2021-03-08", "CreateUsers", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAutoLockTime() {
		return this.autoLockTime;
	}

	public void setAutoLockTime(String autoLockTime) {
		this.autoLockTime = autoLockTime;
		if(autoLockTime != null){
			putQueryParameter("AutoLockTime", autoLockTime);
		}
	}

	public Boolean getIsLocalAdmin() {
		return this.isLocalAdmin;
	}

	public void setIsLocalAdmin(Boolean isLocalAdmin) {
		this.isLocalAdmin = isLocalAdmin;
		if(isLocalAdmin != null){
			putQueryParameter("IsLocalAdmin", isLocalAdmin.toString());
		}
	}

	public List<Users> getUserss() {
		return this.userss;
	}

	public void setUserss(List<Users> userss) {
		this.userss = userss;	
		if (userss != null) {
			for (int depth1 = 0; depth1 < userss.size(); depth1++) {
				putBodyParameter("Users." + (depth1 + 1) + ".Password" , userss.get(depth1).getPassword());
				putBodyParameter("Users." + (depth1 + 1) + ".RealNickName" , userss.get(depth1).getRealNickName());
				putBodyParameter("Users." + (depth1 + 1) + ".Phone" , userss.get(depth1).getPhone());
				putBodyParameter("Users." + (depth1 + 1) + ".OwnerType" , userss.get(depth1).getOwnerType());
				putBodyParameter("Users." + (depth1 + 1) + ".EndUserId" , userss.get(depth1).getEndUserId());
				putBodyParameter("Users." + (depth1 + 1) + ".Remark" , userss.get(depth1).getRemark());
				putBodyParameter("Users." + (depth1 + 1) + ".Email" , userss.get(depth1).getEmail());
				putBodyParameter("Users." + (depth1 + 1) + ".OrgId" , userss.get(depth1).getOrgId());
			}
		}	
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getPasswordExpireDays() {
		return this.passwordExpireDays;
	}

	public void setPasswordExpireDays(String passwordExpireDays) {
		this.passwordExpireDays = passwordExpireDays;
		if(passwordExpireDays != null){
			putQueryParameter("PasswordExpireDays", passwordExpireDays);
		}
	}

	public static class Users {

		private String password;

		private String realNickName;

		private String phone;

		private String ownerType;

		private String endUserId;

		private String remark;

		private String email;

		private String orgId;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRealNickName() {
			return this.realNickName;
		}

		public void setRealNickName(String realNickName) {
			this.realNickName = realNickName;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getOwnerType() {
			return this.ownerType;
		}

		public void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getOrgId() {
			return this.orgId;
		}

		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}
	}

	@Override
	public Class<CreateUsersResponse> getResponseClass() {
		return CreateUsersResponse.class;
	}

}
