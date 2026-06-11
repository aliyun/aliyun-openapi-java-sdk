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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.ListPromptsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPromptsResponse extends AcsResponse {

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

		private Integer pagesAvailable;

		private List<Item> pageItems;

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

		public Integer getPagesAvailable() {
			return this.pagesAvailable;
		}

		public void setPagesAvailable(Integer pagesAvailable) {
			this.pagesAvailable = pagesAvailable;
		}

		public List<Item> getPageItems() {
			return this.pageItems;
		}

		public void setPageItems(List<Item> pageItems) {
			this.pageItems = pageItems;
		}

		public static class Item {

			private Integer schemaVersion;

			private String promptKey;

			private String description;

			private String latestVersion;

			private Long gmtModified;

			private String editingVersion;

			private String reviewingVersion;

			private Integer onlineCnt;

			private Map<Object,Object> labels;

			private List<String> bizTags;

			public Integer getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(Integer schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public String getPromptKey() {
				return this.promptKey;
			}

			public void setPromptKey(String promptKey) {
				this.promptKey = promptKey;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getLatestVersion() {
				return this.latestVersion;
			}

			public void setLatestVersion(String latestVersion) {
				this.latestVersion = latestVersion;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getEditingVersion() {
				return this.editingVersion;
			}

			public void setEditingVersion(String editingVersion) {
				this.editingVersion = editingVersion;
			}

			public String getReviewingVersion() {
				return this.reviewingVersion;
			}

			public void setReviewingVersion(String reviewingVersion) {
				this.reviewingVersion = reviewingVersion;
			}

			public Integer getOnlineCnt() {
				return this.onlineCnt;
			}

			public void setOnlineCnt(Integer onlineCnt) {
				this.onlineCnt = onlineCnt;
			}

			public Map<Object,Object> getLabels() {
				return this.labels;
			}

			public void setLabels(Map<Object,Object> labels) {
				this.labels = labels;
			}

			public List<String> getBizTags() {
				return this.bizTags;
			}

			public void setBizTags(List<String> bizTags) {
				this.bizTags = bizTags;
			}
		}
	}

	@Override
	public ListPromptsResponse getInstance(UnmarshallerContext context) {
		return	ListPromptsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
