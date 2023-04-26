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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeSceneResourceRecommendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSceneResourceRecommendResponse extends AcsResponse {

	private String requestId;

	private List<RecommendProduct> recommendProducts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecommendProduct> getRecommendProducts() {
		return this.recommendProducts;
	}

	public void setRecommendProducts(List<RecommendProduct> recommendProducts) {
		this.recommendProducts = recommendProducts;
	}

	public static class RecommendProduct {

		private String regionId;

		private String zoneId;

		private String resourceId;

		private String recommendReason;

		private List<RecommendInstanceSpec> recommendInstanceSpecs;

		private List<RecommendImage> recommendImages;

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

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRecommendReason() {
			return this.recommendReason;
		}

		public void setRecommendReason(String recommendReason) {
			this.recommendReason = recommendReason;
		}

		public List<RecommendInstanceSpec> getRecommendInstanceSpecs() {
			return this.recommendInstanceSpecs;
		}

		public void setRecommendInstanceSpecs(List<RecommendInstanceSpec> recommendInstanceSpecs) {
			this.recommendInstanceSpecs = recommendInstanceSpecs;
		}

		public List<RecommendImage> getRecommendImages() {
			return this.recommendImages;
		}

		public void setRecommendImages(List<RecommendImage> recommendImages) {
			this.recommendImages = recommendImages;
		}

		public static class RecommendInstanceSpec {

			private Integer cores;

			private Float memory;

			private List<InstanceType> instanceTypes;

			public Integer getCores() {
				return this.cores;
			}

			public void setCores(Integer cores) {
				this.cores = cores;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public List<InstanceType> getInstanceTypes() {
				return this.instanceTypes;
			}

			public void setInstanceTypes(List<InstanceType> instanceTypes) {
				this.instanceTypes = instanceTypes;
			}

			public static class InstanceType {

				private String instanceTypeName;

				private String instanceTypeFamily;

				private Integer priority;

				private String warningRisk;

				public String getInstanceTypeName() {
					return this.instanceTypeName;
				}

				public void setInstanceTypeName(String instanceTypeName) {
					this.instanceTypeName = instanceTypeName;
				}

				public String getInstanceTypeFamily() {
					return this.instanceTypeFamily;
				}

				public void setInstanceTypeFamily(String instanceTypeFamily) {
					this.instanceTypeFamily = instanceTypeFamily;
				}

				public Integer getPriority() {
					return this.priority;
				}

				public void setPriority(Integer priority) {
					this.priority = priority;
				}

				public String getWarningRisk() {
					return this.warningRisk;
				}

				public void setWarningRisk(String warningRisk) {
					this.warningRisk = warningRisk;
				}
			}
		}

		public static class RecommendImage {

			private String imageId;

			private String imageOwnerAlias;

			private Boolean isPublic;

			private Integer priority;

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getImageOwnerAlias() {
				return this.imageOwnerAlias;
			}

			public void setImageOwnerAlias(String imageOwnerAlias) {
				this.imageOwnerAlias = imageOwnerAlias;
			}

			public Boolean getIsPublic() {
				return this.isPublic;
			}

			public void setIsPublic(Boolean isPublic) {
				this.isPublic = isPublic;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}
		}
	}

	@Override
	public DescribeSceneResourceRecommendResponse getInstance(UnmarshallerContext context) {
		return	DescribeSceneResourceRecommendResponseUnmarshaller.unmarshall(this, context);
	}
}
