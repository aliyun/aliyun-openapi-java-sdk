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

package com.aliyuncs.market_inner.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market_inner.transform.v20160801.InnerQueryMarketImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryMarketImageResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private MarketImageProduct marketImageProduct;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public MarketImageProduct getMarketImageProduct() {
		return this.marketImageProduct;
	}

	public void setMarketImageProduct(MarketImageProduct marketImageProduct) {
		this.marketImageProduct = marketImageProduct;
	}

	public static class MarketImageProduct {

		private String imagePc;

		private String extendInfo;

		private List<ImageRegionInfo> imageRegionInfoList;

		private List<String> supportChargeTypes;

		public String getImagePc() {
			return this.imagePc;
		}

		public void setImagePc(String imagePc) {
			this.imagePc = imagePc;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}

		public List<ImageRegionInfo> getImageRegionInfoList() {
			return this.imageRegionInfoList;
		}

		public void setImageRegionInfoList(List<ImageRegionInfo> imageRegionInfoList) {
			this.imageRegionInfoList = imageRegionInfoList;
		}

		public List<String> getSupportChargeTypes() {
			return this.supportChargeTypes;
		}

		public void setSupportChargeTypes(List<String> supportChargeTypes) {
			this.supportChargeTypes = supportChargeTypes;
		}

		public static class ImageRegionInfo {

			private String regionNo;

			private String imageId;

			private String imageVersion;

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getImageVersion() {
				return this.imageVersion;
			}

			public void setImageVersion(String imageVersion) {
				this.imageVersion = imageVersion;
			}
		}
	}

	@Override
	public InnerQueryMarketImageResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryMarketImageResponseUnmarshaller.unmarshall(this, context);
	}
}
