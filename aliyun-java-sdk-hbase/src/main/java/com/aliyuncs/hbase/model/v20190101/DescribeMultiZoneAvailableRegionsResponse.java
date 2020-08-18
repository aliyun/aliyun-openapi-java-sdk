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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeMultiZoneAvailableRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMultiZoneAvailableRegionsResponse extends AcsResponse {

	private String requestId;

	private List<Region> regions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Region> getRegions() {
		return this.regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public static class Region {

		private String localName;

		private String regionEndpoint;

		private String regionId;

		private List<AvailableCombine> availableCombines;

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public String getRegionEndpoint() {
			return this.regionEndpoint;
		}

		public void setRegionEndpoint(String regionEndpoint) {
			this.regionEndpoint = regionEndpoint;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<AvailableCombine> getAvailableCombines() {
			return this.availableCombines;
		}

		public void setAvailableCombines(List<AvailableCombine> availableCombines) {
			this.availableCombines = availableCombines;
		}

		public static class AvailableCombine {

			private String id;

			private List<String> zones;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getZones() {
				return this.zones;
			}

			public void setZones(List<String> zones) {
				this.zones = zones;
			}
		}
	}

	@Override
	public DescribeMultiZoneAvailableRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMultiZoneAvailableRegionsResponseUnmarshaller.unmarshall(this, context);
	}
}
