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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryChangeLogListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryChangeLogListResponse extends AcsResponse {

	private Boolean prePage;

	private Integer currentPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean resultLimit;

	private Integer totalItemNum;

	private Boolean nextPage;

	private List<ChangeLog> data;

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
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

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Boolean getResultLimit() {
		return this.resultLimit;
	}

	public void setResultLimit(Boolean resultLimit) {
		this.resultLimit = resultLimit;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<ChangeLog> getData() {
		return this.data;
	}

	public void setData(List<ChangeLog> data) {
		this.data = data;
	}

	public static class ChangeLog {

		private String operation;

		private String time;

		private String result;

		private String domainName;

		private String operationIPAddress;

		private String details;

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getOperationIPAddress() {
			return this.operationIPAddress;
		}

		public void setOperationIPAddress(String operationIPAddress) {
			this.operationIPAddress = operationIPAddress;
		}

		public String getDetails() {
			return this.details;
		}

		public void setDetails(String details) {
			this.details = details;
		}
	}

	@Override
	public QueryChangeLogListResponse getInstance(UnmarshallerContext context) {
		return	QueryChangeLogListResponseUnmarshaller.unmarshall(this, context);
	}
}
