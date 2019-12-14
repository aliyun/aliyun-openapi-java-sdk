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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeZonesResponse extends AcsResponse {

	private String requestId;

	private List<KVStoreZone> zones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KVStoreZone> getZones() {
		return this.zones;
	}

	public void setZones(List<KVStoreZone> zones) {
		this.zones = zones;
	}

	public static class KVStoreZone {

		private String regionId;

		private String zoneId;

		private String zoneName;

		private Boolean switchNetwork;

		private Boolean isRds;

		private Boolean disabled;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public Boolean getSwitchNetwork() {
			return this.switchNetwork;
		}

		public void setSwitchNetwork(Boolean switchNetwork) {
			this.switchNetwork = switchNetwork;
		}

		public Boolean getIsRds() {
			return this.isRds;
		}

		public void setIsRds(Boolean isRds) {
			this.isRds = isRds;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}
	}

	@Override
	public DescribeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
