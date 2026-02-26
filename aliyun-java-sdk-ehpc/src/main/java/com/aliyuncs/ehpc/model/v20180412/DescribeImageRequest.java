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
public class DescribeImageRequest extends RpcAcsRequest<DescribeImageResponse> {
	   

	private String clusterId;

	private String repository;

	private String containerType;

	private String imageTag;
	public DescribeImageRequest() {
		super("EHPC", "2018-04-12", "DescribeImage", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getRepository() {
		return this.repository;
	}

	public void setRepository(String repository) {
		this.repository = repository;
		if(repository != null){
			putQueryParameter("Repository", repository);
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
