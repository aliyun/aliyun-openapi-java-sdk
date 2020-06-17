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
import com.aliyuncs.ecs.transform.v20140526.AssignPrivateIpAddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AssignPrivateIpAddressesResponse extends AcsResponse {

	private String requestId;

	private AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AssignedPrivateIpAddressesSet getAssignedPrivateIpAddressesSet() {
		return this.assignedPrivateIpAddressesSet;
	}

	public void setAssignedPrivateIpAddressesSet(AssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet) {
		this.assignedPrivateIpAddressesSet = assignedPrivateIpAddressesSet;
	}

	public static class AssignedPrivateIpAddressesSet {

		private String networkInterfaceId;

		private List<String> privateIpSet;

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public List<String> getPrivateIpSet() {
			return this.privateIpSet;
		}

		public void setPrivateIpSet(List<String> privateIpSet) {
			this.privateIpSet = privateIpSet;
		}
	}

	@Override
	public AssignPrivateIpAddressesResponse getInstance(UnmarshallerContext context) {
		return	AssignPrivateIpAddressesResponseUnmarshaller.unmarshall(this, context);
	}
}
