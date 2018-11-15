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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeRecycleBinResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecycleBinResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<RecycleBinModel> recycleBinModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<RecycleBinModel> getRecycleBinModels() {
		return this.recycleBinModels;
	}

	public void setRecycleBinModels(List<RecycleBinModel> recycleBinModels) {
		this.recycleBinModels = recycleBinModels;
	}

	public static class RecycleBinModel {

		private String resourceId;

		private String regionId;

		private String resourceType;

		private String creationTime;

		private String status;

		private List<RelationResource> relationResources;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<RelationResource> getRelationResources() {
			return this.relationResources;
		}

		public void setRelationResources(List<RelationResource> relationResources) {
			this.relationResources = relationResources;
		}

		public static class RelationResource {

			private String relationResourceId;

			private String relationResourceType;

			public String getRelationResourceId() {
				return this.relationResourceId;
			}

			public void setRelationResourceId(String relationResourceId) {
				this.relationResourceId = relationResourceId;
			}

			public String getRelationResourceType() {
				return this.relationResourceType;
			}

			public void setRelationResourceType(String relationResourceType) {
				this.relationResourceType = relationResourceType;
			}
		}
	}

	@Override
	public DescribeRecycleBinResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecycleBinResponseUnmarshaller.unmarshall(this, context);
	}
}
