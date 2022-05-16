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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeNamespaceResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNamespaceResourcesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String vpcId;

		private String lastChangeOrderId;

		private String belongRegion;

		private String namespaceId;

		private String securityGroupId;

		private String userId;

		private String namespaceName;

		private String lastChangeOrderStatus;

		private String vpcName;

		private String vSwitchId;

		private String description;

		private Boolean lastChangeOrderRunning;

		private Long appCount;

		private String vSwitchName;

		private Boolean notificationExpired;

		private String tenantId;

		private String jumpServerAppId;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getLastChangeOrderId() {
			return this.lastChangeOrderId;
		}

		public void setLastChangeOrderId(String lastChangeOrderId) {
			this.lastChangeOrderId = lastChangeOrderId;
		}

		public String getBelongRegion() {
			return this.belongRegion;
		}

		public void setBelongRegion(String belongRegion) {
			this.belongRegion = belongRegion;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getNamespaceName() {
			return this.namespaceName;
		}

		public void setNamespaceName(String namespaceName) {
			this.namespaceName = namespaceName;
		}

		public String getLastChangeOrderStatus() {
			return this.lastChangeOrderStatus;
		}

		public void setLastChangeOrderStatus(String lastChangeOrderStatus) {
			this.lastChangeOrderStatus = lastChangeOrderStatus;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getLastChangeOrderRunning() {
			return this.lastChangeOrderRunning;
		}

		public void setLastChangeOrderRunning(Boolean lastChangeOrderRunning) {
			this.lastChangeOrderRunning = lastChangeOrderRunning;
		}

		public Long getAppCount() {
			return this.appCount;
		}

		public void setAppCount(Long appCount) {
			this.appCount = appCount;
		}

		public String getVSwitchName() {
			return this.vSwitchName;
		}

		public void setVSwitchName(String vSwitchName) {
			this.vSwitchName = vSwitchName;
		}

		public Boolean getNotificationExpired() {
			return this.notificationExpired;
		}

		public void setNotificationExpired(Boolean notificationExpired) {
			this.notificationExpired = notificationExpired;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getJumpServerAppId() {
			return this.jumpServerAppId;
		}

		public void setJumpServerAppId(String jumpServerAppId) {
			this.jumpServerAppId = jumpServerAppId;
		}
	}

	@Override
	public DescribeNamespaceResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNamespaceResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
