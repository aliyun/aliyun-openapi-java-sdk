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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeRenderingDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRenderingDevicesResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private List<Device> devices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public static class Device {

		private String instanceId;

		private String clusterId;

		private String edgeNodeName;

		private String platformType;

		private String specification;

		private String status;

		private String macAddress;

		private String serverName;

		private String instanceChargeType;

		private Boolean autoRenew;

		private Integer autoRenewPeriod;

		private Integer period;

		private String periodUnit;

		private List<IpInfo> ipInfos;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getEdgeNodeName() {
			return this.edgeNodeName;
		}

		public void setEdgeNodeName(String edgeNodeName) {
			this.edgeNodeName = edgeNodeName;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getSpecification() {
			return this.specification;
		}

		public void setSpecification(String specification) {
			this.specification = specification;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMacAddress() {
			return this.macAddress;
		}

		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}

		public String getServerName() {
			return this.serverName;
		}

		public void setServerName(String serverName) {
			this.serverName = serverName;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public Integer getAutoRenewPeriod() {
			return this.autoRenewPeriod;
		}

		public void setAutoRenewPeriod(Integer autoRenewPeriod) {
			this.autoRenewPeriod = autoRenewPeriod;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public List<IpInfo> getIpInfos() {
			return this.ipInfos;
		}

		public void setIpInfos(List<IpInfo> ipInfos) {
			this.ipInfos = ipInfos;
		}

		public static class IpInfo {

			private String natType;

			private String externalIp;

			private String externalPort;

			private String internalIp;

			private String internalPort;

			private String ipProtocol;

			private String iSP;

			public String getNatType() {
				return this.natType;
			}

			public void setNatType(String natType) {
				this.natType = natType;
			}

			public String getExternalIp() {
				return this.externalIp;
			}

			public void setExternalIp(String externalIp) {
				this.externalIp = externalIp;
			}

			public String getExternalPort() {
				return this.externalPort;
			}

			public void setExternalPort(String externalPort) {
				this.externalPort = externalPort;
			}

			public String getInternalIp() {
				return this.internalIp;
			}

			public void setInternalIp(String internalIp) {
				this.internalIp = internalIp;
			}

			public String getInternalPort() {
				return this.internalPort;
			}

			public void setInternalPort(String internalPort) {
				this.internalPort = internalPort;
			}

			public String getIpProtocol() {
				return this.ipProtocol;
			}

			public void setIpProtocol(String ipProtocol) {
				this.ipProtocol = ipProtocol;
			}

			public String getISP() {
				return this.iSP;
			}

			public void setISP(String iSP) {
				this.iSP = iSP;
			}
		}
	}

	@Override
	public DescribeRenderingDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRenderingDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
