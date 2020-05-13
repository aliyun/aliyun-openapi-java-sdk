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
import com.aliyuncs.iovcc.transform.v20180501.ListAssistActionDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAssistActionDetailsResponse extends AcsResponse {

	private String requestId;

	private List<ResultsItem> results;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultsItem> getResults() {
		return this.results;
	}

	public void setResults(List<ResultsItem> results) {
		this.results = results;
	}

	public static class ResultsItem {

		private String deviceId;

		private String action;

		private String timestamp;

		private String type;

		private String data;

		private String iD;

		private Long createdAt;

		private Long updatedAt;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
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
	}

	@Override
	public ListAssistActionDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListAssistActionDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
