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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeUsersInGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUsersInGroupResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer usersCount;

	private Integer onlineUsersCount;

	private List<EndUser> endUsers;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUsersCount() {
		return this.usersCount;
	}

	public void setUsersCount(Integer usersCount) {
		this.usersCount = usersCount;
	}

	public Integer getOnlineUsersCount() {
		return this.onlineUsersCount;
	}

	public void setOnlineUsersCount(Integer onlineUsersCount) {
		this.onlineUsersCount = onlineUsersCount;
	}

	public List<EndUser> getEndUsers() {
		return this.endUsers;
	}

	public void setEndUsers(List<EndUser> endUsers) {
		this.endUsers = endUsers;
	}

	public static class EndUser {

		private String endUserId;

		private String endUserEmail;

		private String desktopName;

		private String connectionStatus;

		private String desktopId;

		private String endUserType;

		private String endUserPhone;

		private String endUserName;

		private List<UserSetPropertiesModelsItem> userSetPropertiesModels;

		private ExternalInfo externalInfo;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEndUserEmail() {
			return this.endUserEmail;
		}

		public void setEndUserEmail(String endUserEmail) {
			this.endUserEmail = endUserEmail;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getEndUserType() {
			return this.endUserType;
		}

		public void setEndUserType(String endUserType) {
			this.endUserType = endUserType;
		}

		public String getEndUserPhone() {
			return this.endUserPhone;
		}

		public void setEndUserPhone(String endUserPhone) {
			this.endUserPhone = endUserPhone;
		}

		public String getEndUserName() {
			return this.endUserName;
		}

		public void setEndUserName(String endUserName) {
			this.endUserName = endUserName;
		}

		public List<UserSetPropertiesModelsItem> getUserSetPropertiesModels() {
			return this.userSetPropertiesModels;
		}

		public void setUserSetPropertiesModels(List<UserSetPropertiesModelsItem> userSetPropertiesModels) {
			this.userSetPropertiesModels = userSetPropertiesModels;
		}

		public ExternalInfo getExternalInfo() {
			return this.externalInfo;
		}

		public void setExternalInfo(ExternalInfo externalInfo) {
			this.externalInfo = externalInfo;
		}

		public static class UserSetPropertiesModelsItem {

			private Long userId;

			private String userName;

			private Long propertyId;

			private String propertyKey;

			private Integer propertyType;

			private List<PropertyValuesItem> propertyValues;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Long getPropertyId() {
				return this.propertyId;
			}

			public void setPropertyId(Long propertyId) {
				this.propertyId = propertyId;
			}

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public Integer getPropertyType() {
				return this.propertyType;
			}

			public void setPropertyType(Integer propertyType) {
				this.propertyType = propertyType;
			}

			public List<PropertyValuesItem> getPropertyValues() {
				return this.propertyValues;
			}

			public void setPropertyValues(List<PropertyValuesItem> propertyValues) {
				this.propertyValues = propertyValues;
			}

			public static class PropertyValuesItem {

				private Long propertyValueId;

				private String propertyValue;

				public Long getPropertyValueId() {
					return this.propertyValueId;
				}

				public void setPropertyValueId(Long propertyValueId) {
					this.propertyValueId = propertyValueId;
				}

				public String getPropertyValue() {
					return this.propertyValue;
				}

				public void setPropertyValue(String propertyValue) {
					this.propertyValue = propertyValue;
				}
			}
		}

		public static class ExternalInfo {

			private String externalName;

			private String jobNumber;

			public String getExternalName() {
				return this.externalName;
			}

			public void setExternalName(String externalName) {
				this.externalName = externalName;
			}

			public String getJobNumber() {
				return this.jobNumber;
			}

			public void setJobNumber(String jobNumber) {
				this.jobNumber = jobNumber;
			}
		}
	}

	@Override
	public DescribeUsersInGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeUsersInGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
