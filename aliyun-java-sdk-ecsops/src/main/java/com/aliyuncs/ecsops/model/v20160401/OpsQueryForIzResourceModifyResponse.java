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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryForIzResourceModifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryForIzResourceModifyResponse extends AcsResponse {

	private String zoneId;

	private String requestId;

	private Map<Object,Object> deployedInstanceTypeToStatus;

	private String localName;

	private List<ResourcesInfo> availableResources;

	private List<String> dedicatedHostGenerations;

	private List<String> availableInstanceTypes;

	private List<String> availableDedicatedHostTypes;

	private List<String> availableDiskCategories;

	private List<String> availableResourceCreation;

	private List<String> availableVolumeCategories;

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getDeployedInstanceTypeToStatus() {
		return this.deployedInstanceTypeToStatus;
	}

	public void setDeployedInstanceTypeToStatus(Map<Object,Object> deployedInstanceTypeToStatus) {
		this.deployedInstanceTypeToStatus = deployedInstanceTypeToStatus;
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

	public List<String> getDedicatedHostGenerations() {
		return this.dedicatedHostGenerations;
	}

	public void setDedicatedHostGenerations(List<String> dedicatedHostGenerations) {
		this.dedicatedHostGenerations = dedicatedHostGenerations;
	}

	public List<String> getAvailableInstanceTypes() {
		return this.availableInstanceTypes;
	}

	public void setAvailableInstanceTypes(List<String> availableInstanceTypes) {
		this.availableInstanceTypes = availableInstanceTypes;
	}

	public List<String> getAvailableDedicatedHostTypes() {
		return this.availableDedicatedHostTypes;
	}

	public void setAvailableDedicatedHostTypes(List<String> availableDedicatedHostTypes) {
		this.availableDedicatedHostTypes = availableDedicatedHostTypes;
	}

	public List<String> getAvailableDiskCategories() {
		return this.availableDiskCategories;
	}

	public void setAvailableDiskCategories(List<String> availableDiskCategories) {
		this.availableDiskCategories = availableDiskCategories;
	}

	public List<String> getAvailableResourceCreation() {
		return this.availableResourceCreation;
	}

	public void setAvailableResourceCreation(List<String> availableResourceCreation) {
		this.availableResourceCreation = availableResourceCreation;
	}

	public List<String> getAvailableVolumeCategories() {
		return this.availableVolumeCategories;
	}

	public void setAvailableVolumeCategories(List<String> availableVolumeCategories) {
		this.availableVolumeCategories = availableVolumeCategories;
	}

	public static class ResourcesInfo {

		private Boolean ioOptimized;

		private Map<Object,Object> deployedInstanceTypeToStatus;

		private List<String> systemDiskCategories;

		private List<String> instanceGenerations;

		private List<String> dataDiskCategories;

		private List<String> instanceTypes;

		private List<String> instanceTypeFamilies;

		private List<String> networkTypes;

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Map<Object,Object> getDeployedInstanceTypeToStatus() {
			return this.deployedInstanceTypeToStatus;
		}

		public void setDeployedInstanceTypeToStatus(Map<Object,Object> deployedInstanceTypeToStatus) {
			this.deployedInstanceTypeToStatus = deployedInstanceTypeToStatus;
		}

		public List<String> getSystemDiskCategories() {
			return this.systemDiskCategories;
		}

		public void setSystemDiskCategories(List<String> systemDiskCategories) {
			this.systemDiskCategories = systemDiskCategories;
		}

		public List<String> getInstanceGenerations() {
			return this.instanceGenerations;
		}

		public void setInstanceGenerations(List<String> instanceGenerations) {
			this.instanceGenerations = instanceGenerations;
		}

		public List<String> getDataDiskCategories() {
			return this.dataDiskCategories;
		}

		public void setDataDiskCategories(List<String> dataDiskCategories) {
			this.dataDiskCategories = dataDiskCategories;
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

		public List<String> getNetworkTypes() {
			return this.networkTypes;
		}

		public void setNetworkTypes(List<String> networkTypes) {
			this.networkTypes = networkTypes;
		}
	}

	@Override
	public OpsQueryForIzResourceModifyResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryForIzResourceModifyResponseUnmarshaller.unmarshall(this, context);
	}
}
