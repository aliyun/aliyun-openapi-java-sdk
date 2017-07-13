/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.AddCategoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddCategoryResponse extends AcsResponse {

	private String requestId;

	private Category category;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public static class Category {

		private Long cateId;

		private String cateName;

		private Long parentId;

		private Long level;

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

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}
	}

	@Override
	public AddCategoryResponse getInstance(UnmarshallerContext context) {
		return	AddCategoryResponseUnmarshaller.unmarshall(this, context);
	}
}
