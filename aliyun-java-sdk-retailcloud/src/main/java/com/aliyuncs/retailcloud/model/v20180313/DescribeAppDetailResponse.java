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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeAppDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppDetailResponse extends AcsResponse {

	private Long code;

	private String requestId;

	private String errMessage;

	private Result result;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String serviceType;

		private String bizTitle;

		private String bizName;

		private Long appId;

		private String language;

		private String title;

		private String operatingSystem;

		private String deployType;

		private String description;

		private String appStateType;

		private List<UserRole> userRoles;

		private List<MiddleWareInfo> middleWareInfoList;

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getBizTitle() {
			return this.bizTitle;
		}

		public void setBizTitle(String bizTitle) {
			this.bizTitle = bizTitle;
		}

		public String getBizName() {
			return this.bizName;
		}

		public void setBizName(String bizName) {
			this.bizName = bizName;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getOperatingSystem() {
			return this.operatingSystem;
		}

		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAppStateType() {
			return this.appStateType;
		}

		public void setAppStateType(String appStateType) {
			this.appStateType = appStateType;
		}

		public List<UserRole> getUserRoles() {
			return this.userRoles;
		}

		public void setUserRoles(List<UserRole> userRoles) {
			this.userRoles = userRoles;
		}

		public List<MiddleWareInfo> getMiddleWareInfoList() {
			return this.middleWareInfoList;
		}

		public void setMiddleWareInfoList(List<MiddleWareInfo> middleWareInfoList) {
			this.middleWareInfoList = middleWareInfoList;
		}

		public static class UserRole {

			private String userId;

			private String userType;

			private String realName;

			private String roleName;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}
		}

		public static class MiddleWareInfo {

			private Long appId;

			private Integer code;

			private String name;

			public Long getAppId() {
				return this.appId;
			}

			public void setAppId(Long appId) {
				this.appId = appId;
			}

			public Integer getCode() {
				return this.code;
			}

			public void setCode(Integer code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeAppDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
