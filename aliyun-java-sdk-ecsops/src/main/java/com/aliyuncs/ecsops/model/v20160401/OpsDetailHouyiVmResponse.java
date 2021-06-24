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

	private String rackId;

	private String vlanNo;

	private Integer vncPort;

	private Integer intensiveIo;

	private String vmPlatform;

	private String vmAliIp;

	private String vgwVip;

	private String gateway;

	private Integer intensiveCpu;

	private Integer intensiveNet;

	private String vpcSubnetId;

	private Integer vmBps;

	private Integer vmCores;

	private String storageNetworkType;

	private String requestId;

	private String clusterId;

	private String securityGroupId;

	private String vmName;

	private Integer intranetTx;

	private String safetyQuota;

	private String hostname;

	private Integer vmMemory;

	private String payType;

	private String machineNo;

	private String mac;

	private Integer intranetRx;

	private String vmInnerIp;

	private String vncHost;

	private String vpcId;

	private String serialNumber;

	private String ncId;

	private Integer vmDisk;

	private String vmStatus;

	private Integer internetTx;

	private Integer internetRx;

	private String vncPassword;

	private String regionId;

	private String netmask;

	private List<Group> groups;

	private VmImage vmImage;

	private VmStatusNote vmStatusNote;

	private VmPublicIp vmPublicIp;

	private Eip eip;

	public String getRackId() {
		return this.rackId;
	}

	public void setRackId(String rackId) {
		this.rackId = rackId;
	}

	public String getVlanNo() {
		return this.vlanNo;
	}

	public void setVlanNo(String vlanNo) {
		this.vlanNo = vlanNo;
	}

	public Integer getVncPort() {
		return this.vncPort;
	}

	public void setVncPort(Integer vncPort) {
		this.vncPort = vncPort;
	}

	public Integer getIntensiveIo() {
		return this.intensiveIo;
	}

	public void setIntensiveIo(Integer intensiveIo) {
		this.intensiveIo = intensiveIo;
	}

	public String getVmPlatform() {
		return this.vmPlatform;
	}

	public void setVmPlatform(String vmPlatform) {
		this.vmPlatform = vmPlatform;
	}

	public String getVmAliIp() {
		return this.vmAliIp;
	}

	public void setVmAliIp(String vmAliIp) {
		this.vmAliIp = vmAliIp;
	}

	public String getVgwVip() {
		return this.vgwVip;
	}

	public void setVgwVip(String vgwVip) {
		this.vgwVip = vgwVip;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
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

	public String getVpcSubnetId() {
		return this.vpcSubnetId;
	}

	public void setVpcSubnetId(String vpcSubnetId) {
		this.vpcSubnetId = vpcSubnetId;
	}

	public Integer getVmBps() {
		return this.vmBps;
	}

	public void setVmBps(Integer vmBps) {
		this.vmBps = vmBps;
	}

	public Integer getVmCores() {
		return this.vmCores;
	}

	public void setVmCores(Integer vmCores) {
		this.vmCores = vmCores;
	}

	public String getStorageNetworkType() {
		return this.storageNetworkType;
	}

	public void setStorageNetworkType(String storageNetworkType) {
		this.storageNetworkType = storageNetworkType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getVmName() {
		return this.vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public Integer getIntranetTx() {
		return this.intranetTx;
	}

	public void setIntranetTx(Integer intranetTx) {
		this.intranetTx = intranetTx;
	}

	public String getSafetyQuota() {
		return this.safetyQuota;
	}

	public void setSafetyQuota(String safetyQuota) {
		this.safetyQuota = safetyQuota;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Integer getVmMemory() {
		return this.vmMemory;
	}

	public void setVmMemory(Integer vmMemory) {
		this.vmMemory = vmMemory;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getMachineNo() {
		return this.machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Integer getIntranetRx() {
		return this.intranetRx;
	}

	public void setIntranetRx(Integer intranetRx) {
		this.intranetRx = intranetRx;
	}

	public String getVmInnerIp() {
		return this.vmInnerIp;
	}

	public void setVmInnerIp(String vmInnerIp) {
		this.vmInnerIp = vmInnerIp;
	}

	public String getVncHost() {
		return this.vncHost;
	}

	public void setVncHost(String vncHost) {
		this.vncHost = vncHost;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getNcId() {
		return this.ncId;
	}

	public void setNcId(String ncId) {
		this.ncId = ncId;
	}

	public Integer getVmDisk() {
		return this.vmDisk;
	}

	public void setVmDisk(Integer vmDisk) {
		this.vmDisk = vmDisk;
	}

	public String getVmStatus() {
		return this.vmStatus;
	}

	public void setVmStatus(String vmStatus) {
		this.vmStatus = vmStatus;
	}

	public Integer getInternetTx() {
		return this.internetTx;
	}

	public void setInternetTx(Integer internetTx) {
		this.internetTx = internetTx;
	}

	public Integer getInternetRx() {
		return this.internetRx;
	}

	public void setInternetRx(Integer internetRx) {
		this.internetRx = internetRx;
	}

	public String getVncPassword() {
		return this.vncPassword;
	}

	public void setVncPassword(String vncPassword) {
		this.vncPassword = vncPassword;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getNetmask() {
		return this.netmask;
	}

	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public VmImage getVmImage() {
		return this.vmImage;
	}

	public void setVmImage(VmImage vmImage) {
		this.vmImage = vmImage;
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

	public static class VmImage {

		private String imageName;

		private String imageId;

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
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

	public static class Eip {

		private Integer internetTx;

		private String ip;

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}
	}

	@Override
	public OpsDetailHouyiVmResponse getInstance(UnmarshallerContext context) {
		return	OpsDetailHouyiVmResponseUnmarshaller.unmarshall(this, context);
	}
}
