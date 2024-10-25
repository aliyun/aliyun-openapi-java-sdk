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
import com.aliyuncs.ens.transform.v20171110.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private Integer code;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private List<Instance> instances;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String creationTime;

		private String status;

		private String specName;

		private String instanceTypeFamily;

		private String instanceResourceType;

		private String hostName;

		private String instanceId;

		private Integer internetMaxBandwidthIn;

		private Integer internetMaxBandwidthOut;

		private String ensRegionId;

		private String cpu;

		private String expiredTime;

		private String instanceName;

		private Integer disk;

		private String oSName;

		private Integer memory;

		private String imageId;

		private String autoReleaseTime;

		private String spotStrategy;

		private String keyPairName;

		private List<DataDiskItem> dataDisk;

		private List<PublicIpAddress> publicIpAddresses;

		private List<PrivateIpAddress> privateIpAddresses;

		private List<TagsItem> tags;

		private List<NetworkInterfacesItem> networkInterfaces;

		private List<String> securityGroupIds;

		private List<String> innerIpAddress;

		private List<String> publicIpAddress;

		private SystemDisk systemDisk;

		private NetworkAttributes networkAttributes;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSpecName() {
			return this.specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getInstanceResourceType() {
			return this.instanceResourceType;
		}

		public void setInstanceResourceType(String instanceResourceType) {
			this.instanceResourceType = instanceResourceType;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getDisk() {
			return this.disk;
		}

		public void setDisk(Integer disk) {
			this.disk = disk;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getAutoReleaseTime() {
			return this.autoReleaseTime;
		}

		public void setAutoReleaseTime(String autoReleaseTime) {
			this.autoReleaseTime = autoReleaseTime;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public List<DataDiskItem> getDataDisk() {
			return this.dataDisk;
		}

		public void setDataDisk(List<DataDiskItem> dataDisk) {
			this.dataDisk = dataDisk;
		}

		public List<PublicIpAddress> getPublicIpAddresses() {
			return this.publicIpAddresses;
		}

		public void setPublicIpAddresses(List<PublicIpAddress> publicIpAddresses) {
			this.publicIpAddresses = publicIpAddresses;
		}

		public List<PrivateIpAddress> getPrivateIpAddresses() {
			return this.privateIpAddresses;
		}

		public void setPrivateIpAddresses(List<PrivateIpAddress> privateIpAddresses) {
			this.privateIpAddresses = privateIpAddresses;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<NetworkInterfacesItem> getNetworkInterfaces() {
			return this.networkInterfaces;
		}

		public void setNetworkInterfaces(List<NetworkInterfacesItem> networkInterfaces) {
			this.networkInterfaces = networkInterfaces;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public SystemDisk getSystemDisk() {
			return this.systemDisk;
		}

		public void setSystemDisk(SystemDisk systemDisk) {
			this.systemDisk = systemDisk;
		}

		public NetworkAttributes getNetworkAttributes() {
			return this.networkAttributes;
		}

		public void setNetworkAttributes(NetworkAttributes networkAttributes) {
			this.networkAttributes = networkAttributes;
		}

		public static class DataDiskItem {

			private String device_type;

			private String disk_type;

			private Integer size;

			private String diskName;

			private String uuid;

			private Integer storage;

			private String diskId;

			private String category;

			private String name;

			private Integer diskSize;

			private String encryptKeyId;

			private Boolean encrypted;

			public String getDevice_type() {
				return this.device_type;
			}

			public void setDevice_type(String device_type) {
				this.device_type = device_type;
			}

			public String getDisk_type() {
				return this.disk_type;
			}

			public void setDisk_type(String disk_type) {
				this.disk_type = disk_type;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public Integer getStorage() {
				return this.storage;
			}

			public void setStorage(Integer storage) {
				this.storage = storage;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getEncryptKeyId() {
				return this.encryptKeyId;
			}

			public void setEncryptKeyId(String encryptKeyId) {
				this.encryptKeyId = encryptKeyId;
			}

			public Boolean getEncrypted() {
				return this.encrypted;
			}

			public void setEncrypted(Boolean encrypted) {
				this.encrypted = encrypted;
			}
		}

		public static class PublicIpAddress {

			private String ip;

			private String gateWay;

			private String isp;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getGateWay() {
				return this.gateWay;
			}

			public void setGateWay(String gateWay) {
				this.gateWay = gateWay;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}
		}

		public static class PrivateIpAddress {

			private String ip;

			private String gateWay;

			private String isp;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getGateWay() {
				return this.gateWay;
			}

			public void setGateWay(String gateWay) {
				this.gateWay = gateWay;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}
		}

		public static class TagsItem {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}

		public static class NetworkInterfacesItem {

			private String type;

			private String macAddress;

			private String primaryIpAddress;

			private String networkInterfaceId;

			private List<PrivateIpSet> privateIpSets;

			private List<Ipv6Set> ipv6Sets;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getMacAddress() {
				return this.macAddress;
			}

			public void setMacAddress(String macAddress) {
				this.macAddress = macAddress;
			}

			public String getPrimaryIpAddress() {
				return this.primaryIpAddress;
			}

			public void setPrimaryIpAddress(String primaryIpAddress) {
				this.primaryIpAddress = primaryIpAddress;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}

			public List<PrivateIpSet> getPrivateIpSets() {
				return this.privateIpSets;
			}

			public void setPrivateIpSets(List<PrivateIpSet> privateIpSets) {
				this.privateIpSets = privateIpSets;
			}

			public List<Ipv6Set> getIpv6Sets() {
				return this.ipv6Sets;
			}

			public void setIpv6Sets(List<Ipv6Set> ipv6Sets) {
				this.ipv6Sets = ipv6Sets;
			}

			public static class PrivateIpSet {

				private String privateIpAddress;

				private Boolean primary;

				public String getPrivateIpAddress() {
					return this.privateIpAddress;
				}

				public void setPrivateIpAddress(String privateIpAddress) {
					this.privateIpAddress = privateIpAddress;
				}

				public Boolean getPrimary() {
					return this.primary;
				}

				public void setPrimary(Boolean primary) {
					this.primary = primary;
				}
			}

			public static class Ipv6Set {

				private String ipv6Address;

				public String getIpv6Address() {
					return this.ipv6Address;
				}

				public void setIpv6Address(String ipv6Address) {
					this.ipv6Address = ipv6Address;
				}
			}
		}

		public static class SystemDisk {

			private String device_type;

			private String disk_type;

			private Integer size;

			private String diskName;

			private String uuid;

			private Integer storage;

			private String diskId;

			private String category;

			private String name;

			public String getDevice_type() {
				return this.device_type;
			}

			public void setDevice_type(String device_type) {
				this.device_type = device_type;
			}

			public String getDisk_type() {
				return this.disk_type;
			}

			public void setDisk_type(String disk_type) {
				this.disk_type = disk_type;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public Integer getStorage() {
				return this.storage;
			}

			public void setStorage(Integer storage) {
				this.storage = storage;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class NetworkAttributes {

			private String networkId;

			private String vSwitchId;

			private List<String> privateIpAddress;

			public String getNetworkId() {
				return this.networkId;
			}

			public void setNetworkId(String networkId) {
				this.networkId = networkId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public List<String> getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(List<String> privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
