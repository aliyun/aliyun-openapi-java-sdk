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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryAlarmHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAlarmHistoryResponse extends AcsResponse {

	private String requestId;

	private String total;

	private String cursor;

	private List<EmrAlarmHistory> alarmHistoryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public List<EmrAlarmHistory> getAlarmHistoryList() {
		return this.alarmHistoryList;
	}

	public void setAlarmHistoryList(List<EmrAlarmHistory> alarmHistoryList) {
		this.alarmHistoryList = alarmHistoryList;
	}

	public static class EmrAlarmHistory {

		private String clusterId;

		private String role;

		private String instanceId;

		private String name;

		private String metricName;

		private Long alarmTime;

		private Long lastTime;

		private String state;

		private Integer status;

		private String contactGroups;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Long getAlarmTime() {
			return this.alarmTime;
		}

		public void setAlarmTime(Long alarmTime) {
			this.alarmTime = alarmTime;
		}

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(String contactGroups) {
			this.contactGroups = contactGroups;
		}
	}

	@Override
	public QueryAlarmHistoryResponse getInstance(UnmarshallerContext context) {
		return	QueryAlarmHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
