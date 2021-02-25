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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecognizeImageRequest extends RpcAcsRequest<RecognizeImageResponse> {
	   

	private Boolean requireCropImage;

	private String corpId;

	private String recognizeType;

	private String vendor;

	private String imageUrl;

	private String imageContent;
	public RecognizeImageRequest() {
		super("CDRS", "2020-11-01", "RecognizeImage");
		setMethod(MethodType.POST);
	}

	public Boolean getRequireCropImage() {
		return this.requireCropImage;
	}

	public void setRequireCropImage(Boolean requireCropImage) {
		this.requireCropImage = requireCropImage;
		if(requireCropImage != null){
			putBodyParameter("RequireCropImage", requireCropImage.toString());
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getRecognizeType() {
		return this.recognizeType;
	}

	public void setRecognizeType(String recognizeType) {
		this.recognizeType = recognizeType;
		if(recognizeType != null){
			putBodyParameter("RecognizeType", recognizeType);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putBodyParameter("Vendor", vendor);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	public String getImageContent() {
		return this.imageContent;
	}

	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
		if(imageContent != null){
			putBodyParameter("ImageContent", imageContent);
		}
	}

	@Override
	public Class<RecognizeImageResponse> getResponseClass() {
		return RecognizeImageResponse.class;
	}

}
