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
import com.aliyuncs.emr.transform.v20160408.ListJobInstanceWorkersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobInstanceWorkersResponse extends AcsResponse {

	private String requestId;

	private List<JobInstanceWorkerInfo> jobInstanceWorkers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<JobInstanceWorkerInfo> getJobInstanceWorkers() {
		return this.jobInstanceWorkers;
	}

	public void setJobInstanceWorkers(List<JobInstanceWorkerInfo> jobInstanceWorkers) {
		this.jobInstanceWorkers = jobInstanceWorkers;
	}

	public static class JobInstanceWorkerInfo {

		private String applicationId;

		private String instanceInfo;

		private String containerInfo;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getInstanceInfo() {
			return this.instanceInfo;
		}

		public void setInstanceInfo(String instanceInfo) {
			this.instanceInfo = instanceInfo;
		}

		public String getContainerInfo() {
			return this.containerInfo;
		}

		public void setContainerInfo(String containerInfo) {
			this.containerInfo = containerInfo;
		}
	}

	@Override
	public ListJobInstanceWorkersResponse getInstance(UnmarshallerContext context) {
		return	ListJobInstanceWorkersResponseUnmarshaller.unmarshall(this, context);
	}
}
