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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeConfigHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigHistoryResponse extends AcsResponse {

	private String requestId;

	private List<ConfigHistoryItem> configHistoryItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ConfigHistoryItem> getConfigHistoryItems() {
		return this.configHistoryItems;
	}

	public void setConfigHistoryItems(List<ConfigHistoryItem> configHistoryItems) {
		this.configHistoryItems = configHistoryItems;
	}

	public static class ConfigHistoryItem {

		private String time;

		private String ownerId;

		private String reason;

		private Boolean success;

		private String changeId;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getChangeId() {
			return this.changeId;
		}

		public void setChangeId(String changeId) {
			this.changeId = changeId;
		}
	}

	@Override
	public DescribeConfigHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
