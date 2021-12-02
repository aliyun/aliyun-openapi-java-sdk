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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListClusterNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterNodeResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<ClusterNodeInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ClusterNodeInfo> getData() {
		return this.data;
	}

	public void setData(List<ClusterNodeInfo> data) {
		this.data = data;
	}

	public static class ClusterNodeInfo {

		private String vpcId;

		private String ecsEip;

		private String ecsOsType;

		private String businessCode;

		private String ecsLocalStorageCapacity;

		private String instanceId;

		private String internetMaxBandwidthOut;

		private String internetMaxBandwidthIn;

		private String instanceType;

		private String ecsMemory;

		private String ecsConfiguration;

		private String regionId;

		private String ecsPublicIp;

		private String ecsPrivateIp;

		private String instanceNetworkType;

		private String instanceName;

		private String oSName;

		private String ecsZone;

		private String ecsExpiredTime;

		private String ecsCpu;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getEcsEip() {
			return this.ecsEip;
		}

		public void setEcsEip(String ecsEip) {
			this.ecsEip = ecsEip;
		}

		public String getEcsOsType() {
			return this.ecsOsType;
		}

		public void setEcsOsType(String ecsOsType) {
			this.ecsOsType = ecsOsType;
		}

		public String getBusinessCode() {
			return this.businessCode;
		}

		public void setBusinessCode(String businessCode) {
			this.businessCode = businessCode;
		}

		public String getEcsLocalStorageCapacity() {
			return this.ecsLocalStorageCapacity;
		}

		public void setEcsLocalStorageCapacity(String ecsLocalStorageCapacity) {
			this.ecsLocalStorageCapacity = ecsLocalStorageCapacity;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(String internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getEcsMemory() {
			return this.ecsMemory;
		}

		public void setEcsMemory(String ecsMemory) {
			this.ecsMemory = ecsMemory;
		}

		public String getEcsConfiguration() {
			return this.ecsConfiguration;
		}

		public void setEcsConfiguration(String ecsConfiguration) {
			this.ecsConfiguration = ecsConfiguration;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEcsPublicIp() {
			return this.ecsPublicIp;
		}

		public void setEcsPublicIp(String ecsPublicIp) {
			this.ecsPublicIp = ecsPublicIp;
		}

		public String getEcsPrivateIp() {
			return this.ecsPrivateIp;
		}

		public void setEcsPrivateIp(String ecsPrivateIp) {
			this.ecsPrivateIp = ecsPrivateIp;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getEcsZone() {
			return this.ecsZone;
		}

		public void setEcsZone(String ecsZone) {
			this.ecsZone = ecsZone;
		}

		public String getEcsExpiredTime() {
			return this.ecsExpiredTime;
		}

		public void setEcsExpiredTime(String ecsExpiredTime) {
			this.ecsExpiredTime = ecsExpiredTime;
		}

		public String getEcsCpu() {
			return this.ecsCpu;
		}

		public void setEcsCpu(String ecsCpu) {
			this.ecsCpu = ecsCpu;
		}
	}

	@Override
	public ListClusterNodeResponse getInstance(UnmarshallerContext context) {
		return	ListClusterNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
