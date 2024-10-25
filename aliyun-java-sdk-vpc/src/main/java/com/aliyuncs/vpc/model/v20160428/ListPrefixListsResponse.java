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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListPrefixListsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrefixListsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long totalCount;

	private Long maxResults;

	private List<PrefixList> prefixLists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public List<PrefixList> getPrefixLists() {
		return this.prefixLists;
	}

	public void setPrefixLists(List<PrefixList> prefixLists) {
		this.prefixLists = prefixLists;
	}

	public static class PrefixList {

		private String prefixListId;

		private String prefixListName;

		private String prefixListDescription;

		private String ipVersion;

		private String creationTime;

		private String shareType;

		private Integer maxEntries;

		private String status;

		private String ownerId;

		private String prefixListStatus;

		private String regionId;

		private String resourceGroupId;

		private String prefixListType;

		private List<Tag> tags;

		private List<String> cidrBlocks;

		public String getPrefixListId() {
			return this.prefixListId;
		}

		public void setPrefixListId(String prefixListId) {
			this.prefixListId = prefixListId;
		}

		public String getPrefixListName() {
			return this.prefixListName;
		}

		public void setPrefixListName(String prefixListName) {
			this.prefixListName = prefixListName;
		}

		public String getPrefixListDescription() {
			return this.prefixListDescription;
		}

		public void setPrefixListDescription(String prefixListDescription) {
			this.prefixListDescription = prefixListDescription;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getShareType() {
			return this.shareType;
		}

		public void setShareType(String shareType) {
			this.shareType = shareType;
		}

		public Integer getMaxEntries() {
			return this.maxEntries;
		}

		public void setMaxEntries(Integer maxEntries) {
			this.maxEntries = maxEntries;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getPrefixListStatus() {
			return this.prefixListStatus;
		}

		public void setPrefixListStatus(String prefixListStatus) {
			this.prefixListStatus = prefixListStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPrefixListType() {
			return this.prefixListType;
		}

		public void setPrefixListType(String prefixListType) {
			this.prefixListType = prefixListType;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getCidrBlocks() {
			return this.cidrBlocks;
		}

		public void setCidrBlocks(List<String> cidrBlocks) {
			this.cidrBlocks = cidrBlocks;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListPrefixListsResponse getInstance(UnmarshallerContext context) {
		return	ListPrefixListsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
