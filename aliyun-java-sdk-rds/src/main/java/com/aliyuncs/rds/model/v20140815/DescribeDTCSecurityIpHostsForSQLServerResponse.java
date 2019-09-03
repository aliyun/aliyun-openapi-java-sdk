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
import com.aliyuncs.rds.transform.v20140815.DescribeDTCSecurityIpHostsForSQLServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDTCSecurityIpHostsForSQLServerResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String ipHostPairNum;

	private List<WhiteListGroups> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getIpHostPairNum() {
		return this.ipHostPairNum;
	}

	public void setIpHostPairNum(String ipHostPairNum) {
		this.ipHostPairNum = ipHostPairNum;
	}

	public List<WhiteListGroups> getItems() {
		return this.items;
	}

	public void setItems(List<WhiteListGroups> items) {
		this.items = items;
	}

	public static class WhiteListGroups {

		private String securityIpHosts;

		private String whitelistGroupName;

		public String getSecurityIpHosts() {
			return this.securityIpHosts;
		}

		public void setSecurityIpHosts(String securityIpHosts) {
			this.securityIpHosts = securityIpHosts;
		}

		public String getWhitelistGroupName() {
			return this.whitelistGroupName;
		}

		public void setWhitelistGroupName(String whitelistGroupName) {
			this.whitelistGroupName = whitelistGroupName;
		}
	}

	@Override
	public DescribeDTCSecurityIpHostsForSQLServerResponse getInstance(UnmarshallerContext context) {
		return	DescribeDTCSecurityIpHostsForSQLServerResponseUnmarshaller.unmarshall(this, context);
	}
}
