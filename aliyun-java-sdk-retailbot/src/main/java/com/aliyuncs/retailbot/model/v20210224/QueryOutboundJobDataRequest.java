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
public class QueryOutboundJobDataRequest extends RpcAcsRequest<QueryOutboundJobDataResponse> {
	   

	@SerializedName("userProfile")
	private UserProfile userProfile;

	private String saasId;

	private Long jobId;

	private String startTime;

	private String endTime;
	public QueryOutboundJobDataRequest() {
		super("RetailBot", "2021-02-24", "QueryOutboundJobData");
		setMethod(MethodType.GET);
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

	public String getSaasId() {
		return this.saasId;
	}

	public void setSaasId(String saasId) {
		this.saasId = saasId;
		if(saasId != null){
			putQueryParameter("SaasId", saasId);
		}
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	@Override
	public Class<QueryOutboundJobDataResponse> getResponseClass() {
		return QueryOutboundJobDataResponse.class;
	}

}
