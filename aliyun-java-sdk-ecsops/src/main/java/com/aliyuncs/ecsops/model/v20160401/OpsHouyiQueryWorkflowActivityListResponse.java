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
import com.aliyuncs.ecsops.transform.v20160401.OpsHouyiQueryWorkflowActivityListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsHouyiQueryWorkflowActivityListResponse extends AcsResponse {

	private Integer totalCount;

	private List<ActivityInstance> activityInstances;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ActivityInstance> getActivityInstances() {
		return this.activityInstances;
	}

	public void setActivityInstances(List<ActivityInstance> activityInstances) {
		this.activityInstances = activityInstances;
	}

	public static class ActivityInstance {

		private Long activityId;

		private String workflowId;

		private String activityName;

		private String method;

		private String state;

		private Long startTime;

		private Long endTime;

		private Long duration;

		private Long createTime;

		private String input;

		private String output;

		private String error;

		private String workerNode;

		public Long getActivityId() {
			return this.activityId;
		}

		public void setActivityId(Long activityId) {
			this.activityId = activityId;
		}

		public String getWorkflowId() {
			return this.workflowId;
		}

		public void setWorkflowId(String workflowId) {
			this.workflowId = workflowId;
		}

		public String getActivityName() {
			return this.activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getInput() {
			return this.input;
		}

		public void setInput(String input) {
			this.input = input;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public String getWorkerNode() {
			return this.workerNode;
		}

		public void setWorkerNode(String workerNode) {
			this.workerNode = workerNode;
		}
	}

	@Override
	public OpsHouyiQueryWorkflowActivityListResponse getInstance(UnmarshallerContext context) {
		return	OpsHouyiQueryWorkflowActivityListResponseUnmarshaller.unmarshall(this, context);
	}
}
