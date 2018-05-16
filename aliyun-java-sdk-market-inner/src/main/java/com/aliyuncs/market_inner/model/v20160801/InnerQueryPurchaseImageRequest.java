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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryPurchaseImageRequest extends RpcAcsRequest<InnerQueryPurchaseImageResponse> {
	
	public InnerQueryPurchaseImageRequest() {
		super("Market-Inner", "2016-08-01", "InnerQueryPurchaseImage");
	}

	private String imageId;

	private String imageProductCode;

	private Long aliUid;

	private String chargeType;

	private String imagePurchaseType;

	private String imageCategory;

	private String regionNo;

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getImageProductCode() {
		return this.imageProductCode;
	}

	public void setImageProductCode(String imageProductCode) {
		this.imageProductCode = imageProductCode;
		if(imageProductCode != null){
			putQueryParameter("ImageProductCode", imageProductCode);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getImagePurchaseType() {
		return this.imagePurchaseType;
	}

	public void setImagePurchaseType(String imagePurchaseType) {
		this.imagePurchaseType = imagePurchaseType;
		if(imagePurchaseType != null){
			putQueryParameter("ImagePurchaseType", imagePurchaseType);
		}
	}

	public String getImageCategory() {
		return this.imageCategory;
	}

	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
		if(imageCategory != null){
			putQueryParameter("ImageCategory", imageCategory);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<InnerQueryPurchaseImageResponse> getResponseClass() {
		return InnerQueryPurchaseImageResponse.class;
	}

}
