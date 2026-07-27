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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateWorkFlowByJsonRequest extends RpcAcsRequest<CreateWorkFlowByJsonResponse> {
	   

	private Long opTenantId;

	@SerializedName("context")
	private Context context;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateWorkFlowByJsonRequest() {
		super("dataphin-public", "2023-06-30", "CreateWorkFlowByJson");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public Context getContext() {
		return this.context;
	}

	public void setContext(Context context) {
		this.context = context;	
		if (context != null) {
			putBodyParameter("Context" , new Gson().toJson(context));
		}	
	}

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class Context {

		@SerializedName("Env")
		private String env;

		@SerializedName("ProjectId")
		private Long projectId;

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
	}

	public static class CreateCommand {

		@SerializedName("TaskType")
		private Integer taskType;

		@SerializedName("ScheduleConfig")
		private String scheduleConfig;

		@SerializedName("Submit")
		private Boolean submit;

		@SerializedName("Description")
		private String description;

		@SerializedName("TaskName")
		private String taskName;

		@SerializedName("WorkFlowJson")
		private String workFlowJson;

		@SerializedName("Directory")
		private String directory;

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public String getScheduleConfig() {
			return this.scheduleConfig;
		}

		public void setScheduleConfig(String scheduleConfig) {
			this.scheduleConfig = scheduleConfig;
		}

		public Boolean getSubmit() {
			return this.submit;
		}

		public void setSubmit(Boolean submit) {
			this.submit = submit;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getWorkFlowJson() {
			return this.workFlowJson;
		}

		public void setWorkFlowJson(String workFlowJson) {
			this.workFlowJson = workFlowJson;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}
	}

	@Override
	public Class<CreateWorkFlowByJsonResponse> getResponseClass() {
		return CreateWorkFlowByJsonResponse.class;
	}

}
