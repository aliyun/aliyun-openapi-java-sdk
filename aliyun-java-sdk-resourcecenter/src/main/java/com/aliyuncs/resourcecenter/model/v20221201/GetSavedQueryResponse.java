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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.GetSavedQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSavedQueryResponse extends AcsResponse {

	private String requestId;

	private SavedQuery savedQuery;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SavedQuery getSavedQuery() {
		return this.savedQuery;
	}

	public void setSavedQuery(SavedQuery savedQuery) {
		this.savedQuery = savedQuery;
	}

	public static class SavedQuery {

		private String createTime;

		private String description;

		private String expression;

		private String name;

		private String queryId;

		private String updateTime;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getQueryId() {
			return this.queryId;
		}

		public void setQueryId(String queryId) {
			this.queryId = queryId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public GetSavedQueryResponse getInstance(UnmarshallerContext context) {
		return	GetSavedQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
