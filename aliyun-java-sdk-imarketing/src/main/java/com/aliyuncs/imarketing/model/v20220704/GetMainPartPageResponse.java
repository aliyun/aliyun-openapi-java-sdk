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

package com.aliyuncs.imarketing.model.v20220704;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imarketing.transform.v20220704.GetMainPartPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMainPartPageResponse extends AcsResponse {

	private Long code;

	private Boolean success;

	private String requestId;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ListItem> list;

		private PageInfo pageInfo;

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class ListItem {

			private String company;

			private Long mainId;

			private String mainName;

			private List<AccountTypeListItem> accountTypeList;

			public String getCompany() {
				return this.company;
			}

			public void setCompany(String company) {
				this.company = company;
			}

			public Long getMainId() {
				return this.mainId;
			}

			public void setMainId(Long mainId) {
				this.mainId = mainId;
			}

			public String getMainName() {
				return this.mainName;
			}

			public void setMainName(String mainName) {
				this.mainName = mainName;
			}

			public List<AccountTypeListItem> getAccountTypeList() {
				return this.accountTypeList;
			}

			public void setAccountTypeList(List<AccountTypeListItem> accountTypeList) {
				this.accountTypeList = accountTypeList;
			}

			public static class AccountTypeListItem {

				private String accountType;

				private String accountTypeDesc;

				public String getAccountType() {
					return this.accountType;
				}

				public void setAccountType(String accountType) {
					this.accountType = accountType;
				}

				public String getAccountTypeDesc() {
					return this.accountTypeDesc;
				}

				public void setAccountTypeDesc(String accountTypeDesc) {
					this.accountTypeDesc = accountTypeDesc;
				}
			}
		}

		public static class PageInfo {

			private Integer page;

			private Integer pageSize;

			private Integer totalNumber;

			public Integer getPage() {
				return this.page;
			}

			public void setPage(Integer page) {
				this.page = page;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getTotalNumber() {
				return this.totalNumber;
			}

			public void setTotalNumber(Integer totalNumber) {
				this.totalNumber = totalNumber;
			}
		}
	}

	@Override
	public GetMainPartPageResponse getInstance(UnmarshallerContext context) {
		return	GetMainPartPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
