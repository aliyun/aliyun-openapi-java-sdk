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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerDescribeEniBdfResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDescribeEniBdfResponse extends AcsResponse {

	private String requestId;

	private List<NetworkInterfaceBdfSet> networkInterfaceBdfSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NetworkInterfaceBdfSet> getNetworkInterfaceBdfSets() {
		return this.networkInterfaceBdfSets;
	}

	public void setNetworkInterfaceBdfSets(List<NetworkInterfaceBdfSet> networkInterfaceBdfSets) {
		this.networkInterfaceBdfSets = networkInterfaceBdfSets;
	}

	public static class NetworkInterfaceBdfSet {

		private String networkInterfaceId;

		private String bdf;

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getBdf() {
			return this.bdf;
		}

		public void setBdf(String bdf) {
			this.bdf = bdf;
		}
	}

	@Override
	public InnerDescribeEniBdfResponse getInstance(UnmarshallerContext context) {
		return	InnerDescribeEniBdfResponseUnmarshaller.unmarshall(this, context);
	}
}
