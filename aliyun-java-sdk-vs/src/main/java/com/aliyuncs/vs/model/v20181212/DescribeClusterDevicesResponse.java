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
import com.aliyuncs.vs.transform.v20181212.DescribeClusterDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterDevicesResponse extends AcsResponse {

	private Long total;

	private String requestId;

	private List<Device> devices;

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public static class Device {

		private String status;

		private String macAddress;

		private Boolean autoRenew;

		private String instanceId;

		private Integer autoRenewPeriod;

		private Integer period;

		private String instanceChargeType;

		private String description;

		private String platformType;

		private String instanceName;

		private String periodUnit;

		private String hostRom;

		private String edgeNodeName;

		private String server;

		private String imageId;

		private List<IpInfo> ipInfos;

		private List<PodInfo> podInfos;

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

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public String getHostRom() {
			return this.hostRom;
		}

		public void setHostRom(String hostRom) {
			this.hostRom = hostRom;
		}

		public String getEdgeNodeName() {
			return this.edgeNodeName;
		}

		public void setEdgeNodeName(String edgeNodeName) {
			this.edgeNodeName = edgeNodeName;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public List<IpInfo> getIpInfos() {
			return this.ipInfos;
		}

		public void setIpInfos(List<IpInfo> ipInfos) {
			this.ipInfos = ipInfos;
		}

		public List<PodInfo> getPodInfos() {
			return this.podInfos;
		}

		public void setPodInfos(List<PodInfo> podInfos) {
			this.podInfos = podInfos;
		}

		public static class IpInfo {

			private String natType;

			private String internalIp;

			private String internalPort;

			private String externalPort;

			private String ipProtocol;

			private String externalIp;

			private String iSP;

			public String getNatType() {
				return this.natType;
			}

			public void setNatType(String natType) {
				this.natType = natType;
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

			public String getExternalPort() {
				return this.externalPort;
			}

			public void setExternalPort(String externalPort) {
				this.externalPort = externalPort;
			}

			public String getIpProtocol() {
				return this.ipProtocol;
			}

			public void setIpProtocol(String ipProtocol) {
				this.ipProtocol = ipProtocol;
			}

			public String getExternalIp() {
				return this.externalIp;
			}

			public void setExternalIp(String externalIp) {
				this.externalIp = externalIp;
			}

			public String getISP() {
				return this.iSP;
			}

			public void setISP(String iSP) {
				this.iSP = iSP;
			}
		}

		public static class PodInfo {

			private String status;

			private String podIp;

			private String podId;

			private List<NetworkItem> network;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPodIp() {
				return this.podIp;
			}

			public void setPodIp(String podIp) {
				this.podIp = podIp;
			}

			public String getPodId() {
				return this.podId;
			}

			public void setPodId(String podId) {
				this.podId = podId;
			}

			public List<NetworkItem> getNetwork() {
				return this.network;
			}

			public void setNetwork(List<NetworkItem> network) {
				this.network = network;
			}

			public static class NetworkItem {

				private String containerPorts;

				private String outgoingIsp;

				private String externalPorts;

				private String externalIp;

				private String externalIsp;

				private String outgoingIp;

				public String getContainerPorts() {
					return this.containerPorts;
				}

				public void setContainerPorts(String containerPorts) {
					this.containerPorts = containerPorts;
				}

				public String getOutgoingIsp() {
					return this.outgoingIsp;
				}

				public void setOutgoingIsp(String outgoingIsp) {
					this.outgoingIsp = outgoingIsp;
				}

				public String getExternalPorts() {
					return this.externalPorts;
				}

				public void setExternalPorts(String externalPorts) {
					this.externalPorts = externalPorts;
				}

				public String getExternalIp() {
					return this.externalIp;
				}

				public void setExternalIp(String externalIp) {
					this.externalIp = externalIp;
				}

				public String getExternalIsp() {
					return this.externalIsp;
				}

				public void setExternalIsp(String externalIsp) {
					this.externalIsp = externalIsp;
				}

				public String getOutgoingIp() {
					return this.outgoingIp;
				}

				public void setOutgoingIp(String outgoingIp) {
					this.outgoingIp = outgoingIp;
				}
			}
		}
	}

	@Override
	public DescribeClusterDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
