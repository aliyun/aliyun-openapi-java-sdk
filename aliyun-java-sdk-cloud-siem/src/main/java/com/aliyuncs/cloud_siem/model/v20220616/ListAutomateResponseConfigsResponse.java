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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListAutomateResponseConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAutomateResponseConfigsResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ResponseDataItem> responseData;

		private PageInfo pageInfo;

		public List<ResponseDataItem> getResponseData() {
			return this.responseData;
		}

		public void setResponseData(List<ResponseDataItem> responseData) {
			this.responseData = responseData;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class ResponseDataItem {

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			private Long aliuid;

			private Long subUserId;

			private String ruleName;

			private String autoResponseType;

			private String executionCondition;

			private String actionType;

			private String actionConfig;

			private Integer status;

			private Integer dataType;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getAliuid() {
				return this.aliuid;
			}

			public void setAliuid(Long aliuid) {
				this.aliuid = aliuid;
			}

			public Long getSubUserId() {
				return this.subUserId;
			}

			public void setSubUserId(Long subUserId) {
				this.subUserId = subUserId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getAutoResponseType() {
				return this.autoResponseType;
			}

			public void setAutoResponseType(String autoResponseType) {
				this.autoResponseType = autoResponseType;
			}

			public String getExecutionCondition() {
				return this.executionCondition;
			}

			public void setExecutionCondition(String executionCondition) {
				this.executionCondition = executionCondition;
			}

			public String getActionType() {
				return this.actionType;
			}

			public void setActionType(String actionType) {
				this.actionType = actionType;
			}

			public String getActionConfig() {
				return this.actionConfig;
			}

			public void setActionConfig(String actionConfig) {
				this.actionConfig = actionConfig;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getDataType() {
				return this.dataType;
			}

			public void setDataType(Integer dataType) {
				this.dataType = dataType;
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public ListAutomateResponseConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListAutomateResponseConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
