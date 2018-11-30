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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCategoriesResponse extends AcsResponse {

	private String requestId;

	private Long subTotal;

	private List<Category> subCategories;

	private Category1 category1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(Long subTotal) {
		this.subTotal = subTotal;
	}

	public List<Category> getSubCategories() {
		return this.subCategories;
	}

	public void setSubCategories(List<Category> subCategories) {
		this.subCategories = subCategories;
	}

	public Category1 getCategory1() {
		return this.category1;
	}

	public void setCategory1(Category1 category1) {
		this.category1 = category1;
	}

	public static class Category {

		private Long cateId;

		private String cateName;

		private Long level;

		private Long parentId;

		public Long getCateId() {
			return this.cateId;
		}

		public void setCateId(Long cateId) {
			this.cateId = cateId;
		}

		public String getCateName() {
			return this.cateName;
		}

		public void setCateName(String cateName) {
			this.cateName = cateName;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
	}

	public static class Category1 {

		private Long cateId;

		private String cateName;

		private Long level;

		private Long parentId;

		public Long getCateId() {
			return this.cateId;
		}

		public void setCateId(Long cateId) {
			this.cateId = cateId;
		}

		public String getCateName() {
			return this.cateName;
		}

		public void setCateName(String cateName) {
			this.cateName = cateName;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
	}

	@Override
	public GetCategoriesResponse getInstance(UnmarshallerContext context) {
		return	GetCategoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
