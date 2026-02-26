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
import com.aliyuncs.vpc.transform.v20160428.CreateIpv4GatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateIpv4GatewayResponse extends AcsResponse {

	private String ipv4GatewayId;

	private String resourceGroupId;

	private String requestId;

	public String getIpv4GatewayId() {
		return this.ipv4GatewayId;
	}

	public void setIpv4GatewayId(String ipv4GatewayId) {
		this.ipv4GatewayId = ipv4GatewayId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateIpv4GatewayResponse getInstance(UnmarshallerContext context) {
		return	CreateIpv4GatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
