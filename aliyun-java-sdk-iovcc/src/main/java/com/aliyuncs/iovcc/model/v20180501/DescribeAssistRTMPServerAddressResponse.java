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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeAssistRTMPServerAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssistRTMPServerAddressResponse extends AcsResponse {

	private String requestId;

	private String rTMPServer;

	private String oTP;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRTMPServer() {
		return this.rTMPServer;
	}

	public void setRTMPServer(String rTMPServer) {
		this.rTMPServer = rTMPServer;
	}

	public String getOTP() {
		return this.oTP;
	}

	public void setOTP(String oTP) {
		this.oTP = oTP;
	}

	@Override
	public DescribeAssistRTMPServerAddressResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssistRTMPServerAddressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
