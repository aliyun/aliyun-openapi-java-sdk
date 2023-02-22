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
import com.aliyuncs.sas.transform.v20181203.DescribeImageInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageInstancesResponse extends AcsResponse {

	private String requestId;

	private List<Responses> imageInstanceList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Responses> getImageInstanceList() {
		return this.imageInstanceList;
	}

	public void setImageInstanceList(List<Responses> imageInstanceList) {
		this.imageInstanceList = imageInstanceList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Responses {

		private String status;

		private String digest;

		private String registryType;

		private String tag;

		private String imageUpdate;

		private String repoType;

		private String imageSize;

		private String hcStatus;

		private Integer vulCount;

		private String imageId;

		private String endpoints;

		private String riskStatus;

		private String imageCreate;

		private String vulStatus;

		private String alarmStatus;

		private Integer scaProgress;

		private String instanceId;

		private String regionId;

		private String scaStatus;

		private String uuid;

		private String repoId;

		private Integer hcCount;

		private String scaResult;

		private String repoName;

		private Integer alarmCount;

		private String repoNamespace;

		private Integer deployed;

		private String sysProduct;

		private String sysVendor;

		private String sysVersion;

		private String osRelease;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getImageUpdate() {
			return this.imageUpdate;
		}

		public void setImageUpdate(String imageUpdate) {
			this.imageUpdate = imageUpdate;
		}

		public String getRepoType() {
			return this.repoType;
		}

		public void setRepoType(String repoType) {
			this.repoType = repoType;
		}

		public String getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(String imageSize) {
			this.imageSize = imageSize;
		}

		public String getHcStatus() {
			return this.hcStatus;
		}

		public void setHcStatus(String hcStatus) {
			this.hcStatus = hcStatus;
		}

		public Integer getVulCount() {
			return this.vulCount;
		}

		public void setVulCount(Integer vulCount) {
			this.vulCount = vulCount;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

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

		public String getImageCreate() {
			return this.imageCreate;
		}

		public void setImageCreate(String imageCreate) {
			this.imageCreate = imageCreate;
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

		public Integer getScaProgress() {
			return this.scaProgress;
		}

		public void setScaProgress(Integer scaProgress) {
			this.scaProgress = scaProgress;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getScaStatus() {
			return this.scaStatus;
		}

		public void setScaStatus(String scaStatus) {
			this.scaStatus = scaStatus;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
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

		public String getScaResult() {
			return this.scaResult;
		}

		public void setScaResult(String scaResult) {
			this.scaResult = scaResult;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public Integer getAlarmCount() {
			return this.alarmCount;
		}

		public void setAlarmCount(Integer alarmCount) {
			this.alarmCount = alarmCount;
		}

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}

		public Integer getDeployed() {
			return this.deployed;
		}

		public void setDeployed(Integer deployed) {
			this.deployed = deployed;
		}

		public String getSysProduct() {
			return this.sysProduct;
		}

		public void setSysProduct(String sysProduct) {
			this.sysProduct = sysProduct;
		}

		public String getSysVendor() {
			return this.sysVendor;
		}

		public void setSysVendor(String sysVendor) {
			this.sysVendor = sysVendor;
		}

		public String getSysVersion() {
			return this.sysVersion;
		}

		public void setSysVersion(String sysVersion) {
			this.sysVersion = sysVersion;
		}

		public String getOsRelease() {
			return this.osRelease;
		}

		public void setOsRelease(String osRelease) {
			this.osRelease = osRelease;
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
	public DescribeImageInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
