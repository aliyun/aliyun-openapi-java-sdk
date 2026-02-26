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
public class SyncDepartmentRequest extends RpcAcsRequest<SyncDepartmentResponse> {
	   

	private Long opTenantId;

	@SerializedName("syncDepartmentCommand")
	private SyncDepartmentCommand syncDepartmentCommand;
	public SyncDepartmentRequest() {
		super("dataphin-public", "2023-06-30", "SyncDepartment");
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

	public SyncDepartmentCommand getSyncDepartmentCommand() {
		return this.syncDepartmentCommand;
	}

	public void setSyncDepartmentCommand(SyncDepartmentCommand syncDepartmentCommand) {
		this.syncDepartmentCommand = syncDepartmentCommand;	
		if (syncDepartmentCommand != null) {
			putBodyParameter("SyncDepartmentCommand" , new Gson().toJson(syncDepartmentCommand));
		}	
	}

	public static class SyncDepartmentCommand {

		@SerializedName("DepartmentList")
		private List<DepartmentListItem> departmentList;

		public List<DepartmentListItem> getDepartmentList() {
			return this.departmentList;
		}

		public void setDepartmentList(List<DepartmentListItem> departmentList) {
			this.departmentList = departmentList;
		}

		public static class DepartmentListItem {

			@SerializedName("DepartmentName")
			private String departmentName;

			@SerializedName("DepartmentId")
			private String departmentId;

			@SerializedName("ParentDepartmentId")
			private String parentDepartmentId;

			public String getDepartmentName() {
				return this.departmentName;
			}

			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}

			public String getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(String departmentId) {
				this.departmentId = departmentId;
			}

			public String getParentDepartmentId() {
				return this.parentDepartmentId;
			}

			public void setParentDepartmentId(String parentDepartmentId) {
				this.parentDepartmentId = parentDepartmentId;
			}
		}
	}

	@Override
	public Class<SyncDepartmentResponse> getResponseClass() {
		return SyncDepartmentResponse.class;
	}

}
