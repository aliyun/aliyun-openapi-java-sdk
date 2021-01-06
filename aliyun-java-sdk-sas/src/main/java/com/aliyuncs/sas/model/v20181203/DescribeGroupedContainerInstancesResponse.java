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
import com.aliyuncs.sas.transform.v20181203.DescribeGroupedContainerInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupedContainerInstancesResponse extends AcsResponse {

	private String requestId;

	private List<GroupedContainerInstance> groupedContainerInstanceList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GroupedContainerInstance> getGroupedContainerInstanceList() {
		return this.groupedContainerInstanceList;
	}

	public void setGroupedContainerInstanceList(List<GroupedContainerInstance> groupedContainerInstanceList) {
		this.groupedContainerInstanceList = groupedContainerInstanceList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class GroupedContainerInstance {

		private Integer instanceCount;

		private Integer riskInstanceCount;

		private String clusterId;

		private String riskStatus;

		private Integer vulCount;

		private Integer alarmCount;

		private String pod;

		private String podIp;

		private String instanceId;

		private String hostIp;

		private String clusterName;

		private Long createTime;

		private String appName;

		private String clusterType;

		private String custerState;

		private String regionId;

		private String namespace;

		private String riskLevel;

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getRiskInstanceCount() {
			return this.riskInstanceCount;
		}

		public void setRiskInstanceCount(Integer riskInstanceCount) {
			this.riskInstanceCount = riskInstanceCount;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRiskStatus() {
			return this.riskStatus;
		}

		public void setRiskStatus(String riskStatus) {
			this.riskStatus = riskStatus;
		}

		public Integer getVulCount() {
			return this.vulCount;
		}

		public void setVulCount(Integer vulCount) {
			this.vulCount = vulCount;
		}

		public Integer getAlarmCount() {
			return this.alarmCount;
		}

		public void setAlarmCount(Integer alarmCount) {
			this.alarmCount = alarmCount;
		}

		public String getPod() {
			return this.pod;
		}

		public void setPod(String pod) {
			this.pod = pod;
		}

		public String getPodIp() {
			return this.podIp;
		}

		public void setPodIp(String podIp) {
			this.podIp = podIp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getCusterState() {
			return this.custerState;
		}

		public void setCusterState(String custerState) {
			this.custerState = custerState;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeGroupedContainerInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupedContainerInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
