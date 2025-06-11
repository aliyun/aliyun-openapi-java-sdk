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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstanceAvailableZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAvailableZonesResponse extends AcsResponse {

	private String requestId;

	private List<ZoneListItem> zoneList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ZoneListItem> getZoneList() {
		return this.zoneList;
	}

	public void setZoneList(List<ZoneListItem> zoneList) {
		this.zoneList = zoneList;
	}

	public static class ZoneListItem {

		private String zone;

		private Boolean isInCluster;

		private String replicateZoneIndex;

		private String logicalZoneName;

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public Boolean getIsInCluster() {
			return this.isInCluster;
		}

		public void setIsInCluster(Boolean isInCluster) {
			this.isInCluster = isInCluster;
		}

		public String getReplicateZoneIndex() {
			return this.replicateZoneIndex;
		}

		public void setReplicateZoneIndex(String replicateZoneIndex) {
			this.replicateZoneIndex = replicateZoneIndex;
		}

		public String getLogicalZoneName() {
			return this.logicalZoneName;
		}

		public void setLogicalZoneName(String logicalZoneName) {
			this.logicalZoneName = logicalZoneName;
		}
	}

	@Override
	public DescribeInstanceAvailableZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAvailableZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
