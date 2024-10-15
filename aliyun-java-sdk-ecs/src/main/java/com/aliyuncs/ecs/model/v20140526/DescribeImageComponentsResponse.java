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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeImageComponentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageComponentsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<ImageComponentSet> imageComponent;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ImageComponentSet> getImageComponent() {
		return this.imageComponent;
	}

	public void setImageComponent(List<ImageComponentSet> imageComponent) {
		this.imageComponent = imageComponent;
	}

	public static class ImageComponentSet {

		private String creationTime;

		private String description;

		private String systemType;

		private String imageComponentId;

		private String componentType;

		private String resourceGroupId;

		private String name;

		private String content;

		private String owner;

		private String componentVersion;

		private List<Tag> tags;

		private List<Parameter> parameters;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSystemType() {
			return this.systemType;
		}

		public void setSystemType(String systemType) {
			this.systemType = systemType;
		}

		public String getImageComponentId() {
			return this.imageComponentId;
		}

		public void setImageComponentId(String imageComponentId) {
			this.imageComponentId = imageComponentId;
		}

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getComponentVersion() {
			return this.componentVersion;
		}

		public void setComponentVersion(String componentVersion) {
			this.componentVersion = componentVersion;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Parameter> getParameters() {
			return this.parameters;
		}

		public void setParameters(List<Parameter> parameters) {
			this.parameters = parameters;
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}

		public static class Parameter {

			private String name;

			private String type;

			private String defaultValue;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}
		}
	}

	@Override
	public DescribeImageComponentsResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageComponentsResponseUnmarshaller.unmarshall(this, context);
	}
}
