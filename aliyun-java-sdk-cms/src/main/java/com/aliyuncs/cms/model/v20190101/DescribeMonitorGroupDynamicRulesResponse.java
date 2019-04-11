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
import com.aliyuncs.cms.transform.v20190101.DescribeMonitorGroupDynamicRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorGroupDynamicRulesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<ResourceItem> resource;

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

	public List<ResourceItem> getResource() {
		return this.resource;
	}

	public void setResource(List<ResourceItem> resource) {
		this.resource = resource;
	}

	public static class ResourceItem {

		private Long groupId;

		private String category;

		private String filterRelation;

		private List<Filter> filters;

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getFilterRelation() {
			return this.filterRelation;
		}

		public void setFilterRelation(String filterRelation) {
			this.filterRelation = filterRelation;
		}

		public List<Filter> getFilters() {
			return this.filters;
		}

		public void setFilters(List<Filter> filters) {
			this.filters = filters;
		}

		public static class Filter {

			private String function;

			private String name;

			private String value;

			public String getFunction() {
				return this.function;
			}

			public void setFunction(String function) {
				this.function = function;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeMonitorGroupDynamicRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorGroupDynamicRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
