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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetSubAccountInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubAccountInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Authorization authorization;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public Authorization getAuthorization() {
		return this.authorization;
	}

	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}

	public static class Authorization {

		private String adminUserId;

		private String adminEdasId;

		private String userId;

		private String edasId;

		private String appIdData;

		private String roleIdData;

		private Long createTime;

		private Long updateTime;

		private Long resGroupId;

		private String resGroupIdData;

		private Boolean isRamSlave;

		private Boolean isRamDel;

		private String subUserKp;

		private Boolean ramOperation;

		private Boolean delegateAdmin;

		private Boolean sts;

		public String getAdminUserId() {
			return this.adminUserId;
		}

		public void setAdminUserId(String adminUserId) {
			this.adminUserId = adminUserId;
		}

		public String getAdminEdasId() {
			return this.adminEdasId;
		}

		public void setAdminEdasId(String adminEdasId) {
			this.adminEdasId = adminEdasId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getEdasId() {
			return this.edasId;
		}

		public void setEdasId(String edasId) {
			this.edasId = edasId;
		}

		public String getAppIdData() {
			return this.appIdData;
		}

		public void setAppIdData(String appIdData) {
			this.appIdData = appIdData;
		}

		public String getRoleIdData() {
			return this.roleIdData;
		}

		public void setRoleIdData(String roleIdData) {
			this.roleIdData = roleIdData;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Long getResGroupId() {
			return this.resGroupId;
		}

		public void setResGroupId(Long resGroupId) {
			this.resGroupId = resGroupId;
		}

		public String getResGroupIdData() {
			return this.resGroupIdData;
		}

		public void setResGroupIdData(String resGroupIdData) {
			this.resGroupIdData = resGroupIdData;
		}

		public Boolean getIsRamSlave() {
			return this.isRamSlave;
		}

		public void setIsRamSlave(Boolean isRamSlave) {
			this.isRamSlave = isRamSlave;
		}

		public Boolean getIsRamDel() {
			return this.isRamDel;
		}

		public void setIsRamDel(Boolean isRamDel) {
			this.isRamDel = isRamDel;
		}

		public String getSubUserKp() {
			return this.subUserKp;
		}

		public void setSubUserKp(String subUserKp) {
			this.subUserKp = subUserKp;
		}

		public Boolean getRamOperation() {
			return this.ramOperation;
		}

		public void setRamOperation(Boolean ramOperation) {
			this.ramOperation = ramOperation;
		}

		public Boolean getDelegateAdmin() {
			return this.delegateAdmin;
		}

		public void setDelegateAdmin(Boolean delegateAdmin) {
			this.delegateAdmin = delegateAdmin;
		}

		public Boolean getSts() {
			return this.sts;
		}

		public void setSts(Boolean sts) {
			this.sts = sts;
		}
	}

	@Override
	public GetSubAccountInfoResponse getInstance(UnmarshallerContext context) {
		return	GetSubAccountInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
