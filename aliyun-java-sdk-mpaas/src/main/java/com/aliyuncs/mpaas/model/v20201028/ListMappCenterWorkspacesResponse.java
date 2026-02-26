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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.ListMappCenterWorkspacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMappCenterWorkspacesResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ListMappCenterWorkspaceResult listMappCenterWorkspaceResult;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ListMappCenterWorkspaceResult getListMappCenterWorkspaceResult() {
		return this.listMappCenterWorkspaceResult;
	}

	public void setListMappCenterWorkspaceResult(ListMappCenterWorkspaceResult listMappCenterWorkspaceResult) {
		this.listMappCenterWorkspaceResult = listMappCenterWorkspaceResult;
	}

	public static class ListMappCenterWorkspaceResult {

		private Boolean success;

		private String resultMsg;

		private String userId;

		private List<MappCenterWorkspaceListItem> mappCenterWorkspaceList;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public List<MappCenterWorkspaceListItem> getMappCenterWorkspaceList() {
			return this.mappCenterWorkspaceList;
		}

		public void setMappCenterWorkspaceList(List<MappCenterWorkspaceListItem> mappCenterWorkspaceList) {
			this.mappCenterWorkspaceList = mappCenterWorkspaceList;
		}

		public static class MappCenterWorkspaceListItem {

			private String displayName;

			private String status;

			private String type;

			private String zones;

			private String updateTime;

			private String createTime;

			private String workspaceId;

			private String region;

			private String compatibleId;

			private String id;

			private String tenantId;

			private Long uid;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getZones() {
				return this.zones;
			}

			public void setZones(String zones) {
				this.zones = zones;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getCompatibleId() {
				return this.compatibleId;
			}

			public void setCompatibleId(String compatibleId) {
				this.compatibleId = compatibleId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public Long getUid() {
				return this.uid;
			}

			public void setUid(Long uid) {
				this.uid = uid;
			}
		}
	}

	@Override
	public ListMappCenterWorkspacesResponse getInstance(UnmarshallerContext context) {
		return	ListMappCenterWorkspacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
