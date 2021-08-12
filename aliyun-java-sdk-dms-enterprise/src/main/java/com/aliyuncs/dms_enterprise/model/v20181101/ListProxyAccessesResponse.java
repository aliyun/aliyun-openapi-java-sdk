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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListProxyAccessesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProxyAccessesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private List<ProxyAccessListItem> proxyAccessList;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<ProxyAccessListItem> getProxyAccessList() {
		return this.proxyAccessList;
	}

	public void setProxyAccessList(List<ProxyAccessListItem> proxyAccessList) {
		this.proxyAccessList = proxyAccessList;
	}

	public static class ProxyAccessListItem {

		private Long proxyAccessId;

		private String gmtCreate;

		private String accessId;

		private String originInfo;

		private String indepAccount;

		private Long userId;

		private String userUid;

		private String userName;

		private Long proxyId;

		private Long instanceId;

		public Long getProxyAccessId() {
			return this.proxyAccessId;
		}

		public void setProxyAccessId(Long proxyAccessId) {
			this.proxyAccessId = proxyAccessId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public String getOriginInfo() {
			return this.originInfo;
		}

		public void setOriginInfo(String originInfo) {
			this.originInfo = originInfo;
		}

		public String getIndepAccount() {
			return this.indepAccount;
		}

		public void setIndepAccount(String indepAccount) {
			this.indepAccount = indepAccount;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getUserUid() {
			return this.userUid;
		}

		public void setUserUid(String userUid) {
			this.userUid = userUid;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getProxyId() {
			return this.proxyId;
		}

		public void setProxyId(Long proxyId) {
			this.proxyId = proxyId;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public ListProxyAccessesResponse getInstance(UnmarshallerContext context) {
		return	ListProxyAccessesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
