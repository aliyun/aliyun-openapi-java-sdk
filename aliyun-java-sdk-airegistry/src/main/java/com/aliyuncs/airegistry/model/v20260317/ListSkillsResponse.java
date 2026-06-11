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
import com.aliyuncs.airegistry.transform.v20260317.ListSkillsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillsResponse extends AcsResponse {

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

		private List<PageItem> pageItems;

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

		public List<PageItem> getPageItems() {
			return this.pageItems;
		}

		public void setPageItems(List<PageItem> pageItems) {
			this.pageItems = pageItems;
		}

		public static class PageItem {

			private Long updateTime;

			private Boolean enable;

			private String bizTags;

			private String from;

			private String scope;

			private Map<Object,Object> labels;

			private String editingVersion;

			private String reviewingVersion;

			private Integer onlineCnt;

			private Long downloadCount;

			private String namespaceId;

			private String name;

			private String description;

			private String owner;

			private Boolean writeable;

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getBizTags() {
				return this.bizTags;
			}

			public void setBizTags(String bizTags) {
				this.bizTags = bizTags;
			}

			public String getFrom() {
				return this.from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public Map<Object,Object> getLabels() {
				return this.labels;
			}

			public void setLabels(Map<Object,Object> labels) {
				this.labels = labels;
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

			public Long getDownloadCount() {
				return this.downloadCount;
			}

			public void setDownloadCount(Long downloadCount) {
				this.downloadCount = downloadCount;
			}

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

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Boolean getWriteable() {
				return this.writeable;
			}

			public void setWriteable(Boolean writeable) {
				this.writeable = writeable;
			}
		}
	}

	@Override
	public ListSkillsResponse getInstance(UnmarshallerContext context) {
		return	ListSkillsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
