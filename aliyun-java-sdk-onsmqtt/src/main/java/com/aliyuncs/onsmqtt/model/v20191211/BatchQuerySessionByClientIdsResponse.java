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

package com.aliyuncs.onsmqtt.model.v20191211;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20191211.BatchQuerySessionByClientIdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchQuerySessionByClientIdsResponse extends AcsResponse {

	private String requestId;

	private List<OnlineStatusListItem> onlineStatusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OnlineStatusListItem> getOnlineStatusList() {
		return this.onlineStatusList;
	}

	public void setOnlineStatusList(List<OnlineStatusListItem> onlineStatusList) {
		this.onlineStatusList = onlineStatusList;
	}

	public static class OnlineStatusListItem {

		private String clientId;

		private Boolean onlineStatus;

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public Boolean getOnlineStatus() {
			return this.onlineStatus;
		}

		public void setOnlineStatus(Boolean onlineStatus) {
			this.onlineStatus = onlineStatus;
		}
	}

	@Override
	public BatchQuerySessionByClientIdsResponse getInstance(UnmarshallerContext context) {
		return	BatchQuerySessionByClientIdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
