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

package com.aliyuncs.dyvmsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyvmsapi.transform.v20170525.QueryCallInTransferRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCallInTransferRecordResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Long pageNo;

		private Long pageSize;

		private List<ValuesItem> values;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<ValuesItem> getValues() {
			return this.values;
		}

		public void setValues(List<ValuesItem> values) {
			this.values = values;
		}

		public static class ValuesItem {

			private String callInCaller;

			private String callInCalled;

			private String transferCaller;

			private String transferCalled;

			private String recordUrl;

			private Long gmtCreate;

			public String getCallInCaller() {
				return this.callInCaller;
			}

			public void setCallInCaller(String callInCaller) {
				this.callInCaller = callInCaller;
			}

			public String getCallInCalled() {
				return this.callInCalled;
			}

			public void setCallInCalled(String callInCalled) {
				this.callInCalled = callInCalled;
			}

			public String getTransferCaller() {
				return this.transferCaller;
			}

			public void setTransferCaller(String transferCaller) {
				this.transferCaller = transferCaller;
			}

			public String getTransferCalled() {
				return this.transferCalled;
			}

			public void setTransferCalled(String transferCalled) {
				this.transferCalled = transferCalled;
			}

			public String getRecordUrl() {
				return this.recordUrl;
			}

			public void setRecordUrl(String recordUrl) {
				this.recordUrl = recordUrl;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}
		}
	}

	@Override
	public QueryCallInTransferRecordResponse getInstance(UnmarshallerContext context) {
		return	QueryCallInTransferRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
