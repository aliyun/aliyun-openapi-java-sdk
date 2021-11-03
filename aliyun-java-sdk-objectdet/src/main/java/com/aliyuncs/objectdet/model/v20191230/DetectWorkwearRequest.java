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

package com.aliyuncs.objectdet.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.objectdet.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectWorkwearRequest extends RpcAcsRequest<DetectWorkwearResponse> {
	   

	@SerializedName("clothes")
	private Clothes clothes;

	private List<String> labelss;

	private String imageUrl;
	public DetectWorkwearRequest() {
		super("objectdet", "2019-12-30", "DetectWorkwear");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Clothes getClothes() {
		return this.clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;	
		if (clothes != null) {
			putBodyParameter("Clothes" , new Gson().toJson(clothes));
		}	
	}

	public List<String> getLabelss() {
		return this.labelss;
	}

	public void setLabelss(List<String> labelss) {
		this.labelss = labelss;	
		if (labelss != null) {
			for (int i = 0; i < labelss.size(); i++) {
				putBodyParameter("Labels." + (i + 1) , labelss.get(i));
			}
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

	public static class Clothes {

		@SerializedName("Threshold")
		private Double threshold;

		@SerializedName("MaxNum")
		private Long maxNum;

		public Double getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Double threshold) {
			this.threshold = threshold;
		}

		public Long getMaxNum() {
			return this.maxNum;
		}

		public void setMaxNum(Long maxNum) {
			this.maxNum = maxNum;
		}
	}

	@Override
	public Class<DetectWorkwearResponse> getResponseClass() {
		return DetectWorkwearResponse.class;
	}

}
