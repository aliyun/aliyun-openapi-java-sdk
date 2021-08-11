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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeZonesResponse extends AcsResponse {

	private String requestId;

	private List<Zone> zones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Zone> getZones() {
		return this.zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public static class Zone {

		private String zoneId;

		private List<InstanceType> instanceTypes;

		private List<String> performance;

		private List<String> capacity;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<InstanceType> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<InstanceType> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public List<String> getPerformance() {
			return this.performance;
		}

		public void setPerformance(List<String> performance) {
			this.performance = performance;
		}

		public List<String> getCapacity() {
			return this.capacity;
		}

		public void setCapacity(List<String> capacity) {
			this.capacity = capacity;
		}

		public static class InstanceType {

			private String storageType;

			private String protocolType;

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}

			public String getProtocolType() {
				return this.protocolType;
			}

			public void setProtocolType(String protocolType) {
				this.protocolType = protocolType;
			}
		}
	}

	@Override
	public DescribeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
