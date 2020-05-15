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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeDBClusterAccessWhiteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAccessWhiteListResponse extends AcsResponse {

	private String requestId;

	private List<IPArray> dBClusterAccessWhiteList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IPArray> getDBClusterAccessWhiteList() {
		return this.dBClusterAccessWhiteList;
	}

	public void setDBClusterAccessWhiteList(List<IPArray> dBClusterAccessWhiteList) {
		this.dBClusterAccessWhiteList = dBClusterAccessWhiteList;
	}

	public static class IPArray {

		private String dBClusterIPArrayName;

		private String securityIPList;

		private String dBClusterIPArrayAttribute;

		public String getDBClusterIPArrayName() {
			return this.dBClusterIPArrayName;
		}

		public void setDBClusterIPArrayName(String dBClusterIPArrayName) {
			this.dBClusterIPArrayName = dBClusterIPArrayName;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getDBClusterIPArrayAttribute() {
			return this.dBClusterIPArrayAttribute;
		}

		public void setDBClusterIPArrayAttribute(String dBClusterIPArrayAttribute) {
			this.dBClusterIPArrayAttribute = dBClusterIPArrayAttribute;
		}
	}

	@Override
	public DescribeDBClusterAccessWhiteListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAccessWhiteListResponseUnmarshaller.unmarshall(this, context);
	}
}
