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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.AllocateClusterPublicConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllocateClusterPublicConnectionResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String connectionString;

	private String iPType;

	private String port;

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

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
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

	@Override
	public AllocateClusterPublicConnectionResponse getInstance(UnmarshallerContext context) {
		return	AllocateClusterPublicConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
