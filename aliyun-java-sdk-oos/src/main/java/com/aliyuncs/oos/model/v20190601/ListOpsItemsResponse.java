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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListOpsItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOpsItemsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private Integer totalCount;

	private List<OpsItem> opsItems;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<OpsItem> getOpsItems() {
		return this.opsItems;
	}

	public void setOpsItems(List<OpsItem> opsItems) {
		this.opsItems = opsItems;
	}

	public static class OpsItem {

		private String opsItemId;

		private String createDate;

		private String updateDate;

		private String title;

		private String status;

		private String severity;

		private String category;

		private String source;

		private Integer priority;

		private Map<Object,Object> tags;

		private List<String> resources;

		public String getOpsItemId() {
			return this.opsItemId;
		}

		public void setOpsItemId(String opsItemId) {
			this.opsItemId = opsItemId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public List<String> getResources() {
			return this.resources;
		}

		public void setResources(List<String> resources) {
			this.resources = resources;
		}
	}

	@Override
	public ListOpsItemsResponse getInstance(UnmarshallerContext context) {
		return	ListOpsItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
