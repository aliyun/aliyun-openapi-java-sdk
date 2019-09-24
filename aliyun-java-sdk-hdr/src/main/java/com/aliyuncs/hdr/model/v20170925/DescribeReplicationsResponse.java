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
import com.aliyuncs.hdr.transform.v20170925.DescribeReplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Replication> replications;

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

	public List<Replication> getReplications() {
		return this.replications;
	}

	public void setReplications(List<Replication> replications) {
		this.replications = replications;
	}

	public static class Replication {

		private String replicationId;

		private String gatewayId;

		private String gatewayName;

		private String instanceIp;

		private String instanceName;

		private String osType;

		private String backupType;

		private String applications;

		private Long protectedTime;

		private String status;

		public String getReplicationId() {
			return this.replicationId;
		}

		public void setReplicationId(String replicationId) {
			this.replicationId = replicationId;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getInstanceIp() {
			return this.instanceIp;
		}

		public void setInstanceIp(String instanceIp) {
			this.instanceIp = instanceIp;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getApplications() {
			return this.applications;
		}

		public void setApplications(String applications) {
			this.applications = applications;
		}

		public Long getProtectedTime() {
			return this.protectedTime;
		}

		public void setProtectedTime(Long protectedTime) {
			this.protectedTime = protectedTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeReplicationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicationsResponseUnmarshaller.unmarshall(this, context);
	}
}
