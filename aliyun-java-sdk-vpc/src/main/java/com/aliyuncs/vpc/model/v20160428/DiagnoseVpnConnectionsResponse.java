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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DiagnoseVpnConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DiagnoseVpnConnectionsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<VpnConnection> vpnConnections;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpnConnection> getVpnConnections() {
		return this.vpnConnections;
	}

	public void setVpnConnections(List<VpnConnection> vpnConnections) {
		this.vpnConnections = vpnConnections;
	}

	public static class VpnConnection {

		private String mismatchRemoteParam;

		private String mismatchLocalParam;

		private String vpnConnectionId;

		private String sourceLog;

		private String failedReasonCode;

		private Long failedTime;

		private String failedReason;

		private String severity;

		private String tunnelId;

		public String getMismatchRemoteParam() {
			return this.mismatchRemoteParam;
		}

		public void setMismatchRemoteParam(String mismatchRemoteParam) {
			this.mismatchRemoteParam = mismatchRemoteParam;
		}

		public String getMismatchLocalParam() {
			return this.mismatchLocalParam;
		}

		public void setMismatchLocalParam(String mismatchLocalParam) {
			this.mismatchLocalParam = mismatchLocalParam;
		}

		public String getVpnConnectionId() {
			return this.vpnConnectionId;
		}

		public void setVpnConnectionId(String vpnConnectionId) {
			this.vpnConnectionId = vpnConnectionId;
		}

		public String getSourceLog() {
			return this.sourceLog;
		}

		public void setSourceLog(String sourceLog) {
			this.sourceLog = sourceLog;
		}

		public String getFailedReasonCode() {
			return this.failedReasonCode;
		}

		public void setFailedReasonCode(String failedReasonCode) {
			this.failedReasonCode = failedReasonCode;
		}

		public Long getFailedTime() {
			return this.failedTime;
		}

		public void setFailedTime(Long failedTime) {
			this.failedTime = failedTime;
		}

		public String getFailedReason() {
			return this.failedReason;
		}

		public void setFailedReason(String failedReason) {
			this.failedReason = failedReason;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getTunnelId() {
			return this.tunnelId;
		}

		public void setTunnelId(String tunnelId) {
			this.tunnelId = tunnelId;
		}
	}

	@Override
	public DiagnoseVpnConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DiagnoseVpnConnectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
