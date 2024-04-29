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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTimingSyntheticTaskRequest extends RpcAcsRequest<CreateTimingSyntheticTaskResponse> {
	   

	@SerializedName("availableAssertions")
	private List<AvailableAssertions> availableAssertions;

	private Integer taskType;

	@SerializedName("commonSetting")
	private CommonSetting commonSetting;

	private Integer monitorCategory;

	private String frequency;

	@SerializedName("tags")
	private List<Tags> tags;

	private String resourceGroupId;

	@SerializedName("monitorConf")
	private MonitorConf monitorConf;

	@SerializedName("customPeriod")
	private CustomPeriod customPeriod;

	private String name;

	@SerializedName("monitors")
	private List<Monitors> monitors;
	public CreateTimingSyntheticTaskRequest() {
		super("ARMS", "2019-08-08", "CreateTimingSyntheticTask", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AvailableAssertions> getAvailableAssertions() {
		return this.availableAssertions;
	}

	public void setAvailableAssertions(List<AvailableAssertions> availableAssertions) {
		this.availableAssertions = availableAssertions;	
		if (availableAssertions != null) {
			putQueryParameter("AvailableAssertions" , new Gson().toJson(availableAssertions));
		}	
	}

	public Integer getTaskType() {
		return this.taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType.toString());
		}
	}

	public CommonSetting getCommonSetting() {
		return this.commonSetting;
	}

	public void setCommonSetting(CommonSetting commonSetting) {
		this.commonSetting = commonSetting;	
		if (commonSetting != null) {
			putQueryParameter("CommonSetting" , new Gson().toJson(commonSetting));
		}	
	}

	public Integer getMonitorCategory() {
		return this.monitorCategory;
	}

	public void setMonitorCategory(Integer monitorCategory) {
		this.monitorCategory = monitorCategory;
		if(monitorCategory != null){
			putQueryParameter("MonitorCategory", monitorCategory.toString());
		}
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency);
		}
	}

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public MonitorConf getMonitorConf() {
		return this.monitorConf;
	}

	public void setMonitorConf(MonitorConf monitorConf) {
		this.monitorConf = monitorConf;	
		if (monitorConf != null) {
			putQueryParameter("MonitorConf" , new Gson().toJson(monitorConf));
		}	
	}

	public CustomPeriod getCustomPeriod() {
		return this.customPeriod;
	}

	public void setCustomPeriod(CustomPeriod customPeriod) {
		this.customPeriod = customPeriod;	
		if (customPeriod != null) {
			putQueryParameter("CustomPeriod" , new Gson().toJson(customPeriod));
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public List<Monitors> getMonitors() {
		return this.monitors;
	}

	public void setMonitors(List<Monitors> monitors) {
		this.monitors = monitors;	
		if (monitors != null) {
			putQueryParameter("Monitors" , new Gson().toJson(monitors));
		}	
	}

	public static class AvailableAssertions {

		@SerializedName("Expect")
		private String expect;

		@SerializedName("Type")
		private String type;

		@SerializedName("Operator")
		private String operator;

		@SerializedName("Target")
		private String target;

		public String getExpect() {
			return this.expect;
		}

		public void setExpect(String expect) {
			this.expect = expect;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}
	}

	public static class CommonSetting {

		@SerializedName("CustomPrometheusSetting")
		private CustomPrometheusSetting customPrometheusSetting;

		@SerializedName("CustomHost")
		private CustomHost customHost;

		@SerializedName("XtraceRegion")
		private String xtraceRegion;

		@SerializedName("IpType")
		private Integer ipType;

		@SerializedName("IsOpenTrace")
		private Boolean isOpenTrace;

		@SerializedName("TraceClientType")
		private Integer traceClientType;

		@SerializedName("CustomVPCSetting")
		private CustomVPCSetting customVPCSetting;

		@SerializedName("MonitorSamples")
		private Integer monitorSamples;

		public CustomPrometheusSetting getCustomPrometheusSetting() {
			return this.customPrometheusSetting;
		}

		public void setCustomPrometheusSetting(CustomPrometheusSetting customPrometheusSetting) {
			this.customPrometheusSetting = customPrometheusSetting;
		}

		public CustomHost getCustomHost() {
			return this.customHost;
		}

		public void setCustomHost(CustomHost customHost) {
			this.customHost = customHost;
		}

		public String getXtraceRegion() {
			return this.xtraceRegion;
		}

		public void setXtraceRegion(String xtraceRegion) {
			this.xtraceRegion = xtraceRegion;
		}

		public Integer getIpType() {
			return this.ipType;
		}

		public void setIpType(Integer ipType) {
			this.ipType = ipType;
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

		public CustomVPCSetting getCustomVPCSetting() {
			return this.customVPCSetting;
		}

		public void setCustomVPCSetting(CustomVPCSetting customVPCSetting) {
			this.customVPCSetting = customVPCSetting;
		}

		public Integer getMonitorSamples() {
			return this.monitorSamples;
		}

		public void setMonitorSamples(Integer monitorSamples) {
			this.monitorSamples = monitorSamples;
		}

		public static class CustomPrometheusSetting {

			@SerializedName("PrometheusLabels")
			private Map<String,String> prometheusLabels;

			@SerializedName("PrometheusClusterRegion")
			private String prometheusClusterRegion;

			@SerializedName("PrometheusClusterId")
			private String prometheusClusterId;

			public Map<String,String> getPrometheusLabels() {
				return this.prometheusLabels;
			}

			public void setPrometheusLabels(Map<String,String> prometheusLabels) {
				this.prometheusLabels = prometheusLabels;
			}

			public String getPrometheusClusterRegion() {
				return this.prometheusClusterRegion;
			}

			public void setPrometheusClusterRegion(String prometheusClusterRegion) {
				this.prometheusClusterRegion = prometheusClusterRegion;
			}

			public String getPrometheusClusterId() {
				return this.prometheusClusterId;
			}

			public void setPrometheusClusterId(String prometheusClusterId) {
				this.prometheusClusterId = prometheusClusterId;
			}
		}

		public static class CustomHost {

			@SerializedName("Hosts")
			private List<HostsItem> hosts;

			@SerializedName("SelectType")
			private Integer selectType;

			public List<HostsItem> getHosts() {
				return this.hosts;
			}

			public void setHosts(List<HostsItem> hosts) {
				this.hosts = hosts;
			}

			public Integer getSelectType() {
				return this.selectType;
			}

			public void setSelectType(Integer selectType) {
				this.selectType = selectType;
			}

			public static class HostsItem {

				@SerializedName("Domain")
				private String domain;

				@SerializedName("IpType")
				private Integer ipType;

				@SerializedName("Ips")
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

			@SerializedName("VSwitchId")
			private String vSwitchId;

			@SerializedName("SecureGroupId")
			private String secureGroupId;

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("VpcId")
			private String vpcId;

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
		}
	}

	public static class Tags {

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

	public static class MonitorConf {

		@SerializedName("NetICMP")
		private NetICMP netICMP;

		@SerializedName("ApiHTTP")
		private ApiHTTP apiHTTP;

		@SerializedName("Website")
		private Website website;

		@SerializedName("Stream")
		private Stream stream;

		@SerializedName("NetDNS")
		private NetDNS netDNS;

		@SerializedName("NetTCP")
		private NetTCP netTCP;

		@SerializedName("FileDownload")
		private FileDownload fileDownload;

		public NetICMP getNetICMP() {
			return this.netICMP;
		}

		public void setNetICMP(NetICMP netICMP) {
			this.netICMP = netICMP;
		}

		public ApiHTTP getApiHTTP() {
			return this.apiHTTP;
		}

		public void setApiHTTP(ApiHTTP apiHTTP) {
			this.apiHTTP = apiHTTP;
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

		public NetDNS getNetDNS() {
			return this.netDNS;
		}

		public void setNetDNS(NetDNS netDNS) {
			this.netDNS = netDNS;
		}

		public NetTCP getNetTCP() {
			return this.netTCP;
		}

		public void setNetTCP(NetTCP netTCP) {
			this.netTCP = netTCP;
		}

		public FileDownload getFileDownload() {
			return this.fileDownload;
		}

		public void setFileDownload(FileDownload fileDownload) {
			this.fileDownload = fileDownload;
		}

		public static class NetICMP {

			@SerializedName("TracertTimeout")
			private Long tracertTimeout;

			@SerializedName("Interval")
			private Long interval;

			@SerializedName("SplitPackage")
			private Boolean splitPackage;

			@SerializedName("PackageSize")
			private Integer packageSize;

			@SerializedName("TracertEnable")
			private Boolean tracertEnable;

			@SerializedName("TargetUrl")
			private String targetUrl;

			@SerializedName("Timeout")
			private Long timeout;

			@SerializedName("PackageNum")
			private Integer packageNum;

			@SerializedName("TracertNumMax")
			private Integer tracertNumMax;

			public Long getTracertTimeout() {
				return this.tracertTimeout;
			}

			public void setTracertTimeout(Long tracertTimeout) {
				this.tracertTimeout = tracertTimeout;
			}

			public Long getInterval() {
				return this.interval;
			}

			public void setInterval(Long interval) {
				this.interval = interval;
			}

			public Boolean getSplitPackage() {
				return this.splitPackage;
			}

			public void setSplitPackage(Boolean splitPackage) {
				this.splitPackage = splitPackage;
			}

			public Integer getPackageSize() {
				return this.packageSize;
			}

			public void setPackageSize(Integer packageSize) {
				this.packageSize = packageSize;
			}

			public Boolean getTracertEnable() {
				return this.tracertEnable;
			}

			public void setTracertEnable(Boolean tracertEnable) {
				this.tracertEnable = tracertEnable;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}

			public Integer getPackageNum() {
				return this.packageNum;
			}

			public void setPackageNum(Integer packageNum) {
				this.packageNum = packageNum;
			}

			public Integer getTracertNumMax() {
				return this.tracertNumMax;
			}

			public void setTracertNumMax(Integer tracertNumMax) {
				this.tracertNumMax = tracertNumMax;
			}
		}

		public static class ApiHTTP {

			@SerializedName("ConnectTimeout")
			private Long connectTimeout;

			@SerializedName("RequestBody")
			private RequestBody requestBody;

			@SerializedName("Method")
			private String method;

			@SerializedName("CheckCert")
			private Boolean checkCert;

			@SerializedName("ProtocolAlpnProtocol")
			private Integer protocolAlpnProtocol;

			@SerializedName("RequestHeaders")
			private Map<String,String> requestHeaders;

			@SerializedName("TargetUrl")
			private String targetUrl;

			@SerializedName("Timeout")
			private Long timeout;

			public Long getConnectTimeout() {
				return this.connectTimeout;
			}

			public void setConnectTimeout(Long connectTimeout) {
				this.connectTimeout = connectTimeout;
			}

			public RequestBody getRequestBody() {
				return this.requestBody;
			}

			public void setRequestBody(RequestBody requestBody) {
				this.requestBody = requestBody;
			}

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
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

			public Map<String,String> getRequestHeaders() {
				return this.requestHeaders;
			}

			public void setRequestHeaders(Map<String,String> requestHeaders) {
				this.requestHeaders = requestHeaders;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}

			public static class RequestBody {

				@SerializedName("Type")
				private String type;

				@SerializedName("Content")
				private String content;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}
		}

		public static class Website {

			@SerializedName("FlowHijackJumpTimes")
			private Integer flowHijackJumpTimes;

			@SerializedName("DNSHijackWhitelist")
			private String dNSHijackWhitelist;

			@SerializedName("SlowElementThreshold")
			private Long slowElementThreshold;

			@SerializedName("VerifyStringBlacklist")
			private String verifyStringBlacklist;

			@SerializedName("CustomHeader")
			private Integer customHeader;

			@SerializedName("WaitCompletionTime")
			private Long waitCompletionTime;

			@SerializedName("DisableCompression")
			private Integer disableCompression;

			@SerializedName("MonitorTimeout")
			private Long monitorTimeout;

			@SerializedName("VerifyStringWhitelist")
			private String verifyStringWhitelist;

			@SerializedName("CustomHeaderContent")
			private Map<String,String> customHeaderContent;

			@SerializedName("FilterInvalidIP")
			private Integer filterInvalidIP;

			@SerializedName("DisableCache")
			private Integer disableCache;

			@SerializedName("PageTamper")
			private String pageTamper;

			@SerializedName("FlowHijackLogo")
			private String flowHijackLogo;

			@SerializedName("AutomaticScrolling")
			private Integer automaticScrolling;

			@SerializedName("TargetUrl")
			private String targetUrl;

			@SerializedName("Redirection")
			private Integer redirection;

			@SerializedName("IgnoreCertificateError")
			private Integer ignoreCertificateError;

			@SerializedName("ElementBlacklist")
			private String elementBlacklist;

			public Integer getFlowHijackJumpTimes() {
				return this.flowHijackJumpTimes;
			}

			public void setFlowHijackJumpTimes(Integer flowHijackJumpTimes) {
				this.flowHijackJumpTimes = flowHijackJumpTimes;
			}

			public String getDNSHijackWhitelist() {
				return this.dNSHijackWhitelist;
			}

			public void setDNSHijackWhitelist(String dNSHijackWhitelist) {
				this.dNSHijackWhitelist = dNSHijackWhitelist;
			}

			public Long getSlowElementThreshold() {
				return this.slowElementThreshold;
			}

			public void setSlowElementThreshold(Long slowElementThreshold) {
				this.slowElementThreshold = slowElementThreshold;
			}

			public String getVerifyStringBlacklist() {
				return this.verifyStringBlacklist;
			}

			public void setVerifyStringBlacklist(String verifyStringBlacklist) {
				this.verifyStringBlacklist = verifyStringBlacklist;
			}

			public Integer getCustomHeader() {
				return this.customHeader;
			}

			public void setCustomHeader(Integer customHeader) {
				this.customHeader = customHeader;
			}

			public Long getWaitCompletionTime() {
				return this.waitCompletionTime;
			}

			public void setWaitCompletionTime(Long waitCompletionTime) {
				this.waitCompletionTime = waitCompletionTime;
			}

			public Integer getDisableCompression() {
				return this.disableCompression;
			}

			public void setDisableCompression(Integer disableCompression) {
				this.disableCompression = disableCompression;
			}

			public Long getMonitorTimeout() {
				return this.monitorTimeout;
			}

			public void setMonitorTimeout(Long monitorTimeout) {
				this.monitorTimeout = monitorTimeout;
			}

			public String getVerifyStringWhitelist() {
				return this.verifyStringWhitelist;
			}

			public void setVerifyStringWhitelist(String verifyStringWhitelist) {
				this.verifyStringWhitelist = verifyStringWhitelist;
			}

			public Map<String,String> getCustomHeaderContent() {
				return this.customHeaderContent;
			}

			public void setCustomHeaderContent(Map<String,String> customHeaderContent) {
				this.customHeaderContent = customHeaderContent;
			}

			public Integer getFilterInvalidIP() {
				return this.filterInvalidIP;
			}

			public void setFilterInvalidIP(Integer filterInvalidIP) {
				this.filterInvalidIP = filterInvalidIP;
			}

			public Integer getDisableCache() {
				return this.disableCache;
			}

			public void setDisableCache(Integer disableCache) {
				this.disableCache = disableCache;
			}

			public String getPageTamper() {
				return this.pageTamper;
			}

			public void setPageTamper(String pageTamper) {
				this.pageTamper = pageTamper;
			}

			public String getFlowHijackLogo() {
				return this.flowHijackLogo;
			}

			public void setFlowHijackLogo(String flowHijackLogo) {
				this.flowHijackLogo = flowHijackLogo;
			}

			public Integer getAutomaticScrolling() {
				return this.automaticScrolling;
			}

			public void setAutomaticScrolling(Integer automaticScrolling) {
				this.automaticScrolling = automaticScrolling;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}

			public Integer getRedirection() {
				return this.redirection;
			}

			public void setRedirection(Integer redirection) {
				this.redirection = redirection;
			}

			public Integer getIgnoreCertificateError() {
				return this.ignoreCertificateError;
			}

			public void setIgnoreCertificateError(Integer ignoreCertificateError) {
				this.ignoreCertificateError = ignoreCertificateError;
			}

			public String getElementBlacklist() {
				return this.elementBlacklist;
			}

			public void setElementBlacklist(String elementBlacklist) {
				this.elementBlacklist = elementBlacklist;
			}
		}

		public static class Stream {

			@SerializedName("PlayerType")
			private Integer playerType;

			@SerializedName("StreamType")
			private Integer streamType;

			@SerializedName("StreamAddressType")
			private Integer streamAddressType;

			@SerializedName("CustomHeaderContent")
			private Map<String,String> customHeaderContent;

			@SerializedName("StreamMonitorTimeout")
			private Integer streamMonitorTimeout;

			@SerializedName("WhiteList")
			private String whiteList;

			@SerializedName("TargetUrl")
			private String targetUrl;

			public Integer getPlayerType() {
				return this.playerType;
			}

			public void setPlayerType(Integer playerType) {
				this.playerType = playerType;
			}

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public Integer getStreamAddressType() {
				return this.streamAddressType;
			}

			public void setStreamAddressType(Integer streamAddressType) {
				this.streamAddressType = streamAddressType;
			}

			public Map<String,String> getCustomHeaderContent() {
				return this.customHeaderContent;
			}

			public void setCustomHeaderContent(Map<String,String> customHeaderContent) {
				this.customHeaderContent = customHeaderContent;
			}

			public Integer getStreamMonitorTimeout() {
				return this.streamMonitorTimeout;
			}

			public void setStreamMonitorTimeout(Integer streamMonitorTimeout) {
				this.streamMonitorTimeout = streamMonitorTimeout;
			}

			public String getWhiteList() {
				return this.whiteList;
			}

			public void setWhiteList(String whiteList) {
				this.whiteList = whiteList;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}
		}

		public static class NetDNS {

			@SerializedName("NsServer")
			private String nsServer;

			@SerializedName("QueryMethod")
			private Integer queryMethod;

			@SerializedName("TargetUrl")
			private String targetUrl;

			@SerializedName("DnsServerIpType")
			private Integer dnsServerIpType;

			@SerializedName("Timeout")
			private Long timeout;

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

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}
		}

		public static class NetTCP {

			@SerializedName("ConnectTimes")
			private Integer connectTimes;

			@SerializedName("TracertTimeout")
			private Long tracertTimeout;

			@SerializedName("Interval")
			private Long interval;

			@SerializedName("TracertEnable")
			private Boolean tracertEnable;

			@SerializedName("TargetUrl")
			private String targetUrl;

			@SerializedName("Timeout")
			private Long timeout;

			@SerializedName("TracertNumMax")
			private Integer tracertNumMax;

			public Integer getConnectTimes() {
				return this.connectTimes;
			}

			public void setConnectTimes(Integer connectTimes) {
				this.connectTimes = connectTimes;
			}

			public Long getTracertTimeout() {
				return this.tracertTimeout;
			}

			public void setTracertTimeout(Long tracertTimeout) {
				this.tracertTimeout = tracertTimeout;
			}

			public Long getInterval() {
				return this.interval;
			}

			public void setInterval(Long interval) {
				this.interval = interval;
			}

			public Boolean getTracertEnable() {
				return this.tracertEnable;
			}

			public void setTracertEnable(Boolean tracertEnable) {
				this.tracertEnable = tracertEnable;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}

			public Long getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Long timeout) {
				this.timeout = timeout;
			}

			public Integer getTracertNumMax() {
				return this.tracertNumMax;
			}

			public void setTracertNumMax(Integer tracertNumMax) {
				this.tracertNumMax = tracertNumMax;
			}
		}

		public static class FileDownload {

			@SerializedName("IgnoreCertificateUntrustworthyError")
			private Integer ignoreCertificateUntrustworthyError;

			@SerializedName("ConnectionTimeout")
			private Long connectionTimeout;

			@SerializedName("IgnoreCertificateCanceledError")
			private Integer ignoreCertificateCanceledError;

			@SerializedName("IgnoreCertificateOutOfDateError")
			private Integer ignoreCertificateOutOfDateError;

			@SerializedName("DownloadKernel")
			private Integer downloadKernel;

			@SerializedName("WhiteList")
			private String whiteList;

			@SerializedName("IgnoreCertificateAuthError")
			private Integer ignoreCertificateAuthError;

			@SerializedName("MonitorTimeout")
			private Long monitorTimeout;

			@SerializedName("ValidateKeywords")
			private String validateKeywords;

			@SerializedName("IgnoreInvalidHostError")
			private Integer ignoreInvalidHostError;

			@SerializedName("CustomHeaderContent")
			private Map<String,String> customHeaderContent;

			@SerializedName("TransmissionSize")
			private Long transmissionSize;

			@SerializedName("IgnoreCertificateUsingError")
			private Integer ignoreCertificateUsingError;

			@SerializedName("QuickProtocol")
			private Integer quickProtocol;

			@SerializedName("IgnoreCertificateStatusError")
			private Integer ignoreCertificateStatusError;

			@SerializedName("TargetUrl")
			private String targetUrl;

			@SerializedName("Redirection")
			private Integer redirection;

			@SerializedName("VerifyWay")
			private Integer verifyWay;

			public Integer getIgnoreCertificateUntrustworthyError() {
				return this.ignoreCertificateUntrustworthyError;
			}

			public void setIgnoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
				this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
			}

			public Long getConnectionTimeout() {
				return this.connectionTimeout;
			}

			public void setConnectionTimeout(Long connectionTimeout) {
				this.connectionTimeout = connectionTimeout;
			}

			public Integer getIgnoreCertificateCanceledError() {
				return this.ignoreCertificateCanceledError;
			}

			public void setIgnoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
				this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
			}

			public Integer getIgnoreCertificateOutOfDateError() {
				return this.ignoreCertificateOutOfDateError;
			}

			public void setIgnoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
				this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
			}

			public Integer getDownloadKernel() {
				return this.downloadKernel;
			}

			public void setDownloadKernel(Integer downloadKernel) {
				this.downloadKernel = downloadKernel;
			}

			public String getWhiteList() {
				return this.whiteList;
			}

			public void setWhiteList(String whiteList) {
				this.whiteList = whiteList;
			}

			public Integer getIgnoreCertificateAuthError() {
				return this.ignoreCertificateAuthError;
			}

			public void setIgnoreCertificateAuthError(Integer ignoreCertificateAuthError) {
				this.ignoreCertificateAuthError = ignoreCertificateAuthError;
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

			public Integer getIgnoreInvalidHostError() {
				return this.ignoreInvalidHostError;
			}

			public void setIgnoreInvalidHostError(Integer ignoreInvalidHostError) {
				this.ignoreInvalidHostError = ignoreInvalidHostError;
			}

			public Map<String,String> getCustomHeaderContent() {
				return this.customHeaderContent;
			}

			public void setCustomHeaderContent(Map<String,String> customHeaderContent) {
				this.customHeaderContent = customHeaderContent;
			}

			public Long getTransmissionSize() {
				return this.transmissionSize;
			}

			public void setTransmissionSize(Long transmissionSize) {
				this.transmissionSize = transmissionSize;
			}

			public Integer getIgnoreCertificateUsingError() {
				return this.ignoreCertificateUsingError;
			}

			public void setIgnoreCertificateUsingError(Integer ignoreCertificateUsingError) {
				this.ignoreCertificateUsingError = ignoreCertificateUsingError;
			}

			public Integer getQuickProtocol() {
				return this.quickProtocol;
			}

			public void setQuickProtocol(Integer quickProtocol) {
				this.quickProtocol = quickProtocol;
			}

			public Integer getIgnoreCertificateStatusError() {
				return this.ignoreCertificateStatusError;
			}

			public void setIgnoreCertificateStatusError(Integer ignoreCertificateStatusError) {
				this.ignoreCertificateStatusError = ignoreCertificateStatusError;
			}

			public String getTargetUrl() {
				return this.targetUrl;
			}

			public void setTargetUrl(String targetUrl) {
				this.targetUrl = targetUrl;
			}

			public Integer getRedirection() {
				return this.redirection;
			}

			public void setRedirection(Integer redirection) {
				this.redirection = redirection;
			}

			public Integer getVerifyWay() {
				return this.verifyWay;
			}

			public void setVerifyWay(Integer verifyWay) {
				this.verifyWay = verifyWay;
			}
		}
	}

	public static class CustomPeriod {

		@SerializedName("EndHour")
		private Integer endHour;

		@SerializedName("StartHour")
		private Integer startHour;

		public Integer getEndHour() {
			return this.endHour;
		}

		public void setEndHour(Integer endHour) {
			this.endHour = endHour;
		}

		public Integer getStartHour() {
			return this.startHour;
		}

		public void setStartHour(Integer startHour) {
			this.startHour = startHour;
		}
	}

	public static class Monitors {

		@SerializedName("ClientType")
		private Integer clientType;

		@SerializedName("CityCode")
		private String cityCode;

		@SerializedName("OperatorCode")
		private String operatorCode;

		public Integer getClientType() {
			return this.clientType;
		}

		public void setClientType(Integer clientType) {
			this.clientType = clientType;
		}

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
	}

	@Override
	public Class<CreateTimingSyntheticTaskResponse> getResponseClass() {
		return CreateTimingSyntheticTaskResponse.class;
	}

}
