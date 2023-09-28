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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetPagedInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPagedInstanceResponse extends AcsResponse {

	private String traceId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Long pageIndex;

	private String requestId;

	private Long pageSize;

	private Long total;

	private Data data;

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<InstanceItem> instance;

		public List<InstanceItem> getInstance() {
			return this.instance;
		}

		public void setInstance(List<InstanceItem> instance) {
			this.instance = instance;
		}

		public static class InstanceItem {

			private String businessTime;

			private Long checkStatus;

			private Long dagId;

			private String delete;

			private String endTime;

			private String gmtCreate;

			private String gmtModified;

			private Long historyDagId;

			private Long id;

			private String lastRunningContext;

			private String msg;

			private Long status;

			private Long taskType;

			private String tenantId;

			private Long triggerType;

			private String version;

			public String getBusinessTime() {
				return this.businessTime;
			}

			public void setBusinessTime(String businessTime) {
				this.businessTime = businessTime;
			}

			public Long getCheckStatus() {
				return this.checkStatus;
			}

			public void setCheckStatus(Long checkStatus) {
				this.checkStatus = checkStatus;
			}

			public Long getDagId() {
				return this.dagId;
			}

			public void setDagId(Long dagId) {
				this.dagId = dagId;
			}

			public String getDelete() {
				return this.delete;
			}

			public void setDelete(String delete) {
				this.delete = delete;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
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

			public Long getHistoryDagId() {
				return this.historyDagId;
			}

			public void setHistoryDagId(Long historyDagId) {
				this.historyDagId = historyDagId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getLastRunningContext() {
				return this.lastRunningContext;
			}

			public void setLastRunningContext(String lastRunningContext) {
				this.lastRunningContext = lastRunningContext;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public Long getTaskType() {
				return this.taskType;
			}

			public void setTaskType(Long taskType) {
				this.taskType = taskType;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public Long getTriggerType() {
				return this.triggerType;
			}

			public void setTriggerType(Long triggerType) {
				this.triggerType = triggerType;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public GetPagedInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetPagedInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
