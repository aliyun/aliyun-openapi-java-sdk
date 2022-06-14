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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CopyImageRequest extends RpcAcsRequest<CopyImageResponse> {
	   

	private String imageId;

	private String destinationImageName;

	private String destinationRegionId;

	private String destinationDescription;
	public CopyImageRequest() {
		super("ecd", "2020-09-30", "CopyImage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getDestinationImageName() {
		return this.destinationImageName;
	}

	public void setDestinationImageName(String destinationImageName) {
		this.destinationImageName = destinationImageName;
		if(destinationImageName != null){
			putQueryParameter("DestinationImageName", destinationImageName);
		}
	}

	public String getDestinationRegionId() {
		return this.destinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
		if(destinationRegionId != null){
			putQueryParameter("DestinationRegionId", destinationRegionId);
		}
	}

	public String getDestinationDescription() {
		return this.destinationDescription;
	}

	public void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
		if(destinationDescription != null){
			putQueryParameter("DestinationDescription", destinationDescription);
		}
	}

	@Override
	public Class<CopyImageResponse> getResponseClass() {
		return CopyImageResponse.class;
	}

}
