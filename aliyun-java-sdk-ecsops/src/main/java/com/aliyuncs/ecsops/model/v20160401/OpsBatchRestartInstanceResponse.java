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
import com.aliyuncs.ecsops.transform.v20160401.OpsBatchRestartInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsBatchRestartInstanceResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean hasFailed;

		private String taskId;

		private List<OperateResponseModel> operateResponseModels;

		public Boolean getHasFailed() {
			return this.hasFailed;
		}

		public void setHasFailed(Boolean hasFailed) {
			this.hasFailed = hasFailed;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public List<OperateResponseModel> getOperateResponseModels() {
			return this.operateResponseModels;
		}

		public void setOperateResponseModels(List<OperateResponseModel> operateResponseModels) {
			this.operateResponseModels = operateResponseModels;
		}

		public static class OperateResponseModel {

			private String currentStatus;

			private Long ecsId;

			private String previousStatus;

			private String code;

			private String message;

			private String instanceId;

			private String ecsAction;

			public String getCurrentStatus() {
				return this.currentStatus;
			}

			public void setCurrentStatus(String currentStatus) {
				this.currentStatus = currentStatus;
			}

			public Long getEcsId() {
				return this.ecsId;
			}

			public void setEcsId(Long ecsId) {
				this.ecsId = ecsId;
			}

			public String getPreviousStatus() {
				return this.previousStatus;
			}

			public void setPreviousStatus(String previousStatus) {
				this.previousStatus = previousStatus;
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

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getEcsAction() {
				return this.ecsAction;
			}

			public void setEcsAction(String ecsAction) {
				this.ecsAction = ecsAction;
			}
		}
	}

	@Override
	public OpsBatchRestartInstanceResponse getInstance(UnmarshallerContext context) {
		return	OpsBatchRestartInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
