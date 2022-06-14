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
public class UpdateJobRequest extends RpcAcsRequest<UpdateJobResponse> {
	   

	@SerializedName("userProfile")
	private UserProfile userProfile;

	private ActiveJobDTO activeJobDTO;
	public UpdateJobRequest() {
		super("RetailBot", "2021-02-24", "UpdateJob");
		setMethod(MethodType.POST);
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;	
		if (userProfile != null) {
			putBodyParameter("UserProfile" , new Gson().toJson(userProfile));
		}	
	}

	public ActiveJobDTO getActiveJobDTO() {
		return this.activeJobDTO;
	}

	public void setActiveJobDTO(ActiveJobDTO activeJobDTO) {
		this.activeJobDTO = activeJobDTO;	
		if (activeJobDTO != null) {
			
				putBodyParameter("ActiveJobDTO.JobId" , activeJobDTO.getJobId());
				putBodyParameter("ActiveJobDTO.InstanceId" , activeJobDTO.getInstanceId());
				putBodyParameter("ActiveJobDTO.EndTime" , activeJobDTO.getEndTime());
				putBodyParameter("ActiveJobDTO.ShopId" , activeJobDTO.getShopId());
				putBodyParameter("ActiveJobDTO.AppVersion" , activeJobDTO.getAppVersion());
				putBodyParameter("ActiveJobDTO.AppCode" , activeJobDTO.getAppCode());
				putBodyParameter("ActiveJobDTO.StartTime" , activeJobDTO.getStartTime());
				putBodyParameter("ActiveJobDTO.Config" , activeJobDTO.getConfig());
				putBodyParameter("ActiveJobDTO.JobName" , activeJobDTO.getJobName());
				putBodyParameter("ActiveJobDTO.Status" , activeJobDTO.getStatus());
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

		private Long jobId;

		private String instanceId;

		private Long endTime;

		private String shopId;

		private String appVersion;

		private String appCode;

		private Long startTime;

		private String config;

		private String jobName;

		private Integer status;

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

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

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
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

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateJobResponse> getResponseClass() {
		return UpdateJobResponse.class;
	}

}
