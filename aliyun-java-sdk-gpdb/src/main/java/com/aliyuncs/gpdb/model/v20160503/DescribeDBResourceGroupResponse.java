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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBResourceGroupResponse extends AcsResponse {

	private String requestId;

	private List<ResourceGroupItem> resourceGroupItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceGroupItem> getResourceGroupItems() {
		return this.resourceGroupItems;
	}

	public void setResourceGroupItems(List<ResourceGroupItem> resourceGroupItems) {
		this.resourceGroupItems = resourceGroupItems;
	}

	public static class ResourceGroupItem {

		private String resourceGroupName;

		private String resourceGroupConfig;

		private List<String> roleList;

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getResourceGroupConfig() {
			return this.resourceGroupConfig;
		}

		public void setResourceGroupConfig(String resourceGroupConfig) {
			this.resourceGroupConfig = resourceGroupConfig;
		}

		public List<String> getRoleList() {
			return this.roleList;
		}

		public void setRoleList(List<String> roleList) {
			this.roleList = roleList;
		}
	}

	@Override
	public DescribeDBResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
