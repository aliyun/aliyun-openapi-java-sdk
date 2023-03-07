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

package com.aliyuncs.resourcecenter.model.v20221201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.SearchMultiAccountResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchMultiAccountResourcesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String scope;

	private Integer maxResults;

	private List<Filter> filters;

	private List<Resource> resources;

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

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Filter {

		private String key;

		private String matchType;

		private List<String> values;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getMatchType() {
			return this.matchType;
		}

		public void setMatchType(String matchType) {
			this.matchType = matchType;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}
	}

	public static class Resource {

		private String resourceType;

		private String createTime;

		private String resourceGroupId;

		private String zoneId;

		private String accountId;

		private String resourceId;

		private String resourceName;

		private String regionId;

		private List<Tag> tags;

		private List<String> ipAddresses;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getIpAddresses() {
			return this.ipAddresses;
		}

		public void setIpAddresses(List<String> ipAddresses) {
			this.ipAddresses = ipAddresses;
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
	public SearchMultiAccountResourcesResponse getInstance(UnmarshallerContext context) {
		return	SearchMultiAccountResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
