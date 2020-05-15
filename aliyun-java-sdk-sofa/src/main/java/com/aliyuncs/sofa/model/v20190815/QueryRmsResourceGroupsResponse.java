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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsResourceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsResourceGroupsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

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

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private Long currentPage;

		private Long pageSize;

		private Long totalSize;

		private List<DataItem> data;

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String groupName;

			private String groupType;

			private String id;

			private String originType;

			private String resType;

			private String tenantId;

			private String utcCreated;

			private String utcModified;

			private String workspaceId;

			private List<LablesItem> lables;

			private List<String> itemTypeAlerting;

			private List<String> itemTypeConfigured;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getGroupType() {
				return this.groupType;
			}

			public void setGroupType(String groupType) {
				this.groupType = groupType;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getOriginType() {
				return this.originType;
			}

			public void setOriginType(String originType) {
				this.originType = originType;
			}

			public String getResType() {
				return this.resType;
			}

			public void setResType(String resType) {
				this.resType = resType;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getUtcCreated() {
				return this.utcCreated;
			}

			public void setUtcCreated(String utcCreated) {
				this.utcCreated = utcCreated;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public List<LablesItem> getLables() {
				return this.lables;
			}

			public void setLables(List<LablesItem> lables) {
				this.lables = lables;
			}

			public List<String> getItemTypeAlerting() {
				return this.itemTypeAlerting;
			}

			public void setItemTypeAlerting(List<String> itemTypeAlerting) {
				this.itemTypeAlerting = itemTypeAlerting;
			}

			public List<String> getItemTypeConfigured() {
				return this.itemTypeConfigured;
			}

			public void setItemTypeConfigured(List<String> itemTypeConfigured) {
				this.itemTypeConfigured = itemTypeConfigured;
			}

			public static class LablesItem {

				private String resId;

				private String resName;

				public String getResId() {
					return this.resId;
				}

				public void setResId(String resId) {
					this.resId = resId;
				}

				public String getResName() {
					return this.resName;
				}

				public void setResName(String resName) {
					this.resName = resName;
				}
			}
		}
	}

	@Override
	public QueryRmsResourceGroupsResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsResourceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
