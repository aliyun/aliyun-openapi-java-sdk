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
package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeImagesRequest extends RoaAcsRequest<DescribeImagesResponse> {
	
	public DescribeImagesRequest() {
		super("CS", "2015-12-15", "DescribeImages");
		setUriPattern("/images");
		setMethod(MethodType.GET);
	}

	private String imageName;

	private String dockerVersion;

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getDockerVersion() {
		return this.dockerVersion;
	}

	public void setDockerVersion(String dockerVersion) {
		this.dockerVersion = dockerVersion;
		if(dockerVersion != null){
			putQueryParameter("DockerVersion", dockerVersion);
		}
	}

	@Override
	public Class<DescribeImagesResponse> getResponseClass() {
		return DescribeImagesResponse.class;
	}

}
