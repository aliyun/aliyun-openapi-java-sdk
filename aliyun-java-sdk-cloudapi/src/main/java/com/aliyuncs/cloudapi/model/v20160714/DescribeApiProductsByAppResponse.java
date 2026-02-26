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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiProductsByAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiProductsByAppResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<ApiProductInfo> apiProductInfoList;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApiProductInfo> getApiProductInfoList() {
		return this.apiProductInfoList;
	}

	public void setApiProductInfoList(List<ApiProductInfo> apiProductInfoList) {
		this.apiProductInfoList = apiProductInfoList;
	}

	public static class ApiProductInfo {

		private String apiProductId;

		public String getApiProductId() {
			return this.apiProductId;
		}

		public void setApiProductId(String apiProductId) {
			this.apiProductId = apiProductId;
		}
	}

	@Override
	public DescribeApiProductsByAppResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiProductsByAppResponseUnmarshaller.unmarshall(this, context);
	}
}
