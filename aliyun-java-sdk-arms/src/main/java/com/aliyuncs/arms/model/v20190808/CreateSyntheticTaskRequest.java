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

	public static class Net {

		@SerializedName("NetTraceRouteTimeout")
		private Long netTraceRouteTimeout;

		@SerializedName("NetICMPActive")
		private Long netICMPActive;

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
