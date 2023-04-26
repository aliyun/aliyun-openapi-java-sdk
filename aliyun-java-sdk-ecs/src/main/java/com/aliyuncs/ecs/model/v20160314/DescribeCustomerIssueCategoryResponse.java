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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeCustomerIssueCategoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomerIssueCategoryResponse extends AcsResponse {

	private String requestId;

	private List<IssueCategoryModelListItem> issueCategoryModelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IssueCategoryModelListItem> getIssueCategoryModelList() {
		return this.issueCategoryModelList;
	}

	public void setIssueCategoryModelList(List<IssueCategoryModelListItem> issueCategoryModelList) {
		this.issueCategoryModelList = issueCategoryModelList;
	}

	public static class IssueCategoryModelListItem {

		private Long issueCategoryId;

		private Long issueCategoryParentId;

		private String issueCategoryName;

		private String mappingTools;

		private Long layer;

		private String resourceType;

		private String metricSetId;

		public Long getIssueCategoryId() {
			return this.issueCategoryId;
		}

		public void setIssueCategoryId(Long issueCategoryId) {
			this.issueCategoryId = issueCategoryId;
		}

		public Long getIssueCategoryParentId() {
			return this.issueCategoryParentId;
		}

		public void setIssueCategoryParentId(Long issueCategoryParentId) {
			this.issueCategoryParentId = issueCategoryParentId;
		}

		public String getIssueCategoryName() {
			return this.issueCategoryName;
		}

		public void setIssueCategoryName(String issueCategoryName) {
			this.issueCategoryName = issueCategoryName;
		}

		public String getMappingTools() {
			return this.mappingTools;
		}

		public void setMappingTools(String mappingTools) {
			this.mappingTools = mappingTools;
		}

		public Long getLayer() {
			return this.layer;
		}

		public void setLayer(Long layer) {
			this.layer = layer;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getMetricSetId() {
			return this.metricSetId;
		}

		public void setMetricSetId(String metricSetId) {
			this.metricSetId = metricSetId;
		}
	}

	@Override
	public DescribeCustomerIssueCategoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomerIssueCategoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
