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
import com.aliyuncs.sddp.transform.v20190103.DescribeAccountDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountDetailResponse extends AcsResponse {

	private String requestId;

	private Account account;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
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

		private Long aliUid;

		private List<Privilege> privilegeList;

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

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public List<Privilege> getPrivilegeList() {
			return this.privilegeList;
		}

		public void setPrivilegeList(List<Privilege> privilegeList) {
			this.privilegeList = privilegeList;
		}

		public EventCount getEventCount() {
			return this.eventCount;
		}

		public void setEventCount(EventCount eventCount) {
			this.eventCount = eventCount;
		}

		public static class Privilege {

			private String productName;

			private String useAccountId;

			private Integer useAccountType;

			private String useAccountTypeName;

			private Long useAccountCreateTime;

			private String useAccountName;

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getUseAccountId() {
				return this.useAccountId;
			}

			public void setUseAccountId(String useAccountId) {
				this.useAccountId = useAccountId;
			}

			public Integer getUseAccountType() {
				return this.useAccountType;
			}

			public void setUseAccountType(Integer useAccountType) {
				this.useAccountType = useAccountType;
			}

			public String getUseAccountTypeName() {
				return this.useAccountTypeName;
			}

			public void setUseAccountTypeName(String useAccountTypeName) {
				this.useAccountTypeName = useAccountTypeName;
			}

			public Long getUseAccountCreateTime() {
				return this.useAccountCreateTime;
			}

			public void setUseAccountCreateTime(Long useAccountCreateTime) {
				this.useAccountCreateTime = useAccountCreateTime;
			}

			public String getUseAccountName() {
				return this.useAccountName;
			}

			public void setUseAccountName(String useAccountName) {
				this.useAccountName = useAccountName;
			}
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
	public DescribeAccountDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
