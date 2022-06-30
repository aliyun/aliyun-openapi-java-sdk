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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FaceBeautyRequest extends RpcAcsRequest<FaceBeautyResponse> {
	   

	private Float white;

	private Float smooth;

	private Float sharp;

	private String imageURL;
	public FaceBeautyRequest() {
		super("facebody", "2019-12-30", "FaceBeauty", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getWhite() {
		return this.white;
	}

	public void setWhite(Float white) {
		this.white = white;
		if(white != null){
			putBodyParameter("White", white.toString());
		}
	}

	public Float getSmooth() {
		return this.smooth;
	}

	public void setSmooth(Float smooth) {
		this.smooth = smooth;
		if(smooth != null){
			putBodyParameter("Smooth", smooth.toString());
		}
	}

	public Float getSharp() {
		return this.sharp;
	}

	public void setSharp(Float sharp) {
		this.sharp = sharp;
		if(sharp != null){
			putBodyParameter("Sharp", sharp.toString());
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

	@Override
	public Class<FaceBeautyResponse> getResponseClass() {
		return FaceBeautyResponse.class;
	}

}
