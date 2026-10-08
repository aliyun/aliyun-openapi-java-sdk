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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopPipelineIntegratedTaskRequest extends RpcAcsRequest<StopPipelineIntegratedTaskResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("stopCommand")
	private StopCommand stopCommand;

	@SerializedName("context")
	private Context context;
	public StopPipelineIntegratedTaskRequest() {
		super("dataphin-public", "2023-06-30", "StopPipelineIntegratedTask", "1111");
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

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public StopCommand getStopCommand() {
		return this.stopCommand;
	}

	public void setStopCommand(StopCommand stopCommand) {
		this.stopCommand = stopCommand;	
		if (stopCommand != null) {
			putBodyParameter("StopCommand" , new Gson().toJson(stopCommand));
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

	public static class StopCommand {

		@SerializedName("TaskIds")
		private List<String> taskIds;

		public List<String> getTaskIds() {
			return this.taskIds;
		}

		public void setTaskIds(List<String> taskIds) {
			this.taskIds = taskIds;
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

	@Override
	public Class<StopPipelineIntegratedTaskResponse> getResponseClass() {
		return StopPipelineIntegratedTaskResponse.class;
	}

}
