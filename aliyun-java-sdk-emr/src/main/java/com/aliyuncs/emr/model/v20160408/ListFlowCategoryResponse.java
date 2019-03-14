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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListFlowCategoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowCategoryResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Category> categories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private String id;

		private Long gmtCreate;

		private Long gmtModified;

		private String name;

		private String parentId;

		private String type;

		private String categoryType;

		private String objectType;

		private String objectId;

		private String projectId;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCategoryType() {
			return this.categoryType;
		}

		public void setCategoryType(String categoryType) {
			this.categoryType = categoryType;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}
	}

	@Override
	public ListFlowCategoryResponse getInstance(UnmarshallerContext context) {
		return	ListFlowCategoryResponseUnmarshaller.unmarshall(this, context);
	}
}
