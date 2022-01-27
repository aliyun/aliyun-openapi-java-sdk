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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetQueryOptimizeExecErrorSampleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQueryOptimizeExecErrorSampleResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Integer pageNo;

		private Integer pageSize;

		private String extra;

		private List<QueryOptimizeExecErrorSamples> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public List<QueryOptimizeExecErrorSamples> getList() {
			return this.list;
		}

		public void setList(List<QueryOptimizeExecErrorSamples> list) {
			this.list = list;
		}

		public static class QueryOptimizeExecErrorSamples {

			private String origHost;

			private String user;

			private String dbname;

			private String sqlId;

			private String sqlText;

			private String errorCode;

			private Long timestamp;

			public String getOrigHost() {
				return this.origHost;
			}

			public void setOrigHost(String origHost) {
				this.origHost = origHost;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getDbname() {
				return this.dbname;
			}

			public void setDbname(String dbname) {
				this.dbname = dbname;
			}

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}

			public String getSqlText() {
				return this.sqlText;
			}

			public void setSqlText(String sqlText) {
				this.sqlText = sqlText;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}
		}
	}

	@Override
	public GetQueryOptimizeExecErrorSampleResponse getInstance(UnmarshallerContext context) {
		return	GetQueryOptimizeExecErrorSampleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
