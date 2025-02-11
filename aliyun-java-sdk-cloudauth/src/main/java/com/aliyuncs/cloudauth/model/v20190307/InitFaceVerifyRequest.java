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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InitFaceVerifyRequest extends RpcAcsRequest<InitFaceVerifyResponse> {
	   

	private String faceContrastPicture;

	private String readImg;

	private String rarelyCharacters;

	private String voluntaryCustomizedContent;

	private String userId;

	private String encryptType;

	private String mode;

	private String outerOrderNo;

	private String faceContrastPictureUrl;

	private String model;

	private String certifyUrlStyle;

	private String metaInfo;

	private String cameraSelection;

	private String validityDate;

	private String certName;

	private String ip;

	private Long sceneId;

	private String ossBucketName;

	private String crop;

	private String certifyUrlType;

	private String birthday;

	private String productCode;

	private String videoEvidence;

	private String certifyId;

	private String certNo;

	private String certType;

	private String suitableType;

	private String ossObjectName;

	private String appQualityCheck;

	private String mobile;

	private String faceGuardOutput;

	private String authId;

	private String procedurePriority;

	private String callbackToken;

	private String uiCustomUrl;

	private String returnUrl;

	private String callbackUrl;
	public InitFaceVerifyRequest() {
		super("Cloudauth", "2019-03-07", "InitFaceVerify", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceContrastPicture() {
		return this.faceContrastPicture;
	}

	public void setFaceContrastPicture(String faceContrastPicture) {
		this.faceContrastPicture = faceContrastPicture;
		if(faceContrastPicture != null){
			putBodyParameter("FaceContrastPicture", faceContrastPicture);
		}
	}

	public String getReadImg() {
		return this.readImg;
	}

	public void setReadImg(String readImg) {
		this.readImg = readImg;
		if(readImg != null){
			putQueryParameter("ReadImg", readImg);
		}
	}

	public String getRarelyCharacters() {
		return this.rarelyCharacters;
	}

	public void setRarelyCharacters(String rarelyCharacters) {
		this.rarelyCharacters = rarelyCharacters;
		if(rarelyCharacters != null){
			putQueryParameter("RarelyCharacters", rarelyCharacters);
		}
	}

	public String getVoluntaryCustomizedContent() {
		return this.voluntaryCustomizedContent;
	}

	public void setVoluntaryCustomizedContent(String voluntaryCustomizedContent) {
		this.voluntaryCustomizedContent = voluntaryCustomizedContent;
		if(voluntaryCustomizedContent != null){
			putQueryParameter("VoluntaryCustomizedContent", voluntaryCustomizedContent);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getEncryptType() {
		return this.encryptType;
	}

	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
		if(encryptType != null){
			putQueryParameter("EncryptType", encryptType);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putQueryParameter("OuterOrderNo", outerOrderNo);
		}
	}

	public String getFaceContrastPictureUrl() {
		return this.faceContrastPictureUrl;
	}

	public void setFaceContrastPictureUrl(String faceContrastPictureUrl) {
		this.faceContrastPictureUrl = faceContrastPictureUrl;
		if(faceContrastPictureUrl != null){
			putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getCertifyUrlStyle() {
		return this.certifyUrlStyle;
	}

	public void setCertifyUrlStyle(String certifyUrlStyle) {
		this.certifyUrlStyle = certifyUrlStyle;
		if(certifyUrlStyle != null){
			putQueryParameter("CertifyUrlStyle", certifyUrlStyle);
		}
	}

	public String getMetaInfo() {
		return this.metaInfo;
	}

	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
		if(metaInfo != null){
			putQueryParameter("MetaInfo", metaInfo);
		}
	}

	public String getCameraSelection() {
		return this.cameraSelection;
	}

	public void setCameraSelection(String cameraSelection) {
		this.cameraSelection = cameraSelection;
		if(cameraSelection != null){
			putQueryParameter("CameraSelection", cameraSelection);
		}
	}

	public String getValidityDate() {
		return this.validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
		if(validityDate != null){
			putQueryParameter("ValidityDate", validityDate);
		}
	}

	public String getCertName() {
		return this.certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
		if(certName != null){
			putQueryParameter("CertName", certName);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId.toString());
		}
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
		if(ossBucketName != null){
			putQueryParameter("OssBucketName", ossBucketName);
		}
	}

	public String getCrop() {
		return this.crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
		if(crop != null){
			putBodyParameter("Crop", crop);
		}
	}

	public String getCertifyUrlType() {
		return this.certifyUrlType;
	}

	public void setCertifyUrlType(String certifyUrlType) {
		this.certifyUrlType = certifyUrlType;
		if(certifyUrlType != null){
			putQueryParameter("CertifyUrlType", certifyUrlType);
		}
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
		if(birthday != null){
			putQueryParameter("Birthday", birthday);
		}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getVideoEvidence() {
		return this.videoEvidence;
	}

	public void setVideoEvidence(String videoEvidence) {
		this.videoEvidence = videoEvidence;
		if(videoEvidence != null){
			putQueryParameter("VideoEvidence", videoEvidence);
		}
	}

	public String getCertifyId() {
		return this.certifyId;
	}

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
		if(certifyId != null){
			putQueryParameter("CertifyId", certifyId);
		}
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
		if(certNo != null){
			putQueryParameter("CertNo", certNo);
		}
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
		if(certType != null){
			putQueryParameter("CertType", certType);
		}
	}

	public String getSuitableType() {
		return this.suitableType;
	}

	public void setSuitableType(String suitableType) {
		this.suitableType = suitableType;
		if(suitableType != null){
			putQueryParameter("SuitableType", suitableType);
		}
	}

	public String getOssObjectName() {
		return this.ossObjectName;
	}

	public void setOssObjectName(String ossObjectName) {
		this.ossObjectName = ossObjectName;
		if(ossObjectName != null){
			putQueryParameter("OssObjectName", ossObjectName);
		}
	}

	public String getAppQualityCheck() {
		return this.appQualityCheck;
	}

	public void setAppQualityCheck(String appQualityCheck) {
		this.appQualityCheck = appQualityCheck;
		if(appQualityCheck != null){
			putQueryParameter("AppQualityCheck", appQualityCheck);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
		}
	}

	public String getFaceGuardOutput() {
		return this.faceGuardOutput;
	}

	public void setFaceGuardOutput(String faceGuardOutput) {
		this.faceGuardOutput = faceGuardOutput;
		if(faceGuardOutput != null){
			putQueryParameter("FaceGuardOutput", faceGuardOutput);
		}
	}

	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
		if(authId != null){
			putBodyParameter("AuthId", authId);
		}
	}

	public String getProcedurePriority() {
		return this.procedurePriority;
	}

	public void setProcedurePriority(String procedurePriority) {
		this.procedurePriority = procedurePriority;
		if(procedurePriority != null){
			putQueryParameter("ProcedurePriority", procedurePriority);
		}
	}

	public String getCallbackToken() {
		return this.callbackToken;
	}

	public void setCallbackToken(String callbackToken) {
		this.callbackToken = callbackToken;
		if(callbackToken != null){
			putQueryParameter("CallbackToken", callbackToken);
		}
	}

	public String getUiCustomUrl() {
		return this.uiCustomUrl;
	}

	public void setUiCustomUrl(String uiCustomUrl) {
		this.uiCustomUrl = uiCustomUrl;
		if(uiCustomUrl != null){
			putQueryParameter("UiCustomUrl", uiCustomUrl);
		}
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		if(returnUrl != null){
			putQueryParameter("ReturnUrl", returnUrl);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	@Override
	public Class<InitFaceVerifyResponse> getResponseClass() {
		return InitFaceVerifyResponse.class;
	}

}
