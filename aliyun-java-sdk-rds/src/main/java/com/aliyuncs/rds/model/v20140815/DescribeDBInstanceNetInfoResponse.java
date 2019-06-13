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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceNetInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetInfoResponse extends AcsResponse {

	private String requestId;

	private String instanceNetworkType;

	private String securityIPMode;

	private List<DBInstanceNetInfo> dBInstanceNetInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
	}

	public String getSecurityIPMode() {
		return this.securityIPMode;
	}

	public void setSecurityIPMode(String securityIPMode) {
		this.securityIPMode = securityIPMode;
	}

	public List<DBInstanceNetInfo> getDBInstanceNetInfos() {
		return this.dBInstanceNetInfos;
	}

	public void setDBInstanceNetInfos(List<DBInstanceNetInfo> dBInstanceNetInfos) {
		this.dBInstanceNetInfos = dBInstanceNetInfos;
	}

	public static class DBInstanceNetInfo {

		private String upgradeable;

		private String expiredTime;

		private String connectionString;

		private String iPAddress;

		private String iPType;

		private String port;

		private String vPCId;

		private String vSwitchId;

		private String connectionStringType;

		private String maxDelayTime;

		private String distributionType;

		private List<SecurityIPGroup> securityIPGroups;

		private List<DBInstanceWeight> dBInstanceWeights;

		public String getUpgradeable() {
			return this.upgradeable;
		}

		public void setUpgradeable(String upgradeable) {
			this.upgradeable = upgradeable;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getConnectionStringType() {
			return this.connectionStringType;
		}

		public void setConnectionStringType(String connectionStringType) {
			this.connectionStringType = connectionStringType;
		}

		public String getMaxDelayTime() {
			return this.maxDelayTime;
		}

		public void setMaxDelayTime(String maxDelayTime) {
			this.maxDelayTime = maxDelayTime;
		}

		public String getDistributionType() {
			return this.distributionType;
		}

		public void setDistributionType(String distributionType) {
			this.distributionType = distributionType;
		}

		public List<SecurityIPGroup> getSecurityIPGroups() {
			return this.securityIPGroups;
		}

		public void setSecurityIPGroups(List<SecurityIPGroup> securityIPGroups) {
			this.securityIPGroups = securityIPGroups;
		}

		public List<DBInstanceWeight> getDBInstanceWeights() {
			return this.dBInstanceWeights;
		}

		public void setDBInstanceWeights(List<DBInstanceWeight> dBInstanceWeights) {
			this.dBInstanceWeights = dBInstanceWeights;
		}

		public static class SecurityIPGroup {

			private String securityIPGroupName;

			private String securityIPs;

			public String getSecurityIPGroupName() {
				return this.securityIPGroupName;
			}

			public void setSecurityIPGroupName(String securityIPGroupName) {
				this.securityIPGroupName = securityIPGroupName;
			}

			public String getSecurityIPs() {
				return this.securityIPs;
			}

			public void setSecurityIPs(String securityIPs) {
				this.securityIPs = securityIPs;
			}
		}

		public static class DBInstanceWeight {

			private String dBInstanceId;

			private String dBInstanceType;

			private String availability;

			private String weight;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getDBInstanceType() {
				return this.dBInstanceType;
			}

			public void setDBInstanceType(String dBInstanceType) {
				this.dBInstanceType = dBInstanceType;
			}

			public String getAvailability() {
				return this.availability;
			}

			public void setAvailability(String availability) {
				this.availability = availability;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}
		}
	}

	@Override
	public DescribeDBInstanceNetInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceNetInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
