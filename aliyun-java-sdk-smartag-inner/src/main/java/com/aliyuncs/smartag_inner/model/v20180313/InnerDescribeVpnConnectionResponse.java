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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerDescribeVpnConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDescribeVpnConnectionResponse extends AcsResponse {

	private String requestId;

	private VpnConnnection vpnConnnection;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VpnConnnection getVpnConnnection() {
		return this.vpnConnnection;
	}

	public void setVpnConnnection(VpnConnnection vpnConnnection) {
		this.vpnConnnection = vpnConnnection;
	}

	public static class VpnConnnection {

		private String smartAccessGatewayId;

		private String routeTableId;

		private String inBandwidth;

		private String outBandwidth;

		private String masterAgwIp;

		private String slaveAgwIp;

		private String currentVersion;

		private String targetVersion;

		private String state;

		private String masterAgwId;

		private String slaveAgwId;

		public String getSmartAccessGatewayId() {
			return this.smartAccessGatewayId;
		}

		public void setSmartAccessGatewayId(String smartAccessGatewayId) {
			this.smartAccessGatewayId = smartAccessGatewayId;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getInBandwidth() {
			return this.inBandwidth;
		}

		public void setInBandwidth(String inBandwidth) {
			this.inBandwidth = inBandwidth;
		}

		public String getOutBandwidth() {
			return this.outBandwidth;
		}

		public void setOutBandwidth(String outBandwidth) {
			this.outBandwidth = outBandwidth;
		}

		public String getMasterAgwIp() {
			return this.masterAgwIp;
		}

		public void setMasterAgwIp(String masterAgwIp) {
			this.masterAgwIp = masterAgwIp;
		}

		public String getSlaveAgwIp() {
			return this.slaveAgwIp;
		}

		public void setSlaveAgwIp(String slaveAgwIp) {
			this.slaveAgwIp = slaveAgwIp;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getTargetVersion() {
			return this.targetVersion;
		}

		public void setTargetVersion(String targetVersion) {
			this.targetVersion = targetVersion;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMasterAgwId() {
			return this.masterAgwId;
		}

		public void setMasterAgwId(String masterAgwId) {
			this.masterAgwId = masterAgwId;
		}

		public String getSlaveAgwId() {
			return this.slaveAgwId;
		}

		public void setSlaveAgwId(String slaveAgwId) {
			this.slaveAgwId = slaveAgwId;
		}
	}

	@Override
	public InnerDescribeVpnConnectionResponse getInstance(UnmarshallerContext context) {
		return	InnerDescribeVpnConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
