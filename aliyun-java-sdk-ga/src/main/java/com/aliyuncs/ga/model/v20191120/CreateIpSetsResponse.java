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
import com.aliyuncs.ga.transform.v20191120.CreateIpSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateIpSetsResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private List<GaIpSet> ipSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public List<GaIpSet> getIpSets() {
		return this.ipSets;
	}

	public void setIpSets(List<GaIpSet> ipSets) {
		this.ipSets = ipSets;
	}

	public static class GaIpSet {

		private String ipSetId;

		private String accelerateRegionId;

		private Integer bandwidth;

		private List<String> ipList;

		public String getIpSetId() {
			return this.ipSetId;
		}

		public void setIpSetId(String ipSetId) {
			this.ipSetId = ipSetId;
		}

		public String getAccelerateRegionId() {
			return this.accelerateRegionId;
		}

		public void setAccelerateRegionId(String accelerateRegionId) {
			this.accelerateRegionId = accelerateRegionId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public List<String> getIpList() {
			return this.ipList;
		}

		public void setIpList(List<String> ipList) {
			this.ipList = ipList;
		}
	}

	@Override
	public CreateIpSetsResponse getInstance(UnmarshallerContext context) {
		return	CreateIpSetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
