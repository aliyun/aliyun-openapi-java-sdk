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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiIpControlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiIpControlsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ApiIpControlItem> apiIpControls;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ApiIpControlItem> getApiIpControls() {
		return this.apiIpControls;
	}

	public void setApiIpControls(List<ApiIpControlItem> apiIpControls) {
		this.apiIpControls = apiIpControls;
	}

	public static class ApiIpControlItem {

		private String apiId;

		private String apiName;

		private String ipControlId;

		private String ipControlName;

		private String boundTime;

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getIpControlId() {
			return this.ipControlId;
		}

		public void setIpControlId(String ipControlId) {
			this.ipControlId = ipControlId;
		}

		public String getIpControlName() {
			return this.ipControlName;
		}

		public void setIpControlName(String ipControlName) {
			this.ipControlName = ipControlName;
		}

		public String getBoundTime() {
			return this.boundTime;
		}

		public void setBoundTime(String boundTime) {
			this.boundTime = boundTime;
		}
	}

	@Override
	public DescribeApiIpControlsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiIpControlsResponseUnmarshaller.unmarshall(this, context);
	}
}
