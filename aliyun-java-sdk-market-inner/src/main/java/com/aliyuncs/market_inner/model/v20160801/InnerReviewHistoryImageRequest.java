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
public class InnerReviewHistoryImageRequest extends RpcAcsRequest<InnerReviewHistoryImageResponse> {
	
	public InnerReviewHistoryImageRequest() {
		super("Market-Inner", "2016-08-01", "InnerReviewHistoryImage");
	}

	private String productCode;

	private String reviewType;

	private String imageVersion;

	private String imageNo;

	private Integer pageIndex;

	private String regionNo;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("productCode", productCode);
		}
	}

	public String getReviewType() {
		return this.reviewType;
	}

	public void setReviewType(String reviewType) {
		this.reviewType = reviewType;
		if(reviewType != null){
			putQueryParameter("reviewType", reviewType);
		}
	}

	public String getImageVersion() {
		return this.imageVersion;
	}

	public void setImageVersion(String imageVersion) {
		this.imageVersion = imageVersion;
		if(imageVersion != null){
			putQueryParameter("imageVersion", imageVersion);
		}
	}

	public String getImageNo() {
		return this.imageNo;
	}

	public void setImageNo(String imageNo) {
		this.imageNo = imageNo;
		if(imageNo != null){
			putQueryParameter("imageNo", imageNo);
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("pageIndex", pageIndex.toString());
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("regionNo", regionNo);
		}
	}

	@Override
	public Class<InnerReviewHistoryImageResponse> getResponseClass() {
		return InnerReviewHistoryImageResponse.class;
	}

}
