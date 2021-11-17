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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive_biz.transform.v20210214.RequestDeviceStateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RequestDeviceStateResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String liveMode;

		private String deviceName;

		private String deviceId;

		private String liveId;

		private String liveStatus;

		private Integer userRole;

		private String liveType;

		private String deviceConnState;

		private Boolean isAuthorizeLive;

		private String systemVersion;

		private Binder binder;

		private CurrentUser currentUser;

		private Service service;

		public String getLiveMode() {
			return this.liveMode;
		}

		public void setLiveMode(String liveMode) {
			this.liveMode = liveMode;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getLiveId() {
			return this.liveId;
		}

		public void setLiveId(String liveId) {
			this.liveId = liveId;
		}

		public String getLiveStatus() {
			return this.liveStatus;
		}

		public void setLiveStatus(String liveStatus) {
			this.liveStatus = liveStatus;
		}

		public Integer getUserRole() {
			return this.userRole;
		}

		public void setUserRole(Integer userRole) {
			this.userRole = userRole;
		}

		public String getLiveType() {
			return this.liveType;
		}

		public void setLiveType(String liveType) {
			this.liveType = liveType;
		}

		public String getDeviceConnState() {
			return this.deviceConnState;
		}

		public void setDeviceConnState(String deviceConnState) {
			this.deviceConnState = deviceConnState;
		}

		public Boolean getIsAuthorizeLive() {
			return this.isAuthorizeLive;
		}

		public void setIsAuthorizeLive(Boolean isAuthorizeLive) {
			this.isAuthorizeLive = isAuthorizeLive;
		}

		public String getSystemVersion() {
			return this.systemVersion;
		}

		public void setSystemVersion(String systemVersion) {
			this.systemVersion = systemVersion;
		}

		public Binder getBinder() {
			return this.binder;
		}

		public void setBinder(Binder binder) {
			this.binder = binder;
		}

		public CurrentUser getCurrentUser() {
			return this.currentUser;
		}

		public void setCurrentUser(CurrentUser currentUser) {
			this.currentUser = currentUser;
		}

		public Service getService() {
			return this.service;
		}

		public void setService(Service service) {
			this.service = service;
		}

		public static class Binder {

			private String userSource;

			private String userId;

			public String getUserSource() {
				return this.userSource;
			}

			public void setUserSource(String userSource) {
				this.userSource = userSource;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class CurrentUser {

			private String userSource;

			private String userId;

			public String getUserSource() {
				return this.userSource;
			}

			public void setUserSource(String userSource) {
				this.userSource = userSource;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class Service {

			private String servicePackName;

			private Long serviceEffectAt;

			private Long serviceExpireAt;

			public String getServicePackName() {
				return this.servicePackName;
			}

			public void setServicePackName(String servicePackName) {
				this.servicePackName = servicePackName;
			}

			public Long getServiceEffectAt() {
				return this.serviceEffectAt;
			}

			public void setServiceEffectAt(Long serviceEffectAt) {
				this.serviceEffectAt = serviceEffectAt;
			}

			public Long getServiceExpireAt() {
				return this.serviceExpireAt;
			}

			public void setServiceExpireAt(Long serviceExpireAt) {
				this.serviceExpireAt = serviceExpireAt;
			}
		}
	}

	@Override
	public RequestDeviceStateResponse getInstance(UnmarshallerContext context) {
		return	RequestDeviceStateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
