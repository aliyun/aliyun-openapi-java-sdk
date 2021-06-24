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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourceRelatedResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceRelatedResourcesResponse extends AcsResponse {

	private String requestId;

	private List<Resource> resources;

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

		private String resourceType;

		private String resourceId;

		private List<RelatedResource> relatedResources;

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

		public List<RelatedResource> getRelatedResources() {
			return this.relatedResources;
		}

		public void setRelatedResources(List<RelatedResource> relatedResources) {
			this.relatedResources = relatedResources;
		}

		public static class RelatedResource {

			private String relatedResourceType;

			private List<ResourceInfo> resourcesInfo;

			public String getRelatedResourceType() {
				return this.relatedResourceType;
			}

			public void setRelatedResourceType(String relatedResourceType) {
				this.relatedResourceType = relatedResourceType;
			}

			public List<ResourceInfo> getResourcesInfo() {
				return this.resourcesInfo;
			}

			public void setResourcesInfo(List<ResourceInfo> resourcesInfo) {
				this.resourcesInfo = resourcesInfo;
			}

			public static class ResourceInfo {

				private String relatedResourceId;

				private String aliUid;

				public String getRelatedResourceId() {
					return this.relatedResourceId;
				}

				public void setRelatedResourceId(String relatedResourceId) {
					this.relatedResourceId = relatedResourceId;
				}

				public String getAliUid() {
					return this.aliUid;
				}

				public void setAliUid(String aliUid) {
					this.aliUid = aliUid;
				}
			}
		}
	}

	@Override
	public OpsDescribeResourceRelatedResourcesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourceRelatedResourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
