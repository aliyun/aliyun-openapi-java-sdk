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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Cluster cluster;

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

	public Cluster getCluster() {
		return this.cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public static class Cluster {

		private String vpcId;

		private Integer oversoldFactor;

		private Long updateTime;

		private Integer memUsed;

		private String iaasProvider;

		private Long createTime;

		private Integer cpuUsed;

		private Integer mem;

		private String regionId;

		private Integer cpu;

		private String csClusterId;

		private Integer networkMode;

		private String description;

		private Integer clusterType;

		private String clusterName;

		private Integer nodeNum;

		private Integer clusterImportStatus;

		private String clusterId;

		private String subClusterType;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Integer getOversoldFactor() {
			return this.oversoldFactor;
		}

		public void setOversoldFactor(Integer oversoldFactor) {
			this.oversoldFactor = oversoldFactor;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getMemUsed() {
			return this.memUsed;
		}

		public void setMemUsed(Integer memUsed) {
			this.memUsed = memUsed;
		}

		public String getIaasProvider() {
			return this.iaasProvider;
		}

		public void setIaasProvider(String iaasProvider) {
			this.iaasProvider = iaasProvider;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getCpuUsed() {
			return this.cpuUsed;
		}

		public void setCpuUsed(Integer cpuUsed) {
			this.cpuUsed = cpuUsed;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getCsClusterId() {
			return this.csClusterId;
		}

		public void setCsClusterId(String csClusterId) {
			this.csClusterId = csClusterId;
		}

		public Integer getNetworkMode() {
			return this.networkMode;
		}

		public void setNetworkMode(Integer networkMode) {
			this.networkMode = networkMode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(Integer nodeNum) {
			this.nodeNum = nodeNum;
		}

		public Integer getClusterImportStatus() {
			return this.clusterImportStatus;
		}

		public void setClusterImportStatus(Integer clusterImportStatus) {
			this.clusterImportStatus = clusterImportStatus;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getSubClusterType() {
			return this.subClusterType;
		}

		public void setSubClusterType(String subClusterType) {
			this.subClusterType = subClusterType;
		}
	}

	@Override
	public GetClusterResponse getInstance(UnmarshallerContext context) {
		return	GetClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
