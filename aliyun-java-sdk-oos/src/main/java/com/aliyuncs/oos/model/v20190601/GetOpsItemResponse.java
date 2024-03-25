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
import com.aliyuncs.oos.transform.v20190601.GetOpsItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOpsItemResponse extends AcsResponse {

	private String requestId;

	private OpsItem opsItem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OpsItem getOpsItem() {
		return this.opsItem;
	}

	public void setOpsItem(OpsItem opsItem) {
		this.opsItem = opsItem;
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

		private String resourceGroupId;

		private String description;

		private String createBy;

		private String lastModifiedBy;

		private Map<Object,Object> attributes;

		private List<Map<Object,Object>> solutions;

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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateBy() {
			return this.createBy;
		}

		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}

		public String getLastModifiedBy() {
			return this.lastModifiedBy;
		}

		public void setLastModifiedBy(String lastModifiedBy) {
			this.lastModifiedBy = lastModifiedBy;
		}

		public Map<Object,Object> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(Map<Object,Object> attributes) {
			this.attributes = attributes;
		}

		public List<Map<Object,Object>> getSolutions() {
			return this.solutions;
		}

		public void setSolutions(List<Map<Object,Object>> solutions) {
			this.solutions = solutions;
		}

		public List<String> getResources() {
			return this.resources;
		}

		public void setResources(List<String> resources) {
			this.resources = resources;
		}
	}

	@Override
	public GetOpsItemResponse getInstance(UnmarshallerContext context) {
		return	GetOpsItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
