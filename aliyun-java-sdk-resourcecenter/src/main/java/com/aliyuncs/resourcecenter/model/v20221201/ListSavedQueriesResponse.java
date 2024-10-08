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
import com.aliyuncs.resourcecenter.transform.v20221201.ListSavedQueriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSavedQueriesResponse extends AcsResponse {

	private String requestId;

	private String maxResults;

	private String nextToken;

	private List<SavedQuery> savedQueries;

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

	public List<SavedQuery> getSavedQueries() {
		return this.savedQueries;
	}

	public void setSavedQueries(List<SavedQuery> savedQueries) {
		this.savedQueries = savedQueries;
	}

	public static class SavedQuery {

		private String queryId;

		private String name;

		private String description;

		private String createTime;

		private String updateTime;

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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public ListSavedQueriesResponse getInstance(UnmarshallerContext context) {
		return	ListSavedQueriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
