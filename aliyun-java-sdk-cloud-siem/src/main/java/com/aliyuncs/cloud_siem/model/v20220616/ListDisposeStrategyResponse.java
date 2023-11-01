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
import com.aliyuncs.cloud_siem.transform.v20220616.ListDisposeStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDisposeStrategyResponse extends AcsResponse {

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

			private Long subAliuid;

			private String incidentName;

			private String incidentUuid;

			private String alertUuid;

			private String sophonTaskId;

			private String playbookName;

			private String playbookUuid;

			private String playbookType;

			private Long entityId;

			private String entityType;

			private String taskParam;

			private String errorMessage;

			private String finishTime;

			private Integer effectiveStatus;

			private Integer status;

			private List<String> scope;

			private List<String> entity;

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

			public Long getSubAliuid() {
				return this.subAliuid;
			}

			public void setSubAliuid(Long subAliuid) {
				this.subAliuid = subAliuid;
			}

			public String getIncidentName() {
				return this.incidentName;
			}

			public void setIncidentName(String incidentName) {
				this.incidentName = incidentName;
			}

			public String getIncidentUuid() {
				return this.incidentUuid;
			}

			public void setIncidentUuid(String incidentUuid) {
				this.incidentUuid = incidentUuid;
			}

			public String getAlertUuid() {
				return this.alertUuid;
			}

			public void setAlertUuid(String alertUuid) {
				this.alertUuid = alertUuid;
			}

			public String getSophonTaskId() {
				return this.sophonTaskId;
			}

			public void setSophonTaskId(String sophonTaskId) {
				this.sophonTaskId = sophonTaskId;
			}

			public String getPlaybookName() {
				return this.playbookName;
			}

			public void setPlaybookName(String playbookName) {
				this.playbookName = playbookName;
			}

			public String getPlaybookUuid() {
				return this.playbookUuid;
			}

			public void setPlaybookUuid(String playbookUuid) {
				this.playbookUuid = playbookUuid;
			}

			public String getPlaybookType() {
				return this.playbookType;
			}

			public void setPlaybookType(String playbookType) {
				this.playbookType = playbookType;
			}

			public Long getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Long entityId) {
				this.entityId = entityId;
			}

			public String getEntityType() {
				return this.entityType;
			}

			public void setEntityType(String entityType) {
				this.entityType = entityType;
			}

			public String getTaskParam() {
				return this.taskParam;
			}

			public void setTaskParam(String taskParam) {
				this.taskParam = taskParam;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public Integer getEffectiveStatus() {
				return this.effectiveStatus;
			}

			public void setEffectiveStatus(Integer effectiveStatus) {
				this.effectiveStatus = effectiveStatus;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public List<String> getScope() {
				return this.scope;
			}

			public void setScope(List<String> scope) {
				this.scope = scope;
			}

			public List<String> getEntity() {
				return this.entity;
			}

			public void setEntity(List<String> entity) {
				this.entity = entity;
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
	public ListDisposeStrategyResponse getInstance(UnmarshallerContext context) {
		return	ListDisposeStrategyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
