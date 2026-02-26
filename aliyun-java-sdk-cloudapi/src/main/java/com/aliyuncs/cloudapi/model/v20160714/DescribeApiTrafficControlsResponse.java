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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiTrafficControlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiTrafficControlsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<ApiTrafficControlItem> apiTrafficControls;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApiTrafficControlItem> getApiTrafficControls() {
		return this.apiTrafficControls;
	}

	public void setApiTrafficControls(List<ApiTrafficControlItem> apiTrafficControls) {
		this.apiTrafficControls = apiTrafficControls;
	}

	public static class ApiTrafficControlItem {

		private String boundTime;

		private String apiId;

		private String trafficControlId;

		private String trafficControlName;

		private String apiName;

		public String getBoundTime() {
			return this.boundTime;
		}

		public void setBoundTime(String boundTime) {
			this.boundTime = boundTime;
		}

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getTrafficControlId() {
			return this.trafficControlId;
		}

		public void setTrafficControlId(String trafficControlId) {
			this.trafficControlId = trafficControlId;
		}

		public String getTrafficControlName() {
			return this.trafficControlName;
		}

		public void setTrafficControlName(String trafficControlName) {
			this.trafficControlName = trafficControlName;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}
	}

	@Override
	public DescribeApiTrafficControlsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiTrafficControlsResponseUnmarshaller.unmarshall(this, context);
	}
}
