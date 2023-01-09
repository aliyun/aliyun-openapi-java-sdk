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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetPtsSceneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPtsSceneResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Scene scene;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public static class Scene {

		private String status;

		private String modifiedTime;

		private String createTime;

		private String sceneName;

		private String sceneId;

		private List<FileParameter> fileParameterList;

		private List<Relation> relationList;

		private List<GlobalParameter> globalParameterList;

		private LoadConfig loadConfig;

		private AdvanceSetting advanceSetting;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public List<FileParameter> getFileParameterList() {
			return this.fileParameterList;
		}

		public void setFileParameterList(List<FileParameter> fileParameterList) {
			this.fileParameterList = fileParameterList;
		}

		public List<Relation> getRelationList() {
			return this.relationList;
		}

		public void setRelationList(List<Relation> relationList) {
			this.relationList = relationList;
		}

		public List<GlobalParameter> getGlobalParameterList() {
			return this.globalParameterList;
		}

		public void setGlobalParameterList(List<GlobalParameter> globalParameterList) {
			this.globalParameterList = globalParameterList;
		}

		public LoadConfig getLoadConfig() {
			return this.loadConfig;
		}

		public void setLoadConfig(LoadConfig loadConfig) {
			this.loadConfig = loadConfig;
		}

		public AdvanceSetting getAdvanceSetting() {
			return this.advanceSetting;
		}

		public void setAdvanceSetting(AdvanceSetting advanceSetting) {
			this.advanceSetting = advanceSetting;
		}

		public static class FileParameter {

			private String fileOssAddress;

			private String fileName;

			public String getFileOssAddress() {
				return this.fileOssAddress;
			}

			public void setFileOssAddress(String fileOssAddress) {
				this.fileOssAddress = fileOssAddress;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}
		}

		public static class Relation {

			private String relationName;

			private String relationId;

			private List<FileParameterExplain> fileParameterExplainList;

			private List<Api> apiList;

			public String getRelationName() {
				return this.relationName;
			}

			public void setRelationName(String relationName) {
				this.relationName = relationName;
			}

			public String getRelationId() {
				return this.relationId;
			}

			public void setRelationId(String relationId) {
				this.relationId = relationId;
			}

			public List<FileParameterExplain> getFileParameterExplainList() {
				return this.fileParameterExplainList;
			}

			public void setFileParameterExplainList(List<FileParameterExplain> fileParameterExplainList) {
				this.fileParameterExplainList = fileParameterExplainList;
			}

			public List<Api> getApiList() {
				return this.apiList;
			}

			public void setApiList(List<Api> apiList) {
				this.apiList = apiList;
			}

			public static class FileParameterExplain {

				private Boolean cycleOnce;

				private String fileParamName;

				private String fileName;

				private Boolean baseFile;

				public Boolean getCycleOnce() {
					return this.cycleOnce;
				}

				public void setCycleOnce(Boolean cycleOnce) {
					this.cycleOnce = cycleOnce;
				}

				public String getFileParamName() {
					return this.fileParamName;
				}

				public void setFileParamName(String fileParamName) {
					this.fileParamName = fileParamName;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public Boolean getBaseFile() {
					return this.baseFile;
				}

				public void setBaseFile(Boolean baseFile) {
					this.baseFile = baseFile;
				}
			}

			public static class Api {

				private String apiId;

				private Integer timeoutInSecond;

				private String url;

				private String method;

				private Integer redirectCountLimit;

				private String apiName;

				private List<CheckPoint> checkPointList;

				private List<Header> headerList;

				private List<Export> exportList;

				private Body body;

				public String getApiId() {
					return this.apiId;
				}

				public void setApiId(String apiId) {
					this.apiId = apiId;
				}

				public Integer getTimeoutInSecond() {
					return this.timeoutInSecond;
				}

				public void setTimeoutInSecond(Integer timeoutInSecond) {
					this.timeoutInSecond = timeoutInSecond;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public String getBizMethod() {
					return this.method;
				}

				public void setBizMethod(String method) {
					this.method = method;
				}

				public Integer getRedirectCountLimit() {
					return this.redirectCountLimit;
				}

				public void setRedirectCountLimit(Integer redirectCountLimit) {
					this.redirectCountLimit = redirectCountLimit;
				}

				public String getApiName() {
					return this.apiName;
				}

				public void setApiName(String apiName) {
					this.apiName = apiName;
				}

				public List<CheckPoint> getCheckPointList() {
					return this.checkPointList;
				}

				public void setCheckPointList(List<CheckPoint> checkPointList) {
					this.checkPointList = checkPointList;
				}

				public List<Header> getHeaderList() {
					return this.headerList;
				}

				public void setHeaderList(List<Header> headerList) {
					this.headerList = headerList;
				}

				public List<Export> getExportList() {
					return this.exportList;
				}

				public void setExportList(List<Export> exportList) {
					this.exportList = exportList;
				}

				public Body getBody() {
					return this.body;
				}

				public void setBody(Body body) {
					this.body = body;
				}

				public static class CheckPoint {

					private String checkType;

					private String operator;

					private String expectValue;

					private String checkPoint;

					public String getCheckType() {
						return this.checkType;
					}

					public void setCheckType(String checkType) {
						this.checkType = checkType;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public String getExpectValue() {
						return this.expectValue;
					}

					public void setExpectValue(String expectValue) {
						this.expectValue = expectValue;
					}

					public String getCheckPoint() {
						return this.checkPoint;
					}

					public void setCheckPoint(String checkPoint) {
						this.checkPoint = checkPoint;
					}
				}

				public static class Header {

					private String headerValue;

					private String headerName;

					public String getHeaderValue() {
						return this.headerValue;
					}

					public void setHeaderValue(String headerValue) {
						this.headerValue = headerValue;
					}

					public String getHeaderName() {
						return this.headerName;
					}

					public void setHeaderName(String headerName) {
						this.headerName = headerName;
					}
				}

				public static class Export {

					private String exportType;

					private String exportValue;

					private String exportName;

					private String count;

					public String getExportType() {
						return this.exportType;
					}

					public void setExportType(String exportType) {
						this.exportType = exportType;
					}

					public String getExportValue() {
						return this.exportValue;
					}

					public void setExportValue(String exportValue) {
						this.exportValue = exportValue;
					}

					public String getExportName() {
						return this.exportName;
					}

					public void setExportName(String exportName) {
						this.exportName = exportName;
					}

					public String getCount() {
						return this.count;
					}

					public void setCount(String count) {
						this.count = count;
					}
				}

				public static class Body {

					private String bodyValue;

					private String contentType;

					public String getBodyValue() {
						return this.bodyValue;
					}

					public void setBodyValue(String bodyValue) {
						this.bodyValue = bodyValue;
					}

					public String getContentType() {
						return this.contentType;
					}

					public void setContentType(String contentType) {
						this.contentType = contentType;
					}
				}
			}
		}

		public static class GlobalParameter {

			private String paramName;

			private String paramValue;

			public String getParamName() {
				return this.paramName;
			}

			public void setParamName(String paramName) {
				this.paramName = paramName;
			}

			public String getParamValue() {
				return this.paramValue;
			}

			public void setParamValue(String paramValue) {
				this.paramValue = paramValue;
			}
		}

		public static class LoadConfig {

			private Integer maxRunningTime;

			private Integer agentCount;

			private String testMode;

			private Boolean autoStep;

			private Integer increment;

			private Integer keepTime;

			private List<ApiLoadConfig> apiLoadConfigList;

			private List<RelationLoadConfig> relationLoadConfigList;

			private Configuration configuration;

			private VpcLoadConfig vpcLoadConfig;

			public Integer getMaxRunningTime() {
				return this.maxRunningTime;
			}

			public void setMaxRunningTime(Integer maxRunningTime) {
				this.maxRunningTime = maxRunningTime;
			}

			public Integer getAgentCount() {
				return this.agentCount;
			}

			public void setAgentCount(Integer agentCount) {
				this.agentCount = agentCount;
			}

			public String getTestMode() {
				return this.testMode;
			}

			public void setTestMode(String testMode) {
				this.testMode = testMode;
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

			public List<ApiLoadConfig> getApiLoadConfigList() {
				return this.apiLoadConfigList;
			}

			public void setApiLoadConfigList(List<ApiLoadConfig> apiLoadConfigList) {
				this.apiLoadConfigList = apiLoadConfigList;
			}

			public List<RelationLoadConfig> getRelationLoadConfigList() {
				return this.relationLoadConfigList;
			}

			public void setRelationLoadConfigList(List<RelationLoadConfig> relationLoadConfigList) {
				this.relationLoadConfigList = relationLoadConfigList;
			}

			public Configuration getConfiguration() {
				return this.configuration;
			}

			public void setConfiguration(Configuration configuration) {
				this.configuration = configuration;
			}

			public VpcLoadConfig getVpcLoadConfig() {
				return this.vpcLoadConfig;
			}

			public void setVpcLoadConfig(VpcLoadConfig vpcLoadConfig) {
				this.vpcLoadConfig = vpcLoadConfig;
			}

			public static class ApiLoadConfig {

				private Integer rpsBegin;

				private Integer rpsLimit;

				private String apiId;

				public Integer getRpsBegin() {
					return this.rpsBegin;
				}

				public void setRpsBegin(Integer rpsBegin) {
					this.rpsBegin = rpsBegin;
				}

				public Integer getRpsLimit() {
					return this.rpsLimit;
				}

				public void setRpsLimit(Integer rpsLimit) {
					this.rpsLimit = rpsLimit;
				}

				public String getApiId() {
					return this.apiId;
				}

				public void setApiId(String apiId) {
					this.apiId = apiId;
				}
			}

			public static class RelationLoadConfig {

				private Integer concurrencyBegin;

				private Integer concurrencyLimit;

				private String relationId;

				public Integer getConcurrencyBegin() {
					return this.concurrencyBegin;
				}

				public void setConcurrencyBegin(Integer concurrencyBegin) {
					this.concurrencyBegin = concurrencyBegin;
				}

				public Integer getConcurrencyLimit() {
					return this.concurrencyLimit;
				}

				public void setConcurrencyLimit(Integer concurrencyLimit) {
					this.concurrencyLimit = concurrencyLimit;
				}

				public String getRelationId() {
					return this.relationId;
				}

				public void setRelationId(String relationId) {
					this.relationId = relationId;
				}
			}

			public static class Configuration {

				private Integer allRpsBegin;

				private Integer allConcurrencyBegin;

				private Integer allConcurrencyLimit;

				private Integer allRpsLimit;

				public Integer getAllRpsBegin() {
					return this.allRpsBegin;
				}

				public void setAllRpsBegin(Integer allRpsBegin) {
					this.allRpsBegin = allRpsBegin;
				}

				public Integer getAllConcurrencyBegin() {
					return this.allConcurrencyBegin;
				}

				public void setAllConcurrencyBegin(Integer allConcurrencyBegin) {
					this.allConcurrencyBegin = allConcurrencyBegin;
				}

				public Integer getAllConcurrencyLimit() {
					return this.allConcurrencyLimit;
				}

				public void setAllConcurrencyLimit(Integer allConcurrencyLimit) {
					this.allConcurrencyLimit = allConcurrencyLimit;
				}

				public Integer getAllRpsLimit() {
					return this.allRpsLimit;
				}

				public void setAllRpsLimit(Integer allRpsLimit) {
					this.allRpsLimit = allRpsLimit;
				}
			}

			public static class VpcLoadConfig {

				private String vpcId;

				private String vSwitchId;

				private String securityGroupId;

				private String regionId;

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
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

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}
			}
		}

		public static class AdvanceSetting {

			private Integer logRate;

			private Integer connectionTimeoutInSecond;

			private String successCode;

			private List<DomainBinding> domainBindingList;

			public Integer getLogRate() {
				return this.logRate;
			}

			public void setLogRate(Integer logRate) {
				this.logRate = logRate;
			}

			public Integer getConnectionTimeoutInSecond() {
				return this.connectionTimeoutInSecond;
			}

			public void setConnectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
				this.connectionTimeoutInSecond = connectionTimeoutInSecond;
			}

			public String getSuccessCode() {
				return this.successCode;
			}

			public void setSuccessCode(String successCode) {
				this.successCode = successCode;
			}

			public List<DomainBinding> getDomainBindingList() {
				return this.domainBindingList;
			}

			public void setDomainBindingList(List<DomainBinding> domainBindingList) {
				this.domainBindingList = domainBindingList;
			}

			public static class DomainBinding {

				private String domain;

				private List<String> ips;

				public String getDomain() {
					return this.domain;
				}

				public void setDomain(String domain) {
					this.domain = domain;
				}

				public List<String> getIps() {
					return this.ips;
				}

				public void setIps(List<String> ips) {
					this.ips = ips;
				}
			}
		}
	}

	@Override
	public GetPtsSceneResponse getInstance(UnmarshallerContext context) {
		return	GetPtsSceneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
