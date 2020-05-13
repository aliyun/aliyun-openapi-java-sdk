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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.GetDeviceAppUpdateFunnelEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceAppUpdateFunnelEventsResponse extends AcsResponse {

	private String requestId;

	private List<EventListItem> eventList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventListItem> getEventList() {
		return this.eventList;
	}

	public void setEventList(List<EventListItem> eventList) {
		this.eventList = eventList;
	}

	public static class EventListItem {

		private String tenantId;

		private String deviceId;

		private String targetVersionCode;

		private String event;

		private String reportTime;

		private String packageName;

		private Long reportTimestamp;

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getTargetVersionCode() {
			return this.targetVersionCode;
		}

		public void setTargetVersionCode(String targetVersionCode) {
			this.targetVersionCode = targetVersionCode;
		}

		public String getEvent() {
			return this.event;
		}

		public void setEvent(String event) {
			this.event = event;
		}

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public Long getReportTimestamp() {
			return this.reportTimestamp;
		}

		public void setReportTimestamp(Long reportTimestamp) {
			this.reportTimestamp = reportTimestamp;
		}
	}

	@Override
	public GetDeviceAppUpdateFunnelEventsResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceAppUpdateFunnelEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
