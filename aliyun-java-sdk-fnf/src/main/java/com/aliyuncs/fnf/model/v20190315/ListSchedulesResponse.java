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

package com.aliyuncs.fnf.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.fnf.transform.v20190315.ListSchedulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSchedulesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<SchedulesItem> schedules;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SchedulesItem> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(List<SchedulesItem> schedules) {
		this.schedules = schedules;
	}

	public static class SchedulesItem {

		private String description;

		private String scheduleId;

		private String payload;

		private String scheduleName;

		private String createdTime;

		private String lastModifiedTime;

		private String cronExpression;

		private Boolean enable;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getScheduleId() {
			return this.scheduleId;
		}

		public void setScheduleId(String scheduleId) {
			this.scheduleId = scheduleId;
		}

		public String getPayload() {
			return this.payload;
		}

		public void setPayload(String payload) {
			this.payload = payload;
		}

		public String getScheduleName() {
			return this.scheduleName;
		}

		public void setScheduleName(String scheduleName) {
			this.scheduleName = scheduleName;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}
	}

	@Override
	public ListSchedulesResponse getInstance(UnmarshallerContext context) {
		return	ListSchedulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
