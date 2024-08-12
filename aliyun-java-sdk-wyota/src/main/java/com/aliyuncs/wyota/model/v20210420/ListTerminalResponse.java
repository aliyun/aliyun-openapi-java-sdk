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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.ListTerminalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTerminalResponse extends AcsResponse {

	private String nextToken;

	private Integer totalCount;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private List<DataItem> data;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String serialNumber;

		private String uuid;

		private String terminalGroupId;

		private String model;

		private Boolean onlineStatus;

		private String lastLoginUser;

		private String locationInfo;

		private String ipv4;

		private String alias;

		private String buildId;

		private Integer clientType;

		private Boolean inManage;

		private Boolean lockSettings;

		private String bindUserId;

		private Integer bindUserCount;

		private String loginUser;

		private String desktopId;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getTerminalGroupId() {
			return this.terminalGroupId;
		}

		public void setTerminalGroupId(String terminalGroupId) {
			this.terminalGroupId = terminalGroupId;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Boolean getOnlineStatus() {
			return this.onlineStatus;
		}

		public void setOnlineStatus(Boolean onlineStatus) {
			this.onlineStatus = onlineStatus;
		}

		public String getLastLoginUser() {
			return this.lastLoginUser;
		}

		public void setLastLoginUser(String lastLoginUser) {
			this.lastLoginUser = lastLoginUser;
		}

		public String getLocationInfo() {
			return this.locationInfo;
		}

		public void setLocationInfo(String locationInfo) {
			this.locationInfo = locationInfo;
		}

		public String getIpv4() {
			return this.ipv4;
		}

		public void setIpv4(String ipv4) {
			this.ipv4 = ipv4;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getBuildId() {
			return this.buildId;
		}

		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}

		public Integer getClientType() {
			return this.clientType;
		}

		public void setClientType(Integer clientType) {
			this.clientType = clientType;
		}

		public Boolean getInManage() {
			return this.inManage;
		}

		public void setInManage(Boolean inManage) {
			this.inManage = inManage;
		}

		public Boolean getLockSettings() {
			return this.lockSettings;
		}

		public void setLockSettings(Boolean lockSettings) {
			this.lockSettings = lockSettings;
		}

		public String getBindUserId() {
			return this.bindUserId;
		}

		public void setBindUserId(String bindUserId) {
			this.bindUserId = bindUserId;
		}

		public Integer getBindUserCount() {
			return this.bindUserCount;
		}

		public void setBindUserCount(Integer bindUserCount) {
			this.bindUserCount = bindUserCount;
		}

		public String getLoginUser() {
			return this.loginUser;
		}

		public void setLoginUser(String loginUser) {
			this.loginUser = loginUser;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}
	}

	@Override
	public ListTerminalResponse getInstance(UnmarshallerContext context) {
		return	ListTerminalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
