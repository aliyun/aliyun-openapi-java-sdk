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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetK8sClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetK8sClusterResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private ClusterPage clusterPage;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ClusterPage getClusterPage() {
		return this.clusterPage;
	}

	public void setClusterPage(ClusterPage clusterPage) {
		this.clusterPage = clusterPage;
	}

	public static class ClusterPage {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalSize;

		private List<Cluster> clusterList;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<Cluster> getClusterList() {
			return this.clusterList;
		}

		public void setClusterList(List<Cluster> clusterList) {
			this.clusterList = clusterList;
		}

		public static class Cluster {

			private String clusterId;

			private Integer clusterImportStatus;

			private String clusterName;

			private Integer clusterStatus;

			private Integer clusterType;

			private String regionId;

			private String vpcId;

			private String vswitchId;

			private String subNetCidr;

			private String csClusterStatus;

			private String csClusterId;

			private String description;

			private Integer nodeNum;

			private Integer cpu;

			private Integer mem;

			private Integer networkMode;

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Integer getClusterImportStatus() {
				return this.clusterImportStatus;
			}

			public void setClusterImportStatus(Integer clusterImportStatus) {
				this.clusterImportStatus = clusterImportStatus;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public Integer getClusterStatus() {
				return this.clusterStatus;
			}

			public void setClusterStatus(Integer clusterStatus) {
				this.clusterStatus = clusterStatus;
			}

			public Integer getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(Integer clusterType) {
				this.clusterType = clusterType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getSubNetCidr() {
				return this.subNetCidr;
			}

			public void setSubNetCidr(String subNetCidr) {
				this.subNetCidr = subNetCidr;
			}

			public String getCsClusterStatus() {
				return this.csClusterStatus;
			}

			public void setCsClusterStatus(String csClusterStatus) {
				this.csClusterStatus = csClusterStatus;
			}

			public String getCsClusterId() {
				return this.csClusterId;
			}

			public void setCsClusterId(String csClusterId) {
				this.csClusterId = csClusterId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getNodeNum() {
				return this.nodeNum;
			}

			public void setNodeNum(Integer nodeNum) {
				this.nodeNum = nodeNum;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getMem() {
				return this.mem;
			}

			public void setMem(Integer mem) {
				this.mem = mem;
			}

			public Integer getNetworkMode() {
				return this.networkMode;
			}

			public void setNetworkMode(Integer networkMode) {
				this.networkMode = networkMode;
			}
		}
	}

	@Override
	public GetK8sClusterResponse getInstance(UnmarshallerContext context) {
		return	GetK8sClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
