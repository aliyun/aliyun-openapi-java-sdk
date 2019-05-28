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
import com.aliyuncs.rds.transform.v20140815.DescribeInstanceVpcMigrateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceVpcMigrateInfoResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceMigrateInfo> dBInstanceMigrateInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceMigrateInfo> getDBInstanceMigrateInfos() {
		return this.dBInstanceMigrateInfos;
	}

	public void setDBInstanceMigrateInfos(List<DBInstanceMigrateInfo> dBInstanceMigrateInfos) {
		this.dBInstanceMigrateInfos = dBInstanceMigrateInfos;
	}

	public static class DBInstanceMigrateInfo {

		private String dBInstanceId;

		private String targetRegionId;

		private String targetZoneId;

		private String targetVPCId;

		private String targetVSwitchId;

		private String targetIPAddress;

		private String targetVpcInstanceId;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getTargetRegionId() {
			return this.targetRegionId;
		}

		public void setTargetRegionId(String targetRegionId) {
			this.targetRegionId = targetRegionId;
		}

		public String getTargetZoneId() {
			return this.targetZoneId;
		}

		public void setTargetZoneId(String targetZoneId) {
			this.targetZoneId = targetZoneId;
		}

		public String getTargetVPCId() {
			return this.targetVPCId;
		}

		public void setTargetVPCId(String targetVPCId) {
			this.targetVPCId = targetVPCId;
		}

		public String getTargetVSwitchId() {
			return this.targetVSwitchId;
		}

		public void setTargetVSwitchId(String targetVSwitchId) {
			this.targetVSwitchId = targetVSwitchId;
		}

		public String getTargetIPAddress() {
			return this.targetIPAddress;
		}

		public void setTargetIPAddress(String targetIPAddress) {
			this.targetIPAddress = targetIPAddress;
		}

		public String getTargetVpcInstanceId() {
			return this.targetVpcInstanceId;
		}

		public void setTargetVpcInstanceId(String targetVpcInstanceId) {
			this.targetVpcInstanceId = targetVpcInstanceId;
		}
	}

	@Override
	public DescribeInstanceVpcMigrateInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceVpcMigrateInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
