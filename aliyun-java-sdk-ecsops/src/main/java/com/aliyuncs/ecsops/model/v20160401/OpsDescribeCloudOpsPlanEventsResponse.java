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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCloudOpsPlanEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCloudOpsPlanEventsResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private String bizMessage;

	private Integer count;

	private Integer page;

	private Integer pageSize;

	private Integer totalCount;

	private List<PlanEventInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
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

	public List<PlanEventInfo> getData() {
		return this.data;
	}

	public void setData(List<PlanEventInfo> data) {
		this.data = data;
	}

	public static class PlanEventInfo {

		private String bizEventId;

		private String eventId;

		private String eventSource;

		private String eventTime;

		private String eventType;

		private String extendData;

		private String gmtCreate;

		private String gmtModified;

		private String impact;

		private String maintenanceId;

		private String opsCode;

		private String remark;

		private String resourceId;

		private String resourceType;

		private String scheduleId;

		private String status;

		private Integer version;

		private String opsTime;

		private String actionCode;

		public String getBizEventId() {
			return this.bizEventId;
		}

		public void setBizEventId(String bizEventId) {
			this.bizEventId = bizEventId;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getEventSource() {
			return this.eventSource;
		}

		public void setEventSource(String eventSource) {
			this.eventSource = eventSource;
		}

		public String getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(String eventTime) {
			this.eventTime = eventTime;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getExtendData() {
			return this.extendData;
		}

		public void setExtendData(String extendData) {
			this.extendData = extendData;
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

		public String getImpact() {
			return this.impact;
		}

		public void setImpact(String impact) {
			this.impact = impact;
		}

		public String getMaintenanceId() {
			return this.maintenanceId;
		}

		public void setMaintenanceId(String maintenanceId) {
			this.maintenanceId = maintenanceId;
		}

		public String getOpsCode() {
			return this.opsCode;
		}

		public void setOpsCode(String opsCode) {
			this.opsCode = opsCode;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getScheduleId() {
			return this.scheduleId;
		}

		public void setScheduleId(String scheduleId) {
			this.scheduleId = scheduleId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getOpsTime() {
			return this.opsTime;
		}

		public void setOpsTime(String opsTime) {
			this.opsTime = opsTime;
		}

		public String getActionCode() {
			return this.actionCode;
		}

		public void setActionCode(String actionCode) {
			this.actionCode = actionCode;
		}
	}

	@Override
	public OpsDescribeCloudOpsPlanEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsPlanEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
