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

package com.aliyuncs.ahas_openapi.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.GetExperimentTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExperimentTaskResponse extends AcsResponse {

	private String taskId;

	private String requestId;

	private String experimentName;

	private String state;

	private String experimentId;

	private Integer httpStatusCode;

	private Long startTime;

	private Boolean success;

	private String result;

	private String namespace;

	private List<ActivitiesItem> activities;

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExperimentName() {
		return this.experimentName;
	}

	public void setExperimentName(String experimentName) {
		this.experimentName = experimentName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public List<ActivitiesItem> getActivities() {
		return this.activities;
	}

	public void setActivities(List<ActivitiesItem> activities) {
		this.activities = activities;
	}

	public static class ActivitiesItem {

		private Long endTime;

		private Long startTime;

		private String checkState;

		private String runResult;

		private String state;

		private String activityId;

		private String phase;

		private String activityName;

		private String experimentTaskId;

		private String taskId;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getCheckState() {
			return this.checkState;
		}

		public void setCheckState(String checkState) {
			this.checkState = checkState;
		}

		public String getRunResult() {
			return this.runResult;
		}

		public void setRunResult(String runResult) {
			this.runResult = runResult;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getActivityId() {
			return this.activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}

		public String getPhase() {
			return this.phase;
		}

		public void setPhase(String phase) {
			this.phase = phase;
		}

		public String getActivityName() {
			return this.activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}

		public String getExperimentTaskId() {
			return this.experimentTaskId;
		}

		public void setExperimentTaskId(String experimentTaskId) {
			this.experimentTaskId = experimentTaskId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public GetExperimentTaskResponse getInstance(UnmarshallerContext context) {
		return	GetExperimentTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
