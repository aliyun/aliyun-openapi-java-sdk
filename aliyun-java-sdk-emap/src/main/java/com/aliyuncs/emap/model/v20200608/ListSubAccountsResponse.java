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

package com.aliyuncs.emap.model.v20200608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emap.transform.v20200608.ListSubAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubAccountsResponse extends AcsResponse {

	private String message;

	private String errorCode;

	private String errorMessage;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private String dynamicCode;

	private String code;

	private Integer pageSize;

	private Integer pageNumber;

	private Long totalCount;

	private List<SubAccount> subAccounts;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

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

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SubAccount> getSubAccounts() {
		return this.subAccounts;
	}

	public void setSubAccounts(List<SubAccount> subAccounts) {
		this.subAccounts = subAccounts;
	}

	public static class SubAccount {

		private String name;

		private Long id;

		private String callerUid;

		private Integer status;

		private List<PermissionData> permissions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCallerUid() {
			return this.callerUid;
		}

		public void setCallerUid(String callerUid) {
			this.callerUid = callerUid;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<PermissionData> getPermissions() {
			return this.permissions;
		}

		public void setPermissions(List<PermissionData> permissions) {
			this.permissions = permissions;
		}

		public static class PermissionData {

			private String type;

			private String option;

			private String desc;

			private String uniqueId;

			private Long id;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getOption() {
				return this.option;
			}

			public void setOption(String option) {
				this.option = option;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			public String getUniqueId() {
				return this.uniqueId;
			}

			public void setUniqueId(String uniqueId) {
				this.uniqueId = uniqueId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public ListSubAccountsResponse getInstance(UnmarshallerContext context) {
		return	ListSubAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
