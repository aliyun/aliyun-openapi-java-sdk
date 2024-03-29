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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.objectdet.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectKitchenAnimalsRequest extends RpcAcsRequest<DetectKitchenAnimalsResponse> {
	   

	private String imageURLB;

	private String imageURLA;
	public DetectKitchenAnimalsRequest() {
		super("objectdet", "2019-12-30", "DetectKitchenAnimals");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageURLB() {
		return this.imageURLB;
	}

	public void setImageURLB(String imageURLB) {
		this.imageURLB = imageURLB;
		if(imageURLB != null){
			putBodyParameter("ImageURLB", imageURLB);
		}
	}

	public String getImageURLA() {
		return this.imageURLA;
	}

	public void setImageURLA(String imageURLA) {
		this.imageURLA = imageURLA;
		if(imageURLA != null){
			putBodyParameter("ImageURLA", imageURLA);
		}
	}

	@Override
	public Class<DetectKitchenAnimalsResponse> getResponseClass() {
		return DetectKitchenAnimalsResponse.class;
	}

}
