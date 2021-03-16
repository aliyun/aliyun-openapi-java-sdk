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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsUpdateDelayExecuteEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateDelayExecuteEventsResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private String bizMessage;

	private DelayExecuteEvent delayExecuteEvent;

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

	public DelayExecuteEvent getDelayExecuteEvent() {
		return this.delayExecuteEvent;
	}

	public void setDelayExecuteEvent(DelayExecuteEvent delayExecuteEvent) {
		this.delayExecuteEvent = delayExecuteEvent;
	}

	public static class DelayExecuteEvent {

		private Long id;

		private Long maintenanceId;

		private String vmName;

		private String eventType;

		private String eventStatus;

		private String publishTime;

		private String planTime;

		private String eventStartTime;

		private String eventFinishTime;

		private Integer effective;

		private String gmtCreate;

		private String gmtModified;

		private String extendData;

		private Integer delayTimes;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getMaintenanceId() {
			return this.maintenanceId;
		}

		public void setMaintenanceId(Long maintenanceId) {
			this.maintenanceId = maintenanceId;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getPlanTime() {
			return this.planTime;
		}

		public void setPlanTime(String planTime) {
			this.planTime = planTime;
		}

		public String getEventStartTime() {
			return this.eventStartTime;
		}

		public void setEventStartTime(String eventStartTime) {
			this.eventStartTime = eventStartTime;
		}

		public String getEventFinishTime() {
			return this.eventFinishTime;
		}

		public void setEventFinishTime(String eventFinishTime) {
			this.eventFinishTime = eventFinishTime;
		}

		public Integer getEffective() {
			return this.effective;
		}

		public void setEffective(Integer effective) {
			this.effective = effective;
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

		public String getExtendData() {
			return this.extendData;
		}

		public void setExtendData(String extendData) {
			this.extendData = extendData;
		}

		public Integer getDelayTimes() {
			return this.delayTimes;
		}

		public void setDelayTimes(Integer delayTimes) {
			this.delayTimes = delayTimes;
		}
	}

	@Override
	public OpsUpdateDelayExecuteEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsUpdateDelayExecuteEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
