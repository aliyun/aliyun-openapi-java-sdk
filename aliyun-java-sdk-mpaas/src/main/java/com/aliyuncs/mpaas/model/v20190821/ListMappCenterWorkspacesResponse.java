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

package com.aliyuncs.mpaas.model.v20190821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20190821.ListMappCenterWorkspacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMappCenterWorkspacesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ListMappCenterWorkspaceResult listMappCenterWorkspaceResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ListMappCenterWorkspaceResult getListMappCenterWorkspaceResult() {
		return this.listMappCenterWorkspaceResult;
	}

	public void setListMappCenterWorkspaceResult(ListMappCenterWorkspaceResult listMappCenterWorkspaceResult) {
		this.listMappCenterWorkspaceResult = listMappCenterWorkspaceResult;
	}

	public static class ListMappCenterWorkspaceResult {

		private String resultMsg;

		private Boolean success;

		private String userId;

		private List<MappCenterWorkspaceListItem> mappCenterWorkspaceList;

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
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

			private String compatibleId;

			private String createTime;

			private String displayName;

			private String id;

			private String region;

			private String status;

			private String tenantId;

			private String type;

			private Long uid;

			private String updateTime;

			private String workspaceId;

			private String zones;

			public String getCompatibleId() {
				return this.compatibleId;
			}

			public void setCompatibleId(String compatibleId) {
				this.compatibleId = compatibleId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUid() {
				return this.uid;
			}

			public void setUid(Long uid) {
				this.uid = uid;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getZones() {
				return this.zones;
			}

			public void setZones(String zones) {
				this.zones = zones;
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
