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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class FindSimilarFacesRequest extends RpcAcsRequest<FindSimilarFacesResponse> {
	   

	private String project;

	private Float minSimilarity;

	private String responseFormat;

	private Integer limit;

	private String faceId;

	private String imageUri;

	private String setId;
	public FindSimilarFacesRequest() {
		super("imm", "2017-09-06", "FindSimilarFaces", "imm");
		setMethod(MethodType.POST);
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public Float getMinSimilarity() {
		return this.minSimilarity;
	}

	public void setMinSimilarity(Float minSimilarity) {
		this.minSimilarity = minSimilarity;
		if(minSimilarity != null){
			putQueryParameter("MinSimilarity", minSimilarity.toString());
		}
	}

	public String getResponseFormat() {
		return this.responseFormat;
	}

	public void setResponseFormat(String responseFormat) {
		this.responseFormat = responseFormat;
		if(responseFormat != null){
			putQueryParameter("ResponseFormat", responseFormat);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getFaceId() {
		return this.faceId;
	}

	public void setFaceId(String faceId) {
		this.faceId = faceId;
		if(faceId != null){
			putQueryParameter("FaceId", faceId);
		}
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
		if(imageUri != null){
			putQueryParameter("ImageUri", imageUri);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	@Override
	public Class<FindSimilarFacesResponse> getResponseClass() {
		return FindSimilarFacesResponse.class;
	}

}
