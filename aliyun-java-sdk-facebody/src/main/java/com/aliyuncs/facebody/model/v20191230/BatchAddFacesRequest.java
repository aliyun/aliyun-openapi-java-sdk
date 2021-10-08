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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchAddFacesRequest extends RpcAcsRequest<BatchAddFacesResponse> {
	   

	private String entityId;

	private Float qualityScoreThreshold;

	private Float similarityScoreThresholdBetweenEntity;

	private Float similarityScoreThresholdInEntity;

	private String dbName;

	@SerializedName("faces")
	private List<Faces> faces;
	public BatchAddFacesRequest() {
		super("facebody", "2019-12-30", "BatchAddFaces");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId);
		}
	}

	public Float getQualityScoreThreshold() {
		return this.qualityScoreThreshold;
	}

	public void setQualityScoreThreshold(Float qualityScoreThreshold) {
		this.qualityScoreThreshold = qualityScoreThreshold;
		if(qualityScoreThreshold != null){
			putBodyParameter("QualityScoreThreshold", qualityScoreThreshold.toString());
		}
	}

	public Float getSimilarityScoreThresholdBetweenEntity() {
		return this.similarityScoreThresholdBetweenEntity;
	}

	public void setSimilarityScoreThresholdBetweenEntity(Float similarityScoreThresholdBetweenEntity) {
		this.similarityScoreThresholdBetweenEntity = similarityScoreThresholdBetweenEntity;
		if(similarityScoreThresholdBetweenEntity != null){
			putBodyParameter("SimilarityScoreThresholdBetweenEntity", similarityScoreThresholdBetweenEntity.toString());
		}
	}

	public Float getSimilarityScoreThresholdInEntity() {
		return this.similarityScoreThresholdInEntity;
	}

	public void setSimilarityScoreThresholdInEntity(Float similarityScoreThresholdInEntity) {
		this.similarityScoreThresholdInEntity = similarityScoreThresholdInEntity;
		if(similarityScoreThresholdInEntity != null){
			putBodyParameter("SimilarityScoreThresholdInEntity", similarityScoreThresholdInEntity.toString());
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putBodyParameter("DbName", dbName);
		}
	}

	public List<Faces> getFaces() {
		return this.faces;
	}

	public void setFaces(List<Faces> faces) {
		this.faces = faces;	
		if (faces != null) {
			putBodyParameter("Faces" , new Gson().toJson(faces));
		}	
	}

	public static class Faces {

		@SerializedName("ExtraData")
		private String extraData;

		@SerializedName("ImageURL")
		private String imageURL;

		public String getExtraData() {
			return this.extraData;
		}

		public void setExtraData(String extraData) {
			this.extraData = extraData;
		}

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
	}

	@Override
	public Class<BatchAddFacesResponse> getResponseClass() {
		return BatchAddFacesResponse.class;
	}

}
