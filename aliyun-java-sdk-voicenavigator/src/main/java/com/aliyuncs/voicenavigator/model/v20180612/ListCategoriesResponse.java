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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.ListCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCategoriesResponse extends AcsResponse {

	private String requestId;

	private List<Category> categories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private String instanceId;

		private String name;

		private String categoryId;

		private Long level;

		private String previousSiblingId;

		private String nextSiblingId;

		private String parentId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public String getPreviousSiblingId() {
			return this.previousSiblingId;
		}

		public void setPreviousSiblingId(String previousSiblingId) {
			this.previousSiblingId = previousSiblingId;
		}

		public String getNextSiblingId() {
			return this.nextSiblingId;
		}

		public void setNextSiblingId(String nextSiblingId) {
			this.nextSiblingId = nextSiblingId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
	}

	@Override
	public ListCategoriesResponse getInstance(UnmarshallerContext context) {
		return	ListCategoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
