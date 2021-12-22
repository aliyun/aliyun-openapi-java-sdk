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

package com.aliyuncs.cciotgw.model.v20210721;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cciotgw.transform.v20210721.ListGreInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGreInterfacesResponse extends AcsResponse {

	private String requestId;

	private String ioTCloudConnectorGatewayId;

	private List<GreInterfaceItem> greInterface;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIoTCloudConnectorGatewayId() {
		return this.ioTCloudConnectorGatewayId;
	}

	public void setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
		this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
	}

	public List<GreInterfaceItem> getGreInterface() {
		return this.greInterface;
	}

	public void setGreInterface(List<GreInterfaceItem> greInterface) {
		this.greInterface = greInterface;
	}

	public static class GreInterfaceItem {

		private String customerIp;

		private String customerTunnelIp;

		private String localTunnelIp;

		private String state;

		private Boolean enableKeepalive;

		private String greGwId;

		private String forwardingUnitId;

		private String localIp;

		private String greInterfaceId;

		private String greCidrs;

		private String ioTCloudConnectorGatewayId;

		public String getCustomerIp() {
			return this.customerIp;
		}

		public void setCustomerIp(String customerIp) {
			this.customerIp = customerIp;
		}

		public String getCustomerTunnelIp() {
			return this.customerTunnelIp;
		}

		public void setCustomerTunnelIp(String customerTunnelIp) {
			this.customerTunnelIp = customerTunnelIp;
		}

		public String getLocalTunnelIp() {
			return this.localTunnelIp;
		}

		public void setLocalTunnelIp(String localTunnelIp) {
			this.localTunnelIp = localTunnelIp;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Boolean getEnableKeepalive() {
			return this.enableKeepalive;
		}

		public void setEnableKeepalive(Boolean enableKeepalive) {
			this.enableKeepalive = enableKeepalive;
		}

		public String getGreGwId() {
			return this.greGwId;
		}

		public void setGreGwId(String greGwId) {
			this.greGwId = greGwId;
		}

		public String getForwardingUnitId() {
			return this.forwardingUnitId;
		}

		public void setForwardingUnitId(String forwardingUnitId) {
			this.forwardingUnitId = forwardingUnitId;
		}

		public String getLocalIp() {
			return this.localIp;
		}

		public void setLocalIp(String localIp) {
			this.localIp = localIp;
		}

		public String getGreInterfaceId() {
			return this.greInterfaceId;
		}

		public void setGreInterfaceId(String greInterfaceId) {
			this.greInterfaceId = greInterfaceId;
		}

		public String getGreCidrs() {
			return this.greCidrs;
		}

		public void setGreCidrs(String greCidrs) {
			this.greCidrs = greCidrs;
		}

		public String getIoTCloudConnectorGatewayId() {
			return this.ioTCloudConnectorGatewayId;
		}

		public void setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
			this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
		}
	}

	@Override
	public ListGreInterfacesResponse getInstance(UnmarshallerContext context) {
		return	ListGreInterfacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
