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
import com.aliyuncs.rds.transform.v20140815.DescribeADInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeADInfoResponse extends AcsResponse {

	private String aDStatus;

	private String requestId;

	private String aDDNS;

	private String aDServerIpAddress;

	private String abnormalReason;

	private String userName;

	public String getADStatus() {
		return this.aDStatus;
	}

	public void setADStatus(String aDStatus) {
		this.aDStatus = aDStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getADDNS() {
		return this.aDDNS;
	}

	public void setADDNS(String aDDNS) {
		this.aDDNS = aDDNS;
	}

	public String getADServerIpAddress() {
		return this.aDServerIpAddress;
	}

	public void setADServerIpAddress(String aDServerIpAddress) {
		this.aDServerIpAddress = aDServerIpAddress;
	}

	public String getAbnormalReason() {
		return this.abnormalReason;
	}

	public void setAbnormalReason(String abnormalReason) {
		this.abnormalReason = abnormalReason;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public DescribeADInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeADInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
