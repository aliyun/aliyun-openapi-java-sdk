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

package com.aliyuncs.imageenhan.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveImageSubtitlesRequest extends RpcAcsRequest<RemoveImageSubtitlesResponse> {
	   

	private Float bH;

	private Float bW;

	private Float bX;

	private String imageURL;

	private Float bY;
	public RemoveImageSubtitlesRequest() {
		super("imageenhan", "2019-09-30", "RemoveImageSubtitles", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getBH() {
		return this.bH;
	}

	public void setBH(Float bH) {
		this.bH = bH;
		if(bH != null){
			putBodyParameter("BH", bH.toString());
		}
	}

	public Float getBW() {
		return this.bW;
	}

	public void setBW(Float bW) {
		this.bW = bW;
		if(bW != null){
			putBodyParameter("BW", bW.toString());
		}
	}

	public Float getBX() {
		return this.bX;
	}

	public void setBX(Float bX) {
		this.bX = bX;
		if(bX != null){
			putBodyParameter("BX", bX.toString());
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

	public Float getBY() {
		return this.bY;
	}

	public void setBY(Float bY) {
		this.bY = bY;
		if(bY != null){
			putBodyParameter("BY", bY.toString());
		}
	}

	@Override
	public Class<RemoveImageSubtitlesResponse> getResponseClass() {
		return RemoveImageSubtitlesResponse.class;
	}

}
