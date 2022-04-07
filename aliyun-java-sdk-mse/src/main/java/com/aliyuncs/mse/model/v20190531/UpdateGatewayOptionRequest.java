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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayOptionRequest extends RpcAcsRequest<UpdateGatewayOptionResponse> {
	   

	private String gatewayUniqueId;

	@SerializedName("gatewayOption")
	private GatewayOption gatewayOption;

	private Long gatewayId;

	private String acceptLanguage;
	public UpdateGatewayOptionRequest() {
		super("mse", "2019-05-31", "UpdateGatewayOption", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public GatewayOption getGatewayOption() {
		return this.gatewayOption;
	}

	public void setGatewayOption(GatewayOption gatewayOption) {
		this.gatewayOption = gatewayOption;	
		if (gatewayOption != null) {
			putQueryParameter("GatewayOption" , new Gson().toJson(gatewayOption));
		}	
	}

	public Long getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId.toString());
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public static class GatewayOption {

		@SerializedName("EnableWaf")
		private Boolean enableWaf;

		@SerializedName("EnableHardwareAcceleration")
		private Boolean enableHardwareAcceleration;

		@SerializedName("DisableHttp2Alpn")
		private Boolean disableHttp2Alpn;

		@SerializedName("LogConfigDetails")
		private LogConfigDetails logConfigDetails;

		@SerializedName("TraceDetails")
		private TraceDetails traceDetails;

		public Boolean getEnableWaf() {
			return this.enableWaf;
		}

		public void setEnableWaf(Boolean enableWaf) {
			this.enableWaf = enableWaf;
		}

		public Boolean getEnableHardwareAcceleration() {
			return this.enableHardwareAcceleration;
		}

		public void setEnableHardwareAcceleration(Boolean enableHardwareAcceleration) {
			this.enableHardwareAcceleration = enableHardwareAcceleration;
		}

		public Boolean getDisableHttp2Alpn() {
			return this.disableHttp2Alpn;
		}

		public void setDisableHttp2Alpn(Boolean disableHttp2Alpn) {
			this.disableHttp2Alpn = disableHttp2Alpn;
		}

		public LogConfigDetails getLogConfigDetails() {
			return this.logConfigDetails;
		}

		public void setLogConfigDetails(LogConfigDetails logConfigDetails) {
			this.logConfigDetails = logConfigDetails;
		}

		public TraceDetails getTraceDetails() {
			return this.traceDetails;
		}

		public void setTraceDetails(TraceDetails traceDetails) {
			this.traceDetails = traceDetails;
		}

		public static class LogConfigDetails {

			@SerializedName("ProjectName")
			private String projectName;

			@SerializedName("LogStoreName")
			private String logStoreName;

			@SerializedName("LogEnabled")
			private Boolean logEnabled;

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getLogStoreName() {
				return this.logStoreName;
			}

			public void setLogStoreName(String logStoreName) {
				this.logStoreName = logStoreName;
			}

			public Boolean getLogEnabled() {
				return this.logEnabled;
			}

			public void setLogEnabled(Boolean logEnabled) {
				this.logEnabled = logEnabled;
			}
		}

		public static class TraceDetails {

			@SerializedName("TraceEnabled")
			private Boolean traceEnabled;

			@SerializedName("Sample")
			private Long sample;

			public Boolean getTraceEnabled() {
				return this.traceEnabled;
			}

			public void setTraceEnabled(Boolean traceEnabled) {
				this.traceEnabled = traceEnabled;
			}

			public Long getSample() {
				return this.sample;
			}

			public void setSample(Long sample) {
				this.sample = sample;
			}
		}
	}

	@Override
	public Class<UpdateGatewayOptionResponse> getResponseClass() {
		return UpdateGatewayOptionResponse.class;
	}

}
