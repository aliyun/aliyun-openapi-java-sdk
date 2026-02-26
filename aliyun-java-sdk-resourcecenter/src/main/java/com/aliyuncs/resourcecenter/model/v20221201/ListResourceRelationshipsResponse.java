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
import com.aliyuncs.resourcecenter.transform.v20221201.ListResourceRelationshipsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceRelationshipsResponse extends AcsResponse {

	private String requestId;

	private Integer maxResults;

	private String nextToken;

	private List<ResourceRelationship> resourceRelationships;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ResourceRelationship> getResourceRelationships() {
		return this.resourceRelationships;
	}

	public void setResourceRelationships(List<ResourceRelationship> resourceRelationships) {
		this.resourceRelationships = resourceRelationships;
	}

	public static class ResourceRelationship {

		private String regionId;

		private String resourceType;

		private String resourceId;

		private String relatedResourceRegionId;

		private String relatedResourceType;

		private String relatedResourceId;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRelatedResourceRegionId() {
			return this.relatedResourceRegionId;
		}

		public void setRelatedResourceRegionId(String relatedResourceRegionId) {
			this.relatedResourceRegionId = relatedResourceRegionId;
		}

		public String getRelatedResourceType() {
			return this.relatedResourceType;
		}

		public void setRelatedResourceType(String relatedResourceType) {
			this.relatedResourceType = relatedResourceType;
		}

		public String getRelatedResourceId() {
			return this.relatedResourceId;
		}

		public void setRelatedResourceId(String relatedResourceId) {
			this.relatedResourceId = relatedResourceId;
		}
	}

	@Override
	public ListResourceRelationshipsResponse getInstance(UnmarshallerContext context) {
		return	ListResourceRelationshipsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
