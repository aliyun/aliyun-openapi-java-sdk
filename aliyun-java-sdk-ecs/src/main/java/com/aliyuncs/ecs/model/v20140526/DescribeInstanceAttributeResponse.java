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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAttributeResponse extends AcsResponse {

	private String status;

	private String serialNumber;

	private String creationTime;

	private String requestId;

	private String description;

	private String instanceName;

	private String instanceNetworkType;

	private Integer memory;

	private String imageId;

	private String clusterId;

	private String vlanId;

	private String stoppedMode;

	private String hostName;

	private String instanceId;

	private String instanceType;

	private Integer internetMaxBandwidthIn;

	private Integer internetMaxBandwidthOut;

	private String regionId;

	private String instanceChargeType;

	private String ioOptimized;

	private Integer cpu;

	private String expiredTime;

	private String zoneId;

	private String internetChargeType;

	private String creditSpecification;

	private Boolean enableJumboFrame;

	private Boolean enableNetworkEncryption;

	private List<LockReason> operationLocks;

	private List<String> securityGroupIds;

	private List<String> publicIpAddress;

	private List<String> innerIpAddress;

	private VpcAttributes vpcAttributes;

	private EipAddress eipAddress;

	private DedicatedHostAttribute dedicatedHostAttribute;

	private NetworkOptions networkOptions;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	public String getStoppedMode() {
		return this.stoppedMode;
	}

	public void setStoppedMode(String stoppedMode) {
		this.stoppedMode = stoppedMode;
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
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

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public String getCreditSpecification() {
		return this.creditSpecification;
	}

	public void setCreditSpecification(String creditSpecification) {
		this.creditSpecification = creditSpecification;
	}

	public Boolean getEnableJumboFrame() {
		return this.enableJumboFrame;
	}

	public void setEnableJumboFrame(Boolean enableJumboFrame) {
		this.enableJumboFrame = enableJumboFrame;
	}

	public Boolean getEnableNetworkEncryption() {
		return this.enableNetworkEncryption;
	}

	public void setEnableNetworkEncryption(Boolean enableNetworkEncryption) {
		this.enableNetworkEncryption = enableNetworkEncryption;
	}

	public List<LockReason> getOperationLocks() {
		return this.operationLocks;
	}

	public void setOperationLocks(List<LockReason> operationLocks) {
		this.operationLocks = operationLocks;
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	public List<String> getPublicIpAddress() {
		return this.publicIpAddress;
	}

	public void setPublicIpAddress(List<String> publicIpAddress) {
		this.publicIpAddress = publicIpAddress;
	}

	public List<String> getInnerIpAddress() {
		return this.innerIpAddress;
	}

	public void setInnerIpAddress(List<String> innerIpAddress) {
		this.innerIpAddress = innerIpAddress;
	}

	public VpcAttributes getVpcAttributes() {
		return this.vpcAttributes;
	}

	public void setVpcAttributes(VpcAttributes vpcAttributes) {
		this.vpcAttributes = vpcAttributes;
	}

	public EipAddress getEipAddress() {
		return this.eipAddress;
	}

	public void setEipAddress(EipAddress eipAddress) {
		this.eipAddress = eipAddress;
	}

	public DedicatedHostAttribute getDedicatedHostAttribute() {
		return this.dedicatedHostAttribute;
	}

	public void setDedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
		this.dedicatedHostAttribute = dedicatedHostAttribute;
	}

	public NetworkOptions getNetworkOptions() {
		return this.networkOptions;
	}

	public void setNetworkOptions(NetworkOptions networkOptions) {
		this.networkOptions = networkOptions;
	}

	public static class LockReason {

		private String lockReason;

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	public static class VpcAttributes {

		private String vpcId;

		private String natIpAddress;

		private String vSwitchId;

		private List<String> privateIpAddress;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getNatIpAddress() {
			return this.natIpAddress;
		}

		public void setNatIpAddress(String natIpAddress) {
			this.natIpAddress = natIpAddress;
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

	public static class EipAddress {

		private String internetChargeType;

		private String ipAddress;

		private Integer bandwidth;

		private String allocationId;

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}
	}

	public static class DedicatedHostAttribute {

		private String dedicatedHostName;

		private String dedicatedHostId;

		public String getDedicatedHostName() {
			return this.dedicatedHostName;
		}

		public void setDedicatedHostName(String dedicatedHostName) {
			this.dedicatedHostName = dedicatedHostName;
		}

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}
	}

	public static class NetworkOptions {

		private Boolean enableJumboFrame;

		private Boolean enableNetworkEncryption;

		private String bandwidthWeighting;

		public Boolean getEnableJumboFrame() {
			return this.enableJumboFrame;
		}

		public void setEnableJumboFrame(Boolean enableJumboFrame) {
			this.enableJumboFrame = enableJumboFrame;
		}

		public Boolean getEnableNetworkEncryption() {
			return this.enableNetworkEncryption;
		}

		public void setEnableNetworkEncryption(Boolean enableNetworkEncryption) {
			this.enableNetworkEncryption = enableNetworkEncryption;
		}

		public String getBandwidthWeighting() {
			return this.bandwidthWeighting;
		}

		public void setBandwidthWeighting(String bandwidthWeighting) {
			this.bandwidthWeighting = bandwidthWeighting;
		}
	}

	@Override
	public DescribeInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
