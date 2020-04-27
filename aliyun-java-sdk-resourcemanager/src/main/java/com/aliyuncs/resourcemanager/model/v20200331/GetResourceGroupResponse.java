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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.GetResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceGroupResponse extends AcsResponse {

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

		private String status;

		private String createDate;

		private String accountId;

		private List<RegionStatus> regionStatuses;

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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public List<RegionStatus> getRegionStatuses() {
			return this.regionStatuses;
		}

		public void setRegionStatuses(List<RegionStatus> regionStatuses) {
			this.regionStatuses = regionStatuses;
		}

		public static class RegionStatus {

			private String regionId;

			private String status;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public GetResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	GetResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
