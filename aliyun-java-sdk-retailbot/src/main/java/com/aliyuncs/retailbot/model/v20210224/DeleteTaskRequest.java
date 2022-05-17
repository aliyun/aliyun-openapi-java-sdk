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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTaskRequest extends RpcAcsRequest<DeleteTaskResponse> {
	   

	@SerializedName("digDeleteParam")
	private DigDeleteParam digDeleteParam;
	public DeleteTaskRequest() {
		super("RetailBot", "2021-02-24", "DeleteTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public DigDeleteParam getDigDeleteParam() {
		return this.digDeleteParam;
	}

	public void setDigDeleteParam(DigDeleteParam digDeleteParam) {
		this.digDeleteParam = digDeleteParam;	
		if (digDeleteParam != null) {
			putBodyParameter("DigDeleteParam" , new Gson().toJson(digDeleteParam));
		}	
	}

	public static class DigDeleteParam {

		@SerializedName("DelMessage")
		private String delMessage;

		@SerializedName("OperatorId")
		private String operatorId;

		@SerializedName("TaskId")
		private Long taskId;

		@SerializedName("RobotCode")
		private String robotCode;

		@SerializedName("OperatorName")
		private String operatorName;

		public String getDelMessage() {
			return this.delMessage;
		}

		public void setDelMessage(String delMessage) {
			this.delMessage = delMessage;
		}

		public String getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getRobotCode() {
			return this.robotCode;
		}

		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
	}

	@Override
	public Class<DeleteTaskResponse> getResponseClass() {
		return DeleteTaskResponse.class;
	}

}
