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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateOutboundJobRequest extends RpcAcsRequest<CreateOutboundJobResponse> {
	   

	@SerializedName("userProfile")
	private UserProfile userProfile;

	@SerializedName("outboundJobDTO")
	private OutboundJobDTO outboundJobDTO;
	public CreateOutboundJobRequest() {
		super("RetailBot", "2021-02-24", "CreateOutboundJob");
		setMethod(MethodType.POST);
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;	
		if (userProfile != null) {
			putQueryParameter("UserProfile" , new Gson().toJson(userProfile));
		}	
	}

	public OutboundJobDTO getOutboundJobDTO() {
		return this.outboundJobDTO;
	}

	public void setOutboundJobDTO(OutboundJobDTO outboundJobDTO) {
		this.outboundJobDTO = outboundJobDTO;	
		if (outboundJobDTO != null) {
			putQueryParameter("OutboundJobDTO" , new Gson().toJson(outboundJobDTO));
		}	
	}

	public static class UserProfile {

		@SerializedName("BuId")
		private Long buId;

		@SerializedName("RequestId")
		private String requestId;

		@SerializedName("UserNick")
		private String userNick;

		@SerializedName("TenantId")
		private Long tenantId;

		@SerializedName("AppCode")
		private String appCode;

		@SerializedName("PlatformCode")
		private String platformCode;

		@SerializedName("UserId")
		private Long userId;

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getUserNick() {
			return this.userNick;
		}

		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}

		public String getPlatformCode() {
			return this.platformCode;
		}

		public void setPlatformCode(String platformCode) {
			this.platformCode = platformCode;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}
	}

	public static class OutboundJobDTO {

		@SerializedName("RunConfig")
		private String runConfig;

		@SerializedName("CrowdConfig")
		private String crowdConfig;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("GmtCreate")
		private String gmtCreate;

		@SerializedName("StartTime")
		private String startTime;

		@SerializedName("GmtModified")
		private String gmtModified;

		@SerializedName("Version")
		private String version;

		@SerializedName("RunType")
		private Integer runType;

		@SerializedName("TenantId")
		private Long tenantId;

		@SerializedName("SaasId")
		private String saasId;

		@SerializedName("ShopId")
		private Long shopId;

		@SerializedName("AppCode")
		private String appCode;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Config")
		private String config;

		@SerializedName("JobName")
		private String jobName;

		@SerializedName("CrowdType")
		private Integer crowdType;

		@SerializedName("Status")
		private Integer status;

		public String getRunConfig() {
			return this.runConfig;
		}

		public void setRunConfig(String runConfig) {
			this.runConfig = runConfig;
		}

		public String getCrowdConfig() {
			return this.crowdConfig;
		}

		public void setCrowdConfig(String crowdConfig) {
			this.crowdConfig = crowdConfig;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Integer getRunType() {
			return this.runType;
		}

		public void setRunType(Integer runType) {
			this.runType = runType;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getSaasId() {
			return this.saasId;
		}

		public void setSaasId(String saasId) {
			this.saasId = saasId;
		}

		public Long getShopId() {
			return this.shopId;
		}

		public void setShopId(Long shopId) {
			this.shopId = shopId;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public Integer getCrowdType() {
			return this.crowdType;
		}

		public void setCrowdType(Integer crowdType) {
			this.crowdType = crowdType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public Class<CreateOutboundJobResponse> getResponseClass() {
		return CreateOutboundJobResponse.class;
	}

}
