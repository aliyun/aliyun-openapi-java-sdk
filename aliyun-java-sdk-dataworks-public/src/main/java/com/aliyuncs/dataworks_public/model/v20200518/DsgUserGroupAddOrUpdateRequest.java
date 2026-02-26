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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DsgUserGroupAddOrUpdateRequest extends RpcAcsRequest<DsgUserGroupAddOrUpdateResponse> {
	   

	@SerializedName("userGroups")
	private List<UserGroups> userGroups;
	public DsgUserGroupAddOrUpdateRequest() {
		super("dataworks-public", "2020-05-18", "DsgUserGroupAddOrUpdate");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UserGroups> getUserGroups() {
		return this.userGroups;
	}

	public void setUserGroups(List<UserGroups> userGroups) {
		this.userGroups = userGroups;	
		if (userGroups != null) {
			putQueryParameter("UserGroups" , new Gson().toJson(userGroups));
		}	
	}

	public static class UserGroups {

		@SerializedName("Owner")
		private String owner;

		@SerializedName("ProjectName")
		private String projectName;

		@SerializedName("UserGroupType")
		private Integer userGroupType;

		@SerializedName("Name")
		private String name;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Accounts")
		private List<String> accounts;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Integer getUserGroupType() {
			return this.userGroupType;
		}

		public void setUserGroupType(Integer userGroupType) {
			this.userGroupType = userGroupType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<String> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<String> accounts) {
			this.accounts = accounts;
		}
	}

	@Override
	public Class<DsgUserGroupAddOrUpdateResponse> getResponseClass() {
		return DsgUserGroupAddOrUpdateResponse.class;
	}

}
