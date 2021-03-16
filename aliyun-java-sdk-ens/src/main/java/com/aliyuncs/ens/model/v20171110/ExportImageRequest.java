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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExportImageRequest extends RpcAcsRequest<ExportImageResponse> {
	   

	private String oSSRegionId;

	private String oSSBucket;

	private String roleName;

	private String oSSPrefix;

	private String imageId;
	public ExportImageRequest() {
		super("Ens", "2017-11-10", "ExportImage");
		setMethod(MethodType.POST);
	}

	public String getOSSRegionId() {
		return this.oSSRegionId;
	}

	public void setOSSRegionId(String oSSRegionId) {
		this.oSSRegionId = oSSRegionId;
		if(oSSRegionId != null){
			putQueryParameter("OSSRegionId", oSSRegionId);
		}
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
		}
	}

	public String getOSSPrefix() {
		return this.oSSPrefix;
	}

	public void setOSSPrefix(String oSSPrefix) {
		this.oSSPrefix = oSSPrefix;
		if(oSSPrefix != null){
			putQueryParameter("OSSPrefix", oSSPrefix);
		}
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

	@Override
	public Class<ExportImageResponse> getResponseClass() {
		return ExportImageResponse.class;
	}

}
