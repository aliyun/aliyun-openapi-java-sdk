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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListUpgradeClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUpgradeClientsResponse extends AcsResponse {

	private String requestId;

	private String latestVersion;

	private String currentVersion;

	private List<ClientRecordsItem> clientRecords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLatestVersion() {
		return this.latestVersion;
	}

	public void setLatestVersion(String latestVersion) {
		this.latestVersion = latestVersion;
	}

	public String getCurrentVersion() {
		return this.currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}

	public List<ClientRecordsItem> getClientRecords() {
		return this.clientRecords;
	}

	public void setClientRecords(List<ClientRecordsItem> clientRecords) {
		this.clientRecords = clientRecords;
	}

	public static class ClientRecordsItem {

		private String subUid;

		private String oldVersion;

		private String newVersion;

		private String updateTime;

		public String getSubUid() {
			return this.subUid;
		}

		public void setSubUid(String subUid) {
			this.subUid = subUid;
		}

		public String getOldVersion() {
			return this.oldVersion;
		}

		public void setOldVersion(String oldVersion) {
			this.oldVersion = oldVersion;
		}

		public String getNewVersion() {
			return this.newVersion;
		}

		public void setNewVersion(String newVersion) {
			this.newVersion = newVersion;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public ListUpgradeClientsResponse getInstance(UnmarshallerContext context) {
		return	ListUpgradeClientsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
