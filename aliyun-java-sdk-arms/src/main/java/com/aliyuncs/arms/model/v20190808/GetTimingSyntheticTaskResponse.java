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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetTimingSyntheticTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTimingSyntheticTaskResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String taskId;

		private String regionId;

		private String name;

		private Integer taskType;

		private Long monitorCategory;

		private String frequency;

		private String status;

		private String resourceGroupId;

		private List<Monitor> monitors;

		private List<AvailableAssertion> availableAssertions;

		private List<Tag> tags;

		private MonitorConf monitorConf;

		private CustomPeriod customPeriod;

		private CommonSetting commonSetting;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public Long getMonitorCategory() {
			return this.monitorCategory;
		}

		public void setMonitorCategory(Long monitorCategory) {
			this.monitorCategory = monitorCategory;
		}

		public String getFrequency() {
			return this.frequency;
		}

		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Monitor> getMonitors() {
			return this.monitors;
		}

		public void setMonitors(List<Monitor> monitors) {
			this.monitors = monitors;
		}

		public List<AvailableAssertion> getAvailableAssertions() {
			return this.availableAssertions;
		}

		public void setAvailableAssertions(List<AvailableAssertion> availableAssertions) {
			this.availableAssertions = availableAssertions;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public MonitorConf getMonitorConf() {
			return this.monitorConf;
		}

		public void setMonitorConf(MonitorConf monitorConf) {
			this.monitorConf = monitorConf;
		}

		public CustomPeriod getCustomPeriod() {
			return this.customPeriod;
		}

		public void setCustomPeriod(CustomPeriod customPeriod) {
			this.customPeriod = customPeriod;
		}

		public CommonSetting getCommonSetting() {
			return this.commonSetting;
		}

		public void setCommonSetting(CommonSetting commonSetting) {
			this.commonSetting = commonSetting;
		}

		public static class Monitor {

			private String cityCode;

			private String operatorCode;

			private Integer clientType;

			public String getCityCode() {
				return this.cityCode;
			}

			public void setCityCode(String cityCode) {
				this.cityCode = cityCode;
			}

			public String getOperatorCode() {
				return this.operatorCode;
			}

			public void setOperatorCode(String operatorCode) {
				this.operatorCode = operatorCode;
			}

			public Integer getClientType() {
				return this.clientType;
			}

			public void setClientType(Integer clientType) {
				this.clientType = clientType;
			}
		}

		public static class AvailableAssertion {

			private String type;

			private String target;

			private String operator;

			private String expect;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getExpect() {
				return this.expect;
			}

			public void setExpect(String expect) {
				this.expect = expect;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class MonitorConf {

			private NetICMP netICMP;

			private NetTCP netTCP;

			private NetDNS netDNS;

			private ApiHTTP apiHTTP;

			private FileDownload fileDownload;

			private Website website;

			private Stream stream;

			public NetICMP getNetICMP() {
				return this.netICMP;
			}

			public void setNetICMP(NetICMP netICMP) {
				this.netICMP = netICMP;
			}

			public NetTCP getNetTCP() {
				return this.netTCP;
			}

			public void setNetTCP(NetTCP netTCP) {
				this.netTCP = netTCP;
			}

			public NetDNS getNetDNS() {
				return this.netDNS;
			}

			public void setNetDNS(NetDNS netDNS) {
				this.netDNS = netDNS;
			}

			public ApiHTTP getApiHTTP() {
				return this.apiHTTP;
			}

			public void setApiHTTP(ApiHTTP apiHTTP) {
				this.apiHTTP = apiHTTP;
			}

			public FileDownload getFileDownload() {
				return this.fileDownload;
			}

			public void setFileDownload(FileDownload fileDownload) {
				this.fileDownload = fileDownload;
			}

			public Website getWebsite() {
				return this.website;
			}

			public void setWebsite(Website website) {
				this.website = website;
			}

			public Stream getStream() {
				return this.stream;
			}

			public void setStream(Stream stream) {
				this.stream = stream;
			}

			public static class NetICMP {

				private String targetUrl;

				private Integer interval;

				private Integer packageNum;

				private Integer packageSize;

				private Boolean splitPackage;

				private Long timeout;

				private Boolean tracertEnable;

				private Integer tracertNumMax;

				private Long tracertTimeout;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public Integer getInterval() {
					return this.interval;
				}

				public void setInterval(Integer interval) {
					this.interval = interval;
				}

				public Integer getPackageNum() {
					return this.packageNum;
				}

				public void setPackageNum(Integer packageNum) {
					this.packageNum = packageNum;
				}

				public Integer getPackageSize() {
					return this.packageSize;
				}

				public void setPackageSize(Integer packageSize) {
					this.packageSize = packageSize;
				}

				public Boolean getSplitPackage() {
					return this.splitPackage;
				}

				public void setSplitPackage(Boolean splitPackage) {
					this.splitPackage = splitPackage;
				}

				public Long getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Long timeout) {
					this.timeout = timeout;
				}

				public Boolean getTracertEnable() {
					return this.tracertEnable;
				}

				public void setTracertEnable(Boolean tracertEnable) {
					this.tracertEnable = tracertEnable;
				}

				public Integer getTracertNumMax() {
					return this.tracertNumMax;
				}

				public void setTracertNumMax(Integer tracertNumMax) {
					this.tracertNumMax = tracertNumMax;
				}

				public Long getTracertTimeout() {
					return this.tracertTimeout;
				}

				public void setTracertTimeout(Long tracertTimeout) {
					this.tracertTimeout = tracertTimeout;
				}
			}

			public static class NetTCP {

				private String targetUrl;

				private Integer connectTimes;

				private Long interval;

				private Long timeout;

				private Boolean tracertEnable;

				private Integer tracertNumMax;

				private Long tracertTimeout;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public Integer getConnectTimes() {
					return this.connectTimes;
				}

				public void setConnectTimes(Integer connectTimes) {
					this.connectTimes = connectTimes;
				}

				public Long getInterval() {
					return this.interval;
				}

				public void setInterval(Long interval) {
					this.interval = interval;
				}

				public Long getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Long timeout) {
					this.timeout = timeout;
				}

				public Boolean getTracertEnable() {
					return this.tracertEnable;
				}

				public void setTracertEnable(Boolean tracertEnable) {
					this.tracertEnable = tracertEnable;
				}

				public Integer getTracertNumMax() {
					return this.tracertNumMax;
				}

				public void setTracertNumMax(Integer tracertNumMax) {
					this.tracertNumMax = tracertNumMax;
				}

				public Long getTracertTimeout() {
					return this.tracertTimeout;
				}

				public void setTracertTimeout(Long tracertTimeout) {
					this.tracertTimeout = tracertTimeout;
				}
			}

			public static class NetDNS {

				private String targetUrl;

				private Integer dnsServerIpType;

				private String nsServer;

				private Integer queryMethod;

				private Long timeout;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public Integer getDnsServerIpType() {
					return this.dnsServerIpType;
				}

				public void setDnsServerIpType(Integer dnsServerIpType) {
					this.dnsServerIpType = dnsServerIpType;
				}

				public String getNsServer() {
					return this.nsServer;
				}

				public void setNsServer(String nsServer) {
					this.nsServer = nsServer;
				}

				public Integer getQueryMethod() {
					return this.queryMethod;
				}

				public void setQueryMethod(Integer queryMethod) {
					this.queryMethod = queryMethod;
				}

				public Long getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Long timeout) {
					this.timeout = timeout;
				}
			}

			public static class ApiHTTP {

				private String targetUrl;

				private String method;

				private Map<Object,Object> requestHeaders;

				private Long connectTimeout;

				private Long timeout;

				private Boolean checkCert;

				private Integer protocolAlpnProtocol;

				private RequestBody requestBody;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public String getBizMethod() {
					return this.method;
				}

				public void setBizMethod(String method) {
					this.method = method;
				}

				public Map<Object,Object> getRequestHeaders() {
					return this.requestHeaders;
				}

				public void setRequestHeaders(Map<Object,Object> requestHeaders) {
					this.requestHeaders = requestHeaders;
				}

				public Long getConnectTimeout() {
					return this.connectTimeout;
				}

				public void setConnectTimeout(Long connectTimeout) {
					this.connectTimeout = connectTimeout;
				}

				public Long getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Long timeout) {
					this.timeout = timeout;
				}

				public Boolean getCheckCert() {
					return this.checkCert;
				}

				public void setCheckCert(Boolean checkCert) {
					this.checkCert = checkCert;
				}

				public Integer getProtocolAlpnProtocol() {
					return this.protocolAlpnProtocol;
				}

				public void setProtocolAlpnProtocol(Integer protocolAlpnProtocol) {
					this.protocolAlpnProtocol = protocolAlpnProtocol;
				}

				public RequestBody getRequestBody() {
					return this.requestBody;
				}

				public void setRequestBody(RequestBody requestBody) {
					this.requestBody = requestBody;
				}

				public static class RequestBody {

					private String content;

					private String type;

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}
				}
			}

			public static class FileDownload {

				private String targetUrl;

				private Long downloadKernel;

				private Long quickProtocol;

				private Long connectionTimeout;

				private Map<Object,Object> customHeaderContent;

				private Integer ignoreCertificateStatusError;

				private Integer ignoreCertificateUntrustworthyError;

				private Integer ignoreInvalidHostError;

				private Long monitorTimeout;

				private Integer redirection;

				private Long transmissionSize;

				private Integer ignoreCertificateCanceledError;

				private Integer ignoreCertificateAuthError;

				private Integer ignoreCertificateOutOfDateError;

				private Integer ignoreCertificateUsingError;

				private Integer verifyWay;

				private String validateKeywords;

				private String whiteList;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public Long getDownloadKernel() {
					return this.downloadKernel;
				}

				public void setDownloadKernel(Long downloadKernel) {
					this.downloadKernel = downloadKernel;
				}

				public Long getQuickProtocol() {
					return this.quickProtocol;
				}

				public void setQuickProtocol(Long quickProtocol) {
					this.quickProtocol = quickProtocol;
				}

				public Long getConnectionTimeout() {
					return this.connectionTimeout;
				}

				public void setConnectionTimeout(Long connectionTimeout) {
					this.connectionTimeout = connectionTimeout;
				}

				public Map<Object,Object> getCustomHeaderContent() {
					return this.customHeaderContent;
				}

				public void setCustomHeaderContent(Map<Object,Object> customHeaderContent) {
					this.customHeaderContent = customHeaderContent;
				}

				public Integer getIgnoreCertificateStatusError() {
					return this.ignoreCertificateStatusError;
				}

				public void setIgnoreCertificateStatusError(Integer ignoreCertificateStatusError) {
					this.ignoreCertificateStatusError = ignoreCertificateStatusError;
				}

				public Integer getIgnoreCertificateUntrustworthyError() {
					return this.ignoreCertificateUntrustworthyError;
				}

				public void setIgnoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
					this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
				}

				public Integer getIgnoreInvalidHostError() {
					return this.ignoreInvalidHostError;
				}

				public void setIgnoreInvalidHostError(Integer ignoreInvalidHostError) {
					this.ignoreInvalidHostError = ignoreInvalidHostError;
				}

				public Long getMonitorTimeout() {
					return this.monitorTimeout;
				}

				public void setMonitorTimeout(Long monitorTimeout) {
					this.monitorTimeout = monitorTimeout;
				}

				public Integer getRedirection() {
					return this.redirection;
				}

				public void setRedirection(Integer redirection) {
					this.redirection = redirection;
				}

				public Long getTransmissionSize() {
					return this.transmissionSize;
				}

				public void setTransmissionSize(Long transmissionSize) {
					this.transmissionSize = transmissionSize;
				}

				public Integer getIgnoreCertificateCanceledError() {
					return this.ignoreCertificateCanceledError;
				}

				public void setIgnoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
					this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
				}

				public Integer getIgnoreCertificateAuthError() {
					return this.ignoreCertificateAuthError;
				}

				public void setIgnoreCertificateAuthError(Integer ignoreCertificateAuthError) {
					this.ignoreCertificateAuthError = ignoreCertificateAuthError;
				}

				public Integer getIgnoreCertificateOutOfDateError() {
					return this.ignoreCertificateOutOfDateError;
				}

				public void setIgnoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
					this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
				}

				public Integer getIgnoreCertificateUsingError() {
					return this.ignoreCertificateUsingError;
				}

				public void setIgnoreCertificateUsingError(Integer ignoreCertificateUsingError) {
					this.ignoreCertificateUsingError = ignoreCertificateUsingError;
				}

				public Integer getVerifyWay() {
					return this.verifyWay;
				}

				public void setVerifyWay(Integer verifyWay) {
					this.verifyWay = verifyWay;
				}

				public String getValidateKeywords() {
					return this.validateKeywords;
				}

				public void setValidateKeywords(String validateKeywords) {
					this.validateKeywords = validateKeywords;
				}

				public String getWhiteList() {
					return this.whiteList;
				}

				public void setWhiteList(String whiteList) {
					this.whiteList = whiteList;
				}
			}

			public static class Website {

				private String targetUrl;

				private Integer automaticScrolling;

				private Integer customHeader;

				private Map<Object,Object> customHeaderContent;

				private Integer disableCache;

				private Integer disableCompression;

				private Integer filterInvalidIP;

				private Integer ignoreCertificateError;

				private Integer monitorTimeout;

				private Integer redirection;

				private Long slowElementThreshold;

				private Long waitCompletionTime;

				private String verifyStringBlacklist;

				private String verifyStringWhitelist;

				private String elementBlacklist;

				private String dNSHijackWhitelist;

				private String pageTamper;

				private Integer flowHijackJumpTimes;

				private String flowHijackLogo;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public Integer getAutomaticScrolling() {
					return this.automaticScrolling;
				}

				public void setAutomaticScrolling(Integer automaticScrolling) {
					this.automaticScrolling = automaticScrolling;
				}

				public Integer getCustomHeader() {
					return this.customHeader;
				}

				public void setCustomHeader(Integer customHeader) {
					this.customHeader = customHeader;
				}

				public Map<Object,Object> getCustomHeaderContent() {
					return this.customHeaderContent;
				}

				public void setCustomHeaderContent(Map<Object,Object> customHeaderContent) {
					this.customHeaderContent = customHeaderContent;
				}

				public Integer getDisableCache() {
					return this.disableCache;
				}

				public void setDisableCache(Integer disableCache) {
					this.disableCache = disableCache;
				}

				public Integer getDisableCompression() {
					return this.disableCompression;
				}

				public void setDisableCompression(Integer disableCompression) {
					this.disableCompression = disableCompression;
				}

				public Integer getFilterInvalidIP() {
					return this.filterInvalidIP;
				}

				public void setFilterInvalidIP(Integer filterInvalidIP) {
					this.filterInvalidIP = filterInvalidIP;
				}

				public Integer getIgnoreCertificateError() {
					return this.ignoreCertificateError;
				}

				public void setIgnoreCertificateError(Integer ignoreCertificateError) {
					this.ignoreCertificateError = ignoreCertificateError;
				}

				public Integer getMonitorTimeout() {
					return this.monitorTimeout;
				}

				public void setMonitorTimeout(Integer monitorTimeout) {
					this.monitorTimeout = monitorTimeout;
				}

				public Integer getRedirection() {
					return this.redirection;
				}

				public void setRedirection(Integer redirection) {
					this.redirection = redirection;
				}

				public Long getSlowElementThreshold() {
					return this.slowElementThreshold;
				}

				public void setSlowElementThreshold(Long slowElementThreshold) {
					this.slowElementThreshold = slowElementThreshold;
				}

				public Long getWaitCompletionTime() {
					return this.waitCompletionTime;
				}

				public void setWaitCompletionTime(Long waitCompletionTime) {
					this.waitCompletionTime = waitCompletionTime;
				}

				public String getVerifyStringBlacklist() {
					return this.verifyStringBlacklist;
				}

				public void setVerifyStringBlacklist(String verifyStringBlacklist) {
					this.verifyStringBlacklist = verifyStringBlacklist;
				}

				public String getVerifyStringWhitelist() {
					return this.verifyStringWhitelist;
				}

				public void setVerifyStringWhitelist(String verifyStringWhitelist) {
					this.verifyStringWhitelist = verifyStringWhitelist;
				}

				public String getElementBlacklist() {
					return this.elementBlacklist;
				}

				public void setElementBlacklist(String elementBlacklist) {
					this.elementBlacklist = elementBlacklist;
				}

				public String getDNSHijackWhitelist() {
					return this.dNSHijackWhitelist;
				}

				public void setDNSHijackWhitelist(String dNSHijackWhitelist) {
					this.dNSHijackWhitelist = dNSHijackWhitelist;
				}

				public String getPageTamper() {
					return this.pageTamper;
				}

				public void setPageTamper(String pageTamper) {
					this.pageTamper = pageTamper;
				}

				public Integer getFlowHijackJumpTimes() {
					return this.flowHijackJumpTimes;
				}

				public void setFlowHijackJumpTimes(Integer flowHijackJumpTimes) {
					this.flowHijackJumpTimes = flowHijackJumpTimes;
				}

				public String getFlowHijackLogo() {
					return this.flowHijackLogo;
				}

				public void setFlowHijackLogo(String flowHijackLogo) {
					this.flowHijackLogo = flowHijackLogo;
				}
			}

			public static class Stream {

				private String targetUrl;

				private Integer streamType;

				private Integer streamMonitorTimeout;

				private Integer streamAddressType;

				private Integer playerType;

				private Map<Object,Object> customHeaderContent;

				private String whiteList;

				public String getTargetUrl() {
					return this.targetUrl;
				}

				public void setTargetUrl(String targetUrl) {
					this.targetUrl = targetUrl;
				}

				public Integer getStreamType() {
					return this.streamType;
				}

				public void setStreamType(Integer streamType) {
					this.streamType = streamType;
				}

				public Integer getStreamMonitorTimeout() {
					return this.streamMonitorTimeout;
				}

				public void setStreamMonitorTimeout(Integer streamMonitorTimeout) {
					this.streamMonitorTimeout = streamMonitorTimeout;
				}

				public Integer getStreamAddressType() {
					return this.streamAddressType;
				}

				public void setStreamAddressType(Integer streamAddressType) {
					this.streamAddressType = streamAddressType;
				}

				public Integer getPlayerType() {
					return this.playerType;
				}

				public void setPlayerType(Integer playerType) {
					this.playerType = playerType;
				}

				public Map<Object,Object> getCustomHeaderContent() {
					return this.customHeaderContent;
				}

				public void setCustomHeaderContent(Map<Object,Object> customHeaderContent) {
					this.customHeaderContent = customHeaderContent;
				}

				public String getWhiteList() {
					return this.whiteList;
				}

				public void setWhiteList(String whiteList) {
					this.whiteList = whiteList;
				}
			}
		}

		public static class CustomPeriod {

			private Long endHour;

			private Long startHour;

			public Long getEndHour() {
				return this.endHour;
			}

			public void setEndHour(Long endHour) {
				this.endHour = endHour;
			}

			public Long getStartHour() {
				return this.startHour;
			}

			public void setStartHour(Long startHour) {
				this.startHour = startHour;
			}
		}

		public static class CommonSetting {

			private Integer ipType;

			private Integer monitorSamples;

			private Boolean isOpenTrace;

			private Integer traceClientType;

			private String xtraceRegion;

			private CustomHost customHost;

			private CustomVPCSetting customVPCSetting;

			private CustomPrometheusSetting customPrometheusSetting;

			public Integer getIpType() {
				return this.ipType;
			}

			public void setIpType(Integer ipType) {
				this.ipType = ipType;
			}

			public Integer getMonitorSamples() {
				return this.monitorSamples;
			}

			public void setMonitorSamples(Integer monitorSamples) {
				this.monitorSamples = monitorSamples;
			}

			public Boolean getIsOpenTrace() {
				return this.isOpenTrace;
			}

			public void setIsOpenTrace(Boolean isOpenTrace) {
				this.isOpenTrace = isOpenTrace;
			}

			public Integer getTraceClientType() {
				return this.traceClientType;
			}

			public void setTraceClientType(Integer traceClientType) {
				this.traceClientType = traceClientType;
			}

			public String getXtraceRegion() {
				return this.xtraceRegion;
			}

			public void setXtraceRegion(String xtraceRegion) {
				this.xtraceRegion = xtraceRegion;
			}

			public CustomHost getCustomHost() {
				return this.customHost;
			}

			public void setCustomHost(CustomHost customHost) {
				this.customHost = customHost;
			}

			public CustomVPCSetting getCustomVPCSetting() {
				return this.customVPCSetting;
			}

			public void setCustomVPCSetting(CustomVPCSetting customVPCSetting) {
				this.customVPCSetting = customVPCSetting;
			}

			public CustomPrometheusSetting getCustomPrometheusSetting() {
				return this.customPrometheusSetting;
			}

			public void setCustomPrometheusSetting(CustomPrometheusSetting customPrometheusSetting) {
				this.customPrometheusSetting = customPrometheusSetting;
			}

			public static class CustomHost {

				private Integer selectType;

				private List<Host> hosts;

				public Integer getSelectType() {
					return this.selectType;
				}

				public void setSelectType(Integer selectType) {
					this.selectType = selectType;
				}

				public List<Host> getHosts() {
					return this.hosts;
				}

				public void setHosts(List<Host> hosts) {
					this.hosts = hosts;
				}

				public static class Host {

					private String domain;

					private Integer ipType;

					private List<String> ips;

					public String getDomain() {
						return this.domain;
					}

					public void setDomain(String domain) {
						this.domain = domain;
					}

					public Integer getIpType() {
						return this.ipType;
					}

					public void setIpType(Integer ipType) {
						this.ipType = ipType;
					}

					public List<String> getIps() {
						return this.ips;
					}

					public void setIps(List<String> ips) {
						this.ips = ips;
					}
				}
			}

			public static class CustomVPCSetting {

				private String regionId;

				private String vpcId;

				private String vSwitchId;

				private String secureGroupId;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

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

				public String getSecureGroupId() {
					return this.secureGroupId;
				}

				public void setSecureGroupId(String secureGroupId) {
					this.secureGroupId = secureGroupId;
				}
			}

			public static class CustomPrometheusSetting {

				private Map<Object,Object> prometheusLabels;

				private String prometheusClusterId;

				private String prometheusClusterRegion;

				public Map<Object,Object> getPrometheusLabels() {
					return this.prometheusLabels;
				}

				public void setPrometheusLabels(Map<Object,Object> prometheusLabels) {
					this.prometheusLabels = prometheusLabels;
				}

				public String getPrometheusClusterId() {
					return this.prometheusClusterId;
				}

				public void setPrometheusClusterId(String prometheusClusterId) {
					this.prometheusClusterId = prometheusClusterId;
				}

				public String getPrometheusClusterRegion() {
					return this.prometheusClusterRegion;
				}

				public void setPrometheusClusterRegion(String prometheusClusterRegion) {
					this.prometheusClusterRegion = prometheusClusterRegion;
				}
			}
		}
	}

	@Override
	public GetTimingSyntheticTaskResponse getInstance(UnmarshallerContext context) {
		return	GetTimingSyntheticTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
