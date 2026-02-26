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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListResourcesByAdvancedSearchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourcesByAdvancedSearchResponse extends AcsResponse {

	private String requestId;

	private QueryResults queryResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QueryResults getQueryResults() {
		return this.queryResults;
	}

	public void setQueryResults(QueryResults queryResults) {
		this.queryResults = queryResults;
	}

	public static class QueryResults {

		private QueryResultList queryResultList;

		public QueryResultList getQueryResultList() {
			return this.queryResultList;
		}

		public void setQueryResultList(QueryResultList queryResultList) {
			this.queryResultList = queryResultList;
		}

		public static class QueryResultList {

			private List<String> columns;

			private List<String> values;

			public List<String> getColumns() {
				return this.columns;
			}

			public void setColumns(List<String> columns) {
				this.columns = columns;
			}

			public List<String> getValues() {
				return this.values;
			}

			public void setValues(List<String> values) {
				this.values = values;
			}
		}
	}

	@Override
	public ListResourcesByAdvancedSearchResponse getInstance(UnmarshallerContext context) {
		return	ListResourcesByAdvancedSearchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
