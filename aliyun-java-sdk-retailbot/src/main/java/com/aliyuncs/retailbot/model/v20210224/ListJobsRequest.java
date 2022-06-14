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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListJobsRequest extends RpcAcsRequest<ListJobsResponse> {
	   

	@SerializedName("userProfile")
	private UserProfile userProfile;

	private String instanceId;

	private String shopId;

	private String appCode;

	private String appVersion;

	@SerializedName("status")
	private List<Integer> status;

	@SerializedName("pageParam")
	private PageParam pageParam;
	public ListJobsRequest() {
		super("RetailBot", "2021-02-24", "ListJobs");
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
		if(shopId != null){
			putQueryParameter("ShopId", shopId);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	public List<Integer> getStatus() {
		return this.status;
	}

	public void setStatus(List<Integer> status) {
		this.status = status;	
		if (status != null) {
			putQueryParameter("Status" , new Gson().toJson(status));
		}	
	}

	public PageParam getPageParam() {
		return this.pageParam;
	}

	public void setPageParam(PageParam pageParam) {
		this.pageParam = pageParam;	
		if (pageParam != null) {
			putQueryParameter("PageParam" , new Gson().toJson(pageParam));
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

	public static class PageParam {

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("PageSize")
		private Integer pageSize;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public Class<ListJobsResponse> getResponseClass() {
		return ListJobsResponse.class;
	}

}
