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
public class UpdatePipelineByAsyncRequest extends RpcAcsRequest<UpdatePipelineByAsyncResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;

	@SerializedName("context")
	private Context context;
	public UpdatePipelineByAsyncRequest() {
		super("dataphin-public", "2023-06-30", "UpdatePipelineByAsync");
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

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
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

	public static class UpdateCommand {

		@SerializedName("Mode")
		private String mode;

		@SerializedName("PipelineJson")
		private String pipelineJson;

		@SerializedName("Settings")
		private String settings;

		@SerializedName("PipelineType")
		private Integer pipelineType;

		@SerializedName("ScheduleConfig")
		private String scheduleConfig;

		@SerializedName("Submit")
		private Boolean submit;

		@SerializedName("PipelineConfig")
		private PipelineConfig pipelineConfig;

		@SerializedName("Comment")
		private String comment;

		@SerializedName("NodeInfo")
		private NodeInfo nodeInfo;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getPipelineJson() {
			return this.pipelineJson;
		}

		public void setPipelineJson(String pipelineJson) {
			this.pipelineJson = pipelineJson;
		}

		public String getSettings() {
			return this.settings;
		}

		public void setSettings(String settings) {
			this.settings = settings;
		}

		public Integer getPipelineType() {
			return this.pipelineType;
		}

		public void setPipelineType(Integer pipelineType) {
			this.pipelineType = pipelineType;
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

		public PipelineConfig getPipelineConfig() {
			return this.pipelineConfig;
		}

		public void setPipelineConfig(PipelineConfig pipelineConfig) {
			this.pipelineConfig = pipelineConfig;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public NodeInfo getNodeInfo() {
			return this.nodeInfo;
		}

		public void setNodeInfo(NodeInfo nodeInfo) {
			this.nodeInfo = nodeInfo;
		}

		public static class PipelineConfig {

			@SerializedName("Hops")
			private List<HopsItem> hops;

			@SerializedName("Steps")
			private List<StepsItem> steps;

			public List<HopsItem> getHops() {
				return this.hops;
			}

			public void setHops(List<HopsItem> hops) {
				this.hops = hops;
			}

			public List<StepsItem> getSteps() {
				return this.steps;
			}

			public void setSteps(List<StepsItem> steps) {
				this.steps = steps;
			}

			public static class HopsItem {

				@SerializedName("SendTo")
				private Boolean sendTo;

				@SerializedName("Source")
				private String source;

				@SerializedName("Target")
				private String target;

				public Boolean getSendTo() {
					return this.sendTo;
				}

				public void setSendTo(Boolean sendTo) {
					this.sendTo = sendTo;
				}

				public String getSource() {
					return this.source;
				}

				public void setSource(String source) {
					this.source = source;
				}

				public String getTarget() {
					return this.target;
				}

				public void setTarget(String target) {
					this.target = target;
				}
			}

			public static class StepsItem {

				@SerializedName("PluginConfig")
				private String pluginConfig;

				@SerializedName("StepType")
				private String stepType;

				@SerializedName("StepName")
				private String stepName;

				@SerializedName("IsDistribute")
				private Boolean isDistribute;

				@SerializedName("Key")
				private String key;

				public String getPluginConfig() {
					return this.pluginConfig;
				}

				public void setPluginConfig(String pluginConfig) {
					this.pluginConfig = pluginConfig;
				}

				public String getStepType() {
					return this.stepType;
				}

				public void setStepType(String stepType) {
					this.stepType = stepType;
				}

				public String getStepName() {
					return this.stepName;
				}

				public void setStepName(String stepName) {
					this.stepName = stepName;
				}

				public Boolean getIsDistribute() {
					return this.isDistribute;
				}

				public void setIsDistribute(Boolean isDistribute) {
					this.isDistribute = isDistribute;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class NodeInfo {

			@SerializedName("NodeName")
			private String nodeName;

			@SerializedName("NodeId")
			private String nodeId;

			@SerializedName("Directory")
			private String directory;

			@SerializedName("PipelineId")
			private Long pipelineId;

			@SerializedName("FileId")
			private Long fileId;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
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
	public Class<UpdatePipelineByAsyncResponse> getResponseClass() {
		return UpdatePipelineByAsyncResponse.class;
	}

}
