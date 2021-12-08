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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.ListUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Long total;

	private List<SspUserDTOModel> model;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<SspUserDTOModel> getModel() {
		return this.model;
	}

	public void setModel(List<SspUserDTOModel> model) {
		this.model = model;
	}

	public static class SspUserDTOModel {

		private String status;

		private String yunPersonsId;

		private String sspUserId;

		private String tenantUserId;

		private String mobilePhone;

		private String roleCode;

		private Long gmtModifiedTime;

		private Long gmtCreateTime;

		private String email;

		private String userName;

		private String yunUid;

		private String isDeleteTag;

		private String tenantId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getYunPersonsId() {
			return this.yunPersonsId;
		}

		public void setYunPersonsId(String yunPersonsId) {
			this.yunPersonsId = yunPersonsId;
		}

		public String getSspUserId() {
			return this.sspUserId;
		}

		public void setSspUserId(String sspUserId) {
			this.sspUserId = sspUserId;
		}

		public String getTenantUserId() {
			return this.tenantUserId;
		}

		public void setTenantUserId(String tenantUserId) {
			this.tenantUserId = tenantUserId;
		}

		public String getMobilePhone() {
			return this.mobilePhone;
		}

		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public String getRoleCode() {
			return this.roleCode;
		}

		public void setRoleCode(String roleCode) {
			this.roleCode = roleCode;
		}

		public Long getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(Long gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public Long getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(Long gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getYunUid() {
			return this.yunUid;
		}

		public void setYunUid(String yunUid) {
			this.yunUid = yunUid;
		}

		public String getIsDeleteTag() {
			return this.isDeleteTag;
		}

		public void setIsDeleteTag(String isDeleteTag) {
			this.isDeleteTag = isDeleteTag;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	@Override
	public ListUserResponse getInstance(UnmarshallerContext context) {
		return	ListUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
