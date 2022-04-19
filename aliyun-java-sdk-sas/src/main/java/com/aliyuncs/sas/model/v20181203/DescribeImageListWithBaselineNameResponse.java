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
import com.aliyuncs.sas.transform.v20181203.DescribeImageListWithBaselineNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageListWithBaselineNameResponse extends AcsResponse {

	private String requestId;

	private List<ImageInfosItem> imageInfos;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageInfosItem> getImageInfos() {
		return this.imageInfos;
	}

	public void setImageInfos(List<ImageInfosItem> imageInfos) {
		this.imageInfos = imageInfos;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ImageInfosItem {

		private Integer middleRiskImage;

		private String endpoints;

		private String riskStatus;

		private Long imageCreate;

		private String digest;

		private String tag;

		private Long imageUpdate;

		private String instanceId;

		private Integer lowRiskImage;

		private String repoType;

		private String regionId;

		private String uuid;

		private Integer imageSize;

		private String repoId;

		private Integer totalItemCount;

		private Integer highRiskImage;

		private Integer noRiskImage;

		private String imageId;

		private String repoName;

		private String repoNamespace;

		public Integer getMiddleRiskImage() {
			return this.middleRiskImage;
		}

		public void setMiddleRiskImage(Integer middleRiskImage) {
			this.middleRiskImage = middleRiskImage;
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

		public Long getImageCreate() {
			return this.imageCreate;
		}

		public void setImageCreate(Long imageCreate) {
			this.imageCreate = imageCreate;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Long getImageUpdate() {
			return this.imageUpdate;
		}

		public void setImageUpdate(Long imageUpdate) {
			this.imageUpdate = imageUpdate;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getLowRiskImage() {
			return this.lowRiskImage;
		}

		public void setLowRiskImage(Integer lowRiskImage) {
			this.lowRiskImage = lowRiskImage;
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

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Integer getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Integer imageSize) {
			this.imageSize = imageSize;
		}

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public Integer getTotalItemCount() {
			return this.totalItemCount;
		}

		public void setTotalItemCount(Integer totalItemCount) {
			this.totalItemCount = totalItemCount;
		}

		public Integer getHighRiskImage() {
			return this.highRiskImage;
		}

		public void setHighRiskImage(Integer highRiskImage) {
			this.highRiskImage = highRiskImage;
		}

		public Integer getNoRiskImage() {
			return this.noRiskImage;
		}

		public void setNoRiskImage(Integer noRiskImage) {
			this.noRiskImage = noRiskImage;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
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
	public DescribeImageListWithBaselineNameResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageListWithBaselineNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
