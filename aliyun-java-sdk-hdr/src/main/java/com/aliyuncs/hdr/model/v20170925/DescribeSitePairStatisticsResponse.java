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
import com.aliyuncs.hdr.transform.v20170925.DescribeSitePairStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSitePairStatisticsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Server> primarySiteServers;

	private List<Server> secondarySiteServers;

	private PrimarySiteGatewayInfo primarySiteGatewayInfo;

	private SecondarySiteGatewayInfo secondarySiteGatewayInfo;

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

	public List<Server> getPrimarySiteServers() {
		return this.primarySiteServers;
	}

	public void setPrimarySiteServers(List<Server> primarySiteServers) {
		this.primarySiteServers = primarySiteServers;
	}

	public List<Server> getSecondarySiteServers() {
		return this.secondarySiteServers;
	}

	public void setSecondarySiteServers(List<Server> secondarySiteServers) {
		this.secondarySiteServers = secondarySiteServers;
	}

	public PrimarySiteGatewayInfo getPrimarySiteGatewayInfo() {
		return this.primarySiteGatewayInfo;
	}

	public void setPrimarySiteGatewayInfo(PrimarySiteGatewayInfo primarySiteGatewayInfo) {
		this.primarySiteGatewayInfo = primarySiteGatewayInfo;
	}

	public SecondarySiteGatewayInfo getSecondarySiteGatewayInfo() {
		return this.secondarySiteGatewayInfo;
	}

	public void setSecondarySiteGatewayInfo(SecondarySiteGatewayInfo secondarySiteGatewayInfo) {
		this.secondarySiteGatewayInfo = secondarySiteGatewayInfo;
	}

	public static class Server {

		private String serverId;

		private String ipAddress;

		private String agentVersion;

		private String connectionStatus;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}
	}

	public static class PrimarySiteGatewayInfo {

		private String gatewayId;

		private String version;

		private String status;

		private Long heartbeatedTime;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getHeartbeatedTime() {
			return this.heartbeatedTime;
		}

		public void setHeartbeatedTime(Long heartbeatedTime) {
			this.heartbeatedTime = heartbeatedTime;
		}
	}

	public static class SecondarySiteGatewayInfo {

		private String gatewayId;

		private String version;

		private String status;

		private Long heartbeatedTime;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getHeartbeatedTime() {
			return this.heartbeatedTime;
		}

		public void setHeartbeatedTime(Long heartbeatedTime) {
			this.heartbeatedTime = heartbeatedTime;
		}
	}

	@Override
	public DescribeSitePairStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSitePairStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
