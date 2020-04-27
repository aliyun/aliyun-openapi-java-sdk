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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.UpdateResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateResourceGroupResponse extends AcsResponse {

	private String requestId;

	private ResourceGroup resourceGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceGroup getResourceGroup() {
		return this.resourceGroup;
	}

	public void setResourceGroup(ResourceGroup resourceGroup) {
		this.resourceGroup = resourceGroup;
	}

	public static class ResourceGroup {

		private String id;

		private String name;

		private String displayName;

		private String createDate;

		private String accountId;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
	}

	@Override
	public UpdateResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	UpdateResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
