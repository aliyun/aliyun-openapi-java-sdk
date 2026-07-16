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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScheduledTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScheduledTasksResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ScheduledTask> scheduledTasks;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ScheduledTask> getScheduledTasks() {
		return this.scheduledTasks;
	}

	public void setScheduledTasks(List<ScheduledTask> scheduledTasks) {
		this.scheduledTasks = scheduledTasks;
	}

	public static class ScheduledTask {

		private String description;

		private String launchTime;

		private String scheduledTaskId;

		private String scalingGroupId;

		private String recurrenceType;

		private String scheduledTaskName;

		private Integer desiredCapacity;

		private Integer maxValue;

		private Integer launchExpirationTime;

		private Integer minValue;

		private String scheduledAction;

		private String recurrenceValue;

		private String recurrenceEndTime;

		private Boolean taskEnabled;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLaunchTime() {
			return this.launchTime;
		}

		public void setLaunchTime(String launchTime) {
			this.launchTime = launchTime;
		}

		public String getScheduledTaskId() {
			return this.scheduledTaskId;
		}

		public void setScheduledTaskId(String scheduledTaskId) {
			this.scheduledTaskId = scheduledTaskId;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getRecurrenceType() {
			return this.recurrenceType;
		}

		public void setRecurrenceType(String recurrenceType) {
			this.recurrenceType = recurrenceType;
		}

		public String getScheduledTaskName() {
			return this.scheduledTaskName;
		}

		public void setScheduledTaskName(String scheduledTaskName) {
			this.scheduledTaskName = scheduledTaskName;
		}

		public Integer getDesiredCapacity() {
			return this.desiredCapacity;
		}

		public void setDesiredCapacity(Integer desiredCapacity) {
			this.desiredCapacity = desiredCapacity;
		}

		public Integer getMaxValue() {
			return this.maxValue;
		}

		public void setMaxValue(Integer maxValue) {
			this.maxValue = maxValue;
		}

		public Integer getLaunchExpirationTime() {
			return this.launchExpirationTime;
		}

		public void setLaunchExpirationTime(Integer launchExpirationTime) {
			this.launchExpirationTime = launchExpirationTime;
		}

		public Integer getMinValue() {
			return this.minValue;
		}

		public void setMinValue(Integer minValue) {
			this.minValue = minValue;
		}

		public String getScheduledAction() {
			return this.scheduledAction;
		}

		public void setScheduledAction(String scheduledAction) {
			this.scheduledAction = scheduledAction;
		}

		public String getRecurrenceValue() {
			return this.recurrenceValue;
		}

		public void setRecurrenceValue(String recurrenceValue) {
			this.recurrenceValue = recurrenceValue;
		}

		public String getRecurrenceEndTime() {
			return this.recurrenceEndTime;
		}

		public void setRecurrenceEndTime(String recurrenceEndTime) {
			this.recurrenceEndTime = recurrenceEndTime;
		}

		public Boolean getTaskEnabled() {
			return this.taskEnabled;
		}

		public void setTaskEnabled(Boolean taskEnabled) {
			this.taskEnabled = taskEnabled;
		}
	}

	@Override
	public DescribeScheduledTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeScheduledTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
