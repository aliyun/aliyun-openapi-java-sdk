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
public class CreateJobRequest extends RpcAcsRequest<CreateJobResponse> {
	   

	@SerializedName("userProfile")
	private UserProfile userProfile;

	@SerializedName("activeJobDTO")
	private ActiveJobDTO activeJobDTO;
	public CreateJobRequest() {
		super("RetailBot", "2021-02-24", "CreateJob");
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

	public ActiveJobDTO getActiveJobDTO() {
		return this.activeJobDTO;
	}

	public void setActiveJobDTO(ActiveJobDTO activeJobDTO) {
		this.activeJobDTO = activeJobDTO;	
		if (activeJobDTO != null) {
			putBodyParameter("ActiveJobDTO" , new Gson().toJson(activeJobDTO));
		}	
	}

	public static class UserProfile {

		@SerializedName("RequestId")
		private String requestId;

		@SerializedName("TenantId")
		private Long tenantId;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}
	}

	public static class ActiveJobDTO {

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("EndTime")
		private Long endTime;

		@SerializedName("AppCode")
		private String appCode;

		@SerializedName("ShopId")
		private String shopId;

		@SerializedName("AppVersion")
		private String appVersion;

		@SerializedName("StartTime")
		private Long startTime;

		@SerializedName("Config")
		private String config;

		@SerializedName("JobName")
		private String jobName;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
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
	}

	@Override
	public Class<CreateJobResponse> getResponseClass() {
		return CreateJobResponse.class;
	}

}
