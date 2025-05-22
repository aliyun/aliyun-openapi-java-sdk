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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceHAConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceHAConfigResponse extends AcsResponse {

	private String dBInstanceId;

	private String hAMode;

	private String requestId;

	private String syncMode;

	private List<NodeInfo> hostInstanceInfos;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getHAMode() {
		return this.hAMode;
	}

	public void setHAMode(String hAMode) {
		this.hAMode = hAMode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSyncMode() {
		return this.syncMode;
	}

	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}

	public List<NodeInfo> getHostInstanceInfos() {
		return this.hostInstanceInfos;
	}

	public void setHostInstanceInfos(List<NodeInfo> hostInstanceInfos) {
		this.hostInstanceInfos = hostInstanceInfos;
	}

	public static class NodeInfo {

		private String dataSyncTime;

		private String logSyncTime;

		private String nodeId;

		private String nodeType;

		private String regionId;

		private String syncStatus;

		private String zoneId;

		public String getDataSyncTime() {
			return this.dataSyncTime;
		}

		public void setDataSyncTime(String dataSyncTime) {
			this.dataSyncTime = dataSyncTime;
		}

		public String getLogSyncTime() {
			return this.logSyncTime;
		}

		public void setLogSyncTime(String logSyncTime) {
			this.logSyncTime = logSyncTime;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(String syncStatus) {
			this.syncStatus = syncStatus;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public DescribeDBInstanceHAConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceHAConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
