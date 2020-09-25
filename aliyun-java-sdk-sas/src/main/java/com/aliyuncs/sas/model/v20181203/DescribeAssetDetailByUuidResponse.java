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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAssetDetailByUuidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssetDetailByUuidResponse extends AcsResponse {

	private String requestId;

	private AssetDetail assetDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AssetDetail getAssetDetail() {
		return this.assetDetail;
	}

	public void setAssetDetail(AssetDetail assetDetail) {
		this.assetDetail = assetDetail;
	}

	public static class AssetDetail {

		private String internetIp;

		private String intranetIp;

		private String instanceName;

		private String instanceId;

		private String ip;

		private String uuid;

		private String assetType;

		private String os;

		private String clientStatus;

		private String region;

		private String regionName;

		private String tag;

		private String groupTrace;

		private Integer cpu;

		private String cpuInfo;

		private String kernel;

		private String osDetail;

		private Integer mem;

		private String sysInfo;

		private String hostName;

		private String osName;

		private String vpcInstanceId;

		private String instanceStatus;

		private Long createTime;

		private List<String> ipList;

		private List<String> macList;

		private List<String> diskInfoList;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getClientStatus() {
			return this.clientStatus;
		}

		public void setClientStatus(String clientStatus) {
			this.clientStatus = clientStatus;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getGroupTrace() {
			return this.groupTrace;
		}

		public void setGroupTrace(String groupTrace) {
			this.groupTrace = groupTrace;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getCpuInfo() {
			return this.cpuInfo;
		}

		public void setCpuInfo(String cpuInfo) {
			this.cpuInfo = cpuInfo;
		}

		public String getKernel() {
			return this.kernel;
		}

		public void setKernel(String kernel) {
			this.kernel = kernel;
		}

		public String getOsDetail() {
			return this.osDetail;
		}

		public void setOsDetail(String osDetail) {
			this.osDetail = osDetail;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getSysInfo() {
			return this.sysInfo;
		}

		public void setSysInfo(String sysInfo) {
			this.sysInfo = sysInfo;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public List<String> getIpList() {
			return this.ipList;
		}

		public void setIpList(List<String> ipList) {
			this.ipList = ipList;
		}

		public List<String> getMacList() {
			return this.macList;
		}

		public void setMacList(List<String> macList) {
			this.macList = macList;
		}

		public List<String> getDiskInfoList() {
			return this.diskInfoList;
		}

		public void setDiskInfoList(List<String> diskInfoList) {
			this.diskInfoList = diskInfoList;
		}
	}

	@Override
	public DescribeAssetDetailByUuidResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssetDetailByUuidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
