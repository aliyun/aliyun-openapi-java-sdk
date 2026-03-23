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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribePolarAgentChatRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolarAgentChatRecordsResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String sessionId;

		private String queryId;

		private String query;

		private String answer;

		private String feedbackType;

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getQueryId() {
			return this.queryId;
		}

		public void setQueryId(String queryId) {
			this.queryId = queryId;
		}

		public String getQuery() {
			return this.query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public String getAnswer() {
			return this.answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		public String getFeedbackType() {
			return this.feedbackType;
		}

		public void setFeedbackType(String feedbackType) {
			this.feedbackType = feedbackType;
		}
	}

	@Override
	public DescribePolarAgentChatRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribePolarAgentChatRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
