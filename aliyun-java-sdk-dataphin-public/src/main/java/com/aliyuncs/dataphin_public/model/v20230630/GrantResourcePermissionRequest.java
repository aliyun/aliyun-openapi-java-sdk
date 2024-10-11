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
public class GrantResourcePermissionRequest extends RpcAcsRequest<GrantResourcePermissionResponse> {
	   

	private Long opTenantId;

	@SerializedName("grantCommand")
	private GrantCommand grantCommand;
	public GrantResourcePermissionRequest() {
		super("dataphin-public", "2023-06-30", "GrantResourcePermission");
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

	public GrantCommand getGrantCommand() {
		return this.grantCommand;
	}

	public void setGrantCommand(GrantCommand grantCommand) {
		this.grantCommand = grantCommand;	
		if (grantCommand != null) {
			putBodyParameter("GrantCommand" , new Gson().toJson(grantCommand));
		}	
	}

	public static class GrantCommand {

		@SerializedName("Reason")
		private String reason;

		@SerializedName("OperateList")
		private List<String> operateList;

		@SerializedName("UserIdList")
		private List<String> userIdList;

		@SerializedName("ResourceType")
		private String resourceType;

		@SerializedName("ResourceList")
		private List<ResourceListItem> resourceList;

		@SerializedName("EffectiveEnd")
		private String effectiveEnd;

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public List<String> getOperateList() {
			return this.operateList;
		}

		public void setOperateList(List<String> operateList) {
			this.operateList = operateList;
		}

		public List<String> getUserIdList() {
			return this.userIdList;
		}

		public void setUserIdList(List<String> userIdList) {
			this.userIdList = userIdList;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public List<ResourceListItem> getResourceList() {
			return this.resourceList;
		}

		public void setResourceList(List<ResourceListItem> resourceList) {
			this.resourceList = resourceList;
		}

		public String getEffectiveEnd() {
			return this.effectiveEnd;
		}

		public void setEffectiveEnd(String effectiveEnd) {
			this.effectiveEnd = effectiveEnd;
		}

		public static class ResourceListItem {

			@SerializedName("ResourceId")
			private String resourceId;

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}
		}
	}

	@Override
	public Class<GrantResourcePermissionResponse> getResponseClass() {
		return GrantResourcePermissionResponse.class;
	}

}
