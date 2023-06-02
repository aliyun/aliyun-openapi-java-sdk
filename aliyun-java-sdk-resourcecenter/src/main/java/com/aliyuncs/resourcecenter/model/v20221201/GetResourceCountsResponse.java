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

package com.aliyuncs.resourcecenter.model.v20221201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.GetResourceCountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceCountsResponse extends AcsResponse {

	private String groupByKey;

	private String requestId;

	private List<Filter> filters;

	private List<ResourceCount> resourceCounts;

	public String getGroupByKey() {
		return this.groupByKey;
	}

	public void setGroupByKey(String groupByKey) {
		this.groupByKey = groupByKey;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public List<ResourceCount> getResourceCounts() {
		return this.resourceCounts;
	}

	public void setResourceCounts(List<ResourceCount> resourceCounts) {
		this.resourceCounts = resourceCounts;
	}

	public static class Filter {

		private String key;

		private List<String> values;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}
	}

	public static class ResourceCount {

		private String groupName;

		private Long count;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	@Override
	public GetResourceCountsResponse getInstance(UnmarshallerContext context) {
		return	GetResourceCountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
