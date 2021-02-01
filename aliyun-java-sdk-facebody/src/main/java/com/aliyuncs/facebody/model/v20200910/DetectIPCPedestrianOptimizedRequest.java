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

package com.aliyuncs.facebody.model.v20200910;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectIPCPedestrianOptimizedRequest extends RoaAcsRequest<DetectIPCPedestrianOptimizedResponse> {
	   

	private String imageData;

	private Long width;

	private Long height;
	public DetectIPCPedestrianOptimizedRequest() {
		super("facebody", "2020-09-10", "DetectIPCPedestrianOptimized", "facebody");
		setUriPattern("/viapi/k8s/facebody/detect-ipc-pedestrian-optimized");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageData() {
		return this.imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
		if(imageData != null){
			putBodyParameter("imageData", imageData);
		}
	}

	public Long getWidth() {
		return this.width;
	}

	public void setWidth(Long width) {
		this.width = width;
		if(width != null){
			putBodyParameter("width", width.toString());
		}
	}

	public Long getHeight() {
		return this.height;
	}

	public void setHeight(Long height) {
		this.height = height;
		if(height != null){
			putBodyParameter("height", height.toString());
		}
	}

	@Override
	public Class<DetectIPCPedestrianOptimizedResponse> getResponseClass() {
		return DetectIPCPedestrianOptimizedResponse.class;
	}

}
