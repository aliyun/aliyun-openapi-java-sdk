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

package com.aliyuncs.airegistry.model.v20260317;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.ListNamespacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNamespacesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Item> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String namespaceId;

			private String name;

			private String description;

			private String tags;

			private String source;

			private Integer sourceIndex;

			private Integer promptCount;

			private String createdTime;

			private Integer skillCount;

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
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

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public Integer getSourceIndex() {
				return this.sourceIndex;
			}

			public void setSourceIndex(Integer sourceIndex) {
				this.sourceIndex = sourceIndex;
			}

			public Integer getPromptCount() {
				return this.promptCount;
			}

			public void setPromptCount(Integer promptCount) {
				this.promptCount = promptCount;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public Integer getSkillCount() {
				return this.skillCount;
			}

			public void setSkillCount(Integer skillCount) {
				this.skillCount = skillCount;
			}
		}
	}

	@Override
	public ListNamespacesResponse getInstance(UnmarshallerContext context) {
		return	ListNamespacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
