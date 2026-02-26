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
import com.aliyuncs.sas.transform.v20181203.ListPodRiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPodRiskResponse extends AcsResponse {

	private String requestId;

	private List<PodRiskListItem> podRiskList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PodRiskListItem> getPodRiskList() {
		return this.podRiskList;
	}

	public void setPodRiskList(List<PodRiskListItem> podRiskList) {
		this.podRiskList = podRiskList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PodRiskListItem {

		private String pod;

		private String nodeName;

		private String clusterId;

		private String podIp;

		private Long createTime;

		private String clusterName;

		private String namespace;

		private Integer vulCount;

		private Integer alarmCount;

		private Integer hcCount;

		private String instanceId;

		public String getPod() {
			return this.pod;
		}

		public void setPod(String pod) {
			this.pod = pod;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getPodIp() {
			return this.podIp;
		}

		public void setPodIp(String podIp) {
			this.podIp = podIp;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
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

		public Integer getHcCount() {
			return this.hcCount;
		}

		public void setHcCount(Integer hcCount) {
			this.hcCount = hcCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	public static class PageInfo {

		private Integer totalCount;

		private Integer count;

		private Integer pageSize;

		private Integer currentPage;

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

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public ListPodRiskResponse getInstance(UnmarshallerContext context) {
		return	ListPodRiskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
