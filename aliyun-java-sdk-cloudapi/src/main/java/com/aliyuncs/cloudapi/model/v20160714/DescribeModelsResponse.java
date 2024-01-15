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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeModelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<ModelDetail> modelDetails;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ModelDetail> getModelDetails() {
		return this.modelDetails;
	}

	public void setModelDetails(List<ModelDetail> modelDetails) {
		this.modelDetails = modelDetails;
	}

	public static class ModelDetail {

		private String modifiedTime;

		private String groupId;

		private String description;

		private String schema;

		private String modelName;

		private String createdTime;

		private String modelId;

		private String modelRef;

		private List<TagInfo> tags;

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSchema() {
			return this.schema;
		}

		public void setSchema(String schema) {
			this.schema = schema;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getModelRef() {
			return this.modelRef;
		}

		public void setModelRef(String modelRef) {
			this.modelRef = modelRef;
		}

		public List<TagInfo> getTags() {
			return this.tags;
		}

		public void setTags(List<TagInfo> tags) {
			this.tags = tags;
		}

		public static class TagInfo {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeModelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeModelsResponseUnmarshaller.unmarshall(this, context);
	}
}
