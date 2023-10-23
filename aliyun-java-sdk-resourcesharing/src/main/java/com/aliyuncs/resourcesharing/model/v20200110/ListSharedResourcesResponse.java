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

package com.aliyuncs.resourcesharing.model.v20200110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.ListSharedResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSharedResourcesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<SharedResource> sharedResources;

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

	public List<SharedResource> getSharedResources() {
		return this.sharedResources;
	}

	public void setSharedResources(List<SharedResource> sharedResources) {
		this.sharedResources = sharedResources;
	}

	public static class SharedResource {

		private String updateTime;

		private String resourceType;

		private String createTime;

		private String resourceShareId;

		private String resourceShareOwner;

		private String resourceId;

		private String resourceStatus;

		private String resourceStatusMessage;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

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

		public String getResourceShareId() {
			return this.resourceShareId;
		}

		public void setResourceShareId(String resourceShareId) {
			this.resourceShareId = resourceShareId;
		}

		public String getResourceShareOwner() {
			return this.resourceShareOwner;
		}

		public void setResourceShareOwner(String resourceShareOwner) {
			this.resourceShareOwner = resourceShareOwner;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public String getResourceStatusMessage() {
			return this.resourceStatusMessage;
		}

		public void setResourceStatusMessage(String resourceStatusMessage) {
			this.resourceStatusMessage = resourceStatusMessage;
		}
	}

	@Override
	public ListSharedResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListSharedResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
