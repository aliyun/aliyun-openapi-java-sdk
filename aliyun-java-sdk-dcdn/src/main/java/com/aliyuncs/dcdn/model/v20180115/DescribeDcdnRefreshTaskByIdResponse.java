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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnRefreshTaskByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnRefreshTaskByIdResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<CDNTask> tasks;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CDNTask> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<CDNTask> tasks) {
		this.tasks = tasks;
	}

	public static class CDNTask {

		private String status;

		private String creationTime;

		private String objectType;

		private String process;

		private String description;

		private String objectPath;

		private String taskId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getObjectPath() {
			return this.objectPath;
		}

		public void setObjectPath(String objectPath) {
			this.objectPath = objectPath;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public DescribeDcdnRefreshTaskByIdResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnRefreshTaskByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
