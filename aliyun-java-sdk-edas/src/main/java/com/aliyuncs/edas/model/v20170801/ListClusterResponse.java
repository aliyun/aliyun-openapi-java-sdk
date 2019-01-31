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
import com.aliyuncs.edas.transform.v20170801.ListClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Cluster> clusterList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Cluster> getClusterList() {
		return this.clusterList;
	}

	public void setClusterList(List<Cluster> clusterList) {
		this.clusterList = clusterList;
	}

	public static class Cluster {

		private String clusterId;

		private String regionId;

		private String description;

		private String clusterName;

		private Integer clusterType;

		private Integer oversoldFactor;

		private Integer networkMode;

		private String vpcId;

		private Integer nodeNum;

		private Integer cpu;

		private Integer mem;

		private Integer cpuUsed;

		private Integer memUsed;

		private Long createTime;

		private Long updateTime;

		private String iaasProvider;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public Integer getOversoldFactor() {
			return this.oversoldFactor;
		}

		public void setOversoldFactor(Integer oversoldFactor) {
			this.oversoldFactor = oversoldFactor;
		}

		public Integer getNetworkMode() {
			return this.networkMode;
		}

		public void setNetworkMode(Integer networkMode) {
			this.networkMode = networkMode;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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

		public Integer getCpuUsed() {
			return this.cpuUsed;
		}

		public void setCpuUsed(Integer cpuUsed) {
			this.cpuUsed = cpuUsed;
		}

		public Integer getMemUsed() {
			return this.memUsed;
		}

		public void setMemUsed(Integer memUsed) {
			this.memUsed = memUsed;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getIaasProvider() {
			return this.iaasProvider;
		}

		public void setIaasProvider(String iaasProvider) {
			this.iaasProvider = iaasProvider;
		}
	}

	@Override
	public ListClusterResponse getInstance(UnmarshallerContext context) {
		return	ListClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
