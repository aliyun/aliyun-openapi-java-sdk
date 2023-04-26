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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListResourceRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceRelationsResponse extends AcsResponse {

	private String requestId;

	private ResourceRelations resourceRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceRelations getResourceRelations() {
		return this.resourceRelations;
	}

	public void setResourceRelations(ResourceRelations resourceRelations) {
		this.resourceRelations = resourceRelations;
	}

	public static class ResourceRelations {

		private String nextToken;

		private Integer maxResults;

		private Integer totalCount;

		private List<ResourceRelationListItem> resourceRelationList;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ResourceRelationListItem> getResourceRelationList() {
			return this.resourceRelationList;
		}

		public void setResourceRelationList(List<ResourceRelationListItem> resourceRelationList) {
			this.resourceRelationList = resourceRelationList;
		}

		public static class ResourceRelationListItem {

			private Long accountId;

			private String sourceResourceType;

			private String sourceResourceRegionId;

			private String sourceResourceId;

			private String targetResourceType;

			private String targetResourceId;

			private String relationType;

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getSourceResourceType() {
				return this.sourceResourceType;
			}

			public void setSourceResourceType(String sourceResourceType) {
				this.sourceResourceType = sourceResourceType;
			}

			public String getSourceResourceRegionId() {
				return this.sourceResourceRegionId;
			}

			public void setSourceResourceRegionId(String sourceResourceRegionId) {
				this.sourceResourceRegionId = sourceResourceRegionId;
			}

			public String getSourceResourceId() {
				return this.sourceResourceId;
			}

			public void setSourceResourceId(String sourceResourceId) {
				this.sourceResourceId = sourceResourceId;
			}

			public String getTargetResourceType() {
				return this.targetResourceType;
			}

			public void setTargetResourceType(String targetResourceType) {
				this.targetResourceType = targetResourceType;
			}

			public String getTargetResourceId() {
				return this.targetResourceId;
			}

			public void setTargetResourceId(String targetResourceId) {
				this.targetResourceId = targetResourceId;
			}

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}
		}
	}

	@Override
	public ListResourceRelationsResponse getInstance(UnmarshallerContext context) {
		return	ListResourceRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
