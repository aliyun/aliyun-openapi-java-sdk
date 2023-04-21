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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MergeImageFaceRequest extends RpcAcsRequest<MergeImageFaceResponse> {
	   

	private List<MergeInfos> mergeInfoss;

	private String templateId;

	private String imageURL;

	private Boolean addWatermark;

	private String modelVersion;
	public MergeImageFaceRequest() {
		super("facebody", "2019-12-30", "MergeImageFace", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<MergeInfos> getMergeInfoss() {
		return this.mergeInfoss;
	}

	public void setMergeInfoss(List<MergeInfos> mergeInfoss) {
		this.mergeInfoss = mergeInfoss;	
		if (mergeInfoss != null) {
			for (int depth1 = 0; depth1 < mergeInfoss.size(); depth1++) {
				putBodyParameter("MergeInfos." + (depth1 + 1) + ".ImageURL" , mergeInfoss.get(depth1).getImageURL());
				putBodyParameter("MergeInfos." + (depth1 + 1) + ".TemplateFaceID" , mergeInfoss.get(depth1).getTemplateFaceID());
			}
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

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
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

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putBodyParameter("ModelVersion", modelVersion);
		}
	}

	public static class MergeInfos {

		private String imageURL;

		private String templateFaceID;

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
	public Class<MergeImageFaceResponse> getResponseClass() {
		return MergeImageFaceResponse.class;
	}

}
