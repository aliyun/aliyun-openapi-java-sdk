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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.GetLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLogsResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private PageInfo pageInfo;

		private ResponseData responseData;

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public ResponseData getResponseData() {
			return this.responseData;
		}

		public void setResponseData(ResponseData responseData) {
			this.responseData = responseData;
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}

		public static class ResponseData {

			private Boolean completeOrNot;

			private Integer count;

			private Long cost;

			private Boolean hasSql;

			private List<String> keys;

			private List<String> lines;

			public Boolean getCompleteOrNot() {
				return this.completeOrNot;
			}

			public void setCompleteOrNot(Boolean completeOrNot) {
				this.completeOrNot = completeOrNot;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Long getCost() {
				return this.cost;
			}

			public void setCost(Long cost) {
				this.cost = cost;
			}

			public Boolean getHasSql() {
				return this.hasSql;
			}

			public void setHasSql(Boolean hasSql) {
				this.hasSql = hasSql;
			}

			public List<String> getKeys() {
				return this.keys;
			}

			public void setKeys(List<String> keys) {
				this.keys = keys;
			}

			public List<String> getLines() {
				return this.lines;
			}

			public void setLines(List<String> lines) {
				this.lines = lines;
			}
		}
	}

	@Override
	public GetLogsResponse getInstance(UnmarshallerContext context) {
		return	GetLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
