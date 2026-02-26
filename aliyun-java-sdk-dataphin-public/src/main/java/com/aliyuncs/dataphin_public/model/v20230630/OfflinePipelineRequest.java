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
public class OfflinePipelineRequest extends RpcAcsRequest<OfflinePipelineResponse> {
	   

	private Long opTenantId;

	@SerializedName("offlineCommand")
	private OfflineCommand offlineCommand;

	@SerializedName("context")
	private Context context;
	public OfflinePipelineRequest() {
		super("dataphin-public", "2023-06-30", "OfflinePipeline");
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

	public OfflineCommand getOfflineCommand() {
		return this.offlineCommand;
	}

	public void setOfflineCommand(OfflineCommand offlineCommand) {
		this.offlineCommand = offlineCommand;	
		if (offlineCommand != null) {
			putBodyParameter("OfflineCommand" , new Gson().toJson(offlineCommand));
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

	public static class OfflineCommand {

		@SerializedName("Comment")
		private String comment;

		@SerializedName("Delete")
		private Boolean delete;

		@SerializedName("NodeId")
		private String nodeId;

		@SerializedName("PipelineId")
		private Long pipelineId;

		@SerializedName("FileId")
		private Long fileId;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Boolean getDelete() {
			return this.delete;
		}

		public void setDelete(Boolean delete) {
			this.delete = delete;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Long getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(Long pipelineId) {
			this.pipelineId = pipelineId;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
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
	public Class<OfflinePipelineResponse> getResponseClass() {
		return OfflinePipelineResponse.class;
	}

}
