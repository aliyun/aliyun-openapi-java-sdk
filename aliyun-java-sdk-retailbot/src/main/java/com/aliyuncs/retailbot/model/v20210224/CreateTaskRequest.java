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
public class CreateTaskRequest extends RpcAcsRequest<CreateTaskResponse> {
	   

	@SerializedName("digTaskInfoParam")
	private DigTaskInfoParam digTaskInfoParam;
	public CreateTaskRequest() {
		super("RetailBot", "2021-02-24", "CreateTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public DigTaskInfoParam getDigTaskInfoParam() {
		return this.digTaskInfoParam;
	}

	public void setDigTaskInfoParam(DigTaskInfoParam digTaskInfoParam) {
		this.digTaskInfoParam = digTaskInfoParam;	
		if (digTaskInfoParam != null) {
			putBodyParameter("DigTaskInfoParam" , new Gson().toJson(digTaskInfoParam));
		}	
	}

	public static class DigTaskInfoParam {

		@SerializedName("ParamConfig")
		private String paramConfig;

		@SerializedName("Type")
		private String type;

		@SerializedName("OperatorId")
		private String operatorId;

		@SerializedName("RobotCode")
		private String robotCode;

		@SerializedName("OperatorName")
		private String operatorName;

		public String getParamConfig() {
			return this.paramConfig;
		}

		public void setParamConfig(String paramConfig) {
			this.paramConfig = paramConfig;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
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
	public Class<CreateTaskResponse> getResponseClass() {
		return CreateTaskResponse.class;
	}

}
