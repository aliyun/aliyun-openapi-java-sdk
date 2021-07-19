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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.AssignIpv6AddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AssignIpv6AddressesResponse extends AcsResponse {

	private String requestId;

	private String networkInterfaceId;

	private List<String> ipv6Sets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
	}

	public List<String> getIpv6Sets() {
		return this.ipv6Sets;
	}

	public void setIpv6Sets(List<String> ipv6Sets) {
		this.ipv6Sets = ipv6Sets;
	}

	@Override
	public AssignIpv6AddressesResponse getInstance(UnmarshallerContext context) {
		return	AssignIpv6AddressesResponseUnmarshaller.unmarshall(this, context);
	}
}
