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
import com.aliyuncs.quotas.transform.v20200510.ListProductQuotaDimensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductQuotaDimensionsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<QuotaDimensionsItem> quotaDimensions;

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

	public List<QuotaDimensionsItem> getQuotaDimensions() {
		return this.quotaDimensions;
	}

	public void setQuotaDimensions(List<QuotaDimensionsItem> quotaDimensions) {
		this.quotaDimensions = quotaDimensions;
	}

	public static class QuotaDimensionsItem {

		private String dimensionKey;

		private String name;

		private Boolean requisite;

		private List<DimensionValueDetailItem> dimensionValueDetail;

		private List<String> dimensionValues;

		private List<String> dependentDimensions;

		public String getDimensionKey() {
			return this.dimensionKey;
		}

		public void setDimensionKey(String dimensionKey) {
			this.dimensionKey = dimensionKey;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getRequisite() {
			return this.requisite;
		}

		public void setRequisite(Boolean requisite) {
			this.requisite = requisite;
		}

		public List<DimensionValueDetailItem> getDimensionValueDetail() {
			return this.dimensionValueDetail;
		}

		public void setDimensionValueDetail(List<DimensionValueDetailItem> dimensionValueDetail) {
			this.dimensionValueDetail = dimensionValueDetail;
		}

		public List<String> getDimensionValues() {
			return this.dimensionValues;
		}

		public void setDimensionValues(List<String> dimensionValues) {
			this.dimensionValues = dimensionValues;
		}

		public List<String> getDependentDimensions() {
			return this.dependentDimensions;
		}

		public void setDependentDimensions(List<String> dependentDimensions) {
			this.dependentDimensions = dependentDimensions;
		}

		public static class DimensionValueDetailItem {

			private String value;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListProductQuotaDimensionsResponse getInstance(UnmarshallerContext context) {
		return	ListProductQuotaDimensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
