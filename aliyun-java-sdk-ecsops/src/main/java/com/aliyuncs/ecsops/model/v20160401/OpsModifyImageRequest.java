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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyImageRequest extends RpcAcsRequest<OpsModifyImageResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private String description;

	private Boolean needD2sFix;

	private String operator;

	private String imageCategory;

	private Boolean topSpeed;

	private Boolean quickBoot;

	private Long imageBit;

	private String bootMode;

	private Boolean soundDevice;

	private String imageName;

	private String isPublic;

	private Boolean fakeCpuModel;

	private Boolean dhcp;

	private Boolean innerResize;

	private Boolean innerPassword;

	private Boolean cloudInit;

	private Long osTypeId;

	private Boolean ignoreOSLicense;

	private Integer imageSize;

	private Long virtBaseImageId;

	private String imageVersion;

	private String auditParamStr;
	public OpsModifyImageRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyImage", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getNeedD2sFix() {
		return this.needD2sFix;
	}

	public void setNeedD2sFix(Boolean needD2sFix) {
		this.needD2sFix = needD2sFix;
		if(needD2sFix != null){
			putQueryParameter("NeedD2sFix", needD2sFix.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getImageCategory() {
		return this.imageCategory;
	}

	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
		if(imageCategory != null){
			putQueryParameter("ImageCategory", imageCategory);
		}
	}

	public Boolean getTopSpeed() {
		return this.topSpeed;
	}

	public void setTopSpeed(Boolean topSpeed) {
		this.topSpeed = topSpeed;
		if(topSpeed != null){
			putQueryParameter("TopSpeed", topSpeed.toString());
		}
	}

	public Boolean getQuickBoot() {
		return this.quickBoot;
	}

	public void setQuickBoot(Boolean quickBoot) {
		this.quickBoot = quickBoot;
		if(quickBoot != null){
			putQueryParameter("QuickBoot", quickBoot.toString());
		}
	}

	public Long getImageBit() {
		return this.imageBit;
	}

	public void setImageBit(Long imageBit) {
		this.imageBit = imageBit;
		if(imageBit != null){
			putQueryParameter("ImageBit", imageBit.toString());
		}
	}

	public String getBootMode() {
		return this.bootMode;
	}

	public void setBootMode(String bootMode) {
		this.bootMode = bootMode;
		if(bootMode != null){
			putQueryParameter("BootMode", bootMode);
		}
	}

	public Boolean getSoundDevice() {
		return this.soundDevice;
	}

	public void setSoundDevice(Boolean soundDevice) {
		this.soundDevice = soundDevice;
		if(soundDevice != null){
			putQueryParameter("SoundDevice", soundDevice.toString());
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

	public String getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
		if(isPublic != null){
			putQueryParameter("IsPublic", isPublic);
		}
	}

	public Boolean getFakeCpuModel() {
		return this.fakeCpuModel;
	}

	public void setFakeCpuModel(Boolean fakeCpuModel) {
		this.fakeCpuModel = fakeCpuModel;
		if(fakeCpuModel != null){
			putQueryParameter("FakeCpuModel", fakeCpuModel.toString());
		}
	}

	public Boolean getDhcp() {
		return this.dhcp;
	}

	public void setDhcp(Boolean dhcp) {
		this.dhcp = dhcp;
		if(dhcp != null){
			putQueryParameter("Dhcp", dhcp.toString());
		}
	}

	public Boolean getInnerResize() {
		return this.innerResize;
	}

	public void setInnerResize(Boolean innerResize) {
		this.innerResize = innerResize;
		if(innerResize != null){
			putQueryParameter("InnerResize", innerResize.toString());
		}
	}

	public Boolean getInnerPassword() {
		return this.innerPassword;
	}

	public void setInnerPassword(Boolean innerPassword) {
		this.innerPassword = innerPassword;
		if(innerPassword != null){
			putQueryParameter("InnerPassword", innerPassword.toString());
		}
	}

	public Boolean getCloudInit() {
		return this.cloudInit;
	}

	public void setCloudInit(Boolean cloudInit) {
		this.cloudInit = cloudInit;
		if(cloudInit != null){
			putQueryParameter("CloudInit", cloudInit.toString());
		}
	}

	public Long getOsTypeId() {
		return this.osTypeId;
	}

	public void setOsTypeId(Long osTypeId) {
		this.osTypeId = osTypeId;
		if(osTypeId != null){
			putQueryParameter("OsTypeId", osTypeId.toString());
		}
	}

	public Boolean getIgnoreOSLicense() {
		return this.ignoreOSLicense;
	}

	public void setIgnoreOSLicense(Boolean ignoreOSLicense) {
		this.ignoreOSLicense = ignoreOSLicense;
		if(ignoreOSLicense != null){
			putQueryParameter("IgnoreOSLicense", ignoreOSLicense.toString());
		}
	}

	public Integer getImageSize() {
		return this.imageSize;
	}

	public void setImageSize(Integer imageSize) {
		this.imageSize = imageSize;
		if(imageSize != null){
			putQueryParameter("ImageSize", imageSize.toString());
		}
	}

	public Long getVirtBaseImageId() {
		return this.virtBaseImageId;
	}

	public void setVirtBaseImageId(Long virtBaseImageId) {
		this.virtBaseImageId = virtBaseImageId;
		if(virtBaseImageId != null){
			putQueryParameter("VirtBaseImageId", virtBaseImageId.toString());
		}
	}

	public String getImageVersion() {
		return this.imageVersion;
	}

	public void setImageVersion(String imageVersion) {
		this.imageVersion = imageVersion;
		if(imageVersion != null){
			putQueryParameter("ImageVersion", imageVersion);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsModifyImageResponse> getResponseClass() {
		return OpsModifyImageResponse.class;
	}

}
