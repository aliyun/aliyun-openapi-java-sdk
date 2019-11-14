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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMSDdcsResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMSDdcsResourcesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalCount;

	private List<ResourcesItem> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ResourcesItem> getResources() {
		return this.resources;
	}

	public void setResources(List<ResourcesItem> resources) {
		this.resources = resources;
	}

	public static class ResourcesItem {

		private String appName;

		private String desc;

		private Integer id;

		private String instanceId;

		private String region;

		private String resourceId;

		private List<AttributesItem> attributes;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public List<AttributesItem> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<AttributesItem> attributes) {
			this.attributes = attributes;
		}

		public static class AttributesItem {

			private String attributeName;

			private String desc;

			private Integer id;

			private String instanceId;

			public String getAttributeName() {
				return this.attributeName;
			}

			public void setAttributeName(String attributeName) {
				this.attributeName = attributeName;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}
	}

	@Override
	public QueryMSDdcsResourcesResponse getInstance(UnmarshallerContext context) {
		return	QueryMSDdcsResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
