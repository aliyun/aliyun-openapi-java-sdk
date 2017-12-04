/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20170301.ListAlarmHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmHistoryResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String cursor;

	private String requestId;

	private List<AlarmHistory> alarmHistoryList;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AlarmHistory> getAlarmHistoryList() {
		return this.alarmHistoryList;
	}

	public void setAlarmHistoryList(List<AlarmHistory> alarmHistoryList) {
		this.alarmHistoryList = alarmHistoryList;
	}

	public static class AlarmHistory {

		private String id;

		private String name;

		private String namespace;

		private String metricName;

		private String dimension;

		private Integer evaluationCount;

		private String value;

		private Long alarmTime;

		private Long lastTime;

		private String state;

		private Integer status;

		private String contactGroups;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public Integer getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(Integer evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
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
	public ListAlarmHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListAlarmHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
