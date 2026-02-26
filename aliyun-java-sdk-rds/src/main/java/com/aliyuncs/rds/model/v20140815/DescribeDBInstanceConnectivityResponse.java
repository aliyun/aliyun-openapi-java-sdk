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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceConnectivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceConnectivityResponse extends AcsResponse {

	private String connCheckErrorCode;

	private String connCheckErrorMessage;

	private String connCheckResult;

	private String dbInstanceName;

	private String requestId;

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

	public String getConnCheckResult() {
		return this.connCheckResult;
	}

	public void setConnCheckResult(String connCheckResult) {
		this.connCheckResult = connCheckResult;
	}

	public String getDbInstanceName() {
		return this.dbInstanceName;
	}

	public void setDbInstanceName(String dbInstanceName) {
		this.dbInstanceName = dbInstanceName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeDBInstanceConnectivityResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceConnectivityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
