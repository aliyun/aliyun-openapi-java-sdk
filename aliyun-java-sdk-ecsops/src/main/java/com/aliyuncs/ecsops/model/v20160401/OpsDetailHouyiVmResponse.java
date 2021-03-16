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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDetailHouyiVmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDetailHouyiVmResponse extends AcsResponse {

	private String requestId;

	private String machineNo;

	private String serialNumber;

	private String vmName;

	private String hostname;

	private String vmStatus;

	private String regionId;

	private String clusterId;

	private String ncId;

	private String vlanNo;

	private String rackId;

	private String securityGroupId;

	private String vmInnerIp;

	private Integer vmCores;

	private String vgwVip;

	private String storageNetworkType;

	private Integer vmMemory;

	private Integer vmDisk;

	private Integer vmBps;

	private String vmPlatform;

	private String mac;

	private String gateway;

	private String netmask;

	private Integer intranetRx;

	private Integer intranetTx;

	private Integer internetRx;

	private Integer internetTx;

	private String safetyQuota;

	private Integer intensiveIo;

	private Integer intensiveCpu;

	private Integer intensiveNet;

	private String payType;

	private String vncHost;

	private Integer vncPort;

	private String vncPassword;

	private String vpcId;

	private String vpcSubnetId;

	private String vmAliIp;

	private List<Group> groups;

	private VmStatusNote vmStatusNote;

	private VmPublicIp vmPublicIp;

	private VmImage vmImage;

	private Eip eip;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMachineNo() {
		return this.machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getVmName() {
		return this.vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getVmStatus() {
		return this.vmStatus;
	}

	public void setVmStatus(String vmStatus) {
		this.vmStatus = vmStatus;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getNcId() {
		return this.ncId;
	}

	public void setNcId(String ncId) {
		this.ncId = ncId;
	}

	public String getVlanNo() {
		return this.vlanNo;
	}

	public void setVlanNo(String vlanNo) {
		this.vlanNo = vlanNo;
	}

	public String getRackId() {
		return this.rackId;
	}

	public void setRackId(String rackId) {
		this.rackId = rackId;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getVmInnerIp() {
		return this.vmInnerIp;
	}

	public void setVmInnerIp(String vmInnerIp) {
		this.vmInnerIp = vmInnerIp;
	}

	public Integer getVmCores() {
		return this.vmCores;
	}

	public void setVmCores(Integer vmCores) {
		this.vmCores = vmCores;
	}

	public String getVgwVip() {
		return this.vgwVip;
	}

	public void setVgwVip(String vgwVip) {
		this.vgwVip = vgwVip;
	}

	public String getStorageNetworkType() {
		return this.storageNetworkType;
	}

	public void setStorageNetworkType(String storageNetworkType) {
		this.storageNetworkType = storageNetworkType;
	}

	public Integer getVmMemory() {
		return this.vmMemory;
	}

	public void setVmMemory(Integer vmMemory) {
		this.vmMemory = vmMemory;
	}

	public Integer getVmDisk() {
		return this.vmDisk;
	}

	public void setVmDisk(Integer vmDisk) {
		this.vmDisk = vmDisk;
	}

	public Integer getVmBps() {
		return this.vmBps;
	}

	public void setVmBps(Integer vmBps) {
		this.vmBps = vmBps;
	}

	public String getVmPlatform() {
		return this.vmPlatform;
	}

	public void setVmPlatform(String vmPlatform) {
		this.vmPlatform = vmPlatform;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getNetmask() {
		return this.netmask;
	}

	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}

	public Integer getIntranetRx() {
		return this.intranetRx;
	}

	public void setIntranetRx(Integer intranetRx) {
		this.intranetRx = intranetRx;
	}

	public Integer getIntranetTx() {
		return this.intranetTx;
	}

	public void setIntranetTx(Integer intranetTx) {
		this.intranetTx = intranetTx;
	}

	public Integer getInternetRx() {
		return this.internetRx;
	}

	public void setInternetRx(Integer internetRx) {
		this.internetRx = internetRx;
	}

	public Integer getInternetTx() {
		return this.internetTx;
	}

	public void setInternetTx(Integer internetTx) {
		this.internetTx = internetTx;
	}

	public String getSafetyQuota() {
		return this.safetyQuota;
	}

	public void setSafetyQuota(String safetyQuota) {
		this.safetyQuota = safetyQuota;
	}

	public Integer getIntensiveIo() {
		return this.intensiveIo;
	}

	public void setIntensiveIo(Integer intensiveIo) {
		this.intensiveIo = intensiveIo;
	}

	public Integer getIntensiveCpu() {
		return this.intensiveCpu;
	}

	public void setIntensiveCpu(Integer intensiveCpu) {
		this.intensiveCpu = intensiveCpu;
	}

	public Integer getIntensiveNet() {
		return this.intensiveNet;
	}

	public void setIntensiveNet(Integer intensiveNet) {
		this.intensiveNet = intensiveNet;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getVncHost() {
		return this.vncHost;
	}

	public void setVncHost(String vncHost) {
		this.vncHost = vncHost;
	}

	public Integer getVncPort() {
		return this.vncPort;
	}

	public void setVncPort(Integer vncPort) {
		this.vncPort = vncPort;
	}

	public String getVncPassword() {
		return this.vncPassword;
	}

	public void setVncPassword(String vncPassword) {
		this.vncPassword = vncPassword;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVpcSubnetId() {
		return this.vpcSubnetId;
	}

	public void setVpcSubnetId(String vpcSubnetId) {
		this.vpcSubnetId = vpcSubnetId;
	}

	public String getVmAliIp() {
		return this.vmAliIp;
	}

	public void setVmAliIp(String vmAliIp) {
		this.vmAliIp = vmAliIp;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public VmStatusNote getVmStatusNote() {
		return this.vmStatusNote;
	}

	public void setVmStatusNote(VmStatusNote vmStatusNote) {
		this.vmStatusNote = vmStatusNote;
	}

	public VmPublicIp getVmPublicIp() {
		return this.vmPublicIp;
	}

	public void setVmPublicIp(VmPublicIp vmPublicIp) {
		this.vmPublicIp = vmPublicIp;
	}

	public VmImage getVmImage() {
		return this.vmImage;
	}

	public void setVmImage(VmImage vmImage) {
		this.vmImage = vmImage;
	}

	public Eip getEip() {
		return this.eip;
	}

	public void setEip(Eip eip) {
		this.eip = eip;
	}

	public static class Group {

		private String securityGroupId;

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}
	}

	public static class VmStatusNote {

		private String noteCode;

		private String noteInfo;

		public String getNoteCode() {
			return this.noteCode;
		}

		public void setNoteCode(String noteCode) {
			this.noteCode = noteCode;
		}

		public String getNoteInfo() {
			return this.noteInfo;
		}

		public void setNoteInfo(String noteInfo) {
			this.noteInfo = noteInfo;
		}
	}

	public static class VmPublicIp {

		private String bindIp;

		private String assignIp;

		private String assignNatIp;

		public String getBindIp() {
			return this.bindIp;
		}

		public void setBindIp(String bindIp) {
			this.bindIp = bindIp;
		}

		public String getAssignIp() {
			return this.assignIp;
		}

		public void setAssignIp(String assignIp) {
			this.assignIp = assignIp;
		}

		public String getAssignNatIp() {
			return this.assignNatIp;
		}

		public void setAssignNatIp(String assignNatIp) {
			this.assignNatIp = assignNatIp;
		}
	}

	public static class VmImage {

		private String imageId;

		private String imageName;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}
	}

	public static class Eip {

		private String ip;

		private Integer internetTx;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}
	}

	@Override
	public OpsDetailHouyiVmResponse getInstance(UnmarshallerContext context) {
		return	OpsDetailHouyiVmResponseUnmarshaller.unmarshall(this, context);
	}
}
