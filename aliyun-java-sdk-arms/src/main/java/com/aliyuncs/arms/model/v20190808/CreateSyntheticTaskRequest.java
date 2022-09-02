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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSyntheticTaskRequest extends RpcAcsRequest<CreateSyntheticTaskResponse> {
	   

	private Long taskType;

	private String intervalType;

	private Boolean updateTask;

	private String taskName;

	@SerializedName("monitorList")
	private List<MonitorList> monitorList;

	private Long ipType;

	private String url;

	private String intervalTime;

	@SerializedName("commonParam")
	private CommonParam commonParam;

	@SerializedName("extendInterval")
	private ExtendInterval extendInterval;

	@SerializedName("navigation")
	private Navigation navigation;

	@SerializedName("download")
	private Download download;

	@SerializedName("protocol")
	private Protocol protocol;

	@SerializedName("net")
	private Net net;
	public CreateSyntheticTaskRequest() {
		super("ARMS", "2019-08-08", "CreateSyntheticTask", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTaskType() {
		return this.taskType;
	}

	public void setTaskType(Long taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType.toString());
		}
	}

	public String getIntervalType() {
		return this.intervalType;
	}

	public void setIntervalType(String intervalType) {
		this.intervalType = intervalType;
		if(intervalType != null){
			putQueryParameter("IntervalType", intervalType);
		}
	}

	public Boolean getUpdateTask() {
		return this.updateTask;
	}

	public void setUpdateTask(Boolean updateTask) {
		this.updateTask = updateTask;
		if(updateTask != null){
			putQueryParameter("UpdateTask", updateTask.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public List<MonitorList> getMonitorList() {
		return this.monitorList;
	}

	public void setMonitorList(List<MonitorList> monitorList) {
		this.monitorList = monitorList;	
		if (monitorList != null) {
			putQueryParameter("MonitorList" , new Gson().toJson(monitorList));
		}	
	}

	public Long getIpType() {
		return this.ipType;
	}

	public void setIpType(Long ipType) {
		this.ipType = ipType;
		if(ipType != null){
			putQueryParameter("IpType", ipType.toString());
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	public String getIntervalTime() {
		return this.intervalTime;
	}

	public void setIntervalTime(String intervalTime) {
		this.intervalTime = intervalTime;
		if(intervalTime != null){
			putQueryParameter("IntervalTime", intervalTime);
		}
	}

	public CommonParam getCommonParam() {
		return this.commonParam;
	}

	public void setCommonParam(CommonParam commonParam) {
		this.commonParam = commonParam;	
		if (commonParam != null) {
			putQueryParameter("CommonParam" , new Gson().toJson(commonParam));
		}	
	}

	public ExtendInterval getExtendInterval() {
		return this.extendInterval;
	}

	public void setExtendInterval(ExtendInterval extendInterval) {
		this.extendInterval = extendInterval;	
		if (extendInterval != null) {
			putQueryParameter("ExtendInterval" , new Gson().toJson(extendInterval));
		}	
	}

	public Navigation getNavigation() {
		return this.navigation;
	}

	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;	
		if (navigation != null) {
			putQueryParameter("Navigation" , new Gson().toJson(navigation));
		}	
	}

	public Download getDownload() {
		return this.download;
	}

	public void setDownload(Download download) {
		this.download = download;	
		if (download != null) {
			putQueryParameter("Download" , new Gson().toJson(download));
		}	
	}

	public Protocol getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(Protocol protocol) {
		this.protocol = protocol;	
		if (protocol != null) {
			putQueryParameter("Protocol" , new Gson().toJson(protocol));
		}	
	}

	public Net getNet() {
		return this.net;
	}

	public void setNet(Net net) {
		this.net = net;	
		if (net != null) {
			putQueryParameter("Net" , new Gson().toJson(net));
		}	
	}

	public static class MonitorList {

		@SerializedName("NetServiceId")
		private Long netServiceId;

		@SerializedName("MonitorType")
		private Long monitorType;

		@SerializedName("CityCode")
		private Long cityCode;

		public Long getNetServiceId() {
			return this.netServiceId;
		}

		public void setNetServiceId(Long netServiceId) {
			this.netServiceId = netServiceId;
		}

		public Long getMonitorType() {
			return this.monitorType;
		}

		public void setMonitorType(Long monitorType) {
			this.monitorType = monitorType;
		}

		public Long getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(Long cityCode) {
			this.cityCode = cityCode;
		}
	}

	public static class CommonParam {

		@SerializedName("AlertNotifierId")
		private String alertNotifierId;

		@SerializedName("AlertPolicyId")
		private String alertPolicyId;

		@SerializedName("AlertList")
		private List<AlertListItem> alertList;

		@SerializedName("AlarmFlag")
		private String alarmFlag;

		@SerializedName("StartExecutionTime")
		private Long startExecutionTime;

		@SerializedName("MonitorSamples")
		private Long monitorSamples;

		public String getAlertNotifierId() {
			return this.alertNotifierId;
		}

		public void setAlertNotifierId(String alertNotifierId) {
			this.alertNotifierId = alertNotifierId;
		}

		public String getAlertPolicyId() {
			return this.alertPolicyId;
		}

		public void setAlertPolicyId(String alertPolicyId) {
			this.alertPolicyId = alertPolicyId;
		}

		public List<AlertListItem> getAlertList() {
			return this.alertList;
		}

		public void setAlertList(List<AlertListItem> alertList) {
			this.alertList = alertList;
		}

		public String getAlarmFlag() {
			return this.alarmFlag;
		}

		public void setAlarmFlag(String alarmFlag) {
			this.alarmFlag = alarmFlag;
		}

		public Long getStartExecutionTime() {
			return this.startExecutionTime;
		}

		public void setStartExecutionTime(Long startExecutionTime) {
			this.startExecutionTime = startExecutionTime;
		}

		public Long getMonitorSamples() {
			return this.monitorSamples;
		}

		public void setMonitorSamples(Long monitorSamples) {
			this.monitorSamples = monitorSamples;
		}

		public static class AlertListItem {

			@SerializedName("IsCritical")
			private Long isCritical;

			@SerializedName("Name")
			private String name;

			@SerializedName("SeriousAlert")
			private String seriousAlert;

			@SerializedName("GeneralAlert")
			private String generalAlert;

			@SerializedName("Symbols")
			private Long symbols;

			public Long getIsCritical() {
				return this.isCritical;
			}

			public void setIsCritical(Long isCritical) {
				this.isCritical = isCritical;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSeriousAlert() {
				return this.seriousAlert;
			}

			public void setSeriousAlert(String seriousAlert) {
				this.seriousAlert = seriousAlert;
			}

			public String getGeneralAlert() {
				return this.generalAlert;
			}

			public void setGeneralAlert(String generalAlert) {
				this.generalAlert = generalAlert;
			}

			public Long getSymbols() {
				return this.symbols;
			}

			public void setSymbols(Long symbols) {
				this.symbols = symbols;
			}
		}
	}

	public static class ExtendInterval {

		@SerializedName("StartMinute")
		private Long startMinute;

		@SerializedName("EndHour")
		private Long endHour;

		@SerializedName("EndMinute")
		private Long endMinute;

		@SerializedName("StartHour")
		private Long startHour;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("Days")
		private List<Long> days;

		@SerializedName("StartTime")
		private String startTime;

		public Long getStartMinute() {
			return this.startMinute;
		}

		public void setStartMinute(Long startMinute) {
			this.startMinute = startMinute;
		}

		public Long getEndHour() {
			return this.endHour;
		}

		public void setEndHour(Long endHour) {
			this.endHour = endHour;
		}

		public Long getEndMinute() {
			return this.endMinute;
		}

		public void setEndMinute(Long endMinute) {
			this.endMinute = endMinute;
		}

		public Long getStartHour() {
			return this.startHour;
		}

		public void setStartHour(Long startHour) {
			this.startHour = startHour;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public List<Long> getDays() {
			return this.days;
		}

		public void setDays(List<Long> days) {
			this.days = days;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	public static class Navigation {

		@SerializedName("ExecuteActiveX")
		private Long executeActiveX;

		@SerializedName("NavCustomHostIp")
		private String navCustomHostIp;

		@SerializedName("NavReturnElement")
		private Long navReturnElement;

		@SerializedName("QUICVersion")
		private Long qUICVersion;

		@SerializedName("SlowElementThreshold")
		private Double slowElementThreshold;

		@SerializedName("WaitCompletionTime")
		private Double waitCompletionTime;

		@SerializedName("QUICDomain")
		private String qUICDomain;

		@SerializedName("NavCustomHeaderContent")
		private String navCustomHeaderContent;

		@SerializedName("ResponseHeader")
		private Long responseHeader;

		@SerializedName("VerifyStringWhiteList")
		private String verifyStringWhiteList;

		@SerializedName("MonitorTimeout")
		private String monitorTimeout;

		@SerializedName("FilterInvalidIP")
		private Long filterInvalidIP;

		@SerializedName("FlowHijackLogo")
		private String flowHijackLogo;

		@SerializedName("NavDisableCache")
		private Long navDisableCache;

		@SerializedName("ElementBlacklist")
		private String elementBlacklist;

		@SerializedName("FlowHijackJumpTimes")
		private Long flowHijackJumpTimes;

		@SerializedName("ExecuteScript")
		private Long executeScript;

		@SerializedName("NavDisableCompression")
		private String navDisableCompression;

		@SerializedName("DNSHijackWhiteList")
		private String dNSHijackWhiteList;

		@SerializedName("ProcessName")
		private String processName;

		@SerializedName("VerifyStringBlacklist")
		private String verifyStringBlacklist;

		@SerializedName("NavAutomaticScrolling")
		private String navAutomaticScrolling;

		@SerializedName("NavRedirection")
		private Long navRedirection;

		@SerializedName("NavCustomHeader")
		private String navCustomHeader;

		@SerializedName("ExecuteApplication")
		private Long executeApplication;

		@SerializedName("NavCustomHost")
		private Long navCustomHost;

		@SerializedName("NavIgnoreCertificateError")
		private Long navIgnoreCertificateError;

		@SerializedName("PageTamper")
		private String pageTamper;

		@SerializedName("RequestHeader")
		private Long requestHeader;

		public Long getExecuteActiveX() {
			return this.executeActiveX;
		}

		public void setExecuteActiveX(Long executeActiveX) {
			this.executeActiveX = executeActiveX;
		}

		public String getNavCustomHostIp() {
			return this.navCustomHostIp;
		}

		public void setNavCustomHostIp(String navCustomHostIp) {
			this.navCustomHostIp = navCustomHostIp;
		}

		public Long getNavReturnElement() {
			return this.navReturnElement;
		}

		public void setNavReturnElement(Long navReturnElement) {
			this.navReturnElement = navReturnElement;
		}

		public Long getQUICVersion() {
			return this.qUICVersion;
		}

		public void setQUICVersion(Long qUICVersion) {
			this.qUICVersion = qUICVersion;
		}

		public Double getSlowElementThreshold() {
			return this.slowElementThreshold;
		}

		public void setSlowElementThreshold(Double slowElementThreshold) {
			this.slowElementThreshold = slowElementThreshold;
		}

		public Double getWaitCompletionTime() {
			return this.waitCompletionTime;
		}

		public void setWaitCompletionTime(Double waitCompletionTime) {
			this.waitCompletionTime = waitCompletionTime;
		}

		public String getQUICDomain() {
			return this.qUICDomain;
		}

		public void setQUICDomain(String qUICDomain) {
			this.qUICDomain = qUICDomain;
		}

		public String getNavCustomHeaderContent() {
			return this.navCustomHeaderContent;
		}

		public void setNavCustomHeaderContent(String navCustomHeaderContent) {
			this.navCustomHeaderContent = navCustomHeaderContent;
		}

		public Long getResponseHeader() {
			return this.responseHeader;
		}

		public void setResponseHeader(Long responseHeader) {
			this.responseHeader = responseHeader;
		}

		public String getVerifyStringWhiteList() {
			return this.verifyStringWhiteList;
		}

		public void setVerifyStringWhiteList(String verifyStringWhiteList) {
			this.verifyStringWhiteList = verifyStringWhiteList;
		}

		public String getMonitorTimeout() {
			return this.monitorTimeout;
		}

		public void setMonitorTimeout(String monitorTimeout) {
			this.monitorTimeout = monitorTimeout;
		}

		public Long getFilterInvalidIP() {
			return this.filterInvalidIP;
		}

		public void setFilterInvalidIP(Long filterInvalidIP) {
			this.filterInvalidIP = filterInvalidIP;
		}

		public String getFlowHijackLogo() {
			return this.flowHijackLogo;
		}

		public void setFlowHijackLogo(String flowHijackLogo) {
			this.flowHijackLogo = flowHijackLogo;
		}

		public Long getNavDisableCache() {
			return this.navDisableCache;
		}

		public void setNavDisableCache(Long navDisableCache) {
			this.navDisableCache = navDisableCache;
		}

		public String getElementBlacklist() {
			return this.elementBlacklist;
		}

		public void setElementBlacklist(String elementBlacklist) {
			this.elementBlacklist = elementBlacklist;
		}

		public Long getFlowHijackJumpTimes() {
			return this.flowHijackJumpTimes;
		}

		public void setFlowHijackJumpTimes(Long flowHijackJumpTimes) {
			this.flowHijackJumpTimes = flowHijackJumpTimes;
		}

		public Long getExecuteScript() {
			return this.executeScript;
		}

		public void setExecuteScript(Long executeScript) {
			this.executeScript = executeScript;
		}

		public String getNavDisableCompression() {
			return this.navDisableCompression;
		}

		public void setNavDisableCompression(String navDisableCompression) {
			this.navDisableCompression = navDisableCompression;
		}

		public String getDNSHijackWhiteList() {
			return this.dNSHijackWhiteList;
		}

		public void setDNSHijackWhiteList(String dNSHijackWhiteList) {
			this.dNSHijackWhiteList = dNSHijackWhiteList;
		}

		public String getProcessName() {
			return this.processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getVerifyStringBlacklist() {
			return this.verifyStringBlacklist;
		}

		public void setVerifyStringBlacklist(String verifyStringBlacklist) {
			this.verifyStringBlacklist = verifyStringBlacklist;
		}

		public String getNavAutomaticScrolling() {
			return this.navAutomaticScrolling;
		}

		public void setNavAutomaticScrolling(String navAutomaticScrolling) {
			this.navAutomaticScrolling = navAutomaticScrolling;
		}

		public Long getNavRedirection() {
			return this.navRedirection;
		}

		public void setNavRedirection(Long navRedirection) {
			this.navRedirection = navRedirection;
		}

		public String getNavCustomHeader() {
			return this.navCustomHeader;
		}

		public void setNavCustomHeader(String navCustomHeader) {
			this.navCustomHeader = navCustomHeader;
		}

		public Long getExecuteApplication() {
			return this.executeApplication;
		}

		public void setExecuteApplication(Long executeApplication) {
			this.executeApplication = executeApplication;
		}

		public Long getNavCustomHost() {
			return this.navCustomHost;
		}

		public void setNavCustomHost(Long navCustomHost) {
			this.navCustomHost = navCustomHost;
		}

		public Long getNavIgnoreCertificateError() {
			return this.navIgnoreCertificateError;
		}

		public void setNavIgnoreCertificateError(Long navIgnoreCertificateError) {
			this.navIgnoreCertificateError = navIgnoreCertificateError;
		}

		public String getPageTamper() {
			return this.pageTamper;
		}

		public void setPageTamper(String pageTamper) {
			this.pageTamper = pageTamper;
		}

		public Long getRequestHeader() {
			return this.requestHeader;
		}

		public void setRequestHeader(Long requestHeader) {
			this.requestHeader = requestHeader;
		}
	}

	public static class Download {

		@SerializedName("DownloadIgnoreCertificateError")
		private String downloadIgnoreCertificateError;

		@SerializedName("DownloadCustomHost")
		private Long downloadCustomHost;

		@SerializedName("ConnectionTimeout")
		private Double connectionTimeout;

		@SerializedName("DownloadKernel")
		private Long downloadKernel;

		@SerializedName("WhiteList")
		private String whiteList;

		@SerializedName("DownloadRedirection")
		private Long downloadRedirection;

		@SerializedName("MonitorTimeout")
		private Long monitorTimeout;

		@SerializedName("ValidateKeywords")
		private String validateKeywords;

		@SerializedName("DownloadTransmissionSize")
		private Long downloadTransmissionSize;

		@SerializedName("QuickProtocol")
		private String quickProtocol;

		@SerializedName("DownloadCustomHeaderContent")
		private String downloadCustomHeaderContent;

		@SerializedName("VerifyWay")
		private Long verifyWay;

		@SerializedName("DownloadCustomHostIp")
		private String downloadCustomHostIp;

		public String getDownloadIgnoreCertificateError() {
			return this.downloadIgnoreCertificateError;
		}

		public void setDownloadIgnoreCertificateError(String downloadIgnoreCertificateError) {
			this.downloadIgnoreCertificateError = downloadIgnoreCertificateError;
		}

		public Long getDownloadCustomHost() {
			return this.downloadCustomHost;
		}

		public void setDownloadCustomHost(Long downloadCustomHost) {
			this.downloadCustomHost = downloadCustomHost;
		}

		public Double getConnectionTimeout() {
			return this.connectionTimeout;
		}

		public void setConnectionTimeout(Double connectionTimeout) {
			this.connectionTimeout = connectionTimeout;
		}

		public Long getDownloadKernel() {
			return this.downloadKernel;
		}

		public void setDownloadKernel(Long downloadKernel) {
			this.downloadKernel = downloadKernel;
		}

		public String getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(String whiteList) {
			this.whiteList = whiteList;
		}

		public Long getDownloadRedirection() {
			return this.downloadRedirection;
		}

		public void setDownloadRedirection(Long downloadRedirection) {
			this.downloadRedirection = downloadRedirection;
		}

		public Long getMonitorTimeout() {
			return this.monitorTimeout;
		}

		public void setMonitorTimeout(Long monitorTimeout) {
			this.monitorTimeout = monitorTimeout;
		}

		public String getValidateKeywords() {
			return this.validateKeywords;
		}

		public void setValidateKeywords(String validateKeywords) {
			this.validateKeywords = validateKeywords;
		}

		public Long getDownloadTransmissionSize() {
			return this.downloadTransmissionSize;
		}

		public void setDownloadTransmissionSize(Long downloadTransmissionSize) {
			this.downloadTransmissionSize = downloadTransmissionSize;
		}

		public String getQuickProtocol() {
			return this.quickProtocol;
		}

		public void setQuickProtocol(String quickProtocol) {
			this.quickProtocol = quickProtocol;
		}

		public String getDownloadCustomHeaderContent() {
			return this.downloadCustomHeaderContent;
		}

		public void setDownloadCustomHeaderContent(String downloadCustomHeaderContent) {
			this.downloadCustomHeaderContent = downloadCustomHeaderContent;
		}

		public Long getVerifyWay() {
			return this.verifyWay;
		}

		public void setVerifyWay(Long verifyWay) {
			this.verifyWay = verifyWay;
		}

		public String getDownloadCustomHostIp() {
			return this.downloadCustomHostIp;
		}

		public void setDownloadCustomHostIp(String downloadCustomHostIp) {
			this.downloadCustomHostIp = downloadCustomHostIp;
		}
	}

	public static class Protocol {

		@SerializedName("ReceivedDataSize")
		private Long receivedDataSize;

		@SerializedName("ProtocolMonitorTimeout")
		private String protocolMonitorTimeout;

		@SerializedName("RequestContent")
		private RequestContent requestContent;

		@SerializedName("ProtocolConnectionTime")
		private Long protocolConnectionTime;

		@SerializedName("CharacterEncoding")
		private Long characterEncoding;

		@SerializedName("VerifyContent")
		private String verifyContent;

		@SerializedName("CustomHost")
		private Long customHost;

		@SerializedName("ProtocolConnectionTimeout")
		private Double protocolConnectionTimeout;

		@SerializedName("CustomHostIp")
		private String customHostIp;

		@SerializedName("VerifyWay")
		private Long verifyWay;

		public Long getReceivedDataSize() {
			return this.receivedDataSize;
		}

		public void setReceivedDataSize(Long receivedDataSize) {
			this.receivedDataSize = receivedDataSize;
		}

		public String getProtocolMonitorTimeout() {
			return this.protocolMonitorTimeout;
		}

		public void setProtocolMonitorTimeout(String protocolMonitorTimeout) {
			this.protocolMonitorTimeout = protocolMonitorTimeout;
		}

		public RequestContent getRequestContent() {
			return this.requestContent;
		}

		public void setRequestContent(RequestContent requestContent) {
			this.requestContent = requestContent;
		}

		public Long getProtocolConnectionTime() {
			return this.protocolConnectionTime;
		}

		public void setProtocolConnectionTime(Long protocolConnectionTime) {
			this.protocolConnectionTime = protocolConnectionTime;
		}

		public Long getCharacterEncoding() {
			return this.characterEncoding;
		}

		public void setCharacterEncoding(Long characterEncoding) {
			this.characterEncoding = characterEncoding;
		}

		public String getVerifyContent() {
			return this.verifyContent;
		}

		public void setVerifyContent(String verifyContent) {
			this.verifyContent = verifyContent;
		}

		public Long getCustomHost() {
			return this.customHost;
		}

		public void setCustomHost(Long customHost) {
			this.customHost = customHost;
		}

		public Double getProtocolConnectionTimeout() {
			return this.protocolConnectionTimeout;
		}

		public void setProtocolConnectionTimeout(Double protocolConnectionTimeout) {
			this.protocolConnectionTimeout = protocolConnectionTimeout;
		}

		public String getCustomHostIp() {
			return this.customHostIp;
		}

		public void setCustomHostIp(String customHostIp) {
			this.customHostIp = customHostIp;
		}

		public Long getVerifyWay() {
			return this.verifyWay;
		}

		public void setVerifyWay(Long verifyWay) {
			this.verifyWay = verifyWay;
		}

		public static class RequestContent {

			@SerializedName("Method")
			private String method;

			@SerializedName("Header")
			private List<HeaderItem> header;

			@SerializedName("Body")
			private Body body;

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public List<HeaderItem> getHeader() {
				return this.header;
			}

			public void setHeader(List<HeaderItem> header) {
				this.header = header;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public static class HeaderItem {

				@SerializedName("Value")
				private String value;

				@SerializedName("Key")
				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}

			public static class Body {

				@SerializedName("Mode")
				private String mode;

				@SerializedName("Raw")
				private String raw;

				@SerializedName("UrlEncoding")
				private List<UrlEncodingItem> urlEncoding;

				@SerializedName("Language")
				private String language;

				@SerializedName("FormData")
				private List<FormDataItem> formData;

				public String getMode() {
					return this.mode;
				}

				public void setMode(String mode) {
					this.mode = mode;
				}

				public String getRaw() {
					return this.raw;
				}

				public void setRaw(String raw) {
					this.raw = raw;
				}

				public List<UrlEncodingItem> getUrlEncoding() {
					return this.urlEncoding;
				}

				public void setUrlEncoding(List<UrlEncodingItem> urlEncoding) {
					this.urlEncoding = urlEncoding;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public List<FormDataItem> getFormData() {
					return this.formData;
				}

				public void setFormData(List<FormDataItem> formData) {
					this.formData = formData;
				}

				public static class UrlEncodingItem {

					@SerializedName("Value")
					private String value;

					@SerializedName("Key")
					private String key;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}

				public static class FormDataItem {

					@SerializedName("Value")
					private String value;

					@SerializedName("Key")
					private String key;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}
				}
			}
		}
	}

	public static class Net {

		@SerializedName("NetICMPTimeout")
		private Long netICMPTimeout;

		@SerializedName("NetTraceRouteTimeout")
		private Long netTraceRouteTimeout;

		@SerializedName("NetICMPActive")
		private Long netICMPActive;

		@SerializedName("NetICMPDataCut")
		private Long netICMPDataCut;

		@SerializedName("NetICMPNum")
		private Long netICMPNum;

		@SerializedName("NetDNSTimeout")
		private Long netDNSTimeout;

		@SerializedName("NetDNSQueryMethod")
		private Long netDNSQueryMethod;

		@SerializedName("WhiteList")
		private String whiteList;

		@SerializedName("NetDNSNs")
		private String netDNSNs;

		@SerializedName("NetDNSServer")
		private Long netDNSServer;

		@SerializedName("NetTraceRouteSwitch")
		private Long netTraceRouteSwitch;

		@SerializedName("NetDigSwitch")
		private Long netDigSwitch;

		@SerializedName("NetICMPInterval")
		private Long netICMPInterval;

		@SerializedName("NetDNSSwitch")
		private Long netDNSSwitch;

		@SerializedName("NetTraceRouteNum")
		private Long netTraceRouteNum;

		@SerializedName("NetICMPSwitch")
		private Long netICMPSwitch;

		@SerializedName("NetICMPSize")
		private Long netICMPSize;

		public Long getNetICMPTimeout() {
			return this.netICMPTimeout;
		}

		public void setNetICMPTimeout(Long netICMPTimeout) {
			this.netICMPTimeout = netICMPTimeout;
		}

		public Long getNetTraceRouteTimeout() {
			return this.netTraceRouteTimeout;
		}

		public void setNetTraceRouteTimeout(Long netTraceRouteTimeout) {
			this.netTraceRouteTimeout = netTraceRouteTimeout;
		}

		public Long getNetICMPActive() {
			return this.netICMPActive;
		}

		public void setNetICMPActive(Long netICMPActive) {
			this.netICMPActive = netICMPActive;
		}

		public Long getNetICMPDataCut() {
			return this.netICMPDataCut;
		}

		public void setNetICMPDataCut(Long netICMPDataCut) {
			this.netICMPDataCut = netICMPDataCut;
		}

		public Long getNetICMPNum() {
			return this.netICMPNum;
		}

		public void setNetICMPNum(Long netICMPNum) {
			this.netICMPNum = netICMPNum;
		}

		public Long getNetDNSTimeout() {
			return this.netDNSTimeout;
		}

		public void setNetDNSTimeout(Long netDNSTimeout) {
			this.netDNSTimeout = netDNSTimeout;
		}

		public Long getNetDNSQueryMethod() {
			return this.netDNSQueryMethod;
		}

		public void setNetDNSQueryMethod(Long netDNSQueryMethod) {
			this.netDNSQueryMethod = netDNSQueryMethod;
		}

		public String getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(String whiteList) {
			this.whiteList = whiteList;
		}

		public String getNetDNSNs() {
			return this.netDNSNs;
		}

		public void setNetDNSNs(String netDNSNs) {
			this.netDNSNs = netDNSNs;
		}

		public Long getNetDNSServer() {
			return this.netDNSServer;
		}

		public void setNetDNSServer(Long netDNSServer) {
			this.netDNSServer = netDNSServer;
		}

		public Long getNetTraceRouteSwitch() {
			return this.netTraceRouteSwitch;
		}

		public void setNetTraceRouteSwitch(Long netTraceRouteSwitch) {
			this.netTraceRouteSwitch = netTraceRouteSwitch;
		}

		public Long getNetDigSwitch() {
			return this.netDigSwitch;
		}

		public void setNetDigSwitch(Long netDigSwitch) {
			this.netDigSwitch = netDigSwitch;
		}

		public Long getNetICMPInterval() {
			return this.netICMPInterval;
		}

		public void setNetICMPInterval(Long netICMPInterval) {
			this.netICMPInterval = netICMPInterval;
		}

		public Long getNetDNSSwitch() {
			return this.netDNSSwitch;
		}

		public void setNetDNSSwitch(Long netDNSSwitch) {
			this.netDNSSwitch = netDNSSwitch;
		}

		public Long getNetTraceRouteNum() {
			return this.netTraceRouteNum;
		}

		public void setNetTraceRouteNum(Long netTraceRouteNum) {
			this.netTraceRouteNum = netTraceRouteNum;
		}

		public Long getNetICMPSwitch() {
			return this.netICMPSwitch;
		}

		public void setNetICMPSwitch(Long netICMPSwitch) {
			this.netICMPSwitch = netICMPSwitch;
		}

		public Long getNetICMPSize() {
			return this.netICMPSize;
		}

		public void setNetICMPSize(Long netICMPSize) {
			this.netICMPSize = netICMPSize;
		}
	}

	@Override
	public Class<CreateSyntheticTaskResponse> getResponseClass() {
		return CreateSyntheticTaskResponse.class;
	}

}
