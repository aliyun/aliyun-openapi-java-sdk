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
public class CreateStreamBatchJobMappingRequest extends RpcAcsRequest<CreateStreamBatchJobMappingResponse> {
	   

	private Long opTenantId;

	@SerializedName("streamBatchJobMappingCreateCommand")
	private StreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand;
	public CreateStreamBatchJobMappingRequest() {
		super("dataphin-public", "2023-06-30", "CreateStreamBatchJobMapping");
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

	public StreamBatchJobMappingCreateCommand getStreamBatchJobMappingCreateCommand() {
		return this.streamBatchJobMappingCreateCommand;
	}

	public void setStreamBatchJobMappingCreateCommand(StreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand) {
		this.streamBatchJobMappingCreateCommand = streamBatchJobMappingCreateCommand;	
		if (streamBatchJobMappingCreateCommand != null) {
			putBodyParameter("StreamBatchJobMappingCreateCommand" , new Gson().toJson(streamBatchJobMappingCreateCommand));
		}	
	}

	public static class StreamBatchJobMappingCreateCommand {

		@SerializedName("QueueName")
		private String queueName;

		@SerializedName("FileType")
		private String fileType;

		@SerializedName("FileName")
		private String fileName;

		@SerializedName("VvpClusterType")
		private String vvpClusterType;

		@SerializedName("Description")
		private String description;

		@SerializedName("EngineVersion")
		private String engineVersion;

		@SerializedName("ClusterId")
		private String clusterId;

		@SerializedName("Env")
		private String env;

		@SerializedName("Directory")
		private String directory;

		@SerializedName("ProjectId")
		private Long projectId;

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getVvpClusterType() {
			return this.vvpClusterType;
		}

		public void setVvpClusterType(String vvpClusterType) {
			this.vvpClusterType = vvpClusterType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
	}

	@Override
	public Class<CreateStreamBatchJobMappingResponse> getResponseClass() {
		return CreateStreamBatchJobMappingResponse.class;
	}

}
