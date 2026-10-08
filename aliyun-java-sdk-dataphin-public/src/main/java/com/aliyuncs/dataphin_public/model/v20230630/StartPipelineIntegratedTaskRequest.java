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
public class StartPipelineIntegratedTaskRequest extends RpcAcsRequest<StartPipelineIntegratedTaskResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("startCommand")
	private StartCommand startCommand;

	@SerializedName("context")
	private Context context;
	public StartPipelineIntegratedTaskRequest() {
		super("dataphin-public", "2023-06-30", "StartPipelineIntegratedTask", "1111");
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

	public StartCommand getStartCommand() {
		return this.startCommand;
	}

	public void setStartCommand(StartCommand startCommand) {
		this.startCommand = startCommand;	
		if (startCommand != null) {
			putBodyParameter("StartCommand" , new Gson().toJson(startCommand));
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

	public static class StartCommand {

		@SerializedName("Checkpoint")
		private String checkpoint;

		@SerializedName("Memory")
		private Integer memory;

		@SerializedName("IncrementalTaskId")
		private String incrementalTaskId;

		@SerializedName("FullTaskMode")
		private String fullTaskMode;

		@SerializedName("Concurrent")
		private Integer concurrent;

		@SerializedName("ByteSpeed")
		private Integer byteSpeed;

		@SerializedName("SyncMode")
		private String syncMode;

		@SerializedName("QuotaGroupId")
		private String quotaGroupId;

		@SerializedName("NodeId")
		private String nodeId;

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getIncrementalTaskId() {
			return this.incrementalTaskId;
		}

		public void setIncrementalTaskId(String incrementalTaskId) {
			this.incrementalTaskId = incrementalTaskId;
		}

		public String getFullTaskMode() {
			return this.fullTaskMode;
		}

		public void setFullTaskMode(String fullTaskMode) {
			this.fullTaskMode = fullTaskMode;
		}

		public Integer getConcurrent() {
			return this.concurrent;
		}

		public void setConcurrent(Integer concurrent) {
			this.concurrent = concurrent;
		}

		public Integer getByteSpeed() {
			return this.byteSpeed;
		}

		public void setByteSpeed(Integer byteSpeed) {
			this.byteSpeed = byteSpeed;
		}

		public String getSyncMode() {
			return this.syncMode;
		}

		public void setSyncMode(String syncMode) {
			this.syncMode = syncMode;
		}

		public String getQuotaGroupId() {
			return this.quotaGroupId;
		}

		public void setQuotaGroupId(String quotaGroupId) {
			this.quotaGroupId = quotaGroupId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
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
	public Class<StartPipelineIntegratedTaskResponse> getResponseClass() {
		return StartPipelineIntegratedTaskResponse.class;
	}

}
