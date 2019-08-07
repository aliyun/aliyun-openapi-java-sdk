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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCategoriesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<Category> categories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private String categoryId;

		private String categoryName;

		private String categoryLogo;

		private String categoryDescription;

		private String createTime;

		private String updateTime;

		private List<DemoProject> demoProjects;

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryLogo() {
			return this.categoryLogo;
		}

		public void setCategoryLogo(String categoryLogo) {
			this.categoryLogo = categoryLogo;
		}

		public String getCategoryDescription() {
			return this.categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<DemoProject> getDemoProjects() {
			return this.demoProjects;
		}

		public void setDemoProjects(List<DemoProject> demoProjects) {
			this.demoProjects = demoProjects;
		}

		public static class DemoProject {

			private String regionId;

			private String packageUrl;

			private String sourceUrl;

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getPackageUrl() {
				return this.packageUrl;
			}

			public void setPackageUrl(String packageUrl) {
				this.packageUrl = packageUrl;
			}

			public String getSourceUrl() {
				return this.sourceUrl;
			}

			public void setSourceUrl(String sourceUrl) {
				this.sourceUrl = sourceUrl;
			}
		}
	}

	@Override
	public DescribeCategoriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCategoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
