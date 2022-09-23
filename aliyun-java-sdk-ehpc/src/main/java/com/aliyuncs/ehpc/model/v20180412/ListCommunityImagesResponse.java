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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListCommunityImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCommunityImagesResponse extends AcsResponse {

	private String requestId;

	private List<ImageInfo> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageInfo> getImages() {
		return this.images;
	}

	public void setImages(List<ImageInfo> images) {
		this.images = images;
	}

	public static class ImageInfo {

		private String status;

		private String postInstallScript;

		private String description;

		private Integer size;

		private String imageOwnerAlias;

		private String imageName;

		private String skuCode;

		private String pricingCycle;

		private String imageId;

		private String productCode;

		private String uid;

		private BaseOsTag baseOsTag;

		private OsTag osTag;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPostInstallScript() {
			return this.postInstallScript;
		}

		public void setPostInstallScript(String postInstallScript) {
			this.postInstallScript = postInstallScript;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getSkuCode() {
			return this.skuCode;
		}

		public void setSkuCode(String skuCode) {
			this.skuCode = skuCode;
		}

		public String getPricingCycle() {
			return this.pricingCycle;
		}

		public void setPricingCycle(String pricingCycle) {
			this.pricingCycle = pricingCycle;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public BaseOsTag getBaseOsTag() {
			return this.baseOsTag;
		}

		public void setBaseOsTag(BaseOsTag baseOsTag) {
			this.baseOsTag = baseOsTag;
		}

		public OsTag getOsTag() {
			return this.osTag;
		}

		public void setOsTag(OsTag osTag) {
			this.osTag = osTag;
		}

		public static class BaseOsTag {

			private String platform;

			private String osTag;

			private String version;

			private String architecture;

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getOsTag() {
				return this.osTag;
			}

			public void setOsTag(String osTag) {
				this.osTag = osTag;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getArchitecture() {
				return this.architecture;
			}

			public void setArchitecture(String architecture) {
				this.architecture = architecture;
			}
		}

		public static class OsTag {

			private String platform;

			private String osTag;

			private String version;

			private String architecture;

			private String baseOsTag;

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getOsTag() {
				return this.osTag;
			}

			public void setOsTag(String osTag) {
				this.osTag = osTag;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getArchitecture() {
				return this.architecture;
			}

			public void setArchitecture(String architecture) {
				this.architecture = architecture;
			}

			public String getBaseOsTag() {
				return this.baseOsTag;
			}

			public void setBaseOsTag(String baseOsTag) {
				this.baseOsTag = baseOsTag;
			}
		}
	}

	@Override
	public ListCommunityImagesResponse getInstance(UnmarshallerContext context) {
		return	ListCommunityImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
