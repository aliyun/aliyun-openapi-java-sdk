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
import com.aliyuncs.sas.transform.v20181203.ListClusterInterceptionConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterInterceptionConfigResponse extends AcsResponse {

	private String requestId;

	private List<ClusterConfig> clusterConfigList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterConfig> getClusterConfigList() {
		return this.clusterConfigList;
	}

	public void setClusterConfigList(List<ClusterConfig> clusterConfigList) {
		this.clusterConfigList = clusterConfigList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ClusterConfig {

		private String clusterName;

		private Integer interceptionSwitch;

		private Integer interceptionType;

		private String clusterId;

		private Integer clusterCNNFStatus;

		private Long openRuleCount;

		private Long totalRuleCount;

		private Boolean supportCNNF;

		private String clusterType;

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getInterceptionSwitch() {
			return this.interceptionSwitch;
		}

		public void setInterceptionSwitch(Integer interceptionSwitch) {
			this.interceptionSwitch = interceptionSwitch;
		}

		public Integer getInterceptionType() {
			return this.interceptionType;
		}

		public void setInterceptionType(Integer interceptionType) {
			this.interceptionType = interceptionType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Integer getClusterCNNFStatus() {
			return this.clusterCNNFStatus;
		}

		public void setClusterCNNFStatus(Integer clusterCNNFStatus) {
			this.clusterCNNFStatus = clusterCNNFStatus;
		}

		public Long getOpenRuleCount() {
			return this.openRuleCount;
		}

		public void setOpenRuleCount(Long openRuleCount) {
			this.openRuleCount = openRuleCount;
		}

		public Long getTotalRuleCount() {
			return this.totalRuleCount;
		}

		public void setTotalRuleCount(Long totalRuleCount) {
			this.totalRuleCount = totalRuleCount;
		}

		public Boolean getSupportCNNF() {
			return this.supportCNNF;
		}

		public void setSupportCNNF(Boolean supportCNNF) {
			this.supportCNNF = supportCNNF;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}
	}

	public static class PageInfo {

		private Integer totalCount;

		private Integer count;

		private Integer currrentPage;

		private Integer pageSize;

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

		public Integer getCurrrentPage() {
			return this.currrentPage;
		}

		public void setCurrrentPage(Integer currrentPage) {
			this.currrentPage = currrentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public ListClusterInterceptionConfigResponse getInstance(UnmarshallerContext context) {
		return	ListClusterInterceptionConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
