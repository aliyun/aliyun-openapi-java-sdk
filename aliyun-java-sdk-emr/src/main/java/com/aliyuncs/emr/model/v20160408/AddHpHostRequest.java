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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddHpHostRequest extends RpcAcsRequest<AddHpHostResponse> {
	
	public AddHpHostRequest() {
		super("Emr", "2016-04-08", "AddHpHost", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<HpHost> hpHosts;

	private String hpBizId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<HpHost> getHpHosts() {
		return this.hpHosts;
	}

	public void setHpHosts(List<HpHost> hpHosts) {
		this.hpHosts = hpHosts;	
		if (hpHosts != null) {
			for (int depth1 = 0; depth1 < hpHosts.size(); depth1++) {
				putQueryParameter("HpHost." + (depth1 + 1) + ".CpuCore" , hpHosts.get(depth1).getCpuCore());
				putQueryParameter("HpHost." + (depth1 + 1) + ".MemSize" , hpHosts.get(depth1).getMemSize());
				putQueryParameter("HpHost." + (depth1 + 1) + ".RackInfo" , hpHosts.get(depth1).getRackInfo());
				putQueryParameter("HpHost." + (depth1 + 1) + ".Role" , hpHosts.get(depth1).getRole());
				putQueryParameter("HpHost." + (depth1 + 1) + ".SerialNumber" , hpHosts.get(depth1).getSerialNumber());
				putQueryParameter("HpHost." + (depth1 + 1) + ".HostType" , hpHosts.get(depth1).getHostType());
				putQueryParameter("HpHost." + (depth1 + 1) + ".SecurityGroupId" , hpHosts.get(depth1).getSecurityGroupId());
				if (hpHosts.get(depth1).getHpHostDisks() != null) {
					for (int depth2 = 0; depth2 < hpHosts.get(depth1).getHpHostDisks().size(); depth2++) {
						putQueryParameter("HpHost." + (depth1 + 1) + ".HpHostDisk." + (depth2 + 1) + ".DiskSize" , hpHosts.get(depth1).getHpHostDisks().get(depth2).getDiskSize());
						putQueryParameter("HpHost." + (depth1 + 1) + ".HpHostDisk." + (depth2 + 1) + ".MountPath" , hpHosts.get(depth1).getHpHostDisks().get(depth2).getMountPath());
						putQueryParameter("HpHost." + (depth1 + 1) + ".HpHostDisk." + (depth2 + 1) + ".DiskDevice" , hpHosts.get(depth1).getHpHostDisks().get(depth2).getDiskDevice());
					}
				}
				putQueryParameter("HpHost." + (depth1 + 1) + ".VswitchId" , hpHosts.get(depth1).getVswitchId());
				putQueryParameter("HpHost." + (depth1 + 1) + ".ExternalKey" , hpHosts.get(depth1).getExternalKey());
				putQueryParameter("HpHost." + (depth1 + 1) + ".HostName" , hpHosts.get(depth1).getHostName());
				putQueryParameter("HpHost." + (depth1 + 1) + ".VpcId" , hpHosts.get(depth1).getVpcId());
				putQueryParameter("HpHost." + (depth1 + 1) + ".InnerIp" , hpHosts.get(depth1).getInnerIp());
				putQueryParameter("HpHost." + (depth1 + 1) + ".ExternalIp" , hpHosts.get(depth1).getExternalIp());
			}
		}	
	}

	public String getHpBizId() {
		return this.hpBizId;
	}

	public void setHpBizId(String hpBizId) {
		this.hpBizId = hpBizId;
		if(hpBizId != null){
			putQueryParameter("HpBizId", hpBizId);
		}
	}

	public static class HpHost {

		private Integer cpuCore;

		private Integer memSize;

		private String rackInfo;

		private String role;

		private String serialNumber;

		private String hostType;

		private String securityGroupId;

		private List<HpHostDisk> hpHostDisks;

		private String vswitchId;

		private String externalKey;

		private String hostName;

		private String vpcId;

		private String innerIp;

		private String externalIp;

		public Integer getCpuCore() {
			return this.cpuCore;
		}

		public void setCpuCore(Integer cpuCore) {
			this.cpuCore = cpuCore;
		}

		public Integer getMemSize() {
			return this.memSize;
		}

		public void setMemSize(Integer memSize) {
			this.memSize = memSize;
		}

		public String getRackInfo() {
			return this.rackInfo;
		}

		public void setRackInfo(String rackInfo) {
			this.rackInfo = rackInfo;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getHostType() {
			return this.hostType;
		}

		public void setHostType(String hostType) {
			this.hostType = hostType;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public List<HpHostDisk> getHpHostDisks() {
			return this.hpHostDisks;
		}

		public void setHpHostDisks(List<HpHostDisk> hpHostDisks) {
			this.hpHostDisks = hpHostDisks;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getExternalKey() {
			return this.externalKey;
		}

		public void setExternalKey(String externalKey) {
			this.externalKey = externalKey;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public String getExternalIp() {
			return this.externalIp;
		}

		public void setExternalIp(String externalIp) {
			this.externalIp = externalIp;
		}

		public static class HpHostDisk {

			private String diskSize;

			private String mountPath;

			private String diskDevice;

			public String getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(String diskSize) {
				this.diskSize = diskSize;
			}

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public String getDiskDevice() {
				return this.diskDevice;
			}

			public void setDiskDevice(String diskDevice) {
				this.diskDevice = diskDevice;
			}
		}
	}

	@Override
	public Class<AddHpHostResponse> getResponseClass() {
		return AddHpHostResponse.class;
	}

}
