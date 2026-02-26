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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetPipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPipelineResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private Pipeline pipeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Pipeline getPipeline() {
		return this.pipeline;
	}

	public void setPipeline(Pipeline pipeline) {
		this.pipeline = pipeline;
	}

	public static class Pipeline {

		private String creatorAccountId;

		private Integer envId;

		private String envName;

		private Long createTime;

		private Long updateTime;

		private Long groupId;

		private String modifierAccountId;

		private String name;

		private List<Tag> tagList;

		private PipelineConfig pipelineConfig;

		public String getCreatorAccountId() {
			return this.creatorAccountId;
		}

		public void setCreatorAccountId(String creatorAccountId) {
			this.creatorAccountId = creatorAccountId;
		}

		public Integer getEnvId() {
			return this.envId;
		}

		public void setEnvId(Integer envId) {
			this.envId = envId;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getModifierAccountId() {
			return this.modifierAccountId;
		}

		public void setModifierAccountId(String modifierAccountId) {
			this.modifierAccountId = modifierAccountId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Tag> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<Tag> tagList) {
			this.tagList = tagList;
		}

		public PipelineConfig getPipelineConfig() {
			return this.pipelineConfig;
		}

		public void setPipelineConfig(PipelineConfig pipelineConfig) {
			this.pipelineConfig = pipelineConfig;
		}

		public static class Tag {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class PipelineConfig {

			private String flow;

			private String settings;

			private List<Source> sources;

			public String getFlow() {
				return this.flow;
			}

			public void setFlow(String flow) {
				this.flow = flow;
			}

			public String getSettings() {
				return this.settings;
			}

			public void setSettings(String settings) {
				this.settings = settings;
			}

			public List<Source> getSources() {
				return this.sources;
			}

			public void setSources(List<Source> sources) {
				this.sources = sources;
			}

			public static class Source {

				private String sign;

				private String type;

				private Data data;

				public String getSign() {
					return this.sign;
				}

				public void setSign(String sign) {
					this.sign = sign;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Data getData() {
					return this.data;
				}

				public void setData(Data data) {
					this.data = data;
				}

				public static class Data {

					private String branch;

					private Long serviceConnectionId;

					private String label;

					private Boolean isTrigger;

					private String repo;

					private String triggerFilter;

					private String webhook;

					private Boolean isBranchMode;

					private Boolean isSubmodule;

					private Boolean isCloneDepth;

					private Long cloneDepth;

					private Long credentialId;

					private String credentialType;

					private String credentialLabel;

					private String namespace;

					private List<String> events;

					public String getBranch() {
						return this.branch;
					}

					public void setBranch(String branch) {
						this.branch = branch;
					}

					public Long getServiceConnectionId() {
						return this.serviceConnectionId;
					}

					public void setServiceConnectionId(Long serviceConnectionId) {
						this.serviceConnectionId = serviceConnectionId;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public Boolean getIsTrigger() {
						return this.isTrigger;
					}

					public void setIsTrigger(Boolean isTrigger) {
						this.isTrigger = isTrigger;
					}

					public String getRepo() {
						return this.repo;
					}

					public void setRepo(String repo) {
						this.repo = repo;
					}

					public String getTriggerFilter() {
						return this.triggerFilter;
					}

					public void setTriggerFilter(String triggerFilter) {
						this.triggerFilter = triggerFilter;
					}

					public String getWebhook() {
						return this.webhook;
					}

					public void setWebhook(String webhook) {
						this.webhook = webhook;
					}

					public Boolean getIsBranchMode() {
						return this.isBranchMode;
					}

					public void setIsBranchMode(Boolean isBranchMode) {
						this.isBranchMode = isBranchMode;
					}

					public Boolean getIsSubmodule() {
						return this.isSubmodule;
					}

					public void setIsSubmodule(Boolean isSubmodule) {
						this.isSubmodule = isSubmodule;
					}

					public Boolean getIsCloneDepth() {
						return this.isCloneDepth;
					}

					public void setIsCloneDepth(Boolean isCloneDepth) {
						this.isCloneDepth = isCloneDepth;
					}

					public Long getCloneDepth() {
						return this.cloneDepth;
					}

					public void setCloneDepth(Long cloneDepth) {
						this.cloneDepth = cloneDepth;
					}

					public Long getCredentialId() {
						return this.credentialId;
					}

					public void setCredentialId(Long credentialId) {
						this.credentialId = credentialId;
					}

					public String getCredentialType() {
						return this.credentialType;
					}

					public void setCredentialType(String credentialType) {
						this.credentialType = credentialType;
					}

					public String getCredentialLabel() {
						return this.credentialLabel;
					}

					public void setCredentialLabel(String credentialLabel) {
						this.credentialLabel = credentialLabel;
					}

					public String getNamespace() {
						return this.namespace;
					}

					public void setNamespace(String namespace) {
						this.namespace = namespace;
					}

					public List<String> getEvents() {
						return this.events;
					}

					public void setEvents(List<String> events) {
						this.events = events;
					}
				}
			}
		}
	}

	@Override
	public GetPipelineResponse getInstance(UnmarshallerContext context) {
		return	GetPipelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
