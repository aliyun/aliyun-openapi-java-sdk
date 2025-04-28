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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncDepartmentUserRequest extends RpcAcsRequest<SyncDepartmentUserResponse> {
	   

	private Long opTenantId;

	@SerializedName("syncDepartmentUserCommand")
	private SyncDepartmentUserCommand syncDepartmentUserCommand;
	public SyncDepartmentUserRequest() {
		super("dataphin-public", "2023-06-30", "SyncDepartmentUser");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public SyncDepartmentUserCommand getSyncDepartmentUserCommand() {
		return this.syncDepartmentUserCommand;
	}

	public void setSyncDepartmentUserCommand(SyncDepartmentUserCommand syncDepartmentUserCommand) {
		this.syncDepartmentUserCommand = syncDepartmentUserCommand;	
		if (syncDepartmentUserCommand != null) {
			putBodyParameter("SyncDepartmentUserCommand" , new Gson().toJson(syncDepartmentUserCommand));
		}	
	}

	public static class SyncDepartmentUserCommand {

		@SerializedName("DeptUserMapping")
		private List<DeptUserMappingItem> deptUserMapping;

		public List<DeptUserMappingItem> getDeptUserMapping() {
			return this.deptUserMapping;
		}

		public void setDeptUserMapping(List<DeptUserMappingItem> deptUserMapping) {
			this.deptUserMapping = deptUserMapping;
		}

		public static class DeptUserMappingItem {

			@SerializedName("SourceUserId")
			private String sourceUserId;

			@SerializedName("DepartmentIdList")
			private List<String> departmentIdList;

			public String getSourceUserId() {
				return this.sourceUserId;
			}

			public void setSourceUserId(String sourceUserId) {
				this.sourceUserId = sourceUserId;
			}

			public List<String> getDepartmentIdList() {
				return this.departmentIdList;
			}

			public void setDepartmentIdList(List<String> departmentIdList) {
				this.departmentIdList = departmentIdList;
			}
		}
	}

	@Override
	public Class<SyncDepartmentUserResponse> getResponseClass() {
		return SyncDepartmentUserResponse.class;
	}

}
