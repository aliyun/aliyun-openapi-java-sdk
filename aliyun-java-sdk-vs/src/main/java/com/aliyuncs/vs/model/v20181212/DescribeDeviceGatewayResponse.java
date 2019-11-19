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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeDeviceGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceGatewayResponse extends AcsResponse {

	private String requestId;

	private String host;

	private Long port;

	private String protocol;

	private String token;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Long getPort() {
		return this.port;
	}

	public void setPort(Long port) {
		this.port = port;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public DescribeDeviceGatewayResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
