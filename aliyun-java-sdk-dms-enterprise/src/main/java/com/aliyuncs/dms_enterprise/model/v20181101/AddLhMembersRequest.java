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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLhMembersRequest extends RpcAcsRequest<AddLhMembersResponse> {
	   

	private Long tid;

	@SerializedName("members")
	private List<Members> members;

	private Integer objectType;

	private Long objectId;
	public AddLhMembersRequest() {
		super("dms-enterprise", "2018-11-01", "AddLhMembers", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<Members> getMembers() {
		return this.members;
	}

	public void setMembers(List<Members> members) {
		this.members = members;	
		if (members != null) {
			putQueryParameter("Members" , new Gson().toJson(members));
		}	
	}

	public Integer getObjectType() {
		return this.objectType;
	}

	public void setObjectType(Integer objectType) {
		this.objectType = objectType;
		if(objectType != null){
			putQueryParameter("ObjectType", objectType.toString());
		}
	}

	public Long getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
		if(objectId != null){
			putQueryParameter("ObjectId", objectId.toString());
		}
	}

	public static class Members {

		@SerializedName("Roles")
		private List<String> roles;

		@SerializedName("UserId")
		private Long userId;

		public List<String> getRoles() {
			return this.roles;
		}

		public void setRoles(List<String> roles) {
			this.roles = roles;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<AddLhMembersResponse> getResponseClass() {
		return AddLhMembersResponse.class;
	}

}
