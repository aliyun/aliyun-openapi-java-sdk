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
import com.aliyuncs.retailcloud.transform.v20180313.ListClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterResponse extends AcsResponse {

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Long totalCount;

	private List<ClusterInfo> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ClusterInfo> getData() {
		return this.data;
	}

	public void setData(List<ClusterInfo> data) {
		this.data = data;
	}

	public static class ClusterInfo {

		private String businessCode;

		private String clusterTitle;

		private String createStatus;

		private String envType;

		private Long id;

		private String instanceId;

		private String keyPair;

		private String netPlug;

		private String password;

		private String podCIDR;

		private String regionId;

		private String regionName;

		private String serviceCIDR;

		private String status;

		private String vpcId;

		private String workLoadCpu;

		private String workLoadMem;

		private List<String> ecsIds;

		private List<String> vswitchIds;

		public String getBusinessCode() {
			return this.businessCode;
		}

		public void setBusinessCode(String businessCode) {
			this.businessCode = businessCode;
		}

		public String getClusterTitle() {
			return this.clusterTitle;
		}

		public void setClusterTitle(String clusterTitle) {
			this.clusterTitle = clusterTitle;
		}

		public String getCreateStatus() {
			return this.createStatus;
		}

		public void setCreateStatus(String createStatus) {
			this.createStatus = createStatus;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getKeyPair() {
			return this.keyPair;
		}

		public void setKeyPair(String keyPair) {
			this.keyPair = keyPair;
		}

		public String getNetPlug() {
			return this.netPlug;
		}

		public void setNetPlug(String netPlug) {
			this.netPlug = netPlug;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPodCIDR() {
			return this.podCIDR;
		}

		public void setPodCIDR(String podCIDR) {
			this.podCIDR = podCIDR;
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

		public String getServiceCIDR() {
			return this.serviceCIDR;
		}

		public void setServiceCIDR(String serviceCIDR) {
			this.serviceCIDR = serviceCIDR;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getWorkLoadCpu() {
			return this.workLoadCpu;
		}

		public void setWorkLoadCpu(String workLoadCpu) {
			this.workLoadCpu = workLoadCpu;
		}

		public String getWorkLoadMem() {
			return this.workLoadMem;
		}

		public void setWorkLoadMem(String workLoadMem) {
			this.workLoadMem = workLoadMem;
		}

		public List<String> getEcsIds() {
			return this.ecsIds;
		}

		public void setEcsIds(List<String> ecsIds) {
			this.ecsIds = ecsIds;
		}

		public List<String> getVswitchIds() {
			return this.vswitchIds;
		}

		public void setVswitchIds(List<String> vswitchIds) {
			this.vswitchIds = vswitchIds;
		}
	}

	@Override
	public ListClusterResponse getInstance(UnmarshallerContext context) {
		return	ListClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
