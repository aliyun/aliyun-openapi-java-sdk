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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeSyncAvailableDBClusterListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncAvailableDBClusterListResponse extends AcsResponse {

	private String requestId;

	private List<SyncAvailableDBCluster> syncAvailableDBClusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SyncAvailableDBCluster> getSyncAvailableDBClusters() {
		return this.syncAvailableDBClusters;
	}

	public void setSyncAvailableDBClusters(List<SyncAvailableDBCluster> syncAvailableDBClusters) {
		this.syncAvailableDBClusters = syncAvailableDBClusters;
	}

	public static class SyncAvailableDBCluster {

		private Integer tableNumber;

		private String dBClusterId;

		private String dBClusterDescription;

		private String dBType;

		private Float storageSize;

		public Integer getTableNumber() {
			return this.tableNumber;
		}

		public void setTableNumber(Integer tableNumber) {
			this.tableNumber = tableNumber;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public Float getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Float storageSize) {
			this.storageSize = storageSize;
		}
	}

	@Override
	public DescribeSyncAvailableDBClusterListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSyncAvailableDBClusterListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
