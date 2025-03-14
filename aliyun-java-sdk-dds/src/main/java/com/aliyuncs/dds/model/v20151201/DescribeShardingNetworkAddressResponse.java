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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeShardingNetworkAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardingNetworkAddressResponse extends AcsResponse {

	private String requestId;

	private List<CompatibleConnection> compatibleConnections;

	private List<NetworkAddress> networkAddresses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CompatibleConnection> getCompatibleConnections() {
		return this.compatibleConnections;
	}

	public void setCompatibleConnections(List<CompatibleConnection> compatibleConnections) {
		this.compatibleConnections = compatibleConnections;
	}

	public List<NetworkAddress> getNetworkAddresses() {
		return this.networkAddresses;
	}

	public void setNetworkAddresses(List<NetworkAddress> networkAddresses) {
		this.networkAddresses = networkAddresses;
	}

	public static class CompatibleConnection {

		private String vswitchId;

		private String expiredTime;

		private String networkType;

		private String port;

		private String networkAddress;

		private String vPCId;

		private String iPAddress;

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getNetworkAddress() {
			return this.networkAddress;
		}

		public void setNetworkAddress(String networkAddress) {
			this.networkAddress = networkAddress;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}
	}

	public static class NetworkAddress {

		private String nodeType;

		private String vswitchId;

		private String expiredTime;

		private String networkType;

		private String role;

		private String port;

		private String vPCId;

		private String networkAddress;

		private String nodeId;

		private String iPAddress;

		private String connectionType;

		private String txtRecord;

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getNetworkAddress() {
			return this.networkAddress;
		}

		public void setNetworkAddress(String networkAddress) {
			this.networkAddress = networkAddress;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}

		public String getConnectionType() {
			return this.connectionType;
		}

		public void setConnectionType(String connectionType) {
			this.connectionType = connectionType;
		}

		public String getTxtRecord() {
			return this.txtRecord;
		}

		public void setTxtRecord(String txtRecord) {
			this.txtRecord = txtRecord;
		}
	}

	@Override
	public DescribeShardingNetworkAddressResponse getInstance(UnmarshallerContext context) {
		return	DescribeShardingNetworkAddressResponseUnmarshaller.unmarshall(this, context);
	}
}
