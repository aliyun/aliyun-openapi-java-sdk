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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListRamUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRamUsersResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<String> params;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RamUser> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<RamUser> getList() {
			return this.list;
		}

		public void setList(List<RamUser> list) {
			this.list = list;
		}

		public static class RamUser {

			private Long aliyunUid;

			private String displayName;

			private String email;

			private String loginName;

			private String mobile;

			private Boolean primary;

			private String ramId;

			public Long getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(Long aliyunUid) {
				this.aliyunUid = aliyunUid;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public Boolean getPrimary() {
				return this.primary;
			}

			public void setPrimary(Boolean primary) {
				this.primary = primary;
			}

			public String getRamId() {
				return this.ramId;
			}

			public void setRamId(String ramId) {
				this.ramId = ramId;
			}
		}
	}

	@Override
	public ListRamUsersResponse getInstance(UnmarshallerContext context) {
		return	ListRamUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
