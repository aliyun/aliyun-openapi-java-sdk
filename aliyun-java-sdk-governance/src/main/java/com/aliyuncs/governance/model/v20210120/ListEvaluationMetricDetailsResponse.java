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

package com.aliyuncs.governance.model.v20210120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.governance.transform.v20210120.ListEvaluationMetricDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEvaluationMetricDetailsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Resource> resources;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String regionId;

		private String resourceClassification;

		private String resourceId;

		private String resourceName;

		private String resourceOwnerDisplayName;

		private Long resourceOwnerId;

		private String resourceType;

		private List<ResourcePropertie> resourceProperties;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceClassification() {
			return this.resourceClassification;
		}

		public void setResourceClassification(String resourceClassification) {
			this.resourceClassification = resourceClassification;
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

		public String getResourceOwnerDisplayName() {
			return this.resourceOwnerDisplayName;
		}

		public void setResourceOwnerDisplayName(String resourceOwnerDisplayName) {
			this.resourceOwnerDisplayName = resourceOwnerDisplayName;
		}

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public List<ResourcePropertie> getResourceProperties() {
			return this.resourceProperties;
		}

		public void setResourceProperties(List<ResourcePropertie> resourceProperties) {
			this.resourceProperties = resourceProperties;
		}

		public static class ResourcePropertie {

			private String propertyName;

			private String propertyValue;

			public String getPropertyName() {
				return this.propertyName;
			}

			public void setPropertyName(String propertyName) {
				this.propertyName = propertyName;
			}

			public String getPropertyValue() {
				return this.propertyValue;
			}

			public void setPropertyValue(String propertyValue) {
				this.propertyValue = propertyValue;
			}
		}
	}

	@Override
	public ListEvaluationMetricDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListEvaluationMetricDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
