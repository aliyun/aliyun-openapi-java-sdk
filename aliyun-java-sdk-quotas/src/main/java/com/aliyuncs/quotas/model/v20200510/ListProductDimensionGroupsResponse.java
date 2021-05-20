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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ListProductDimensionGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductDimensionGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<DimensionGroupsItem> dimensionGroups;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<DimensionGroupsItem> getDimensionGroups() {
		return this.dimensionGroups;
	}

	public void setDimensionGroups(List<DimensionGroupsItem> dimensionGroups) {
		this.dimensionGroups = dimensionGroups;
	}

	public static class DimensionGroupsItem {

		private String groupName;

		private String productCode;

		private String groupCode;

		private List<String> dimensionKeys;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getGroupCode() {
			return this.groupCode;
		}

		public void setGroupCode(String groupCode) {
			this.groupCode = groupCode;
		}

		public List<String> getDimensionKeys() {
			return this.dimensionKeys;
		}

		public void setDimensionKeys(List<String> dimensionKeys) {
			this.dimensionKeys = dimensionKeys;
		}
	}

	@Override
	public ListProductDimensionGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListProductDimensionGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
