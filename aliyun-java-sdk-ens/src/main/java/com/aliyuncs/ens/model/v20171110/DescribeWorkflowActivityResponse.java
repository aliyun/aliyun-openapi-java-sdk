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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeWorkflowActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkflowActivityResponse extends AcsResponse {

	private String requestId;

	private List<ActivityInfos> activityInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ActivityInfos> getActivityInfo() {
		return this.activityInfo;
	}

	public void setActivityInfo(List<ActivityInfos> activityInfo) {
		this.activityInfo = activityInfo;
	}

	public static class ActivityInfos {

		private String activityId;

		private String activityName;

		private String state;

		private String gmtStart;

		private String gmtEnd;

		private String duration;

		private String gmtCreate;

		private String method;

		private String input;

		private String output;

		private String error;

		private String workerNode;

		public String getActivityId() {
			return this.activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}

		public String getActivityName() {
			return this.activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getGmtStart() {
			return this.gmtStart;
		}

		public void setGmtStart(String gmtStart) {
			this.gmtStart = gmtStart;
		}

		public String getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(String gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
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
	public DescribeWorkflowActivityResponse getInstance(UnmarshallerContext context) {
		return	DescribeWorkflowActivityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
