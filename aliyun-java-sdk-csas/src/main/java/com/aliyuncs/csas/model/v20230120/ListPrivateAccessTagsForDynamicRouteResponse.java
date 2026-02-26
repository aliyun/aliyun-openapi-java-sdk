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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListPrivateAccessTagsForDynamicRouteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivateAccessTagsForDynamicRouteResponse extends AcsResponse {

	private String requestId;

	private List<DynamicRoute> dynamicRoutes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DynamicRoute> getDynamicRoutes() {
		return this.dynamicRoutes;
	}

	public void setDynamicRoutes(List<DynamicRoute> dynamicRoutes) {
		this.dynamicRoutes = dynamicRoutes;
	}

	public static class DynamicRoute {

		private String dynamicRouteId;

		private List<Tag> tags;

		public String getDynamicRouteId() {
			return this.dynamicRouteId;
		}

		public void setDynamicRouteId(String dynamicRouteId) {
			this.dynamicRouteId = dynamicRouteId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String tagId;

			private String name;

			private String description;

			private String tagType;

			private String createTime;

			public String getTagId() {
				return this.tagId;
			}

			public void setTagId(String tagId) {
				this.tagId = tagId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getTagType() {
				return this.tagType;
			}

			public void setTagType(String tagType) {
				this.tagType = tagType;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}
		}
	}

	@Override
	public ListPrivateAccessTagsForDynamicRouteResponse getInstance(UnmarshallerContext context) {
		return	ListPrivateAccessTagsForDynamicRouteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
