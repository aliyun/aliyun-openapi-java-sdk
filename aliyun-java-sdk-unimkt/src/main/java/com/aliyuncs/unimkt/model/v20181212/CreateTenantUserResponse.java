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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.CreateTenantUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTenantUserResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private Model model;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Long createTime;

		private Long modifyTime;

		private String tenantId;

		private String tenantName;

		private String business;

		private String userId;

		private String userName;

		private String settleInfo;

		private String extInfo;

		private String status;

		private String originSite;

		private String originSiteUserId;

		private String originSiteUserName;

		private String status1;

		private String extInfo2;

		private String version;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getBusiness() {
			return this.business;
		}

		public void setBusiness(String business) {
			this.business = business;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getSettleInfo() {
			return this.settleInfo;
		}

		public void setSettleInfo(String settleInfo) {
			this.settleInfo = settleInfo;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOriginSite() {
			return this.originSite;
		}

		public void setOriginSite(String originSite) {
			this.originSite = originSite;
		}

		public String getOriginSiteUserId() {
			return this.originSiteUserId;
		}

		public void setOriginSiteUserId(String originSiteUserId) {
			this.originSiteUserId = originSiteUserId;
		}

		public String getOriginSiteUserName() {
			return this.originSiteUserName;
		}

		public void setOriginSiteUserName(String originSiteUserName) {
			this.originSiteUserName = originSiteUserName;
		}

		public String getStatus1() {
			return this.status1;
		}

		public void setStatus1(String status1) {
			this.status1 = status1;
		}

		public String getExtInfo2() {
			return this.extInfo2;
		}

		public void setExtInfo2(String extInfo2) {
			this.extInfo2 = extInfo2;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public CreateTenantUserResponse getInstance(UnmarshallerContext context) {
		return	CreateTenantUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
