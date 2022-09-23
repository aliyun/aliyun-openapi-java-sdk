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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetUserImageRequest extends RpcAcsRequest<GetUserImageResponse> {
	   

	private String oSSBucket;

	private String oSSEndPoint;

	private String clusterId;

	private String containerType;

	private String imagePath;

	private String imageName;
	public GetUserImageRequest() {
		super("EHPC", "2018-04-12", "GetUserImage");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOSSBucket() {
		return this.oSSBucket;
	}

	public void setOSSBucket(String oSSBucket) {
		this.oSSBucket = oSSBucket;
		if(oSSBucket != null){
			putQueryParameter("OSSBucket", oSSBucket);
		}
	}

	public String getOSSEndPoint() {
		return this.oSSEndPoint;
	}

	public void setOSSEndPoint(String oSSEndPoint) {
		this.oSSEndPoint = oSSEndPoint;
		if(oSSEndPoint != null){
			putQueryParameter("OSSEndPoint", oSSEndPoint);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getContainerType() {
		return this.containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
		if(containerType != null){
			putQueryParameter("ContainerType", containerType);
		}
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
		if(imagePath != null){
			putQueryParameter("ImagePath", imagePath);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	@Override
	public Class<GetUserImageResponse> getResponseClass() {
		return GetUserImageResponse.class;
	}

}
