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

package com.aliyuncs.privatelink.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointZonesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<Zone> zones;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Zone> getZones() {
		return this.zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public static class Zone {

		private String vSwitchId;

		private String eniIp;

		private String zoneStatus;

		private String zoneId;

		private String serviceStatus;

		private String eniId;

		private String zoneDomain;

		private String regionId;

		private Long nsiIndex;

		private String nsiIndexString;

		private String zoneIpv6Address;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getEniIp() {
			return this.eniIp;
		}

		public void setEniIp(String eniIp) {
			this.eniIp = eniIp;
		}

		public String getZoneStatus() {
			return this.zoneStatus;
		}

		public void setZoneStatus(String zoneStatus) {
			this.zoneStatus = zoneStatus;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public String getEniId() {
			return this.eniId;
		}

		public void setEniId(String eniId) {
			this.eniId = eniId;
		}

		public String getZoneDomain() {
			return this.zoneDomain;
		}

		public void setZoneDomain(String zoneDomain) {
			this.zoneDomain = zoneDomain;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getNsiIndex() {
			return this.nsiIndex;
		}

		public void setNsiIndex(Long nsiIndex) {
			this.nsiIndex = nsiIndex;
		}

		public String getNsiIndexString() {
			return this.nsiIndexString;
		}

		public void setNsiIndexString(String nsiIndexString) {
			this.nsiIndexString = nsiIndexString;
		}

		public String getZoneIpv6Address() {
			return this.zoneIpv6Address;
		}

		public void setZoneIpv6Address(String zoneIpv6Address) {
			this.zoneIpv6Address = zoneIpv6Address;
		}
	}

	@Override
	public ListVpcEndpointZonesResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
