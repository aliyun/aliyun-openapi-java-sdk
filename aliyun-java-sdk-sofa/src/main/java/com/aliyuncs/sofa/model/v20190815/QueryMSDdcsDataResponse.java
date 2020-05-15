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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMSDdcsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMSDdcsDataResponse extends AcsResponse {

	private String requestId;

	private List<QueryResultItem> queryResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QueryResultItem> getQueryResult() {
		return this.queryResult;
	}

	public void setQueryResult(List<QueryResultItem> queryResult) {
		this.queryResult = queryResult;
	}

	public static class QueryResultItem {

		private String cell;

		private String data;

		public String getCell() {
			return this.cell;
		}

		public void setCell(String cell) {
			this.cell = cell;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}
	}

	@Override
	public QueryMSDdcsDataResponse getInstance(UnmarshallerContext context) {
		return	QueryMSDdcsDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
