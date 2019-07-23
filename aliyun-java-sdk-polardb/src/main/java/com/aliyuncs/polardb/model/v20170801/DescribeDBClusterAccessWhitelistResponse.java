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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterAccessWhitelistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAccessWhitelistResponse extends AcsResponse {

	private String requestId;

	private List<DBClusterIPArray> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBClusterIPArray> getItems() {
		return this.items;
	}

	public void setItems(List<DBClusterIPArray> items) {
		this.items = items;
	}

	public static class DBClusterIPArray {

		private String dBClusterIPArrayName;

		private String dBClusterIPArrayAttribute;

		private String securityIps;

		public String getDBClusterIPArrayName() {
			return this.dBClusterIPArrayName;
		}

		public void setDBClusterIPArrayName(String dBClusterIPArrayName) {
			this.dBClusterIPArrayName = dBClusterIPArrayName;
		}

		public String getDBClusterIPArrayAttribute() {
			return this.dBClusterIPArrayAttribute;
		}

		public void setDBClusterIPArrayAttribute(String dBClusterIPArrayAttribute) {
			this.dBClusterIPArrayAttribute = dBClusterIPArrayAttribute;
		}

		public String getSecurityIps() {
			return this.securityIps;
		}

		public void setSecurityIps(String securityIps) {
			this.securityIps = securityIps;
		}
	}

	@Override
	public DescribeDBClusterAccessWhitelistResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAccessWhitelistResponseUnmarshaller.unmarshall(this, context);
	}
}
