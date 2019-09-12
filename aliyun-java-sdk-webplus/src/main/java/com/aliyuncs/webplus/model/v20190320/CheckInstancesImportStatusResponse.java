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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.CheckInstancesImportStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckInstancesImportStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<InstanceImportStatus> instancesImportStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<InstanceImportStatus> getInstancesImportStatus() {
		return this.instancesImportStatus;
	}

	public void setInstancesImportStatus(List<InstanceImportStatus> instancesImportStatus) {
		this.instancesImportStatus = instancesImportStatus;
	}

	public static class InstanceImportStatus {

		private String instanceId;

		private String importStatus;

		private String importMessage;

		private Long finishedTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImportStatus() {
			return this.importStatus;
		}

		public void setImportStatus(String importStatus) {
			this.importStatus = importStatus;
		}

		public String getImportMessage() {
			return this.importMessage;
		}

		public void setImportMessage(String importMessage) {
			this.importMessage = importMessage;
		}

		public Long getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(Long finishedTime) {
			this.finishedTime = finishedTime;
		}
	}

	@Override
	public CheckInstancesImportStatusResponse getInstance(UnmarshallerContext context) {
		return	CheckInstancesImportStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
