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
import com.aliyuncs.sas.transform.v20181203.ListAgentlessRiskUuidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAgentlessRiskUuidResponse extends AcsResponse {

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

		private String uuid;

		private String instanceName;

		private String internetIp;

		private String intranetIp;

		private Integer vulCount;

		private Integer maliciousCount;

		private Integer baselineCount;

		private String targetId;

		private String targetName;

		private Long scanTime;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Integer getVulCount() {
			return this.vulCount;
		}

		public void setVulCount(Integer vulCount) {
			this.vulCount = vulCount;
		}

		public Integer getMaliciousCount() {
			return this.maliciousCount;
		}

		public void setMaliciousCount(Integer maliciousCount) {
			this.maliciousCount = maliciousCount;
		}

		public Integer getBaselineCount() {
			return this.baselineCount;
		}

		public void setBaselineCount(Integer baselineCount) {
			this.baselineCount = baselineCount;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getTargetName() {
			return this.targetName;
		}

		public void setTargetName(String targetName) {
			this.targetName = targetName;
		}

		public Long getScanTime() {
			return this.scanTime;
		}

		public void setScanTime(Long scanTime) {
			this.scanTime = scanTime;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

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
	}

	@Override
	public ListAgentlessRiskUuidResponse getInstance(UnmarshallerContext context) {
		return	ListAgentlessRiskUuidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
