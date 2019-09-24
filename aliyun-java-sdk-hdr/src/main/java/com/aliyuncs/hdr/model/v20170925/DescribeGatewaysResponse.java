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

package com.aliyuncs.hdr.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewaysResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Gateway> gateways;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<Gateway> getGateways() {
		return this.gateways;
	}

	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

	public static class Gateway {

		private String gatewayId;

		private String sitePairId;

		private String siteName;

		private String gatewayName;

		private String gatewayDescription;

		private String gatewayIp;

		private String gatewayClass;

		private String storeInstanceId;

		private String mCInstanceId;

		private Integer backupWorkload;

		private Integer recoveryWorkload;

		private String taskId;

		private String status;

		private String mcUsername;

		private String mcPassword;

		private Long createdTime;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getSitePairId() {
			return this.sitePairId;
		}

		public void setSitePairId(String sitePairId) {
			this.sitePairId = sitePairId;
		}

		public String getSiteName() {
			return this.siteName;
		}

		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getGatewayDescription() {
			return this.gatewayDescription;
		}

		public void setGatewayDescription(String gatewayDescription) {
			this.gatewayDescription = gatewayDescription;
		}

		public String getGatewayIp() {
			return this.gatewayIp;
		}

		public void setGatewayIp(String gatewayIp) {
			this.gatewayIp = gatewayIp;
		}

		public String getGatewayClass() {
			return this.gatewayClass;
		}

		public void setGatewayClass(String gatewayClass) {
			this.gatewayClass = gatewayClass;
		}

		public String getStoreInstanceId() {
			return this.storeInstanceId;
		}

		public void setStoreInstanceId(String storeInstanceId) {
			this.storeInstanceId = storeInstanceId;
		}

		public String getMCInstanceId() {
			return this.mCInstanceId;
		}

		public void setMCInstanceId(String mCInstanceId) {
			this.mCInstanceId = mCInstanceId;
		}

		public Integer getBackupWorkload() {
			return this.backupWorkload;
		}

		public void setBackupWorkload(Integer backupWorkload) {
			this.backupWorkload = backupWorkload;
		}

		public Integer getRecoveryWorkload() {
			return this.recoveryWorkload;
		}

		public void setRecoveryWorkload(Integer recoveryWorkload) {
			this.recoveryWorkload = recoveryWorkload;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMcUsername() {
			return this.mcUsername;
		}

		public void setMcUsername(String mcUsername) {
			this.mcUsername = mcUsername;
		}

		public String getMcPassword() {
			return this.mcPassword;
		}

		public void setMcPassword(String mcPassword) {
			this.mcPassword = mcPassword;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
