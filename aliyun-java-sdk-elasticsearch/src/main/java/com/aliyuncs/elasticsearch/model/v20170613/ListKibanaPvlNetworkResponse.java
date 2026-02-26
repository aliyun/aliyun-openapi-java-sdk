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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListKibanaPvlNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKibanaPvlNetworkResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String endpointName;

		private String vpcId;

		private String endpointId;

		private String endpointStatus;

		private String createTime;

		private String pvlId;

		private List<VSwitchIdsZoneItem> vSwitchIdsZone;

		private List<String> securityGroups;

		public String getEndpointName() {
			return this.endpointName;
		}

		public void setEndpointName(String endpointName) {
			this.endpointName = endpointName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getEndpointStatus() {
			return this.endpointStatus;
		}

		public void setEndpointStatus(String endpointStatus) {
			this.endpointStatus = endpointStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPvlId() {
			return this.pvlId;
		}

		public void setPvlId(String pvlId) {
			this.pvlId = pvlId;
		}

		public List<VSwitchIdsZoneItem> getVSwitchIdsZone() {
			return this.vSwitchIdsZone;
		}

		public void setVSwitchIdsZone(List<VSwitchIdsZoneItem> vSwitchIdsZone) {
			this.vSwitchIdsZone = vSwitchIdsZone;
		}

		public List<String> getSecurityGroups() {
			return this.securityGroups;
		}

		public void setSecurityGroups(List<String> securityGroups) {
			this.securityGroups = securityGroups;
		}

		public static class VSwitchIdsZoneItem {

			private String zoneId;

			private String vswitchId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}
		}
	}

	@Override
	public ListKibanaPvlNetworkResponse getInstance(UnmarshallerContext context) {
		return	ListKibanaPvlNetworkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
