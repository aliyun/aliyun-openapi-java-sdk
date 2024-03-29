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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListEndpointGroupIpAddressCidrBlocksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEndpointGroupIpAddressCidrBlocksResponse extends AcsResponse {

	private String endpointGroupRegion;

	private String resourceGroupId;

	private String state;

	private String requestId;

	private List<String> ipAddressCidrBlocks;

	public String getEndpointGroupRegion() {
		return this.endpointGroupRegion;
	}

	public void setEndpointGroupRegion(String endpointGroupRegion) {
		this.endpointGroupRegion = endpointGroupRegion;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getIpAddressCidrBlocks() {
		return this.ipAddressCidrBlocks;
	}

	public void setIpAddressCidrBlocks(List<String> ipAddressCidrBlocks) {
		this.ipAddressCidrBlocks = ipAddressCidrBlocks;
	}

	@Override
	public ListEndpointGroupIpAddressCidrBlocksResponse getInstance(UnmarshallerContext context) {
		return	ListEndpointGroupIpAddressCidrBlocksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
