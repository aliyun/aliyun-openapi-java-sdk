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
public class ModifyHpHostRequest extends RpcAcsRequest<ModifyHpHostResponse> {
	
	public ModifyHpHostRequest() {
		super("Emr", "2016-04-08", "ModifyHpHost", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer cpuCore;

	private Integer memSize;

	private Long resourceOwnerId;

	private String rackInfo;

	private String role;

	private String serialNumber;

	private String hostType;

	private String securityGroupId;

	private List<HpHostDisk> hpHostDisks;

	private String vswitchId;

	private String hpHostBizId;

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
		if(cpuCore != null){
			putQueryParameter("CpuCore", cpuCore.toString());
		}
	}

	public Integer getMemSize() {
		return this.memSize;
	}

	public void setMemSize(Integer memSize) {
		this.memSize = memSize;
		if(memSize != null){
			putQueryParameter("MemSize", memSize.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRackInfo() {
		return this.rackInfo;
	}

	public void setRackInfo(String rackInfo) {
		this.rackInfo = rackInfo;
		if(rackInfo != null){
			putQueryParameter("RackInfo", rackInfo);
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putQueryParameter("SerialNumber", serialNumber);
		}
	}

	public String getHostType() {
		return this.hostType;
	}

	public void setHostType(String hostType) {
		this.hostType = hostType;
		if(hostType != null){
			putQueryParameter("HostType", hostType);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public List<HpHostDisk> getHpHostDisks() {
		return this.hpHostDisks;
	}

	public void setHpHostDisks(List<HpHostDisk> hpHostDisks) {
		this.hpHostDisks = hpHostDisks;	
		if (hpHostDisks != null) {
			for (int depth1 = 0; depth1 < hpHostDisks.size(); depth1++) {
				putQueryParameter("HpHostDisk." + (depth1 + 1) + ".DiskSize" , hpHostDisks.get(depth1).getDiskSize());
				putQueryParameter("HpHostDisk." + (depth1 + 1) + ".MountPath" , hpHostDisks.get(depth1).getMountPath());
				putQueryParameter("HpHostDisk." + (depth1 + 1) + ".DiskDevice" , hpHostDisks.get(depth1).getDiskDevice());
			}
		}	
	}

	public String getVswitchId() {
		return this.vswitchId;
	}

	public void setVswitchId(String vswitchId) {
		this.vswitchId = vswitchId;
		if(vswitchId != null){
			putQueryParameter("VswitchId", vswitchId);
		}
	}

	public String getHpHostBizId() {
		return this.hpHostBizId;
	}

	public void setHpHostBizId(String hpHostBizId) {
		this.hpHostBizId = hpHostBizId;
		if(hpHostBizId != null){
			putQueryParameter("HpHostBizId", hpHostBizId);
		}
	}

	public String getExternalKey() {
		return this.externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
		if(externalKey != null){
			putQueryParameter("ExternalKey", externalKey);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getInnerIp() {
		return this.innerIp;
	}

	public void setInnerIp(String innerIp) {
		this.innerIp = innerIp;
		if(innerIp != null){
			putQueryParameter("InnerIp", innerIp);
		}
	}

	public String getExternalIp() {
		return this.externalIp;
	}

	public void setExternalIp(String externalIp) {
		this.externalIp = externalIp;
		if(externalIp != null){
			putQueryParameter("ExternalIp", externalIp);
		}
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

	@Override
	public Class<ModifyHpHostResponse> getResponseClass() {
		return ModifyHpHostResponse.class;
	}

}
