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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeSceneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSceneResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private Scene scene;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public static class Scene {

		private String id;

		private String name;

		private String type;

		private Map<Object,Object> variables;

		private Map<Object,Object> headers;

		private String creator;

		private String modifier;

		private Long createTime;

		private Long modifyTime;

		private List<Relation> relations;

		private List<Vip> vips;

		private List<File> files;

		private Status status;

		private TestConfig testConfig;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Map<Object,Object> getVariables() {
			return this.variables;
		}

		public void setVariables(Map<Object,Object> variables) {
			this.variables = variables;
		}

		public Map<Object,Object> getHeaders() {
			return this.headers;
		}

		public void setHeaders(Map<Object,Object> headers) {
			this.headers = headers;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public List<Relation> getRelations() {
			return this.relations;
		}

		public void setRelations(List<Relation> relations) {
			this.relations = relations;
		}

		public List<Vip> getVips() {
			return this.vips;
		}

		public void setVips(List<Vip> vips) {
			this.vips = vips;
		}

		public List<File> getFiles() {
			return this.files;
		}

		public void setFiles(List<File> files) {
			this.files = files;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public TestConfig getTestConfig() {
			return this.testConfig;
		}

		public void setTestConfig(TestConfig testConfig) {
			this.testConfig = testConfig;
		}

		public static class Relation {

			private Long id;

			private String name;

			private Boolean disabled;

			private Map<Object,Object> headers;

			private List<Node> nodes;

			private RelationTestConfig relationTestConfig;

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

			public Boolean getDisabled() {
				return this.disabled;
			}

			public void setDisabled(Boolean disabled) {
				this.disabled = disabled;
			}

			public Map<Object,Object> getHeaders() {
				return this.headers;
			}

			public void setHeaders(Map<Object,Object> headers) {
				this.headers = headers;
			}

			public List<Node> getNodes() {
				return this.nodes;
			}

			public void setNodes(List<Node> nodes) {
				this.nodes = nodes;
			}

			public RelationTestConfig getRelationTestConfig() {
				return this.relationTestConfig;
			}

			public void setRelationTestConfig(RelationTestConfig relationTestConfig) {
				this.relationTestConfig = relationTestConfig;
			}

			public static class Node {

				private Long id;

				private String name;

				private String type;

				private Map<Object,Object> config;

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

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Map<Object,Object> getConfig() {
					return this.config;
				}

				public void setConfig(Map<Object,Object> config) {
					this.config = config;
				}
			}

			public static class RelationTestConfig {

				private Integer beginStep;

				private Integer increment;

				private Integer endStep;

				public Integer getBeginStep() {
					return this.beginStep;
				}

				public void setBeginStep(Integer beginStep) {
					this.beginStep = beginStep;
				}

				public Integer getIncrement() {
					return this.increment;
				}

				public void setIncrement(Integer increment) {
					this.increment = increment;
				}

				public Integer getEndStep() {
					return this.endStep;
				}

				public void setEndStep(Integer endStep) {
					this.endStep = endStep;
				}
			}
		}

		public static class Vip {

			private String domain;

			private Boolean enabled;

			private List<String> ips;

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public List<String> getIps() {
				return this.ips;
			}

			public void setIps(List<String> ips) {
				this.ips = ips;
			}
		}

		public static class File {

			private String fileKey;

			private String fileName;

			private Boolean skipFirstLine;

			private Map<Object,Object> previewData;

			private String remoteUrl;

			private List<ExportedParam> exportedParams;

			public String getFileKey() {
				return this.fileKey;
			}

			public void setFileKey(String fileKey) {
				this.fileKey = fileKey;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Boolean getSkipFirstLine() {
				return this.skipFirstLine;
			}

			public void setSkipFirstLine(Boolean skipFirstLine) {
				this.skipFirstLine = skipFirstLine;
			}

			public Map<Object,Object> getPreviewData() {
				return this.previewData;
			}

			public void setPreviewData(Map<Object,Object> previewData) {
				this.previewData = previewData;
			}

			public String getRemoteUrl() {
				return this.remoteUrl;
			}

			public void setRemoteUrl(String remoteUrl) {
				this.remoteUrl = remoteUrl;
			}

			public List<ExportedParam> getExportedParams() {
				return this.exportedParams;
			}

			public void setExportedParams(List<ExportedParam> exportedParams) {
				this.exportedParams = exportedParams;
			}

			public static class ExportedParam {

				private String name;

				private String column;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getColumn() {
					return this.column;
				}

				public void setColumn(String column) {
					this.column = column;
				}
			}
		}

		public static class Status {

			private Map<Object,Object> operations;

			private String tips;

			private Boolean debugging;

			private Boolean testing;

			private Boolean isCronable;

			private Boolean isReusable;

			private Boolean cronEditable;

			public Map<Object,Object> getOperations() {
				return this.operations;
			}

			public void setOperations(Map<Object,Object> operations) {
				this.operations = operations;
			}

			public String getTips() {
				return this.tips;
			}

			public void setTips(String tips) {
				this.tips = tips;
			}

			public Boolean getDebugging() {
				return this.debugging;
			}

			public void setDebugging(Boolean debugging) {
				this.debugging = debugging;
			}

			public Boolean getTesting() {
				return this.testing;
			}

			public void setTesting(Boolean testing) {
				this.testing = testing;
			}

			public Boolean getIsCronable() {
				return this.isCronable;
			}

			public void setIsCronable(Boolean isCronable) {
				this.isCronable = isCronable;
			}

			public Boolean getIsReusable() {
				return this.isReusable;
			}

			public void setIsReusable(Boolean isReusable) {
				this.isReusable = isReusable;
			}

			public Boolean getCronEditable() {
				return this.cronEditable;
			}

			public void setCronEditable(Boolean cronEditable) {
				this.cronEditable = cronEditable;
			}
		}

		public static class TestConfig {

			private String mode;

			private Integer maxDuration;

			private Boolean autoStep;

			private Integer increment;

			private Integer keepTime;

			private String agentPool;

			private VpcConfig vpcConfig;

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public Integer getMaxDuration() {
				return this.maxDuration;
			}

			public void setMaxDuration(Integer maxDuration) {
				this.maxDuration = maxDuration;
			}

			public Boolean getAutoStep() {
				return this.autoStep;
			}

			public void setAutoStep(Boolean autoStep) {
				this.autoStep = autoStep;
			}

			public Integer getIncrement() {
				return this.increment;
			}

			public void setIncrement(Integer increment) {
				this.increment = increment;
			}

			public Integer getKeepTime() {
				return this.keepTime;
			}

			public void setKeepTime(Integer keepTime) {
				this.keepTime = keepTime;
			}

			public String getAgentPool() {
				return this.agentPool;
			}

			public void setAgentPool(String agentPool) {
				this.agentPool = agentPool;
			}

			public VpcConfig getVpcConfig() {
				return this.vpcConfig;
			}

			public void setVpcConfig(VpcConfig vpcConfig) {
				this.vpcConfig = vpcConfig;
			}

			public static class VpcConfig {

				private String regionId;

				private String vSwitchId;

				private String securityGroupId;

				private String vpcId;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getVSwitchId() {
					return this.vSwitchId;
				}

				public void setVSwitchId(String vSwitchId) {
					this.vSwitchId = vSwitchId;
				}

				public String getSecurityGroupId() {
					return this.securityGroupId;
				}

				public void setSecurityGroupId(String securityGroupId) {
					this.securityGroupId = securityGroupId;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}
			}
		}
	}

	@Override
	public DescribeSceneResponse getInstance(UnmarshallerContext context) {
		return	DescribeSceneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
