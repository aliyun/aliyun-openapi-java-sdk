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
import com.aliyuncs.ccc.transform.v20200701.ListUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUsersResponse extends AcsResponse {

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

		private List<UserDetail> list;

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

		public List<UserDetail> getList() {
			return this.list;
		}

		public void setList(List<UserDetail> list) {
			this.list = list;
		}

		public static class UserDetail {

			private String displayName;

			private String loginName;

			private String email;

			private String workMode;

			private String mobile;

			private String userId;

			private String displayId;

			private String roleName;

			private String roleId;

			private Boolean primaryAccount;

			private Long ramId;

			private String extension;

			private String deviceId;

			private String deviceExt;

			private String deviceState;

			private List<PhoneNumber> personalOutboundNumberList;

			private List<UserSkillLevel> skillLevelList;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getWorkMode() {
				return this.workMode;
			}

			public void setWorkMode(String workMode) {
				this.workMode = workMode;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDisplayId() {
				return this.displayId;
			}

			public void setDisplayId(String displayId) {
				this.displayId = displayId;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getRoleId() {
				return this.roleId;
			}

			public void setRoleId(String roleId) {
				this.roleId = roleId;
			}

			public Boolean getPrimaryAccount() {
				return this.primaryAccount;
			}

			public void setPrimaryAccount(Boolean primaryAccount) {
				this.primaryAccount = primaryAccount;
			}

			public Long getRamId() {
				return this.ramId;
			}

			public void setRamId(Long ramId) {
				this.ramId = ramId;
			}

			public String getExtension() {
				return this.extension;
			}

			public void setExtension(String extension) {
				this.extension = extension;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getDeviceExt() {
				return this.deviceExt;
			}

			public void setDeviceExt(String deviceExt) {
				this.deviceExt = deviceExt;
			}

			public String getDeviceState() {
				return this.deviceState;
			}

			public void setDeviceState(String deviceState) {
				this.deviceState = deviceState;
			}

			public List<PhoneNumber> getPersonalOutboundNumberList() {
				return this.personalOutboundNumberList;
			}

			public void setPersonalOutboundNumberList(List<PhoneNumber> personalOutboundNumberList) {
				this.personalOutboundNumberList = personalOutboundNumberList;
			}

			public List<UserSkillLevel> getSkillLevelList() {
				return this.skillLevelList;
			}

			public void setSkillLevelList(List<UserSkillLevel> skillLevelList) {
				this.skillLevelList = skillLevelList;
			}

			public static class PhoneNumber {

				private String number;

				private Boolean active;

				private String city;

				private String usage;

				private String province;

				public String getNumber() {
					return this.number;
				}

				public void setNumber(String number) {
					this.number = number;
				}

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

				public String getUsage() {
					return this.usage;
				}

				public void setUsage(String usage) {
					this.usage = usage;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}
			}

			public static class UserSkillLevel {

				private Integer skillLevel;

				private String skillGroupId;

				private String skillGroupName;

				public Integer getSkillLevel() {
					return this.skillLevel;
				}

				public void setSkillLevel(Integer skillLevel) {
					this.skillLevel = skillLevel;
				}

				public String getSkillGroupId() {
					return this.skillGroupId;
				}

				public void setSkillGroupId(String skillGroupId) {
					this.skillGroupId = skillGroupId;
				}

				public String getSkillGroupName() {
					return this.skillGroupName;
				}

				public void setSkillGroupName(String skillGroupName) {
					this.skillGroupName = skillGroupName;
				}
			}
		}
	}

	@Override
	public ListUsersResponse getInstance(UnmarshallerContext context) {
		return	ListUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
