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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceSSLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSSLResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String dBInstanceName;

	private String certCommonName;

	private String sSLExpiredTime;

	private Boolean sSLEnabled;

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

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getCertCommonName() {
		return this.certCommonName;
	}

	public void setCertCommonName(String certCommonName) {
		this.certCommonName = certCommonName;
	}

	public String getSSLExpiredTime() {
		return this.sSLExpiredTime;
	}

	public void setSSLExpiredTime(String sSLExpiredTime) {
		this.sSLExpiredTime = sSLExpiredTime;
	}

	public Boolean getSSLEnabled() {
		return this.sSLEnabled;
	}

	public void setSSLEnabled(Boolean sSLEnabled) {
		this.sSLEnabled = sSLEnabled;
	}

	@Override
	public DescribeDBInstanceSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSSLResponseUnmarshaller.unmarshall(this, context);
	}
}
