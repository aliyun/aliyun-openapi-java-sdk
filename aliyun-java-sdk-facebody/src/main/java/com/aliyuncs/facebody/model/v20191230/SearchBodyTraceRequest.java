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
public class SearchBodyTraceRequest extends RpcAcsRequest<SearchBodyTraceResponse> {
	   

	private Float minScore;

	private Long limit;

	@SerializedName("images")
	private List<Images> images;

	private Long dbId;
	public SearchBodyTraceRequest() {
		super("facebody", "2019-12-30", "SearchBodyTrace");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getMinScore() {
		return this.minScore;
	}

	public void setMinScore(Float minScore) {
		this.minScore = minScore;
		if(minScore != null){
			putBodyParameter("MinScore", minScore.toString());
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public List<Images> getImages() {
		return this.images;
	}

	public void setImages(List<Images> images) {
		this.images = images;	
		if (images != null) {
			putBodyParameter("Images" , new Gson().toJson(images));
		}	
	}

	public Long getDbId() {
		return this.dbId;
	}

	public void setDbId(Long dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putBodyParameter("DbId", dbId.toString());
		}
	}

	public static class Images {

		@SerializedName("ImageURL")
		private String imageURL;

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
	}

	@Override
	public Class<SearchBodyTraceResponse> getResponseClass() {
		return SearchBodyTraceResponse.class;
	}

}
