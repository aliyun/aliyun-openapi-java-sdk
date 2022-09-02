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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetSyntheticTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSyntheticTaskDetailResponse extends AcsResponse {

	private String requestId;

	private TaskDetail taskDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TaskDetail getTaskDetail() {
		return this.taskDetail;
	}

	public void setTaskDetail(TaskDetail taskDetail) {
		this.taskDetail = taskDetail;
	}

	public static class TaskDetail {

		private Long taskId;

		private String taskName;

		private String url;

		private Long taskType;

		private Long intervalTime;

		private Long intervalType;

		private Long ipType;

		private List<MinotorListItem> minotorList;

		private ExtendInterval extendInterval;

		private Download download;

		private Net net;

		private Nav nav;

		private Protocol protocol;

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Long getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Long taskType) {
			this.taskType = taskType;
		}

		public Long getIntervalTime() {
			return this.intervalTime;
		}

		public void setIntervalTime(Long intervalTime) {
			this.intervalTime = intervalTime;
		}

		public Long getIntervalType() {
			return this.intervalType;
		}

		public void setIntervalType(Long intervalType) {
			this.intervalType = intervalType;
		}

		public Long getIpType() {
			return this.ipType;
		}

		public void setIpType(Long ipType) {
			this.ipType = ipType;
		}

		public List<MinotorListItem> getMinotorList() {
			return this.minotorList;
		}

		public void setMinotorList(List<MinotorListItem> minotorList) {
			this.minotorList = minotorList;
		}

		public ExtendInterval getExtendInterval() {
			return this.extendInterval;
		}

		public void setExtendInterval(ExtendInterval extendInterval) {
			this.extendInterval = extendInterval;
		}

		public Download getDownload() {
			return this.download;
		}

		public void setDownload(Download download) {
			this.download = download;
		}

		public Net getNet() {
			return this.net;
		}

		public void setNet(Net net) {
			this.net = net;
		}

		public Nav getNav() {
			return this.nav;
		}

		public void setNav(Nav nav) {
			this.nav = nav;
		}

		public Protocol getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(Protocol protocol) {
			this.protocol = protocol;
		}

		public static class MinotorListItem {

			private Long cityCode;

			private Long netServiceId;

			private Long monitorType;

			private Long sendCount;

			public Long getCityCode() {
				return this.cityCode;
			}

			public void setCityCode(Long cityCode) {
				this.cityCode = cityCode;
			}

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

			public Long getSendCount() {
				return this.sendCount;
			}

			public void setSendCount(Long sendCount) {
				this.sendCount = sendCount;
			}
		}

		public static class ExtendInterval {

			private String startTime;

			private String endTime;

			private Long startHour;

			private Long startMinute;

			private Long endhour;

			private Long endMinute;

			private List<Long> days;

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

			public Long getStartHour() {
				return this.startHour;
			}

			public void setStartHour(Long startHour) {
				this.startHour = startHour;
			}

			public Long getStartMinute() {
				return this.startMinute;
			}

			public void setStartMinute(Long startMinute) {
				this.startMinute = startMinute;
			}

			public Long getEndhour() {
				return this.endhour;
			}

			public void setEndhour(Long endhour) {
				this.endhour = endhour;
			}

			public Long getEndMinute() {
				return this.endMinute;
			}

			public void setEndMinute(Long endMinute) {
				this.endMinute = endMinute;
			}

			public List<Long> getDays() {
				return this.days;
			}

			public void setDays(List<Long> days) {
				this.days = days;
			}
		}

		public static class Download {

			private Long downloadTransmissionSize;

			private Long downloadCustomHost;

			private String downloadCustomHostIp;

			private String whiteList;

			private Long downloadKernel;

			private String quickProtocol;

			private Long monitorTimeout;

			private Long connectionTimeout;

			private Long verifyWay;

			private String validateKeywords;

			private Long downloadRedirect;

			private String downloadCustomHeaderContent;

			public Long getDownloadTransmissionSize() {
				return this.downloadTransmissionSize;
			}

			public void setDownloadTransmissionSize(Long downloadTransmissionSize) {
				this.downloadTransmissionSize = downloadTransmissionSize;
			}

			public Long getDownloadCustomHost() {
				return this.downloadCustomHost;
			}

			public void setDownloadCustomHost(Long downloadCustomHost) {
				this.downloadCustomHost = downloadCustomHost;
			}

			public String getDownloadCustomHostIp() {
				return this.downloadCustomHostIp;
			}

			public void setDownloadCustomHostIp(String downloadCustomHostIp) {
				this.downloadCustomHostIp = downloadCustomHostIp;
			}

			public String getWhiteList() {
				return this.whiteList;
			}

			public void setWhiteList(String whiteList) {
				this.whiteList = whiteList;
			}

			public Long getDownloadKernel() {
				return this.downloadKernel;
			}

			public void setDownloadKernel(Long downloadKernel) {
				this.downloadKernel = downloadKernel;
			}

			public String getQuickProtocol() {
				return this.quickProtocol;
			}

			public void setQuickProtocol(String quickProtocol) {
				this.quickProtocol = quickProtocol;
			}

			public Long getMonitorTimeout() {
				return this.monitorTimeout;
			}

			public void setMonitorTimeout(Long monitorTimeout) {
				this.monitorTimeout = monitorTimeout;
			}

			public Long getConnectionTimeout() {
				return this.connectionTimeout;
			}

			public void setConnectionTimeout(Long connectionTimeout) {
				this.connectionTimeout = connectionTimeout;
			}

			public Long getVerifyWay() {
				return this.verifyWay;
			}

			public void setVerifyWay(Long verifyWay) {
				this.verifyWay = verifyWay;
			}

			public String getValidateKeywords() {
				return this.validateKeywords;
			}

			public void setValidateKeywords(String validateKeywords) {
				this.validateKeywords = validateKeywords;
			}

			public Long getDownloadRedirect() {
				return this.downloadRedirect;
			}

			public void setDownloadRedirect(Long downloadRedirect) {
				this.downloadRedirect = downloadRedirect;
			}

			public String getDownloadCustomHeaderContent() {
				return this.downloadCustomHeaderContent;
			}

			public void setDownloadCustomHeaderContent(String downloadCustomHeaderContent) {
				this.downloadCustomHeaderContent = downloadCustomHeaderContent;
			}
		}

		public static class Net {

			private Long netIcmpSwitch;

			private Long netIcmpActive;

			private Long netIcmpTimeout;

			private Long netIcmpInterval;

			private Long netIcmpNum;

			private Long netIcmpSize;

			private Long netIcmpDataCut;

			private String netDnsQueryMethod;

			private Long netDnsSwitch;

			private Long netTraceRouteSwitch;

			private Long netTraceRouteTimeout;

			private Long netTraceRouteNum;

			private String whiteList;

			private String netDnsNs;

			private Long netDigSwitch;

			private Long netDnsServer;

			public Long getNetIcmpSwitch() {
				return this.netIcmpSwitch;
			}

			public void setNetIcmpSwitch(Long netIcmpSwitch) {
				this.netIcmpSwitch = netIcmpSwitch;
			}

			public Long getNetIcmpActive() {
				return this.netIcmpActive;
			}

			public void setNetIcmpActive(Long netIcmpActive) {
				this.netIcmpActive = netIcmpActive;
			}

			public Long getNetIcmpTimeout() {
				return this.netIcmpTimeout;
			}

			public void setNetIcmpTimeout(Long netIcmpTimeout) {
				this.netIcmpTimeout = netIcmpTimeout;
			}

			public Long getNetIcmpInterval() {
				return this.netIcmpInterval;
			}

			public void setNetIcmpInterval(Long netIcmpInterval) {
				this.netIcmpInterval = netIcmpInterval;
			}

			public Long getNetIcmpNum() {
				return this.netIcmpNum;
			}

			public void setNetIcmpNum(Long netIcmpNum) {
				this.netIcmpNum = netIcmpNum;
			}

			public Long getNetIcmpSize() {
				return this.netIcmpSize;
			}

			public void setNetIcmpSize(Long netIcmpSize) {
				this.netIcmpSize = netIcmpSize;
			}

			public Long getNetIcmpDataCut() {
				return this.netIcmpDataCut;
			}

			public void setNetIcmpDataCut(Long netIcmpDataCut) {
				this.netIcmpDataCut = netIcmpDataCut;
			}

			public String getNetDnsQueryMethod() {
				return this.netDnsQueryMethod;
			}

			public void setNetDnsQueryMethod(String netDnsQueryMethod) {
				this.netDnsQueryMethod = netDnsQueryMethod;
			}

			public Long getNetDnsSwitch() {
				return this.netDnsSwitch;
			}

			public void setNetDnsSwitch(Long netDnsSwitch) {
				this.netDnsSwitch = netDnsSwitch;
			}

			public Long getNetTraceRouteSwitch() {
				return this.netTraceRouteSwitch;
			}

			public void setNetTraceRouteSwitch(Long netTraceRouteSwitch) {
				this.netTraceRouteSwitch = netTraceRouteSwitch;
			}

			public Long getNetTraceRouteTimeout() {
				return this.netTraceRouteTimeout;
			}

			public void setNetTraceRouteTimeout(Long netTraceRouteTimeout) {
				this.netTraceRouteTimeout = netTraceRouteTimeout;
			}

			public Long getNetTraceRouteNum() {
				return this.netTraceRouteNum;
			}

			public void setNetTraceRouteNum(Long netTraceRouteNum) {
				this.netTraceRouteNum = netTraceRouteNum;
			}

			public String getWhiteList() {
				return this.whiteList;
			}

			public void setWhiteList(String whiteList) {
				this.whiteList = whiteList;
			}

			public String getNetDnsNs() {
				return this.netDnsNs;
			}

			public void setNetDnsNs(String netDnsNs) {
				this.netDnsNs = netDnsNs;
			}

			public Long getNetDigSwitch() {
				return this.netDigSwitch;
			}

			public void setNetDigSwitch(Long netDigSwitch) {
				this.netDigSwitch = netDigSwitch;
			}

			public Long getNetDnsServer() {
				return this.netDnsServer;
			}

			public void setNetDnsServer(Long netDnsServer) {
				this.netDnsServer = netDnsServer;
			}
		}

		public static class Nav {

			private Long navDisableCache;

			private Long navReturnElement;

			private Long navRedirect;

			private Long navDisableCompression;

			private Long navAutomaticScrolling;

			private Long navIgnoreCertificateError;

			private Long filterInvalidIP;

			private Long executeApplet;

			private Long executeActiveX;

			private Long executeScript;

			private Long quicVersion;

			private String quicDomain;

			private Long requestHeader;

			private Long navCustomHost;

			private String navCustomHostIp;

			private String navCustomHeader;

			private String navCustomHeaderContent;

			private String elementBlacklist;

			private String processName;

			private String verifyStringBlacklist;

			private String verifyStringWhitelist;

			private Long monitorTimeout;

			private Long waitCompletionTime;

			private Long slowElementThreshold;

			private String dnsHijackWhitelist;

			private String pageTampering;

			private Long flowHijackJumpTimes;

			private String flowHijackLogo;

			public Long getNavDisableCache() {
				return this.navDisableCache;
			}

			public void setNavDisableCache(Long navDisableCache) {
				this.navDisableCache = navDisableCache;
			}

			public Long getNavReturnElement() {
				return this.navReturnElement;
			}

			public void setNavReturnElement(Long navReturnElement) {
				this.navReturnElement = navReturnElement;
			}

			public Long getNavRedirect() {
				return this.navRedirect;
			}

			public void setNavRedirect(Long navRedirect) {
				this.navRedirect = navRedirect;
			}

			public Long getNavDisableCompression() {
				return this.navDisableCompression;
			}

			public void setNavDisableCompression(Long navDisableCompression) {
				this.navDisableCompression = navDisableCompression;
			}

			public Long getNavAutomaticScrolling() {
				return this.navAutomaticScrolling;
			}

			public void setNavAutomaticScrolling(Long navAutomaticScrolling) {
				this.navAutomaticScrolling = navAutomaticScrolling;
			}

			public Long getNavIgnoreCertificateError() {
				return this.navIgnoreCertificateError;
			}

			public void setNavIgnoreCertificateError(Long navIgnoreCertificateError) {
				this.navIgnoreCertificateError = navIgnoreCertificateError;
			}

			public Long getFilterInvalidIP() {
				return this.filterInvalidIP;
			}

			public void setFilterInvalidIP(Long filterInvalidIP) {
				this.filterInvalidIP = filterInvalidIP;
			}

			public Long getExecuteApplet() {
				return this.executeApplet;
			}

			public void setExecuteApplet(Long executeApplet) {
				this.executeApplet = executeApplet;
			}

			public Long getExecuteActiveX() {
				return this.executeActiveX;
			}

			public void setExecuteActiveX(Long executeActiveX) {
				this.executeActiveX = executeActiveX;
			}

			public Long getExecuteScript() {
				return this.executeScript;
			}

			public void setExecuteScript(Long executeScript) {
				this.executeScript = executeScript;
			}

			public Long getQuicVersion() {
				return this.quicVersion;
			}

			public void setQuicVersion(Long quicVersion) {
				this.quicVersion = quicVersion;
			}

			public String getQuicDomain() {
				return this.quicDomain;
			}

			public void setQuicDomain(String quicDomain) {
				this.quicDomain = quicDomain;
			}

			public Long getRequestHeader() {
				return this.requestHeader;
			}

			public void setRequestHeader(Long requestHeader) {
				this.requestHeader = requestHeader;
			}

			public Long getNavCustomHost() {
				return this.navCustomHost;
			}

			public void setNavCustomHost(Long navCustomHost) {
				this.navCustomHost = navCustomHost;
			}

			public String getNavCustomHostIp() {
				return this.navCustomHostIp;
			}

			public void setNavCustomHostIp(String navCustomHostIp) {
				this.navCustomHostIp = navCustomHostIp;
			}

			public String getNavCustomHeader() {
				return this.navCustomHeader;
			}

			public void setNavCustomHeader(String navCustomHeader) {
				this.navCustomHeader = navCustomHeader;
			}

			public String getNavCustomHeaderContent() {
				return this.navCustomHeaderContent;
			}

			public void setNavCustomHeaderContent(String navCustomHeaderContent) {
				this.navCustomHeaderContent = navCustomHeaderContent;
			}

			public String getElementBlacklist() {
				return this.elementBlacklist;
			}

			public void setElementBlacklist(String elementBlacklist) {
				this.elementBlacklist = elementBlacklist;
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

			public String getVerifyStringWhitelist() {
				return this.verifyStringWhitelist;
			}

			public void setVerifyStringWhitelist(String verifyStringWhitelist) {
				this.verifyStringWhitelist = verifyStringWhitelist;
			}

			public Long getMonitorTimeout() {
				return this.monitorTimeout;
			}

			public void setMonitorTimeout(Long monitorTimeout) {
				this.monitorTimeout = monitorTimeout;
			}

			public Long getWaitCompletionTime() {
				return this.waitCompletionTime;
			}

			public void setWaitCompletionTime(Long waitCompletionTime) {
				this.waitCompletionTime = waitCompletionTime;
			}

			public Long getSlowElementThreshold() {
				return this.slowElementThreshold;
			}

			public void setSlowElementThreshold(Long slowElementThreshold) {
				this.slowElementThreshold = slowElementThreshold;
			}

			public String getDnsHijackWhitelist() {
				return this.dnsHijackWhitelist;
			}

			public void setDnsHijackWhitelist(String dnsHijackWhitelist) {
				this.dnsHijackWhitelist = dnsHijackWhitelist;
			}

			public String getPageTampering() {
				return this.pageTampering;
			}

			public void setPageTampering(String pageTampering) {
				this.pageTampering = pageTampering;
			}

			public Long getFlowHijackJumpTimes() {
				return this.flowHijackJumpTimes;
			}

			public void setFlowHijackJumpTimes(Long flowHijackJumpTimes) {
				this.flowHijackJumpTimes = flowHijackJumpTimes;
			}

			public String getFlowHijackLogo() {
				return this.flowHijackLogo;
			}

			public void setFlowHijackLogo(String flowHijackLogo) {
				this.flowHijackLogo = flowHijackLogo;
			}
		}

		public static class Protocol {

			private Long characterEncoding;

			private Long verifyWay;

			private String verifyContent;

			private Long receivedDataSize;

			private Long protocolMonitorTimeout;

			private Long protocolConnectionTimeout;

			private Long customHost;

			private String customHostIp;

			private RequestContent requestContent;

			public Long getCharacterEncoding() {
				return this.characterEncoding;
			}

			public void setCharacterEncoding(Long characterEncoding) {
				this.characterEncoding = characterEncoding;
			}

			public Long getVerifyWay() {
				return this.verifyWay;
			}

			public void setVerifyWay(Long verifyWay) {
				this.verifyWay = verifyWay;
			}

			public String getVerifyContent() {
				return this.verifyContent;
			}

			public void setVerifyContent(String verifyContent) {
				this.verifyContent = verifyContent;
			}

			public Long getReceivedDataSize() {
				return this.receivedDataSize;
			}

			public void setReceivedDataSize(Long receivedDataSize) {
				this.receivedDataSize = receivedDataSize;
			}

			public Long getProtocolMonitorTimeout() {
				return this.protocolMonitorTimeout;
			}

			public void setProtocolMonitorTimeout(Long protocolMonitorTimeout) {
				this.protocolMonitorTimeout = protocolMonitorTimeout;
			}

			public Long getProtocolConnectionTimeout() {
				return this.protocolConnectionTimeout;
			}

			public void setProtocolConnectionTimeout(Long protocolConnectionTimeout) {
				this.protocolConnectionTimeout = protocolConnectionTimeout;
			}

			public Long getCustomHost() {
				return this.customHost;
			}

			public void setCustomHost(Long customHost) {
				this.customHost = customHost;
			}

			public String getCustomHostIp() {
				return this.customHostIp;
			}

			public void setCustomHostIp(String customHostIp) {
				this.customHostIp = customHostIp;
			}

			public RequestContent getRequestContent() {
				return this.requestContent;
			}

			public void setRequestContent(RequestContent requestContent) {
				this.requestContent = requestContent;
			}

			public static class RequestContent {

				private String method;

				private List<HeaderItem> header;

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

				public static class Body {

					private String mode;

					private String raw;

					private String language;

					private Formdata formdata;

					private Urlencoded urlencoded;

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

					public String getLanguage() {
						return this.language;
					}

					public void setLanguage(String language) {
						this.language = language;
					}

					public Formdata getFormdata() {
						return this.formdata;
					}

					public void setFormdata(Formdata formdata) {
						this.formdata = formdata;
					}

					public Urlencoded getUrlencoded() {
						return this.urlencoded;
					}

					public void setUrlencoded(Urlencoded urlencoded) {
						this.urlencoded = urlencoded;
					}

					public static class Formdata {

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

					public static class Urlencoded {

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
				}
			}
		}
	}

	@Override
	public GetSyntheticTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	GetSyntheticTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
