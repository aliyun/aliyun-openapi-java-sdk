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

package com.aliyuncs.goodstech.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.goodstech.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFurnitureSpuRequest extends RpcAcsRequest<RecognizeFurnitureSpuResponse> {
	   

	private Float xLength;

	private Float zLength;

	private String imageURL;

	private Float yLength;
	public RecognizeFurnitureSpuRequest() {
		super("goodstech", "2019-12-30", "RecognizeFurnitureSpu", "goodstech");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getXLength() {
		return this.xLength;
	}

	public void setXLength(Float xLength) {
		this.xLength = xLength;
		if(xLength != null){
			putBodyParameter("XLength", xLength.toString());
		}
	}

	public Float getZLength() {
		return this.zLength;
	}

	public void setZLength(Float zLength) {
		this.zLength = zLength;
		if(zLength != null){
			putBodyParameter("ZLength", zLength.toString());
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

	public Float getYLength() {
		return this.yLength;
	}

	public void setYLength(Float yLength) {
		this.yLength = yLength;
		if(yLength != null){
			putBodyParameter("YLength", yLength.toString());
		}
	}

	@Override
	public Class<RecognizeFurnitureSpuResponse> getResponseClass() {
		return RecognizeFurnitureSpuResponse.class;
	}

}
