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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourceRecommendFiltersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceRecommendFiltersResponse extends AcsResponse {

	private String requestId;

	private List<RecommendFilter> recommendFilters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecommendFilter> getRecommendFilters() {
		return this.recommendFilters;
	}

	public void setRecommendFilters(List<RecommendFilter> recommendFilters) {
		this.recommendFilters = recommendFilters;
	}

	public static class RecommendFilter {

		private String product;

		private String resourceType;

		private String attributeName;

		private String attributeValue;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public String getAttributeValue() {
			return this.attributeValue;
		}

		public void setAttributeValue(String attributeValue) {
			this.attributeValue = attributeValue;
		}
	}

	@Override
	public OpsDescribeResourceRecommendFiltersResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourceRecommendFiltersResponseUnmarshaller.unmarshall(this, context);
	}
}
