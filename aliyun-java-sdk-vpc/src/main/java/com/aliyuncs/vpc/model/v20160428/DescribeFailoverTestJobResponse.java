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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeFailoverTestJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFailoverTestJobResponse extends AcsResponse {

	private String requestId;

	private FailoverTestJobModel failoverTestJobModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FailoverTestJobModel getFailoverTestJobModel() {
		return this.failoverTestJobModel;
	}

	public void setFailoverTestJobModel(FailoverTestJobModel failoverTestJobModel) {
		this.failoverTestJobModel = failoverTestJobModel;
	}

	public static class FailoverTestJobModel {

		private String jobId;

		private String name;

		private String description;

		private String resourceType;

		private String jobType;

		private String jobDuration;

		private String startTime;

		private String stopTime;

		private String status;

		private List<String> resourceId;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getJobDuration() {
			return this.jobDuration;
		}

		public void setJobDuration(String jobDuration) {
			this.jobDuration = jobDuration;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(String stopTime) {
			this.stopTime = stopTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<String> getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(List<String> resourceId) {
			this.resourceId = resourceId;
		}
	}

	@Override
	public DescribeFailoverTestJobResponse getInstance(UnmarshallerContext context) {
		return	DescribeFailoverTestJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
