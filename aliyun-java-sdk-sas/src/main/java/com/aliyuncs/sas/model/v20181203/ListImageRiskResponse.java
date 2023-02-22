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
import com.aliyuncs.sas.transform.v20181203.ListImageRiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListImageRiskResponse extends AcsResponse {

	private String requestId;

	private List<ImageRiskListItem> imageRiskList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageRiskListItem> getImageRiskList() {
		return this.imageRiskList;
	}

	public void setImageRiskList(List<ImageRiskListItem> imageRiskList) {
		this.imageRiskList = imageRiskList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ImageRiskListItem {

		private String repoNamespace;

		private String repoName;

		private String tag;

		private String regionId;

		private String digest;

		private String repoId;

		private String repoType;

		private String registryType;

		private String endpoints;

		private String imageId;

		private Integer tagImmutable;

		private String statistics;

		private String imageAccessType;

		private String image;

		private String uuid;

		private String internetURLs;

		private String vpcURLs;

		private List<Endpoint> endPointList;

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public String getRepoType() {
			return this.repoType;
		}

		public void setRepoType(String repoType) {
			this.repoType = repoType;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public String getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(String endpoints) {
			this.endpoints = endpoints;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Integer getTagImmutable() {
			return this.tagImmutable;
		}

		public void setTagImmutable(Integer tagImmutable) {
			this.tagImmutable = tagImmutable;
		}

		public String getStatistics() {
			return this.statistics;
		}

		public void setStatistics(String statistics) {
			this.statistics = statistics;
		}

		public String getImageAccessType() {
			return this.imageAccessType;
		}

		public void setImageAccessType(String imageAccessType) {
			this.imageAccessType = imageAccessType;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getInternetURLs() {
			return this.internetURLs;
		}

		public void setInternetURLs(String internetURLs) {
			this.internetURLs = internetURLs;
		}

		public String getVpcURLs() {
			return this.vpcURLs;
		}

		public void setVpcURLs(String vpcURLs) {
			this.vpcURLs = vpcURLs;
		}

		public List<Endpoint> getEndPointList() {
			return this.endPointList;
		}

		public void setEndPointList(List<Endpoint> endPointList) {
			this.endPointList = endPointList;
		}

		public static class Endpoint {

			private String type;

			private List<String> domains;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<String> getDomains() {
				return this.domains;
			}

			public void setDomains(List<String> domains) {
				this.domains = domains;
			}
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
	public ListImageRiskResponse getInstance(UnmarshallerContext context) {
		return	ListImageRiskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
