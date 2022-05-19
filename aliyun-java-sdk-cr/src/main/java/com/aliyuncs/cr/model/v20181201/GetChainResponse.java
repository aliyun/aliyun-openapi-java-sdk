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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetChainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChainResponse extends AcsResponse {

	private Long modifiedTime;

	private String scopeId;

	private String requestId;

	private String description;

	private Long createTime;

	private String scopeType;

	private String code;

	private String chainId;

	private String instanceId;

	private Boolean isSuccess;

	private String name;

	private ChainConfig chainConfig;

	public Long getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getChainId() {
		return this.chainId;
	}

	public void setChainId(String chainId) {
		this.chainId = chainId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChainConfig getChainConfig() {
		return this.chainConfig;
	}

	public void setChainConfig(ChainConfig chainConfig) {
		this.chainConfig = chainConfig;
	}

	public static class ChainConfig {

		private String chainConfigId;

		private Boolean isActive;

		private String version;

		private List<RoutersItem> routers;

		private List<NodesItem> nodes;

		public String getChainConfigId() {
			return this.chainConfigId;
		}

		public void setChainConfigId(String chainConfigId) {
			this.chainConfigId = chainConfigId;
		}

		public Boolean getIsActive() {
			return this.isActive;
		}

		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<RoutersItem> getRouters() {
			return this.routers;
		}

		public void setRouters(List<RoutersItem> routers) {
			this.routers = routers;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class RoutersItem {

			private From from;

			private To to;

			public From getFrom() {
				return this.from;
			}

			public void setFrom(From from) {
				this.from = from;
			}

			public To getTo() {
				return this.to;
			}

			public void setTo(To to) {
				this.to = to;
			}

			public static class From {

				private String nodeName;

				public String getNodeName() {
					return this.nodeName;
				}

				public void setNodeName(String nodeName) {
					this.nodeName = nodeName;
				}
			}

			public static class To {

				private String nodeName;

				public String getNodeName() {
					return this.nodeName;
				}

				public void setNodeName(String nodeName) {
					this.nodeName = nodeName;
				}
			}
		}

		public static class NodesItem {

			private String nodeName;

			private Boolean enable;

			private NodeConfig nodeConfig;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public NodeConfig getNodeConfig() {
				return this.nodeConfig;
			}

			public void setNodeConfig(NodeConfig nodeConfig) {
				this.nodeConfig = nodeConfig;
			}

			public static class NodeConfig {

				private Long timeout;

				private Integer retry;

				private String scanEngine;

				private DenyPolicy denyPolicy;

				public Long getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Long timeout) {
					this.timeout = timeout;
				}

				public Integer getRetry() {
					return this.retry;
				}

				public void setRetry(Integer retry) {
					this.retry = retry;
				}

				public String getScanEngine() {
					return this.scanEngine;
				}

				public void setScanEngine(String scanEngine) {
					this.scanEngine = scanEngine;
				}

				public DenyPolicy getDenyPolicy() {
					return this.denyPolicy;
				}

				public void setDenyPolicy(DenyPolicy denyPolicy) {
					this.denyPolicy = denyPolicy;
				}

				public static class DenyPolicy {

					private String logic;

					private String issueLevel;

					private String issueCount;

					private String action;

					private String issueList;

					public String getLogic() {
						return this.logic;
					}

					public void setLogic(String logic) {
						this.logic = logic;
					}

					public String getIssueLevel() {
						return this.issueLevel;
					}

					public void setIssueLevel(String issueLevel) {
						this.issueLevel = issueLevel;
					}

					public String getIssueCount() {
						return this.issueCount;
					}

					public void setIssueCount(String issueCount) {
						this.issueCount = issueCount;
					}

					public String getAction() {
						return this.action;
					}

					public void setAction(String action) {
						this.action = action;
					}

					public String getIssueList() {
						return this.issueList;
					}

					public void setIssueList(String issueList) {
						this.issueList = issueList;
					}
				}
			}
		}
	}

	@Override
	public GetChainResponse getInstance(UnmarshallerContext context) {
		return	GetChainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
