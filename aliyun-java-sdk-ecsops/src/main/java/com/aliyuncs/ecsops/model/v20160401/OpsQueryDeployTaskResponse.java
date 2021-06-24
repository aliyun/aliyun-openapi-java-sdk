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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryDeployTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDeployTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private QueryDeployTaskResult queryDeployTaskResult;

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

	public QueryDeployTaskResult getQueryDeployTaskResult() {
		return this.queryDeployTaskResult;
	}

	public void setQueryDeployTaskResult(QueryDeployTaskResult queryDeployTaskResult) {
		this.queryDeployTaskResult = queryDeployTaskResult;
	}

	public static class QueryDeployTaskResult {

		private String taskStatus;

		private String taskMsg;

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskMsg() {
			return this.taskMsg;
		}

		public void setTaskMsg(String taskMsg) {
			this.taskMsg = taskMsg;
		}
	}

	@Override
	public OpsQueryDeployTaskResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryDeployTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
