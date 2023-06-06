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
import com.aliyuncs.sas.transform.v20181203.ListCheckItemWarningMachineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCheckItemWarningMachineResponse extends AcsResponse {

	private String requestId;

	private List<ListItem> list;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ListItem {

		private Integer status;

		private Boolean bind;

		private Integer authVersion;

		private Boolean portOpen;

		private String instanceId;

		private String intranetIp;

		private String internetIp;

		private String instanceName;

		private String uuid;

		private String regionId;

		private String prompt;

		private String containerId;

		private String containerName;

		private List<WarningRiskListItem> warningRiskList;

		private List<FixListItem> fixList;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getBind() {
			return this.bind;
		}

		public void setBind(Boolean bind) {
			this.bind = bind;
		}

		public Integer getAuthVersion() {
			return this.authVersion;
		}

		public void setAuthVersion(Integer authVersion) {
			this.authVersion = authVersion;
		}

		public Boolean getPortOpen() {
			return this.portOpen;
		}

		public void setPortOpen(Boolean portOpen) {
			this.portOpen = portOpen;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public List<WarningRiskListItem> getWarningRiskList() {
			return this.warningRiskList;
		}

		public void setWarningRiskList(List<WarningRiskListItem> warningRiskList) {
			this.warningRiskList = warningRiskList;
		}

		public List<FixListItem> getFixList() {
			return this.fixList;
		}

		public void setFixList(List<FixListItem> fixList) {
			this.fixList = fixList;
		}

		public static class WarningRiskListItem {

			private Long riskId;

			private String riskName;

			public Long getRiskId() {
				return this.riskId;
			}

			public void setRiskId(Long riskId) {
				this.riskId = riskId;
			}

			public String getRiskName() {
				return this.riskName;
			}

			public void setRiskName(String riskName) {
				this.riskName = riskName;
			}
		}

		public static class FixListItem {

			private Long riskId;

			private String riskName;

			public Long getRiskId() {
				return this.riskId;
			}

			public void setRiskId(Long riskId) {
				this.riskId = riskId;
			}

			public String getRiskName() {
				return this.riskName;
			}

			public void setRiskName(String riskName) {
				this.riskName = riskName;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private String lastRowKey;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public String getLastRowKey() {
			return this.lastRowKey;
		}

		public void setLastRowKey(String lastRowKey) {
			this.lastRowKey = lastRowKey;
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
	public ListCheckItemWarningMachineResponse getInstance(UnmarshallerContext context) {
		return	ListCheckItemWarningMachineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
