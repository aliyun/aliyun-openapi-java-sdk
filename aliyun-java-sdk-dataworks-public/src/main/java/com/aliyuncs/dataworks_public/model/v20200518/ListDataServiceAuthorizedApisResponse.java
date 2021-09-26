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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListDataServiceAuthorizedApisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceAuthorizedApisResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<ApiAuthorized> apiAuthorizedList;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ApiAuthorized> getApiAuthorizedList() {
			return this.apiAuthorizedList;
		}

		public void setApiAuthorizedList(List<ApiAuthorized> apiAuthorizedList) {
			this.apiAuthorizedList = apiAuthorizedList;
		}

		public static class ApiAuthorized {

			private Long apiId;

			private String apiName;

			private String apiPath;

			private Integer apiStatus;

			private String createdTime;

			private String creatorId;

			private String grantCreatedTime;

			private String grantEndTime;

			private String grantOperatorId;

			private String groupId;

			private String modifiedTime;

			private Long projectId;

			private Long tenantId;

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getApiPath() {
				return this.apiPath;
			}

			public void setApiPath(String apiPath) {
				this.apiPath = apiPath;
			}

			public Integer getApiStatus() {
				return this.apiStatus;
			}

			public void setApiStatus(Integer apiStatus) {
				this.apiStatus = apiStatus;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getGrantCreatedTime() {
				return this.grantCreatedTime;
			}

			public void setGrantCreatedTime(String grantCreatedTime) {
				this.grantCreatedTime = grantCreatedTime;
			}

			public String getGrantEndTime() {
				return this.grantEndTime;
			}

			public void setGrantEndTime(String grantEndTime) {
				this.grantEndTime = grantEndTime;
			}

			public String getGrantOperatorId() {
				return this.grantOperatorId;
			}

			public void setGrantOperatorId(String grantOperatorId) {
				this.grantOperatorId = grantOperatorId;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}
		}
	}

	@Override
	public ListDataServiceAuthorizedApisResponse getInstance(UnmarshallerContext context) {
		return	ListDataServiceAuthorizedApisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
