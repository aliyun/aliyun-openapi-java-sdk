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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListSupabaseProjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSupabaseProjectsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private String nextToken;

	private Integer maxResults;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String status;

		private String publicConnectUrl;

		private String dashboardUserName;

		private String engineVersion;

		private String zoneId;

		private String projectName;

		private String vSwitchId;

		private String createTime;

		private String projectId;

		private String diskPerformanceLevel;

		private Long storageSize;

		private String payType;

		private String privateConnectUrl;

		private String projectSpec;

		private String vpcId;

		private String securityIPList;

		private String dashboardPassword;

		private String regionId;

		private String engine;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPublicConnectUrl() {
			return this.publicConnectUrl;
		}

		public void setPublicConnectUrl(String publicConnectUrl) {
			this.publicConnectUrl = publicConnectUrl;
		}

		public String getDashboardUserName() {
			return this.dashboardUserName;
		}

		public void setDashboardUserName(String dashboardUserName) {
			this.dashboardUserName = dashboardUserName;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getDiskPerformanceLevel() {
			return this.diskPerformanceLevel;
		}

		public void setDiskPerformanceLevel(String diskPerformanceLevel) {
			this.diskPerformanceLevel = diskPerformanceLevel;
		}

		public Long getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Long storageSize) {
			this.storageSize = storageSize;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getPrivateConnectUrl() {
			return this.privateConnectUrl;
		}

		public void setPrivateConnectUrl(String privateConnectUrl) {
			this.privateConnectUrl = privateConnectUrl;
		}

		public String getProjectSpec() {
			return this.projectSpec;
		}

		public void setProjectSpec(String projectSpec) {
			this.projectSpec = projectSpec;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getDashboardPassword() {
			return this.dashboardPassword;
		}

		public void setDashboardPassword(String dashboardPassword) {
			this.dashboardPassword = dashboardPassword;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}
	}

	@Override
	public ListSupabaseProjectsResponse getInstance(UnmarshallerContext context) {
		return	ListSupabaseProjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
