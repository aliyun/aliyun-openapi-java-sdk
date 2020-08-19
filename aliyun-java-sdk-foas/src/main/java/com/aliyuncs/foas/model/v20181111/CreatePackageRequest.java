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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePackageRequest extends RoaAcsRequest<CreatePackageResponse> {
	   

	private String projectName;

	private String ossBucket;

	private String ossOwner;

	private String packageName;

	private String ossEndpoint;

	private String description;

	private String tag;

	private String originName;

	private String type;

	private String ossPath;

	private String md5;
	public CreatePackageRequest() {
		super("foas", "2018-11-11", "CreatePackage", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/packages");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putPathParameter("projectName", projectName);
		}
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putBodyParameter("ossBucket", ossBucket);
		}
	}

	public String getOssOwner() {
		return this.ossOwner;
	}

	public void setOssOwner(String ossOwner) {
		this.ossOwner = ossOwner;
		if(ossOwner != null){
			putBodyParameter("ossOwner", ossOwner);
		}
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
		if(packageName != null){
			putBodyParameter("packageName", packageName);
		}
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putBodyParameter("ossEndpoint", ossEndpoint);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("description", description);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putBodyParameter("tag", tag);
		}
	}

	public String getOriginName() {
		return this.originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
		if(originName != null){
			putBodyParameter("originName", originName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("type", type);
		}
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
		if(ossPath != null){
			putBodyParameter("ossPath", ossPath);
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putBodyParameter("md5", md5);
		}
	}

	@Override
	public Class<CreatePackageResponse> getResponseClass() {
		return CreatePackageResponse.class;
	}

}
