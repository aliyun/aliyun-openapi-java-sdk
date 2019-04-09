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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitorGroupCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorGroupCategoriesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private MonitorGroupCategories monitorGroupCategories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MonitorGroupCategories getMonitorGroupCategories() {
		return this.monitorGroupCategories;
	}

	public void setMonitorGroupCategories(MonitorGroupCategories monitorGroupCategories) {
		this.monitorGroupCategories = monitorGroupCategories;
	}

	public static class MonitorGroupCategories {

		private Long groupId;

		private List<CategoryItem> monitorGroupCategory;

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public List<CategoryItem> getMonitorGroupCategory() {
			return this.monitorGroupCategory;
		}

		public void setMonitorGroupCategory(List<CategoryItem> monitorGroupCategory) {
			this.monitorGroupCategory = monitorGroupCategory;
		}

		public static class CategoryItem {

			private String category;

			private Integer count;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeMonitorGroupCategoriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorGroupCategoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
