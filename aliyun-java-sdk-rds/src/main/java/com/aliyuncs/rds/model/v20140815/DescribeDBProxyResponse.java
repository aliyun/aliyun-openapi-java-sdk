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
import com.aliyuncs.rds.transform.v20140815.DescribeDBProxyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBProxyResponse extends AcsResponse {

	private String requestId;

	private String dBProxyServiceStatus;

	private String dBProxyInstanceType;

	private Integer dBProxyInstanceNum;

	private String dBProxyInstanceStatus;

	private List<DBProxyConnectStringItemsItem> dBProxyConnectStringItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBProxyServiceStatus() {
		return this.dBProxyServiceStatus;
	}

	public void setDBProxyServiceStatus(String dBProxyServiceStatus) {
		this.dBProxyServiceStatus = dBProxyServiceStatus;
	}

	public String getDBProxyInstanceType() {
		return this.dBProxyInstanceType;
	}

	public void setDBProxyInstanceType(String dBProxyInstanceType) {
		this.dBProxyInstanceType = dBProxyInstanceType;
	}

	public Integer getDBProxyInstanceNum() {
		return this.dBProxyInstanceNum;
	}

	public void setDBProxyInstanceNum(Integer dBProxyInstanceNum) {
		this.dBProxyInstanceNum = dBProxyInstanceNum;
	}

	public String getDBProxyInstanceStatus() {
		return this.dBProxyInstanceStatus;
	}

	public void setDBProxyInstanceStatus(String dBProxyInstanceStatus) {
		this.dBProxyInstanceStatus = dBProxyInstanceStatus;
	}

	public List<DBProxyConnectStringItemsItem> getDBProxyConnectStringItems() {
		return this.dBProxyConnectStringItems;
	}

	public void setDBProxyConnectStringItems(List<DBProxyConnectStringItemsItem> dBProxyConnectStringItems) {
		this.dBProxyConnectStringItems = dBProxyConnectStringItems;
	}

	public static class DBProxyConnectStringItemsItem {

		private String dBProxyEndpointId;

		private String dBProxyConnectString;

		private String dBProxyConnectStringPort;

		private String dBProxyConnectStringNetType;

		private String dBProxyVpcInstanceId;

		public String getDBProxyEndpointId() {
			return this.dBProxyEndpointId;
		}

		public void setDBProxyEndpointId(String dBProxyEndpointId) {
			this.dBProxyEndpointId = dBProxyEndpointId;
		}

		public String getDBProxyConnectString() {
			return this.dBProxyConnectString;
		}

		public void setDBProxyConnectString(String dBProxyConnectString) {
			this.dBProxyConnectString = dBProxyConnectString;
		}

		public String getDBProxyConnectStringPort() {
			return this.dBProxyConnectStringPort;
		}

		public void setDBProxyConnectStringPort(String dBProxyConnectStringPort) {
			this.dBProxyConnectStringPort = dBProxyConnectStringPort;
		}

		public String getDBProxyConnectStringNetType() {
			return this.dBProxyConnectStringNetType;
		}

		public void setDBProxyConnectStringNetType(String dBProxyConnectStringNetType) {
			this.dBProxyConnectStringNetType = dBProxyConnectStringNetType;
		}

		public String getDBProxyVpcInstanceId() {
			return this.dBProxyVpcInstanceId;
		}

		public void setDBProxyVpcInstanceId(String dBProxyVpcInstanceId) {
			this.dBProxyVpcInstanceId = dBProxyVpcInstanceId;
		}
	}

	@Override
	public DescribeDBProxyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBProxyResponseUnmarshaller.unmarshall(this, context);
	}
}
