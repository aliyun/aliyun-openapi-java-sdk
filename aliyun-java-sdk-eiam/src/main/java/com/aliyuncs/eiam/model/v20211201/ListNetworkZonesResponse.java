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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListNetworkZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNetworkZonesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private String previousToken;

	private List<NetworkZone> networkZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getPreviousToken() {
		return this.previousToken;
	}

	public void setPreviousToken(String previousToken) {
		this.previousToken = previousToken;
	}

	public List<NetworkZone> getNetworkZones() {
		return this.networkZones;
	}

	public void setNetworkZones(List<NetworkZone> networkZones) {
		this.networkZones = networkZones;
	}

	public static class NetworkZone {

		private String instanceId;

		private String networkZoneId;

		private String networkZoneName;

		private String description;

		private String networkZoneType;

		private String vpcId;

		private List<String> ipv4Cidrs;

		private List<String> ipv6Cidrs;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNetworkZoneId() {
			return this.networkZoneId;
		}

		public void setNetworkZoneId(String networkZoneId) {
			this.networkZoneId = networkZoneId;
		}

		public String getNetworkZoneName() {
			return this.networkZoneName;
		}

		public void setNetworkZoneName(String networkZoneName) {
			this.networkZoneName = networkZoneName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNetworkZoneType() {
			return this.networkZoneType;
		}

		public void setNetworkZoneType(String networkZoneType) {
			this.networkZoneType = networkZoneType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<String> getIpv4Cidrs() {
			return this.ipv4Cidrs;
		}

		public void setIpv4Cidrs(List<String> ipv4Cidrs) {
			this.ipv4Cidrs = ipv4Cidrs;
		}

		public List<String> getIpv6Cidrs() {
			return this.ipv6Cidrs;
		}

		public void setIpv6Cidrs(List<String> ipv6Cidrs) {
			this.ipv6Cidrs = ipv6Cidrs;
		}
	}

	@Override
	public ListNetworkZonesResponse getInstance(UnmarshallerContext context) {
		return	ListNetworkZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
