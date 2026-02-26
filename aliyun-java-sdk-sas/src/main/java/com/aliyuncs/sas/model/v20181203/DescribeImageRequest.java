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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageRequest extends RpcAcsRequest<DescribeImageResponse> {
	   

	private String imageInstanceId;

	private String imageRegionId;

	private String imageRepoId;

	private String imageTag;
	public DescribeImageRequest() {
		super("Sas", "2018-12-03", "DescribeImage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageInstanceId() {
		return this.imageInstanceId;
	}

	public void setImageInstanceId(String imageInstanceId) {
		this.imageInstanceId = imageInstanceId;
		if(imageInstanceId != null){
			putQueryParameter("ImageInstanceId", imageInstanceId);
		}
	}

	public String getImageRegionId() {
		return this.imageRegionId;
	}

	public void setImageRegionId(String imageRegionId) {
		this.imageRegionId = imageRegionId;
		if(imageRegionId != null){
			putQueryParameter("ImageRegionId", imageRegionId);
		}
	}

	public String getImageRepoId() {
		return this.imageRepoId;
	}

	public void setImageRepoId(String imageRepoId) {
		this.imageRepoId = imageRepoId;
		if(imageRepoId != null){
			putQueryParameter("ImageRepoId", imageRepoId);
		}
	}

	public String getImageTag() {
		return this.imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
		if(imageTag != null){
			putQueryParameter("ImageTag", imageTag);
		}
	}

	@Override
	public Class<DescribeImageResponse> getResponseClass() {
		return DescribeImageResponse.class;
	}

}
