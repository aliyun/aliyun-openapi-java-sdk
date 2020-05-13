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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListAssistHistoryDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAssistHistoryDetailsResponse extends AcsResponse {

	private String requestId;

	private List<ActionsItem> actions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ActionsItem> getActions() {
		return this.actions;
	}

	public void setActions(List<ActionsItem> actions) {
		this.actions = actions;
	}

	public static class ActionsItem {

		private String assistId;

		private String action;

		private String timestamp;

		private Long createdAt;

		private Long updatedAt;

		private String iD;

		public String getAssistId() {
			return this.assistId;
		}

		public void setAssistId(String assistId) {
			this.assistId = assistId;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
		}
	}

	@Override
	public ListAssistHistoryDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListAssistHistoryDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
