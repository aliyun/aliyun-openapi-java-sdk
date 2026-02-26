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

package com.aliyuncs.ehpcinstant.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteJobsRequest extends RpcAcsRequest<DeleteJobsResponse> {
	   

	@SerializedName("jobSpec")
	private List<JobSpec> jobSpec;

	@SerializedName("executorIds")
	private List<String> executorIds;
	public DeleteJobsRequest() {
		super("EhpcInstant", "2023-07-01", "DeleteJobs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<JobSpec> getJobSpec() {
		return this.jobSpec;
	}

	public void setJobSpec(List<JobSpec> jobSpec) {
		this.jobSpec = jobSpec;	
		if (jobSpec != null) {
			putQueryParameter("JobSpec" , new Gson().toJson(jobSpec));
		}	
	}

	public List<String> getExecutorIds() {
		return this.executorIds;
	}

	public void setExecutorIds(List<String> executorIds) {
		this.executorIds = executorIds;	
		if (executorIds != null) {
			putQueryParameter("ExecutorIds" , new Gson().toJson(executorIds));
		}	
	}

	public static class JobSpec {

		@SerializedName("JobId")
		private String jobId;

		@SerializedName("TaskSpec")
		private List<TaskSpecItem> taskSpec;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public List<TaskSpecItem> getTaskSpec() {
			return this.taskSpec;
		}

		public void setTaskSpec(List<TaskSpecItem> taskSpec) {
			this.taskSpec = taskSpec;
		}

		public static class TaskSpecItem {

			@SerializedName("TaskName")
			private String taskName;

			@SerializedName("ArrayIndex")
			private List<Integer> arrayIndex;

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public List<Integer> getArrayIndex() {
				return this.arrayIndex;
			}

			public void setArrayIndex(List<Integer> arrayIndex) {
				this.arrayIndex = arrayIndex;
			}
		}
	}

	@Override
	public Class<DeleteJobsResponse> getResponseClass() {
		return DeleteJobsResponse.class;
	}

}
