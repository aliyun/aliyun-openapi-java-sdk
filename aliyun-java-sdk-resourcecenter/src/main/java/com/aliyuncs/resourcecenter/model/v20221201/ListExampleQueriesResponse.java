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

package com.aliyuncs.resourcecenter.model.v20221201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.ListExampleQueriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExampleQueriesResponse extends AcsResponse {

	private String requestId;

	private String maxResults;

	private String nextToken;

	private List<ExampleQuery> exampleQueries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ExampleQuery> getExampleQueries() {
		return this.exampleQueries;
	}

	public void setExampleQueries(List<ExampleQuery> exampleQueries) {
		this.exampleQueries = exampleQueries;
	}

	public static class ExampleQuery {

		private String queryId;

		private String name;

		private String description;

		public String getQueryId() {
			return this.queryId;
		}

		public void setQueryId(String queryId) {
			this.queryId = queryId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListExampleQueriesResponse getInstance(UnmarshallerContext context) {
		return	ListExampleQueriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
