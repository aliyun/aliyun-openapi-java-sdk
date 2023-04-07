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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveFilePermissionRequest extends RpcAcsRequest<RemoveFilePermissionResponse> {
	   

	@SerializedName("memberList")
	private List<MemberList> memberList;

	private String cdsId;

	private String endUserId;

	private String fileId;
	public RemoveFilePermissionRequest() {
		super("ecd", "2020-09-30", "RemoveFilePermission");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<MemberList> getMemberList() {
		return this.memberList;
	}

	public void setMemberList(List<MemberList> memberList) {
		this.memberList = memberList;	
		if (memberList != null) {
			putQueryParameter("MemberList" , new Gson().toJson(memberList));
		}	
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putQueryParameter("FileId", fileId);
		}
	}

	public static class MemberList {

		@SerializedName("RoleId")
		private String roleId;

		@SerializedName("CdsIdentity")
		private CdsIdentity cdsIdentity;

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}

		public CdsIdentity getCdsIdentity() {
			return this.cdsIdentity;
		}

		public void setCdsIdentity(CdsIdentity cdsIdentity) {
			this.cdsIdentity = cdsIdentity;
		}

		public static class CdsIdentity {

			@SerializedName("Id")
			private String id;

			@SerializedName("Type")
			private String type;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public Class<RemoveFilePermissionResponse> getResponseClass() {
		return RemoveFilePermissionResponse.class;
	}

}
