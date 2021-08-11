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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.ListDevopsProjectTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevopsProjectTasksResponse extends AcsResponse {

	private String errorMsg;

	private String requestId;

	private Boolean successful;

	private String errorCode;

	private List<Task> object;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<Task> getObject() {
		return this.object;
	}

	public void setObject(List<Task> object) {
		this.object = object;
	}

	public static class Task {

		private String taskgroupId;

		private String tasklistId;

		private String projectId;

		private String modifierId;

		private String updated;

		private String creatorId;

		private String created;

		private String name;

		private String id;

		public String getTaskgroupId() {
			return this.taskgroupId;
		}

		public void setTaskgroupId(String taskgroupId) {
			this.taskgroupId = taskgroupId;
		}

		public String getTasklistId() {
			return this.tasklistId;
		}

		public void setTasklistId(String tasklistId) {
			this.tasklistId = tasklistId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getModifierId() {
			return this.modifierId;
		}

		public void setModifierId(String modifierId) {
			this.modifierId = modifierId;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public ListDevopsProjectTasksResponse getInstance(UnmarshallerContext context) {
		return	ListDevopsProjectTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
