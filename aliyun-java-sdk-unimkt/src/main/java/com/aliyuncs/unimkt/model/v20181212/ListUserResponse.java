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

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private Long total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SspUserDTOModel> model;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<SspUserDTOModel> getModel() {
		return this.model;
	}

	public void setModel(List<SspUserDTOModel> model) {
		this.model = model;
	}

	public static class SspUserDTOModel {

		private String sspUserId;

		private Long gmtCreateTime;

		private Long gmtModifiedTime;

		private String isDeleteTag;

		private String userName;

		private String yunUid;

		private String yunPersonsId;

		private String mobilePhone;

		private String email;

		private String status;

		private String tenantId;

		private String tenantUserId;

		private String roleCode;

		public String getSspUserId() {
			return this.sspUserId;
		}

		public void setSspUserId(String sspUserId) {
			this.sspUserId = sspUserId;
		}

		public Long getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(Long gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public Long getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(Long gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getIsDeleteTag() {
			return this.isDeleteTag;
		}

		public void setIsDeleteTag(String isDeleteTag) {
			this.isDeleteTag = isDeleteTag;
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

		public String getYunPersonsId() {
			return this.yunPersonsId;
		}

		public void setYunPersonsId(String yunPersonsId) {
			this.yunPersonsId = yunPersonsId;
		}

		public String getMobilePhone() {
			return this.mobilePhone;
		}

		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantUserId() {
			return this.tenantUserId;
		}

		public void setTenantUserId(String tenantUserId) {
			this.tenantUserId = tenantUserId;
		}

		public String getRoleCode() {
			return this.roleCode;
		}

		public void setRoleCode(String roleCode) {
			this.roleCode = roleCode;
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
