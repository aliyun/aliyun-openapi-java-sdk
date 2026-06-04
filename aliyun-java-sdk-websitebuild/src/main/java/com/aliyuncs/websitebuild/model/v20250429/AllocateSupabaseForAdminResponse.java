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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.AllocateSupabaseForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllocateSupabaseForAdminResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String dbInstanceId;

		private String supabaseInstanceId;

		private String userId;

		private String dbType;

		private String bizId;

		private Integer status;

		private String extra;

		private String dbPublicUrl;

		private String supabasePublicUrl;

		private String supabaseKongUrl;

		private String rdsDatabasePassword;

		private String supabaseDashboardUserName;

		private String supabaseDashboardPassword;

		private String supabasePublicIp;

		private String supabasePrivateIp;

		private String serviceKey;

		private String anonKey;

		private Integer isDeleted;

		private String dbInstanceCreateTime;

		private String supabaseInstanceCreateTime;

		private String instanceCreateStatus;

		private String instanceCreateFinishedTime;

		private String tenantId;

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getSupabaseInstanceId() {
			return this.supabaseInstanceId;
		}

		public void setSupabaseInstanceId(String supabaseInstanceId) {
			this.supabaseInstanceId = supabaseInstanceId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getDbPublicUrl() {
			return this.dbPublicUrl;
		}

		public void setDbPublicUrl(String dbPublicUrl) {
			this.dbPublicUrl = dbPublicUrl;
		}

		public String getSupabasePublicUrl() {
			return this.supabasePublicUrl;
		}

		public void setSupabasePublicUrl(String supabasePublicUrl) {
			this.supabasePublicUrl = supabasePublicUrl;
		}

		public String getSupabaseKongUrl() {
			return this.supabaseKongUrl;
		}

		public void setSupabaseKongUrl(String supabaseKongUrl) {
			this.supabaseKongUrl = supabaseKongUrl;
		}

		public String getRdsDatabasePassword() {
			return this.rdsDatabasePassword;
		}

		public void setRdsDatabasePassword(String rdsDatabasePassword) {
			this.rdsDatabasePassword = rdsDatabasePassword;
		}

		public String getSupabaseDashboardUserName() {
			return this.supabaseDashboardUserName;
		}

		public void setSupabaseDashboardUserName(String supabaseDashboardUserName) {
			this.supabaseDashboardUserName = supabaseDashboardUserName;
		}

		public String getSupabaseDashboardPassword() {
			return this.supabaseDashboardPassword;
		}

		public void setSupabaseDashboardPassword(String supabaseDashboardPassword) {
			this.supabaseDashboardPassword = supabaseDashboardPassword;
		}

		public String getSupabasePublicIp() {
			return this.supabasePublicIp;
		}

		public void setSupabasePublicIp(String supabasePublicIp) {
			this.supabasePublicIp = supabasePublicIp;
		}

		public String getSupabasePrivateIp() {
			return this.supabasePrivateIp;
		}

		public void setSupabasePrivateIp(String supabasePrivateIp) {
			this.supabasePrivateIp = supabasePrivateIp;
		}

		public String getServiceKey() {
			return this.serviceKey;
		}

		public void setServiceKey(String serviceKey) {
			this.serviceKey = serviceKey;
		}

		public String getAnonKey() {
			return this.anonKey;
		}

		public void setAnonKey(String anonKey) {
			this.anonKey = anonKey;
		}

		public Integer getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Integer isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getDbInstanceCreateTime() {
			return this.dbInstanceCreateTime;
		}

		public void setDbInstanceCreateTime(String dbInstanceCreateTime) {
			this.dbInstanceCreateTime = dbInstanceCreateTime;
		}

		public String getSupabaseInstanceCreateTime() {
			return this.supabaseInstanceCreateTime;
		}

		public void setSupabaseInstanceCreateTime(String supabaseInstanceCreateTime) {
			this.supabaseInstanceCreateTime = supabaseInstanceCreateTime;
		}

		public String getInstanceCreateStatus() {
			return this.instanceCreateStatus;
		}

		public void setInstanceCreateStatus(String instanceCreateStatus) {
			this.instanceCreateStatus = instanceCreateStatus;
		}

		public String getInstanceCreateFinishedTime() {
			return this.instanceCreateFinishedTime;
		}

		public void setInstanceCreateFinishedTime(String instanceCreateFinishedTime) {
			this.instanceCreateFinishedTime = instanceCreateFinishedTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	@Override
	public AllocateSupabaseForAdminResponse getInstance(UnmarshallerContext context) {
		return	AllocateSupabaseForAdminResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
