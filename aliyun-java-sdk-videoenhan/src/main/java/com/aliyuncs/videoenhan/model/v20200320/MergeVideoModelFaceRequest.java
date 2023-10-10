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

package com.aliyuncs.videoenhan.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videoenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MergeVideoModelFaceRequest extends RpcAcsRequest<MergeVideoModelFaceResponse> {
	   

	private String faceImageURL;

	private List<MergeInfos> mergeInfoss;

	private String watermarkType;

	private Boolean enhance;

	private String templateId;

	private Boolean addWatermark;
	public MergeVideoModelFaceRequest() {
		super("videoenhan", "2020-03-20", "MergeVideoModelFace", "videoenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceImageURL() {
		return this.faceImageURL;
	}

	public void setFaceImageURL(String faceImageURL) {
		this.faceImageURL = faceImageURL;
		if(faceImageURL != null){
			putBodyParameter("FaceImageURL", faceImageURL);
		}
	}

	public List<MergeInfos> getMergeInfoss() {
		return this.mergeInfoss;
	}

	public void setMergeInfoss(List<MergeInfos> mergeInfoss) {
		this.mergeInfoss = mergeInfoss;	
		if (mergeInfoss != null) {
			for (int depth1 = 0; depth1 < mergeInfoss.size(); depth1++) {
				putBodyParameter("MergeInfos." + (depth1 + 1) + ".TemplateFaceURL" , mergeInfoss.get(depth1).getTemplateFaceURL());
				putBodyParameter("MergeInfos." + (depth1 + 1) + ".ImageURL" , mergeInfoss.get(depth1).getImageURL());
				putBodyParameter("MergeInfos." + (depth1 + 1) + ".TemplateFaceID" , mergeInfoss.get(depth1).getTemplateFaceID());
			}
		}	
	}

	public String getWatermarkType() {
		return this.watermarkType;
	}

	public void setWatermarkType(String watermarkType) {
		this.watermarkType = watermarkType;
		if(watermarkType != null){
			putBodyParameter("WatermarkType", watermarkType);
		}
	}

	public Boolean getEnhance() {
		return this.enhance;
	}

	public void setEnhance(Boolean enhance) {
		this.enhance = enhance;
		if(enhance != null){
			putBodyParameter("Enhance", enhance.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public Boolean getAddWatermark() {
		return this.addWatermark;
	}

	public void setAddWatermark(Boolean addWatermark) {
		this.addWatermark = addWatermark;
		if(addWatermark != null){
			putBodyParameter("AddWatermark", addWatermark.toString());
		}
	}

	public static class MergeInfos {

		private String templateFaceURL;

		private String imageURL;

		private String templateFaceID;

		public String getTemplateFaceURL() {
			return this.templateFaceURL;
		}

		public void setTemplateFaceURL(String templateFaceURL) {
			this.templateFaceURL = templateFaceURL;
		}

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

		public String getTemplateFaceID() {
			return this.templateFaceID;
		}

		public void setTemplateFaceID(String templateFaceID) {
			this.templateFaceID = templateFaceID;
		}
	}

	@Override
	public Class<MergeVideoModelFaceResponse> getResponseClass() {
		return MergeVideoModelFaceResponse.class;
	}

}
