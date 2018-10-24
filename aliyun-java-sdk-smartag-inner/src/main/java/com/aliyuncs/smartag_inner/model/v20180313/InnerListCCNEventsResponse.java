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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListCCNEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListCCNEventsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Event> events;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

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

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public static class Event {

		private Long id;

		private String regionNo;

		private String instanceId;

		private String namespace;

		private String sourceInstanceId;

		private String sourceNamespace;

		private String schedulerIp;

		private String handlerIp;

		private String state;

		private String scheduleState;

		private String message;

		private String data;

		private String dataSchemaNamespace;

		private String gmtCreate;

		private String gmtModify;

		private String gmtScheduled;

		private String timeoutRetryPolicy;

		private String delayPolicy;

		private String context;

		private String priority;

		private Long handledTimes;

		private Long maxHandleTimes;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getSourceInstanceId() {
			return this.sourceInstanceId;
		}

		public void setSourceInstanceId(String sourceInstanceId) {
			this.sourceInstanceId = sourceInstanceId;
		}

		public String getSourceNamespace() {
			return this.sourceNamespace;
		}

		public void setSourceNamespace(String sourceNamespace) {
			this.sourceNamespace = sourceNamespace;
		}

		public String getSchedulerIp() {
			return this.schedulerIp;
		}

		public void setSchedulerIp(String schedulerIp) {
			this.schedulerIp = schedulerIp;
		}

		public String getHandlerIp() {
			return this.handlerIp;
		}

		public void setHandlerIp(String handlerIp) {
			this.handlerIp = handlerIp;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getScheduleState() {
			return this.scheduleState;
		}

		public void setScheduleState(String scheduleState) {
			this.scheduleState = scheduleState;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getDataSchemaNamespace() {
			return this.dataSchemaNamespace;
		}

		public void setDataSchemaNamespace(String dataSchemaNamespace) {
			this.dataSchemaNamespace = dataSchemaNamespace;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getGmtScheduled() {
			return this.gmtScheduled;
		}

		public void setGmtScheduled(String gmtScheduled) {
			this.gmtScheduled = gmtScheduled;
		}

		public String getTimeoutRetryPolicy() {
			return this.timeoutRetryPolicy;
		}

		public void setTimeoutRetryPolicy(String timeoutRetryPolicy) {
			this.timeoutRetryPolicy = timeoutRetryPolicy;
		}

		public String getDelayPolicy() {
			return this.delayPolicy;
		}

		public void setDelayPolicy(String delayPolicy) {
			this.delayPolicy = delayPolicy;
		}

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Long getHandledTimes() {
			return this.handledTimes;
		}

		public void setHandledTimes(Long handledTimes) {
			this.handledTimes = handledTimes;
		}

		public Long getMaxHandleTimes() {
			return this.maxHandleTimes;
		}

		public void setMaxHandleTimes(Long maxHandleTimes) {
			this.maxHandleTimes = maxHandleTimes;
		}
	}

	@Override
	public InnerListCCNEventsResponse getInstance(UnmarshallerContext context) {
		return	InnerListCCNEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
