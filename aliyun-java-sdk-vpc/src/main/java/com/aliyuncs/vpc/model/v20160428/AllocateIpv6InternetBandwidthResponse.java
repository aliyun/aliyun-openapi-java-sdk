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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.AllocateIpv6InternetBandwidthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllocateIpv6InternetBandwidthResponse extends AcsResponse {

	private String requestId;

	private String ipv6AddressId;

	private String internetBandwidthId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIpv6AddressId() {
		return this.ipv6AddressId;
	}

	public void setIpv6AddressId(String ipv6AddressId) {
		this.ipv6AddressId = ipv6AddressId;
	}

	public String getInternetBandwidthId() {
		return this.internetBandwidthId;
	}

	public void setInternetBandwidthId(String internetBandwidthId) {
		this.internetBandwidthId = internetBandwidthId;
	}

	@Override
	public AllocateIpv6InternetBandwidthResponse getInstance(UnmarshallerContext context) {
		return	AllocateIpv6InternetBandwidthResponseUnmarshaller.unmarshall(this, context);
	}
}
