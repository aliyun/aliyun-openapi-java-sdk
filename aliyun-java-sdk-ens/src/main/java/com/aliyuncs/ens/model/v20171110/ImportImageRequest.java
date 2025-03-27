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
public class ImportImageRequest extends RpcAcsRequest<ImportImageResponse> {
	   

	private String computeType;

	private String oSSBucket;

	private String oSVersion;

	private String diskDeviceMapping;

	private String oSSRegion;

	private String oSSObject;

	private String platform;

	private String imageName;

	private String imageFormat;

	private String architecture;

	private String oSType;

	private String targetOSSRegionId;
	public ImportImageRequest() {
		super("Ens", "2017-11-10", "ImportImage", "ens");
		setMethod(MethodType.POST);
	}

	public String getComputeType() {
		return this.computeType;
	}

	public void setComputeType(String computeType) {
		this.computeType = computeType;
		if(computeType != null){
			putQueryParameter("ComputeType", computeType);
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

	public String getOSVersion() {
		return this.oSVersion;
	}

	public void setOSVersion(String oSVersion) {
		this.oSVersion = oSVersion;
		if(oSVersion != null){
			putQueryParameter("OSVersion", oSVersion);
		}
	}

	public String getDiskDeviceMapping() {
		return this.diskDeviceMapping;
	}

	public void setDiskDeviceMapping(String diskDeviceMapping) {
		this.diskDeviceMapping = diskDeviceMapping;
		if(diskDeviceMapping != null){
			putQueryParameter("DiskDeviceMapping", diskDeviceMapping);
		}
	}

	public String getOSSRegion() {
		return this.oSSRegion;
	}

	public void setOSSRegion(String oSSRegion) {
		this.oSSRegion = oSSRegion;
		if(oSSRegion != null){
			putQueryParameter("OSSRegion", oSSRegion);
		}
	}

	public String getOSSObject() {
		return this.oSSObject;
	}

	public void setOSSObject(String oSSObject) {
		this.oSSObject = oSSObject;
		if(oSSObject != null){
			putQueryParameter("OSSObject", oSSObject);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
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

	public String getImageFormat() {
		return this.imageFormat;
	}

	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
		if(imageFormat != null){
			putQueryParameter("ImageFormat", imageFormat);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
		}
	}

	public String getOSType() {
		return this.oSType;
	}

	public void setOSType(String oSType) {
		this.oSType = oSType;
		if(oSType != null){
			putQueryParameter("OSType", oSType);
		}
	}

	public String getTargetOSSRegionId() {
		return this.targetOSSRegionId;
	}

	public void setTargetOSSRegionId(String targetOSSRegionId) {
		this.targetOSSRegionId = targetOSSRegionId;
		if(targetOSSRegionId != null){
			putQueryParameter("TargetOSSRegionId", targetOSSRegionId);
		}
	}

	@Override
	public Class<ImportImageResponse> getResponseClass() {
		return ImportImageResponse.class;
	}

}
