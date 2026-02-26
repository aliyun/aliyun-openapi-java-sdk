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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterConnectivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterConnectivityResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private String connCheckResult;

	private String connCheckErrorCode;

	private String connCheckErrorMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getConnCheckResult() {
		return this.connCheckResult;
	}

	public void setConnCheckResult(String connCheckResult) {
		this.connCheckResult = connCheckResult;
	}

	public String getConnCheckErrorCode() {
		return this.connCheckErrorCode;
	}

	public void setConnCheckErrorCode(String connCheckErrorCode) {
		this.connCheckErrorCode = connCheckErrorCode;
	}

	public String getConnCheckErrorMessage() {
		return this.connCheckErrorMessage;
	}

	public void setConnCheckErrorMessage(String connCheckErrorMessage) {
		this.connCheckErrorMessage = connCheckErrorMessage;
	}

	@Override
	public DescribeDBClusterConnectivityResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterConnectivityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
