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
import com.aliyuncs.devops_rdc.transform.v20200303.ListDevopsProjectTaskFlowStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevopsProjectTaskFlowStatusResponse extends AcsResponse {

	private Boolean successful;

	private String errorCode;

	private String errorMsg;

	private String requestId;

	private List<TaskflowStatus> object;

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

	public List<TaskflowStatus> getObject() {
		return this.object;
	}

	public void setObject(List<TaskflowStatus> object) {
		this.object = object;
	}

	public static class TaskflowStatus {

		private Boolean isDeleted;

		private String rejectStatusIds;

		private Integer pos;

		private String kind;

		private String created;

		private String taskflowId;

		private String name;

		private String creatorId;

		private String id;

		private String updated;

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getRejectStatusIds() {
			return this.rejectStatusIds;
		}

		public void setRejectStatusIds(String rejectStatusIds) {
			this.rejectStatusIds = rejectStatusIds;
		}

		public Integer getPos() {
			return this.pos;
		}

		public void setPos(Integer pos) {
			this.pos = pos;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getTaskflowId() {
			return this.taskflowId;
		}

		public void setTaskflowId(String taskflowId) {
			this.taskflowId = taskflowId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}
	}

	@Override
	public ListDevopsProjectTaskFlowStatusResponse getInstance(UnmarshallerContext context) {
		return	ListDevopsProjectTaskFlowStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
