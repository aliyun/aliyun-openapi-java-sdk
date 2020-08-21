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

package com.aliyuncs.quickbi_public.model.v20200730;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200730.QueryDataServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDataServiceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String sql;

		private List<HeadersItem> headers;

		private List<Map<Object,Object>> values;

		public String getSql() {
			return this.sql;
		}

		public void setSql(String sql) {
			this.sql = sql;
		}

		public List<HeadersItem> getHeaders() {
			return this.headers;
		}

		public void setHeaders(List<HeadersItem> headers) {
			this.headers = headers;
		}

		public List<Map<Object,Object>> getValues() {
			return this.values;
		}

		public void setValues(List<Map<Object,Object>> values) {
			this.values = values;
		}

		public static class HeadersItem {

			private String label;

			private String type;

			private String dataType;

			private String column;

			private String aggregator;

			private String granularity;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getColumn() {
				return this.column;
			}

			public void setColumn(String column) {
				this.column = column;
			}

			public String getAggregator() {
				return this.aggregator;
			}

			public void setAggregator(String aggregator) {
				this.aggregator = aggregator;
			}

			public String getGranularity() {
				return this.granularity;
			}

			public void setGranularity(String granularity) {
				this.granularity = granularity;
			}
		}
	}

	@Override
	public QueryDataServiceResponse getInstance(UnmarshallerContext context) {
		return	QueryDataServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
