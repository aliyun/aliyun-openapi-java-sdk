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
public class CreatePipelineNodeRequest extends RpcAcsRequest<CreatePipelineNodeResponse> {
	   

	private Long opTenantId;

	@SerializedName("createPipelineNodeCommand")
	private CreatePipelineNodeCommand createPipelineNodeCommand;
	public CreatePipelineNodeRequest() {
		super("dataphin-public", "2023-06-30", "CreatePipelineNode");
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

	public CreatePipelineNodeCommand getCreatePipelineNodeCommand() {
		return this.createPipelineNodeCommand;
	}

	public void setCreatePipelineNodeCommand(CreatePipelineNodeCommand createPipelineNodeCommand) {
		this.createPipelineNodeCommand = createPipelineNodeCommand;	
		if (createPipelineNodeCommand != null) {
			putBodyParameter("CreatePipelineNodeCommand" , new Gson().toJson(createPipelineNodeCommand));
		}	
	}

	public static class CreatePipelineNodeCommand {

		@SerializedName("PipelineName")
		private String pipelineName;

		@SerializedName("PipelineType")
		private String pipelineType;

		@SerializedName("NodeType")
		private String nodeType;

		@SerializedName("FileInfo")
		private FileInfo fileInfo;

		@SerializedName("ProjectId")
		private Long projectId;

		public String getPipelineName() {
			return this.pipelineName;
		}

		public void setPipelineName(String pipelineName) {
			this.pipelineName = pipelineName;
		}

		public String getPipelineType() {
			return this.pipelineType;
		}

		public void setPipelineType(String pipelineType) {
			this.pipelineType = pipelineType;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public FileInfo getFileInfo() {
			return this.fileInfo;
		}

		public void setFileInfo(FileInfo fileInfo) {
			this.fileInfo = fileInfo;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public static class FileInfo {

			@SerializedName("FileName")
			private String fileName;

			@SerializedName("Description")
			private String description;

			@SerializedName("Directory")
			private String directory;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}
	}

	@Override
	public Class<CreatePipelineNodeResponse> getResponseClass() {
		return CreatePipelineNodeResponse.class;
	}

}
