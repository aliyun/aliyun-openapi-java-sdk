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
import com.aliyuncs.resourcecenter.transform.v20221201.ListFiltersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFiltersResponse extends AcsResponse {

	private String defaultFilterName;

	private String requestId;

	private List<Filter> filters;

	public String getDefaultFilterName() {
		return this.defaultFilterName;
	}

	public void setDefaultFilterName(String defaultFilterName) {
		this.defaultFilterName = defaultFilterName;
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

	public static class Filter {

		private String filterConfiguration;

		private String filterName;

		public String getFilterConfiguration() {
			return this.filterConfiguration;
		}

		public void setFilterConfiguration(String filterConfiguration) {
			this.filterConfiguration = filterConfiguration;
		}

		public String getFilterName() {
			return this.filterName;
		}

		public void setFilterName(String filterName) {
			this.filterName = filterName;
		}
	}

	@Override
	public ListFiltersResponse getInstance(UnmarshallerContext context) {
		return	ListFiltersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
