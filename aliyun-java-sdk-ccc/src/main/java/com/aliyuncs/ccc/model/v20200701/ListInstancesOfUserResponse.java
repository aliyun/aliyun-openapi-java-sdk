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
import com.aliyuncs.ccc.transform.v20200701.ListInstancesOfUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesOfUserResponse extends AcsResponse {

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

		private List<CallCenterInstance> list;

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

		public List<CallCenterInstance> getList() {
			return this.list;
		}

		public void setList(List<CallCenterInstance> list) {
			this.list = list;
		}

		public static class CallCenterInstance {

			private String aliyunUid;

			private String consoleUrl;

			private String description;

			private String domainName;

			private String id;

			private String name;

			private String status;

			private List<User> adminList;

			private List<PhoneNumber> numberList;

			public String getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(String aliyunUid) {
				this.aliyunUid = aliyunUid;
			}

			public String getConsoleUrl() {
				return this.consoleUrl;
			}

			public void setConsoleUrl(String consoleUrl) {
				this.consoleUrl = consoleUrl;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<User> getAdminList() {
				return this.adminList;
			}

			public void setAdminList(List<User> adminList) {
				this.adminList = adminList;
			}

			public List<PhoneNumber> getNumberList() {
				return this.numberList;
			}

			public void setNumberList(List<PhoneNumber> numberList) {
				this.numberList = numberList;
			}

			public static class User {

				private String displayName;

				private String email;

				private String extension;

				private String instanceId;

				private String loginName;

				private String mobile;

				private String roleId;

				private String roleName;

				private String userId;

				private String workMode;

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

				public String getExtension() {
					return this.extension;
				}

				public void setExtension(String extension) {
					this.extension = extension;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
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

				public String getRoleId() {
					return this.roleId;
				}

				public void setRoleId(String roleId) {
					this.roleId = roleId;
				}

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getWorkMode() {
					return this.workMode;
				}

				public void setWorkMode(String workMode) {
					this.workMode = workMode;
				}
			}

			public static class PhoneNumber {

				private Boolean active;

				private String city;

				private String contactFlowId;

				private String instanceId;

				private String number;

				private String province;

				private String usage;

				private String userId;

				private List<SkillGroup> skillGroups;

				public Boolean getActive() {
					return this.active;
				}

				public void setActive(Boolean active) {
					this.active = active;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public String getContactFlowId() {
					return this.contactFlowId;
				}

				public void setContactFlowId(String contactFlowId) {
					this.contactFlowId = contactFlowId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getNumber() {
					return this.number;
				}

				public void setNumber(String number) {
					this.number = number;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				public String getUsage() {
					return this.usage;
				}

				public void setUsage(String usage) {
					this.usage = usage;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public List<SkillGroup> getSkillGroups() {
					return this.skillGroups;
				}

				public void setSkillGroups(List<SkillGroup> skillGroups) {
					this.skillGroups = skillGroups;
				}

				public static class SkillGroup {

					private String description;

					private String displayName;

					private String instanceId;

					private String name;

					private Integer phoneNumberCount;

					private String skillGroupId;

					private Integer userCount;

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public String getDisplayName() {
						return this.displayName;
					}

					public void setDisplayName(String displayName) {
						this.displayName = displayName;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Integer getPhoneNumberCount() {
						return this.phoneNumberCount;
					}

					public void setPhoneNumberCount(Integer phoneNumberCount) {
						this.phoneNumberCount = phoneNumberCount;
					}

					public String getSkillGroupId() {
						return this.skillGroupId;
					}

					public void setSkillGroupId(String skillGroupId) {
						this.skillGroupId = skillGroupId;
					}

					public Integer getUserCount() {
						return this.userCount;
					}

					public void setUserCount(Integer userCount) {
						this.userCount = userCount;
					}
				}
			}
		}
	}

	@Override
	public ListInstancesOfUserResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesOfUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
