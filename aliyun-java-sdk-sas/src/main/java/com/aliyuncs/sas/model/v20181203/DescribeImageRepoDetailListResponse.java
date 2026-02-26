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
import com.aliyuncs.sas.transform.v20181203.DescribeImageRepoDetailListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageRepoDetailListResponse extends AcsResponse {

	private String requestId;

	private List<Response> imageRepoResponses;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Response> getImageRepoResponses() {
		return this.imageRepoResponses;
	}

	public void setImageRepoResponses(List<Response> imageRepoResponses) {
		this.imageRepoResponses = imageRepoResponses;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Response {

		private String endpoints;

		private String riskStatus;

		private String vulStatus;

		private String alarmStatus;

		private String registryType;

		private String instanceId;

		private String repoType;

		private String regionId;

		private String repoId;

		private Integer hcCount;

		private Integer vulCount;

		private String hcStatus;

		private Integer alarmCount;

		private String repoName;

		private String repoNamespace;

		private Integer imageCount;

		public String getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(String endpoints) {
			this.endpoints = endpoints;
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

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRepoType() {
			return this.repoType;
		}

		public void setRepoType(String repoType) {
			this.repoType = repoType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public Integer getHcCount() {
			return this.hcCount;
		}

		public void setHcCount(Integer hcCount) {
			this.hcCount = hcCount;
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

		public Integer getAlarmCount() {
			return this.alarmCount;
		}

		public void setAlarmCount(Integer alarmCount) {
			this.alarmCount = alarmCount;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}

		public Integer getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Integer imageCount) {
			this.imageCount = imageCount;
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
	public DescribeImageRepoDetailListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageRepoDetailListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
