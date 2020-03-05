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
import com.aliyuncs.ehpc.transform.v20180412.ListCustomImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomImagesResponse extends AcsResponse {

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

		private String uid;

		private String imageId;

		private String imageName;

		private String imageOwnerAlias;

		private String description;

		private String status;

		private String productCode;

		private String skuCode;

		private String pricingCycle;

		private String postInstallScript;

		private Integer size;

		private BaseOsTag baseOsTag;

		private OsTag osTag;

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
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

		public String getPostInstallScript() {
			return this.postInstallScript;
		}

		public void setPostInstallScript(String postInstallScript) {
			this.postInstallScript = postInstallScript;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
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

			private String osTag;

			private String platform;

			private String version;

			private String architecture;

			public String getOsTag() {
				return this.osTag;
			}

			public void setOsTag(String osTag) {
				this.osTag = osTag;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
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

			private String osTag;

			private String baseOsTag;

			private String platform;

			private String version;

			private String architecture;

			public String getOsTag() {
				return this.osTag;
			}

			public void setOsTag(String osTag) {
				this.osTag = osTag;
			}

			public String getBaseOsTag() {
				return this.baseOsTag;
			}

			public void setBaseOsTag(String baseOsTag) {
				this.baseOsTag = baseOsTag;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
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
	}

	@Override
	public ListCustomImagesResponse getInstance(UnmarshallerContext context) {
		return	ListCustomImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
