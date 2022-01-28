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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeDeviceServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceServiceResponse extends AcsResponse {

	private String requestId;

	private List<DeviceInfo> resourceDetailInfos;

	private List<ResourceInfosItem> resourceInfos;

	private AppStatus appStatus;

	private AppMetaData appMetaData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DeviceInfo> getResourceDetailInfos() {
		return this.resourceDetailInfos;
	}

	public void setResourceDetailInfos(List<DeviceInfo> resourceDetailInfos) {
		this.resourceDetailInfos = resourceDetailInfos;
	}

	public List<ResourceInfosItem> getResourceInfos() {
		return this.resourceInfos;
	}

	public void setResourceInfos(List<ResourceInfosItem> resourceInfos) {
		this.resourceInfos = resourceInfos;
	}

	public AppStatus getAppStatus() {
		return this.appStatus;
	}

	public void setAppStatus(AppStatus appStatus) {
		this.appStatus = appStatus;
	}

	public AppMetaData getAppMetaData() {
		return this.appMetaData;
	}

	public void setAppMetaData(AppMetaData appMetaData) {
		this.appMetaData = appMetaData;
	}

	public static class DeviceInfo {

		private String regionID;

		private String iD;

		private String iP;

		private String server;

		private String status;

		private String type;

		private String mac;

		private String iSP;

		private String deviceName;

		private String imageID;

		public String getRegionID() {
			return this.regionID;
		}

		public void setRegionID(String regionID) {
			this.regionID = regionID;
		}

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getImageID() {
			return this.imageID;
		}

		public void setImageID(String imageID) {
			this.imageID = imageID;
		}
	}

	public static class ResourceInfosItem {

		private String appVersion;

		private String areaCode;

		private String areaName;

		private String createTime;

		private String instanceId;

		private String instanceStatus;

		private String regionCode;

		private String regionId;

		private String regionName;

		private List<DeviceInfosItem> deviceInfos;

		private List<InternalIpsItem> internalIps;

		private List<PublicIpsItem> publicIps;

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getAreaName() {
			return this.areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getRegionCode() {
			return this.regionCode;
		}

		public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public List<DeviceInfosItem> getDeviceInfos() {
			return this.deviceInfos;
		}

		public void setDeviceInfos(List<DeviceInfosItem> deviceInfos) {
			this.deviceInfos = deviceInfos;
		}

		public List<InternalIpsItem> getInternalIps() {
			return this.internalIps;
		}

		public void setInternalIps(List<InternalIpsItem> internalIps) {
			this.internalIps = internalIps;
		}

		public List<PublicIpsItem> getPublicIps() {
			return this.publicIps;
		}

		public void setPublicIps(List<PublicIpsItem> publicIps) {
			this.publicIps = publicIps;
		}

		public static class DeviceInfosItem {

			private String name;

			private String status;

			private List<Ports> network;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<Ports> getNetwork() {
				return this.network;
			}

			public void setNetwork(List<Ports> network) {
				this.network = network;
			}

			public static class Ports {

				private String containerPorts;

				private String externalIp;

				private String hostPorts;

				private String protocol;

				public String getContainerPorts() {
					return this.containerPorts;
				}

				public void setContainerPorts(String containerPorts) {
					this.containerPorts = containerPorts;
				}

				public String getExternalIp() {
					return this.externalIp;
				}

				public void setExternalIp(String externalIp) {
					this.externalIp = externalIp;
				}

				public String getHostPorts() {
					return this.hostPorts;
				}

				public void setHostPorts(String hostPorts) {
					this.hostPorts = hostPorts;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}
			}
		}

		public static class InternalIpsItem {

			private String ip;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}
		}

		public static class PublicIpsItem {

			private String ip;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}
		}
	}

	public static class AppStatus {

		private String phase;

		private String statusDescrip;

		private String updateTime;

		public String getPhase() {
			return this.phase;
		}

		public void setPhase(String phase) {
			this.phase = phase;
		}

		public String getStatusDescrip() {
			return this.statusDescrip;
		}

		public void setStatusDescrip(String statusDescrip) {
			this.statusDescrip = statusDescrip;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	public static class AppMetaData {

		private String appId;

		private String appName;

		private String appStableVersion;

		private String appType;

		private String clusterName;

		private String createTime;

		private String description;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppStableVersion() {
			return this.appStableVersion;
		}

		public void setAppStableVersion(String appStableVersion) {
			this.appStableVersion = appStableVersion;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeDeviceServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
