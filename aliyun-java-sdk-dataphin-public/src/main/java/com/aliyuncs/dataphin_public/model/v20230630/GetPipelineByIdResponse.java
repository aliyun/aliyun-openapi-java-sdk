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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetPipelineByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPipelineByIdResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String scheduleConfig;

		private Integer pipelineType;

		private String mode;

		private String pipelineJson;

		private String settings;

		private PipelineConfig pipelineConfig;

		private NodeInfo nodeInfo;

		public String getScheduleConfig() {
			return this.scheduleConfig;
		}

		public void setScheduleConfig(String scheduleConfig) {
			this.scheduleConfig = scheduleConfig;
		}

		public Integer getPipelineType() {
			return this.pipelineType;
		}

		public void setPipelineType(Integer pipelineType) {
			this.pipelineType = pipelineType;
		}

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

		public PipelineConfig getPipelineConfig() {
			return this.pipelineConfig;
		}

		public void setPipelineConfig(PipelineConfig pipelineConfig) {
			this.pipelineConfig = pipelineConfig;
		}

		public NodeInfo getNodeInfo() {
			return this.nodeInfo;
		}

		public void setNodeInfo(NodeInfo nodeInfo) {
			this.nodeInfo = nodeInfo;
		}

		public static class PipelineConfig {

			private List<Step> steps;

			private List<Hop> hops;

			public List<Step> getSteps() {
				return this.steps;
			}

			public void setSteps(List<Step> steps) {
				this.steps = steps;
			}

			public List<Hop> getHops() {
				return this.hops;
			}

			public void setHops(List<Hop> hops) {
				this.hops = hops;
			}

			public static class Step {

				private String pluginConfig;

				private String stepType;

				private String stepName;

				private Boolean isDistribute;

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

			public static class Hop {

				private String target;

				private Boolean sendTo;

				private String source;

				public String getTarget() {
					return this.target;
				}

				public void setTarget(String target) {
					this.target = target;
				}

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
			}
		}

		public static class NodeInfo {

			private String desc;

			private String nodeName;

			private String nodeId;

			private Long pipelineId;

			private Long fileId;

			private String directory;

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

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

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}
	}

	@Override
	public GetPipelineByIdResponse getInstance(UnmarshallerContext context) {
		return	GetPipelineByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
