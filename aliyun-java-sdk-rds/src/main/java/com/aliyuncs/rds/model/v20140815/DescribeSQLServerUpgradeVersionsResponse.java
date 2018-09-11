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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeSQLServerUpgradeVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLServerUpgradeVersionsResponse extends AcsResponse {

	private String requestId;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String currentVersion;

		private List<SQLServerUpgradeVersion> sQLServerUpgradeVersions;

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public List<SQLServerUpgradeVersion> getSQLServerUpgradeVersions() {
			return this.sQLServerUpgradeVersions;
		}

		public void setSQLServerUpgradeVersions(List<SQLServerUpgradeVersion> sQLServerUpgradeVersions) {
			this.sQLServerUpgradeVersions = sQLServerUpgradeVersions;
		}

		public static class SQLServerUpgradeVersion {

			private String version;

			private String enableUpgrade;

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getEnableUpgrade() {
				return this.enableUpgrade;
			}

			public void setEnableUpgrade(String enableUpgrade) {
				this.enableUpgrade = enableUpgrade;
			}
		}
	}

	@Override
	public DescribeSQLServerUpgradeVersionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLServerUpgradeVersionsResponseUnmarshaller.unmarshall(this, context);
	}
}
