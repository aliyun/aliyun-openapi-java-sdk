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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeInstanceSSLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSSLResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String sSLEnabled;

	private String certCommonName;

	private String sSLExpiredTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getSSLEnabled() {
		return this.sSLEnabled;
	}

	public void setSSLEnabled(String sSLEnabled) {
		this.sSLEnabled = sSLEnabled;
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

	@Override
	public DescribeInstanceSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSSLResponseUnmarshaller.unmarshall(this, context);
	}
}
