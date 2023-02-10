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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetFeatureDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFeatureDetailsResponse extends AcsResponse {

	private String requestId;

	private Terraform terraform;

	private TemplateScratch templateScratch;

	private ResourceCleaner resourceCleaner;

	private TemplateParameterConstraints templateParameterConstraints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Terraform getTerraform() {
		return this.terraform;
	}

	public void setTerraform(Terraform terraform) {
		this.terraform = terraform;
	}

	public TemplateScratch getTemplateScratch() {
		return this.templateScratch;
	}

	public void setTemplateScratch(TemplateScratch templateScratch) {
		this.templateScratch = templateScratch;
	}

	public ResourceCleaner getResourceCleaner() {
		return this.resourceCleaner;
	}

	public void setResourceCleaner(ResourceCleaner resourceCleaner) {
		this.resourceCleaner = resourceCleaner;
	}

	public TemplateParameterConstraints getTemplateParameterConstraints() {
		return this.templateParameterConstraints;
	}

	public void setTemplateParameterConstraints(TemplateParameterConstraints templateParameterConstraints) {
		this.templateParameterConstraints = templateParameterConstraints;
	}

	public static class Terraform {

		private List<SupportedVersion> supportedVersions;

		private SupportedResourceTypes supportedResourceTypes;

		public List<SupportedVersion> getSupportedVersions() {
			return this.supportedVersions;
		}

		public void setSupportedVersions(List<SupportedVersion> supportedVersions) {
			this.supportedVersions = supportedVersions;
		}

		public SupportedResourceTypes getSupportedResourceTypes() {
			return this.supportedResourceTypes;
		}

		public void setSupportedResourceTypes(SupportedResourceTypes supportedResourceTypes) {
			this.supportedResourceTypes = supportedResourceTypes;
		}

		public static class SupportedVersion {

			private String terraformVersion;

			private String transform;

			private List<ProviderVersion> providerVersions;

			private List<String> updateAllowedTransforms;

			public String getTerraformVersion() {
				return this.terraformVersion;
			}

			public void setTerraformVersion(String terraformVersion) {
				this.terraformVersion = terraformVersion;
			}

			public String getTransform() {
				return this.transform;
			}

			public void setTransform(String transform) {
				this.transform = transform;
			}

			public List<ProviderVersion> getProviderVersions() {
				return this.providerVersions;
			}

			public void setProviderVersions(List<ProviderVersion> providerVersions) {
				this.providerVersions = providerVersions;
			}

			public List<String> getUpdateAllowedTransforms() {
				return this.updateAllowedTransforms;
			}

			public void setUpdateAllowedTransforms(List<String> updateAllowedTransforms) {
				this.updateAllowedTransforms = updateAllowedTransforms;
			}

			public static class ProviderVersion {

				private String providerName;

				private List<String> supportedVersions1;

				public String getProviderName() {
					return this.providerName;
				}

				public void setProviderName(String providerName) {
					this.providerName = providerName;
				}

				public List<String> getSupportedVersions1() {
					return this.supportedVersions1;
				}

				public void setSupportedVersions1(List<String> supportedVersions1) {
					this.supportedVersions1 = supportedVersions1;
				}
			}
		}

		public static class SupportedResourceTypes {

			private List<String> systemTag;

			private List<String> customTag;

			private List<String> estimateCost;

			private List<String> resourceGroup;

			private StackOperationRisk stackOperationRisk;

			public List<String> getSystemTag() {
				return this.systemTag;
			}

			public void setSystemTag(List<String> systemTag) {
				this.systemTag = systemTag;
			}

			public List<String> getCustomTag() {
				return this.customTag;
			}

			public void setCustomTag(List<String> customTag) {
				this.customTag = customTag;
			}

			public List<String> getEstimateCost() {
				return this.estimateCost;
			}

			public void setEstimateCost(List<String> estimateCost) {
				this.estimateCost = estimateCost;
			}

			public List<String> getResourceGroup() {
				return this.resourceGroup;
			}

			public void setResourceGroup(List<String> resourceGroup) {
				this.resourceGroup = resourceGroup;
			}

			public StackOperationRisk getStackOperationRisk() {
				return this.stackOperationRisk;
			}

			public void setStackOperationRisk(StackOperationRisk stackOperationRisk) {
				this.stackOperationRisk = stackOperationRisk;
			}

			public static class StackOperationRisk {

				private List<String> deleteStack;

				public List<String> getDeleteStack() {
					return this.deleteStack;
				}

				public void setDeleteStack(List<String> deleteStack) {
					this.deleteStack = deleteStack;
				}
			}
		}
	}

	public static class TemplateScratch {

		private List<SupportedResourceType> supportedResourceTypes2;

		public List<SupportedResourceType> getSupportedResourceTypes2() {
			return this.supportedResourceTypes2;
		}

		public void setSupportedResourceTypes2(List<SupportedResourceType> supportedResourceTypes2) {
			this.supportedResourceTypes2 = supportedResourceTypes2;
		}

		public static class SupportedResourceType {

			private String resourceType;

			private Boolean sourceResourcesSupported;

			private Boolean sourceTagSupported;

			private Boolean sourceResourceGroupSupported;

			private Boolean sourceSupported;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public Boolean getSourceResourcesSupported() {
				return this.sourceResourcesSupported;
			}

			public void setSourceResourcesSupported(Boolean sourceResourcesSupported) {
				this.sourceResourcesSupported = sourceResourcesSupported;
			}

			public Boolean getSourceTagSupported() {
				return this.sourceTagSupported;
			}

			public void setSourceTagSupported(Boolean sourceTagSupported) {
				this.sourceTagSupported = sourceTagSupported;
			}

			public Boolean getSourceResourceGroupSupported() {
				return this.sourceResourceGroupSupported;
			}

			public void setSourceResourceGroupSupported(Boolean sourceResourceGroupSupported) {
				this.sourceResourceGroupSupported = sourceResourceGroupSupported;
			}

			public Boolean getSourceSupported() {
				return this.sourceSupported;
			}

			public void setSourceSupported(Boolean sourceSupported) {
				this.sourceSupported = sourceSupported;
			}
		}
	}

	public static class ResourceCleaner {

		private List<SupportedResourceType4> supportedResourceTypes3;

		public List<SupportedResourceType4> getSupportedResourceTypes3() {
			return this.supportedResourceTypes3;
		}

		public void setSupportedResourceTypes3(List<SupportedResourceType4> supportedResourceTypes3) {
			this.supportedResourceTypes3 = supportedResourceTypes3;
		}

		public static class SupportedResourceType4 {

			private String resourceType;

			private List<String> supportedFilters;

			private List<String> sideEffects;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public List<String> getSupportedFilters() {
				return this.supportedFilters;
			}

			public void setSupportedFilters(List<String> supportedFilters) {
				this.supportedFilters = supportedFilters;
			}

			public List<String> getSideEffects() {
				return this.sideEffects;
			}

			public void setSideEffects(List<String> sideEffects) {
				this.sideEffects = sideEffects;
			}
		}
	}

	public static class TemplateParameterConstraints {

		private List<SupportedResourceType6> supportedResourceTypes5;

		public List<SupportedResourceType6> getSupportedResourceTypes5() {
			return this.supportedResourceTypes5;
		}

		public void setSupportedResourceTypes5(List<SupportedResourceType6> supportedResourceTypes5) {
			this.supportedResourceTypes5 = supportedResourceTypes5;
		}

		public static class SupportedResourceType6 {

			private String resourceType;

			private List<String> properties;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public List<String> getProperties() {
				return this.properties;
			}

			public void setProperties(List<String> properties) {
				this.properties = properties;
			}
		}
	}

	@Override
	public GetFeatureDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetFeatureDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
