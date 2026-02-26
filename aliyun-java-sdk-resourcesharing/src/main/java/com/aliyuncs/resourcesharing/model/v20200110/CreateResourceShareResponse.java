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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.CreateResourceShareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceShareResponse extends AcsResponse {

	private String requestId;

	private ResourceShare resourceShare;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceShare getResourceShare() {
		return this.resourceShare;
	}

	public void setResourceShare(ResourceShare resourceShare) {
		this.resourceShare = resourceShare;
	}

	public static class ResourceShare {

		private String updateTime;

		private String resourceShareName;

		private String resourceShareOwner;

		private String createTime;

		private String resourceShareId;

		private String resourceShareStatus;

		private Boolean allowExternalTargets;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getResourceShareName() {
			return this.resourceShareName;
		}

		public void setResourceShareName(String resourceShareName) {
			this.resourceShareName = resourceShareName;
		}

		public String getResourceShareOwner() {
			return this.resourceShareOwner;
		}

		public void setResourceShareOwner(String resourceShareOwner) {
			this.resourceShareOwner = resourceShareOwner;
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

		public String getResourceShareStatus() {
			return this.resourceShareStatus;
		}

		public void setResourceShareStatus(String resourceShareStatus) {
			this.resourceShareStatus = resourceShareStatus;
		}

		public Boolean getAllowExternalTargets() {
			return this.allowExternalTargets;
		}

		public void setAllowExternalTargets(Boolean allowExternalTargets) {
			this.allowExternalTargets = allowExternalTargets;
		}
	}

	@Override
	public CreateResourceShareResponse getInstance(UnmarshallerContext context) {
		return	CreateResourceShareResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
