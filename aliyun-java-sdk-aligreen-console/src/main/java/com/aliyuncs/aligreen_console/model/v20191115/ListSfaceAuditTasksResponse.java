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

package com.aliyuncs.aligreen_console.model.v20191115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aligreen_console.transform.v20191115.ListSfaceAuditTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSfaceAuditTasksResponse extends AcsResponse {

	private String requestId;

	private List<AuditTask> tasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AuditTask> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<AuditTask> tasks) {
		this.tasks = tasks;
	}

	public static class AuditTask {

		private String dataId;

		private String status;

		private String reason;

		private String action;

		private String personId;

		private String faceId;

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}
	}

	@Override
	public ListSfaceAuditTasksResponse getInstance(UnmarshallerContext context) {
		return	ListSfaceAuditTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
