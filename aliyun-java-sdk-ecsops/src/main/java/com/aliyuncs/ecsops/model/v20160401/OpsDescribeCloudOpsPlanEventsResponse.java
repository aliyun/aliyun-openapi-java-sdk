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

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private String bizMessage;

	private Integer page;

	private Integer count;

	private String bizCode;

	private List<PlanEventInfo> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<PlanEventInfo> getData() {
		return this.data;
	}

	public void setData(List<PlanEventInfo> data) {
		this.data = data;
	}

	public static class PlanEventInfo {

		private String status;

		private String eventTime;

		private String extendData;

		private String impact;

		private String remark;

		private String maintenanceId;

		private String gmtModified;

		private String opsCode;

		private String eventId;

		private String bizEventId;

		private String actionCode;

		private String resourceType;

		private String eventType;

		private Integer version;

		private String gmtCreate;

		private String scheduleId;

		private String opsTime;

		private String resourceId;

		private String eventSource;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(String eventTime) {
			this.eventTime = eventTime;
		}

		public String getExtendData() {
			return this.extendData;
		}

		public void setExtendData(String extendData) {
			this.extendData = extendData;
		}

		public String getImpact() {
			return this.impact;
		}

		public void setImpact(String impact) {
			this.impact = impact;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getMaintenanceId() {
			return this.maintenanceId;
		}

		public void setMaintenanceId(String maintenanceId) {
			this.maintenanceId = maintenanceId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getOpsCode() {
			return this.opsCode;
		}

		public void setOpsCode(String opsCode) {
			this.opsCode = opsCode;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getBizEventId() {
			return this.bizEventId;
		}

		public void setBizEventId(String bizEventId) {
			this.bizEventId = bizEventId;
		}

		public String getActionCode() {
			return this.actionCode;
		}

		public void setActionCode(String actionCode) {
			this.actionCode = actionCode;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getScheduleId() {
			return this.scheduleId;
		}

		public void setScheduleId(String scheduleId) {
			this.scheduleId = scheduleId;
		}

		public String getOpsTime() {
			return this.opsTime;
		}

		public void setOpsTime(String opsTime) {
			this.opsTime = opsTime;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getEventSource() {
			return this.eventSource;
		}

		public void setEventSource(String eventSource) {
			this.eventSource = eventSource;
		}
	}

	@Override
	public OpsDescribeCloudOpsPlanEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsPlanEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
