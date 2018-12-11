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

package com.aliyuncs.dds.model.v20151201;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstanceSSLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSSLResponse extends AcsResponse {

	private String requestId;

	private String sSLExpiredTime;

	private String certCommonName;

	private String sSLStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSSLExpiredTime() {
		return this.sSLExpiredTime;
	}

	public void setSSLExpiredTime(String sSLExpiredTime) {
		this.sSLExpiredTime = sSLExpiredTime;
	}

	public String getCertCommonName() {
		return this.certCommonName;
	}

	public void setCertCommonName(String certCommonName) {
		this.certCommonName = certCommonName;
	}

	public String getSSLStatus() {
		return this.sSLStatus;
	}

	public void setSSLStatus(String sSLStatus) {
		this.sSLStatus = sSLStatus;
	}

	@Override
	public DescribeDBInstanceSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSSLResponseUnmarshaller.unmarshall(this, context);
	}
}
