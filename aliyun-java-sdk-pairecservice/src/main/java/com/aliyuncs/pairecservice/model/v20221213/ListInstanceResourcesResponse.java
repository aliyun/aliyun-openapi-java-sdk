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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListInstanceResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceResourcesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<ResourcesItem> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ResourcesItem> getResources() {
		return this.resources;
	}

	public void setResources(List<ResourcesItem> resources) {
		this.resources = resources;
	}

	public static class ResourcesItem {

		private String resourceId;

		private String category;

		private String group;

		private String type;

		private String uri;

		private String config;

		private String gmtCreateAt;

		private String gmtModifiedAt;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getGmtCreateAt() {
			return this.gmtCreateAt;
		}

		public void setGmtCreateAt(String gmtCreateAt) {
			this.gmtCreateAt = gmtCreateAt;
		}

		public String getGmtModifiedAt() {
			return this.gmtModifiedAt;
		}

		public void setGmtModifiedAt(String gmtModifiedAt) {
			this.gmtModifiedAt = gmtModifiedAt;
		}
	}

	@Override
	public ListInstanceResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
