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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Account> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Account> getItems() {
		return this.items;
	}

	public void setItems(List<Account> items) {
		this.items = items;
	}

	public static class Account {

		private Long id;

		private Long userId;

		private Long firstLevelDepartId;

		private String loginName;

		private String fullName;

		private String cellphoneNum;

		private String telephoneNum;

		private String email;

		private String activeStatus;

		private String deleteStatus;

		private String dataInstance;

		private Long createTime;

		private Long loginDataTime;

		private String loginPolicyName;

		private String firstLevelDepartName;

		private String roleNames;

		private String instanceName;

		private Long aliUid;

		private Long accountTypeId;

		private EventCount eventCount;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public Long getFirstLevelDepartId() {
			return this.firstLevelDepartId;
		}

		public void setFirstLevelDepartId(Long firstLevelDepartId) {
			this.firstLevelDepartId = firstLevelDepartId;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getFullName() {
			return this.fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getCellphoneNum() {
			return this.cellphoneNum;
		}

		public void setCellphoneNum(String cellphoneNum) {
			this.cellphoneNum = cellphoneNum;
		}

		public String getTelephoneNum() {
			return this.telephoneNum;
		}

		public void setTelephoneNum(String telephoneNum) {
			this.telephoneNum = telephoneNum;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getActiveStatus() {
			return this.activeStatus;
		}

		public void setActiveStatus(String activeStatus) {
			this.activeStatus = activeStatus;
		}

		public String getDeleteStatus() {
			return this.deleteStatus;
		}

		public void setDeleteStatus(String deleteStatus) {
			this.deleteStatus = deleteStatus;
		}

		public String getDataInstance() {
			return this.dataInstance;
		}

		public void setDataInstance(String dataInstance) {
			this.dataInstance = dataInstance;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLoginDataTime() {
			return this.loginDataTime;
		}

		public void setLoginDataTime(Long loginDataTime) {
			this.loginDataTime = loginDataTime;
		}

		public String getLoginPolicyName() {
			return this.loginPolicyName;
		}

		public void setLoginPolicyName(String loginPolicyName) {
			this.loginPolicyName = loginPolicyName;
		}

		public String getFirstLevelDepartName() {
			return this.firstLevelDepartName;
		}

		public void setFirstLevelDepartName(String firstLevelDepartName) {
			this.firstLevelDepartName = firstLevelDepartName;
		}

		public String getRoleNames() {
			return this.roleNames;
		}

		public void setRoleNames(String roleNames) {
			this.roleNames = roleNames;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getAccountTypeId() {
			return this.accountTypeId;
		}

		public void setAccountTypeId(Long accountTypeId) {
			this.accountTypeId = accountTypeId;
		}

		public EventCount getEventCount() {
			return this.eventCount;
		}

		public void setEventCount(EventCount eventCount) {
			this.eventCount = eventCount;
		}

		public static class EventCount {

			private Total total;

			public Total getTotal() {
				return this.total;
			}

			public void setTotal(Total total) {
				this.total = total;
			}

			public static class Total {

				private Long totalCount;

				private Long undealCount;

				private Long confirmCount;

				private Long excludeCount;

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public Long getUndealCount() {
					return this.undealCount;
				}

				public void setUndealCount(Long undealCount) {
					this.undealCount = undealCount;
				}

				public Long getConfirmCount() {
					return this.confirmCount;
				}

				public void setConfirmCount(Long confirmCount) {
					this.confirmCount = confirmCount;
				}

				public Long getExcludeCount() {
					return this.excludeCount;
				}

				public void setExcludeCount(Long excludeCount) {
					this.excludeCount = excludeCount;
				}
			}
		}
	}

	@Override
	public DescribeAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
