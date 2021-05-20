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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeCloudConnectNetworksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudConnectNetworksResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<CloudConnectNetwork> cloudConnectNetworks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<CloudConnectNetwork> getCloudConnectNetworks() {
		return this.cloudConnectNetworks;
	}

	public void setCloudConnectNetworks(List<CloudConnectNetwork> cloudConnectNetworks) {
		this.cloudConnectNetworks = cloudConnectNetworks;
	}

	public static class CloudConnectNetwork {

		private Boolean isDefault;

		private String description;

		private String interworkingStatus;

		private String availableCloudBoxCount;

		private String ccnId;

		private Long createTime;

		private String cidrBlock;

		private String associatedCenOwnerId;

		private String associatedCenId;

		private String snatCidrBlock;

		private String associatedCloudBoxCount;

		private String name;

		private List<Tag> tags;

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInterworkingStatus() {
			return this.interworkingStatus;
		}

		public void setInterworkingStatus(String interworkingStatus) {
			this.interworkingStatus = interworkingStatus;
		}

		public String getAvailableCloudBoxCount() {
			return this.availableCloudBoxCount;
		}

		public void setAvailableCloudBoxCount(String availableCloudBoxCount) {
			this.availableCloudBoxCount = availableCloudBoxCount;
		}

		public String getCcnId() {
			return this.ccnId;
		}

		public void setCcnId(String ccnId) {
			this.ccnId = ccnId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getAssociatedCenOwnerId() {
			return this.associatedCenOwnerId;
		}

		public void setAssociatedCenOwnerId(String associatedCenOwnerId) {
			this.associatedCenOwnerId = associatedCenOwnerId;
		}

		public String getAssociatedCenId() {
			return this.associatedCenId;
		}

		public void setAssociatedCenId(String associatedCenId) {
			this.associatedCenId = associatedCenId;
		}

		public String getSnatCidrBlock() {
			return this.snatCidrBlock;
		}

		public void setSnatCidrBlock(String snatCidrBlock) {
			this.snatCidrBlock = snatCidrBlock;
		}

		public String getAssociatedCloudBoxCount() {
			return this.associatedCloudBoxCount;
		}

		public void setAssociatedCloudBoxCount(String associatedCloudBoxCount) {
			this.associatedCloudBoxCount = associatedCloudBoxCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public DescribeCloudConnectNetworksResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudConnectNetworksResponseUnmarshaller.unmarshall(this, context);
	}
}
