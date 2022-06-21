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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddDbCustomImageRequest extends RpcAcsRequest<AddDbCustomImageResponse> {
	   

	private String imageId;

	private String copyUserId;

	private String description;

	private String osType;

	private String resourceImageName;

	private String site;

	private String name;

	private String resourceImageVersion;
	public AddDbCustomImageRequest() {
		super("SWAS", "2017-08-10", "AddDbCustomImage", "SWAS");
		setMethod(MethodType.POST);
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

	public String getCopyUserId() {
		return this.copyUserId;
	}

	public void setCopyUserId(String copyUserId) {
		this.copyUserId = copyUserId;
		if(copyUserId != null){
			putQueryParameter("CopyUserId", copyUserId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getResourceImageName() {
		return this.resourceImageName;
	}

	public void setResourceImageName(String resourceImageName) {
		this.resourceImageName = resourceImageName;
		if(resourceImageName != null){
			putQueryParameter("ResourceImageName", resourceImageName);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getResourceImageVersion() {
		return this.resourceImageVersion;
	}

	public void setResourceImageVersion(String resourceImageVersion) {
		this.resourceImageVersion = resourceImageVersion;
		if(resourceImageVersion != null){
			putQueryParameter("ResourceImageVersion", resourceImageVersion);
		}
	}

	@Override
	public Class<AddDbCustomImageResponse> getResponseClass() {
		return AddDbCustomImageResponse.class;
	}

}
