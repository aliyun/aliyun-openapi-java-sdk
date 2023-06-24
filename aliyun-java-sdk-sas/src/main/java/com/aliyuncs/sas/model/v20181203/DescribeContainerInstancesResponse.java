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
import com.aliyuncs.sas.transform.v20181203.DescribeContainerInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContainerInstancesResponse extends AcsResponse {

	private String requestId;

	private List<ContainerInstance> containerInstanceList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ContainerInstance> getContainerInstanceList() {
		return this.containerInstanceList;
	}

	public void setContainerInstanceList(List<ContainerInstance> containerInstanceList) {
		this.containerInstanceList = containerInstanceList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ContainerInstance {

		private String imageRepoTag;

		private String appName;

		private String podIp;

		private Integer vulCount;

		private String hcStatus;

		private String imageId;

		private String clusterId;

		private String imageRepoName;

		private String hostIp;

		private String pod;

		private String riskStatus;

		private String vulStatus;

		private String alarmStatus;

		private String image;

		private String imageRepoNamespace;

		private String imageDigest;

		private String namespace;

		private String instanceId;

		private String nodeInfo;

		private String imageUuid;

		private String regionId;

		private String updateMark;

		private String containerId;

		private String nodeName;

		private Integer hcCount;

		private String clusterName;

		private String riskCount;

		private Integer alarmCount;

		private Long createTimestamp;

		private Integer exposed;

		private String exposedDetail;

		public String getImageRepoTag() {
			return this.imageRepoTag;
		}

		public void setImageRepoTag(String imageRepoTag) {
			this.imageRepoTag = imageRepoTag;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getPodIp() {
			return this.podIp;
		}

		public void setPodIp(String podIp) {
			this.podIp = podIp;
		}

		public Integer getVulCount() {
			return this.vulCount;
		}

		public void setVulCount(Integer vulCount) {
			this.vulCount = vulCount;
		}

		public String getHcStatus() {
			return this.hcStatus;
		}

		public void setHcStatus(String hcStatus) {
			this.hcStatus = hcStatus;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getImageRepoName() {
			return this.imageRepoName;
		}

		public void setImageRepoName(String imageRepoName) {
			this.imageRepoName = imageRepoName;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public String getPod() {
			return this.pod;
		}

		public void setPod(String pod) {
			this.pod = pod;
		}

		public String getRiskStatus() {
			return this.riskStatus;
		}

		public void setRiskStatus(String riskStatus) {
			this.riskStatus = riskStatus;
		}

		public String getVulStatus() {
			return this.vulStatus;
		}

		public void setVulStatus(String vulStatus) {
			this.vulStatus = vulStatus;
		}

		public String getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(String alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getImageRepoNamespace() {
			return this.imageRepoNamespace;
		}

		public void setImageRepoNamespace(String imageRepoNamespace) {
			this.imageRepoNamespace = imageRepoNamespace;
		}

		public String getImageDigest() {
			return this.imageDigest;
		}

		public void setImageDigest(String imageDigest) {
			this.imageDigest = imageDigest;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNodeInfo() {
			return this.nodeInfo;
		}

		public void setNodeInfo(String nodeInfo) {
			this.nodeInfo = nodeInfo;
		}

		public String getImageUuid() {
			return this.imageUuid;
		}

		public void setImageUuid(String imageUuid) {
			this.imageUuid = imageUuid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUpdateMark() {
			return this.updateMark;
		}

		public void setUpdateMark(String updateMark) {
			this.updateMark = updateMark;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Integer getHcCount() {
			return this.hcCount;
		}

		public void setHcCount(Integer hcCount) {
			this.hcCount = hcCount;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(String riskCount) {
			this.riskCount = riskCount;
		}

		public Integer getAlarmCount() {
			return this.alarmCount;
		}

		public void setAlarmCount(Integer alarmCount) {
			this.alarmCount = alarmCount;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public Integer getExposed() {
			return this.exposed;
		}

		public void setExposed(Integer exposed) {
			this.exposed = exposed;
		}

		public String getExposedDetail() {
			return this.exposedDetail;
		}

		public void setExposedDetail(String exposedDetail) {
			this.exposedDetail = exposedDetail;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeContainerInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeContainerInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
