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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeClusterResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterResourcesResponse extends AcsResponse {

	private List<ResourcesItem> resources;

	public List<ResourcesItem> getResources() {
		return this.resources;
	}

	public void setResources(List<ResourcesItem> resources) {
		this.resources = resources;
	}

	public static class ResourcesItem {

		private String instance_id;

		private String resource_type;

		private String resource_info;

		private String state;

		public String getInstance_id() {
			return this.instance_id;
		}

		public void setInstance_id(String instance_id) {
			this.instance_id = instance_id;
		}

		public String getResource_type() {
			return this.resource_type;
		}

		public void setResource_type(String resource_type) {
			this.resource_type = resource_type;
		}

		public String getResource_info() {
			return this.resource_info;
		}

		public void setResource_info(String resource_info) {
			this.resource_info = resource_info;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public DescribeClusterResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
