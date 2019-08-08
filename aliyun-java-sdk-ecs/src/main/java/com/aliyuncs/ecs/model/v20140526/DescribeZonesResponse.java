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
import com.aliyuncs.ecs.transform.v20140526.DescribeZonesResponseUnmarshaller;
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

		private String localName;

		private List<ResourcesInfo> availableResources;

		private List<String> availableResourceCreation;

		private List<String> availableDiskCategories;

		private List<String> availableInstanceTypes;

		private List<String> availableVolumeCategories;

		private List<String> availableDedicatedHostTypes;

		private List<String> dedicatedHostGenerations;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public List<ResourcesInfo> getAvailableResources() {
			return this.availableResources;
		}

		public void setAvailableResources(List<ResourcesInfo> availableResources) {
			this.availableResources = availableResources;
		}

		public List<String> getAvailableResourceCreation() {
			return this.availableResourceCreation;
		}

		public void setAvailableResourceCreation(List<String> availableResourceCreation) {
			this.availableResourceCreation = availableResourceCreation;
		}

		public List<String> getAvailableDiskCategories() {
			return this.availableDiskCategories;
		}

		public void setAvailableDiskCategories(List<String> availableDiskCategories) {
			this.availableDiskCategories = availableDiskCategories;
		}

		public List<String> getAvailableInstanceTypes() {
			return this.availableInstanceTypes;
		}

		public void setAvailableInstanceTypes(List<String> availableInstanceTypes) {
			this.availableInstanceTypes = availableInstanceTypes;
		}

		public List<String> getAvailableVolumeCategories() {
			return this.availableVolumeCategories;
		}

		public void setAvailableVolumeCategories(List<String> availableVolumeCategories) {
			this.availableVolumeCategories = availableVolumeCategories;
		}

		public List<String> getAvailableDedicatedHostTypes() {
			return this.availableDedicatedHostTypes;
		}

		public void setAvailableDedicatedHostTypes(List<String> availableDedicatedHostTypes) {
			this.availableDedicatedHostTypes = availableDedicatedHostTypes;
		}

		public List<String> getDedicatedHostGenerations() {
			return this.dedicatedHostGenerations;
		}

		public void setDedicatedHostGenerations(List<String> dedicatedHostGenerations) {
			this.dedicatedHostGenerations = dedicatedHostGenerations;
		}

		public static class ResourcesInfo {

			private Boolean ioOptimized;

			private List<String> systemDiskCategories;

			private List<String> dataDiskCategories;

			private List<String> networkTypes;

			private List<String> instanceTypes;

			private List<String> instanceTypeFamilies;

			private List<String> instanceGenerations;

			public Boolean getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(Boolean ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public List<String> getSystemDiskCategories() {
				return this.systemDiskCategories;
			}

			public void setSystemDiskCategories(List<String> systemDiskCategories) {
				this.systemDiskCategories = systemDiskCategories;
			}

			public List<String> getDataDiskCategories() {
				return this.dataDiskCategories;
			}

			public void setDataDiskCategories(List<String> dataDiskCategories) {
				this.dataDiskCategories = dataDiskCategories;
			}

			public List<String> getNetworkTypes() {
				return this.networkTypes;
			}

			public void setNetworkTypes(List<String> networkTypes) {
				this.networkTypes = networkTypes;
			}

			public List<String> getInstanceTypes() {
				return this.instanceTypes;
			}

			public void setInstanceTypes(List<String> instanceTypes) {
				this.instanceTypes = instanceTypes;
			}

			public List<String> getInstanceTypeFamilies() {
				return this.instanceTypeFamilies;
			}

			public void setInstanceTypeFamilies(List<String> instanceTypeFamilies) {
				this.instanceTypeFamilies = instanceTypeFamilies;
			}

			public List<String> getInstanceGenerations() {
				return this.instanceGenerations;
			}

			public void setInstanceGenerations(List<String> instanceGenerations) {
				this.instanceGenerations = instanceGenerations;
			}
		}
	}

	@Override
	public DescribeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
