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
public class UploadImageRequest extends RpcAcsRequest<UploadImageResponse> {
	   

	private Boolean enableSecurityCheck;

	private Boolean gpuCategory;

	private String description;

	private String ossObjectPath;

	private String imageName;

	private String licenseType;

	private String osType;

	private Integer dataDiskSize;

	private String protocolType;

	private String gpuDriverType;
	public UploadImageRequest() {
		super("ecd", "2020-09-30", "UploadImage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getEnableSecurityCheck() {
		return this.enableSecurityCheck;
	}

	public void setEnableSecurityCheck(Boolean enableSecurityCheck) {
		this.enableSecurityCheck = enableSecurityCheck;
		if(enableSecurityCheck != null){
			putQueryParameter("EnableSecurityCheck", enableSecurityCheck.toString());
		}
	}

	public Boolean getGpuCategory() {
		return this.gpuCategory;
	}

	public void setGpuCategory(Boolean gpuCategory) {
		this.gpuCategory = gpuCategory;
		if(gpuCategory != null){
			putQueryParameter("GpuCategory", gpuCategory.toString());
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

	public String getOssObjectPath() {
		return this.ossObjectPath;
	}

	public void setOssObjectPath(String ossObjectPath) {
		this.ossObjectPath = ossObjectPath;
		if(ossObjectPath != null){
			putQueryParameter("OssObjectPath", ossObjectPath);
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

	public String getLicenseType() {
		return this.licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
		if(licenseType != null){
			putQueryParameter("LicenseType", licenseType);
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

	public Integer getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(Integer dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
		if(dataDiskSize != null){
			putQueryParameter("DataDiskSize", dataDiskSize.toString());
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public String getGpuDriverType() {
		return this.gpuDriverType;
	}

	public void setGpuDriverType(String gpuDriverType) {
		this.gpuDriverType = gpuDriverType;
		if(gpuDriverType != null){
			putQueryParameter("GpuDriverType", gpuDriverType);
		}
	}

	@Override
	public Class<UploadImageResponse> getResponseClass() {
		return UploadImageResponse.class;
	}

}
