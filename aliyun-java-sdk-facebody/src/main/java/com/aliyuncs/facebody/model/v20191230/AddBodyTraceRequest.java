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
public class AddBodyTraceRequest extends RpcAcsRequest<AddBodyTraceResponse> {
	   

	private String extraData;

	private Long personId;

	@SerializedName("images")
	private List<Images> images;

	private Long dbId;
	public AddBodyTraceRequest() {
		super("facebody", "2019-12-30", "AddBodyTrace");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
		if(extraData != null){
			putBodyParameter("ExtraData", extraData);
		}
	}

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
		if(personId != null){
			putBodyParameter("PersonId", personId.toString());
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

		@SerializedName("ImageData")
		private String imageData;

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

		public String getImageData() {
			return this.imageData;
		}

		public void setImageData(String imageData) {
			this.imageData = imageData;
		}
	}

	@Override
	public Class<AddBodyTraceResponse> getResponseClass() {
		return AddBodyTraceResponse.class;
	}

}
