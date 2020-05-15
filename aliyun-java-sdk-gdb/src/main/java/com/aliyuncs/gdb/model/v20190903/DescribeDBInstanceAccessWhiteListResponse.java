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

package com.aliyuncs.gdb.model.v20190903;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gdb.transform.v20190903.DescribeDBInstanceAccessWhiteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAccessWhiteListResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceIPArray> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceIPArray> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstanceIPArray> items) {
		this.items = items;
	}

	public static class DBInstanceIPArray {

		private String dBInstanceIPArrayName;

		private String dBInstanceIPArrayAttribute;

		private String securityIps;

		public String getDBInstanceIPArrayName() {
			return this.dBInstanceIPArrayName;
		}

		public void setDBInstanceIPArrayName(String dBInstanceIPArrayName) {
			this.dBInstanceIPArrayName = dBInstanceIPArrayName;
		}

		public String getDBInstanceIPArrayAttribute() {
			return this.dBInstanceIPArrayAttribute;
		}

		public void setDBInstanceIPArrayAttribute(String dBInstanceIPArrayAttribute) {
			this.dBInstanceIPArrayAttribute = dBInstanceIPArrayAttribute;
		}

		public String getSecurityIps() {
			return this.securityIps;
		}

		public void setSecurityIps(String securityIps) {
			this.securityIps = securityIps;
		}
	}

	@Override
	public DescribeDBInstanceAccessWhiteListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAccessWhiteListResponseUnmarshaller.unmarshall(this, context);
	}
}
