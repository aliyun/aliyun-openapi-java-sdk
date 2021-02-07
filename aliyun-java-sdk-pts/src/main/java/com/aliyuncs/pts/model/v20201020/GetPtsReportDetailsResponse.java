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
import com.aliyuncs.pts.transform.v20201020.GetPtsReportDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPtsReportDetailsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<ApiMetrics> apiMetricsList;

	private ReportOverView reportOverView;

	private SceneMetrics sceneMetrics;

	private SceneSnapShot sceneSnapShot;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public List<ApiMetrics> getApiMetricsList() {
		return this.apiMetricsList;
	}

	public void setApiMetricsList(List<ApiMetrics> apiMetricsList) {
		this.apiMetricsList = apiMetricsList;
	}

	public ReportOverView getReportOverView() {
		return this.reportOverView;
	}

	public void setReportOverView(ReportOverView reportOverView) {
		this.reportOverView = reportOverView;
	}

	public SceneMetrics getSceneMetrics() {
		return this.sceneMetrics;
	}

	public void setSceneMetrics(SceneMetrics sceneMetrics) {
		this.sceneMetrics = sceneMetrics;
	}

	public SceneSnapShot getSceneSnapShot() {
		return this.sceneSnapShot;
	}

	public void setSceneSnapShot(SceneSnapShot sceneSnapShot) {
		this.sceneSnapShot = sceneSnapShot;
	}

	public static class ApiMetrics {

		private Float avgTps;

		private Float avgRt;

		private Float seg50Rt;

		private Float seg75Rt;

		private Float seg90Rt;

		private Float seg99Rt;

		private Float maxRt;

		private Float minRt;

		private Float successRateReq;

		private Float successRateBiz;

		private Long failCountReq;

		private Long failCountBiz;

		private Long allCount;

		public Float getAvgTps() {
			return this.avgTps;
		}

		public void setAvgTps(Float avgTps) {
			this.avgTps = avgTps;
		}

		public Float getAvgRt() {
			return this.avgRt;
		}

		public void setAvgRt(Float avgRt) {
			this.avgRt = avgRt;
		}

		public Float getSeg50Rt() {
			return this.seg50Rt;
		}

		public void setSeg50Rt(Float seg50Rt) {
			this.seg50Rt = seg50Rt;
		}

		public Float getSeg75Rt() {
			return this.seg75Rt;
		}

		public void setSeg75Rt(Float seg75Rt) {
			this.seg75Rt = seg75Rt;
		}

		public Float getSeg90Rt() {
			return this.seg90Rt;
		}

		public void setSeg90Rt(Float seg90Rt) {
			this.seg90Rt = seg90Rt;
		}

		public Float getSeg99Rt() {
			return this.seg99Rt;
		}

		public void setSeg99Rt(Float seg99Rt) {
			this.seg99Rt = seg99Rt;
		}

		public Float getMaxRt() {
			return this.maxRt;
		}

		public void setMaxRt(Float maxRt) {
			this.maxRt = maxRt;
		}

		public Float getMinRt() {
			return this.minRt;
		}

		public void setMinRt(Float minRt) {
			this.minRt = minRt;
		}

		public Float getSuccessRateReq() {
			return this.successRateReq;
		}

		public void setSuccessRateReq(Float successRateReq) {
			this.successRateReq = successRateReq;
		}

		public Float getSuccessRateBiz() {
			return this.successRateBiz;
		}

		public void setSuccessRateBiz(Float successRateBiz) {
			this.successRateBiz = successRateBiz;
		}

		public Long getFailCountReq() {
			return this.failCountReq;
		}

		public void setFailCountReq(Long failCountReq) {
			this.failCountReq = failCountReq;
		}

		public Long getFailCountBiz() {
			return this.failCountBiz;
		}

		public void setFailCountBiz(Long failCountBiz) {
			this.failCountBiz = failCountBiz;
		}

		public Long getAllCount() {
			return this.allCount;
		}

		public void setAllCount(Long allCount) {
			this.allCount = allCount;
		}
	}

	public static class ReportOverView {

		private String reportId;

		private String reportName;

		private String startTime;

		private String endTime;

		private Integer agentCount;

		private Long vum;

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getReportName() {
			return this.reportName;
		}

		public void setReportName(String reportName) {
			this.reportName = reportName;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getAgentCount() {
			return this.agentCount;
		}

		public void setAgentCount(Integer agentCount) {
			this.agentCount = agentCount;
		}

		public Long getVum() {
			return this.vum;
		}

		public void setVum(Long vum) {
			this.vum = vum;
		}
	}

	public static class SceneMetrics {

		private Float avgTps;

		private Float avgRt;

		private Float seg90Rt;

		private Float seg99Rt;

		private Float successRateReq;

		private Float successRateBiz;

		private Long failCountReq;

		private Long failCountBiz;

		private Long allCount;

		public Float getAvgTps() {
			return this.avgTps;
		}

		public void setAvgTps(Float avgTps) {
			this.avgTps = avgTps;
		}

		public Float getAvgRt() {
			return this.avgRt;
		}

		public void setAvgRt(Float avgRt) {
			this.avgRt = avgRt;
		}

		public Float getSeg90Rt() {
			return this.seg90Rt;
		}

		public void setSeg90Rt(Float seg90Rt) {
			this.seg90Rt = seg90Rt;
		}

		public Float getSeg99Rt() {
			return this.seg99Rt;
		}

		public void setSeg99Rt(Float seg99Rt) {
			this.seg99Rt = seg99Rt;
		}

		public Float getSuccessRateReq() {
			return this.successRateReq;
		}

		public void setSuccessRateReq(Float successRateReq) {
			this.successRateReq = successRateReq;
		}

		public Float getSuccessRateBiz() {
			return this.successRateBiz;
		}

		public void setSuccessRateBiz(Float successRateBiz) {
			this.successRateBiz = successRateBiz;
		}

		public Long getFailCountReq() {
			return this.failCountReq;
		}

		public void setFailCountReq(Long failCountReq) {
			this.failCountReq = failCountReq;
		}

		public Long getFailCountBiz() {
			return this.failCountBiz;
		}

		public void setFailCountBiz(Long failCountBiz) {
			this.failCountBiz = failCountBiz;
		}

		public Long getAllCount() {
			return this.allCount;
		}

		public void setAllCount(Long allCount) {
			this.allCount = allCount;
		}
	}

	public static class SceneSnapShot {

		private String sceneId;

		private String sceneName;

		private String createTime;

		private String modifiedTime;

		private String status;

		private List<Relation> relationList;

		private List<FileParameter> fileParameterList;

		private List<GlobalParameter> globalParameterList;

		private LoadConfig loadConfig;

		private AdvanceSetting advanceSetting;

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Relation> getRelationList() {
			return this.relationList;
		}

		public void setRelationList(List<Relation> relationList) {
			this.relationList = relationList;
		}

		public List<FileParameter> getFileParameterList() {
			return this.fileParameterList;
		}

		public void setFileParameterList(List<FileParameter> fileParameterList) {
			this.fileParameterList = fileParameterList;
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

		public static class Relation {

			private String relationId;

			private String relationName;

			private List<Api> apiList;

			private List<FileParameterExplain> fileParameterExplainList;

			public String getRelationId() {
				return this.relationId;
			}

			public void setRelationId(String relationId) {
				this.relationId = relationId;
			}

			public String getRelationName() {
				return this.relationName;
			}

			public void setRelationName(String relationName) {
				this.relationName = relationName;
			}

			public List<Api> getApiList() {
				return this.apiList;
			}

			public void setApiList(List<Api> apiList) {
				this.apiList = apiList;
			}

			public List<FileParameterExplain> getFileParameterExplainList() {
				return this.fileParameterExplainList;
			}

			public void setFileParameterExplainList(List<FileParameterExplain> fileParameterExplainList) {
				this.fileParameterExplainList = fileParameterExplainList;
			}

			public static class Api {

				private String apiId;

				private String apiName;

				private String url;

				private String method;

				private Integer timeoutInSecond;

				private Integer redirectCountLimit;

				private List<Header> headerList;

				private List<Export> exportList;

				private List<CheckPoint> checkPointList;

				private Body body;

				public String getApiId() {
					return this.apiId;
				}

				public void setApiId(String apiId) {
					this.apiId = apiId;
				}

				public String getApiName() {
					return this.apiName;
				}

				public void setApiName(String apiName) {
					this.apiName = apiName;
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

				public Integer getTimeoutInSecond() {
					return this.timeoutInSecond;
				}

				public void setTimeoutInSecond(Integer timeoutInSecond) {
					this.timeoutInSecond = timeoutInSecond;
				}

				public Integer getRedirectCountLimit() {
					return this.redirectCountLimit;
				}

				public void setRedirectCountLimit(Integer redirectCountLimit) {
					this.redirectCountLimit = redirectCountLimit;
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

				public List<CheckPoint> getCheckPointList() {
					return this.checkPointList;
				}

				public void setCheckPointList(List<CheckPoint> checkPointList) {
					this.checkPointList = checkPointList;
				}

				public Body getBody() {
					return this.body;
				}

				public void setBody(Body body) {
					this.body = body;
				}

				public static class Header {

					private String headerName;

					private String headerValue;

					public String getHeaderName() {
						return this.headerName;
					}

					public void setHeaderName(String headerName) {
						this.headerName = headerName;
					}

					public String getHeaderValue() {
						return this.headerValue;
					}

					public void setHeaderValue(String headerValue) {
						this.headerValue = headerValue;
					}
				}

				public static class Export {

					private String exportName;

					private String exportType;

					private String exportValue;

					private String count;

					public String getExportName() {
						return this.exportName;
					}

					public void setExportName(String exportName) {
						this.exportName = exportName;
					}

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

					public String getCount() {
						return this.count;
					}

					public void setCount(String count) {
						this.count = count;
					}
				}

				public static class CheckPoint {

					private String checkPoint;

					private String checkType;

					private String operator;

					private String expectValue;

					public String getCheckPoint() {
						return this.checkPoint;
					}

					public void setCheckPoint(String checkPoint) {
						this.checkPoint = checkPoint;
					}

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
				}

				public static class Body {

					private String contentType;

					private String bodyValue;

					public String getContentType() {
						return this.contentType;
					}

					public void setContentType(String contentType) {
						this.contentType = contentType;
					}

					public String getBodyValue() {
						return this.bodyValue;
					}

					public void setBodyValue(String bodyValue) {
						this.bodyValue = bodyValue;
					}
				}
			}

			public static class FileParameterExplain {

				private String fileName;

				private String fileParamName;

				private Boolean cycleOnce;

				private Boolean baseFile;

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public String getFileParamName() {
					return this.fileParamName;
				}

				public void setFileParamName(String fileParamName) {
					this.fileParamName = fileParamName;
				}

				public Boolean getCycleOnce() {
					return this.cycleOnce;
				}

				public void setCycleOnce(Boolean cycleOnce) {
					this.cycleOnce = cycleOnce;
				}

				public Boolean getBaseFile() {
					return this.baseFile;
				}

				public void setBaseFile(Boolean baseFile) {
					this.baseFile = baseFile;
				}
			}
		}

		public static class FileParameter {

			private String fileName;

			private String fileOssAddress;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getFileOssAddress() {
				return this.fileOssAddress;
			}

			public void setFileOssAddress(String fileOssAddress) {
				this.fileOssAddress = fileOssAddress;
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

			private String testMode;

			private Integer maxRunningTime;

			private Integer agentCount;

			private List<ApiLoadConfig> apiLoadConfigList;

			private List<RelationLoadConfig> relationLoadConfigList;

			private Configuration configuration;

			public String getTestMode() {
				return this.testMode;
			}

			public void setTestMode(String testMode) {
				this.testMode = testMode;
			}

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

			public static class ApiLoadConfig {

				private Integer rpsBegin;

				private Integer rpsLimit;

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
			}

			public static class RelationLoadConfig {

				private Integer concurrencyBegin;

				private Integer concurrencyLimit;

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
			}

			public static class Configuration {

				private Integer allConcurrencyBegin;

				private Integer allConcurrencyLimit;

				private Integer allRpsBegin;

				private Integer allRpsLimit;

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

				public Integer getAllRpsBegin() {
					return this.allRpsBegin;
				}

				public void setAllRpsBegin(Integer allRpsBegin) {
					this.allRpsBegin = allRpsBegin;
				}

				public Integer getAllRpsLimit() {
					return this.allRpsLimit;
				}

				public void setAllRpsLimit(Integer allRpsLimit) {
					this.allRpsLimit = allRpsLimit;
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
	public GetPtsReportDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetPtsReportDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
