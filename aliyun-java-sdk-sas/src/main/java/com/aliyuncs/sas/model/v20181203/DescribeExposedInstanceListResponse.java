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
import com.aliyuncs.sas.transform.v20181203.DescribeExposedInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedInstanceListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<ExposedInstance> exposedInstances;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ExposedInstance> getExposedInstances() {
		return this.exposedInstances;
	}

	public void setExposedInstances(List<ExposedInstance> exposedInstances) {
		this.exposedInstances = exposedInstances;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ExposedInstance {

		private String uuid;

		private String intranetIp;

		private String internetIp;

		private Integer asapVulCount;

		private Integer laterVulCount;

		private Integer nntfVulCount;

		private Integer totalVulCount;

		private String exposureComponent;

		private String exposureType;

		private String exposureTypeId;

		private String exposurePort;

		private String exposureIp;

		private String instanceId;

		private String instanceName;

		private String regionId;

		private Long groupId;

		private String groupName;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
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

		public Integer getAsapVulCount() {
			return this.asapVulCount;
		}

		public void setAsapVulCount(Integer asapVulCount) {
			this.asapVulCount = asapVulCount;
		}

		public Integer getLaterVulCount() {
			return this.laterVulCount;
		}

		public void setLaterVulCount(Integer laterVulCount) {
			this.laterVulCount = laterVulCount;
		}

		public Integer getNntfVulCount() {
			return this.nntfVulCount;
		}

		public void setNntfVulCount(Integer nntfVulCount) {
			this.nntfVulCount = nntfVulCount;
		}

		public Integer getTotalVulCount() {
			return this.totalVulCount;
		}

		public void setTotalVulCount(Integer totalVulCount) {
			this.totalVulCount = totalVulCount;
		}

		public String getExposureComponent() {
			return this.exposureComponent;
		}

		public void setExposureComponent(String exposureComponent) {
			this.exposureComponent = exposureComponent;
		}

		public String getExposureType() {
			return this.exposureType;
		}

		public void setExposureType(String exposureType) {
			this.exposureType = exposureType;
		}

		public String getExposureTypeId() {
			return this.exposureTypeId;
		}

		public void setExposureTypeId(String exposureTypeId) {
			this.exposureTypeId = exposureTypeId;
		}

		public String getExposurePort() {
			return this.exposurePort;
		}

		public void setExposurePort(String exposurePort) {
			this.exposurePort = exposurePort;
		}

		public String getExposureIp() {
			return this.exposureIp;
		}

		public void setExposureIp(String exposureIp) {
			this.exposureIp = exposureIp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
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
	public DescribeExposedInstanceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeExposedInstanceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
