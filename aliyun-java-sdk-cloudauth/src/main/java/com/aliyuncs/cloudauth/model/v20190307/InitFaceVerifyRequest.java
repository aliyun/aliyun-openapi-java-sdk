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
	   

	private String productCode;

	private String faceContrastPicture;

	private String userId;

	private String certifyId;

	private String certNo;

	private String outerOrderNo;

	private String certType;

	private String faceContrastPictureUrl;

	private String metaInfo;

	private String ossObjectName;

	private String certName;

	private String ip;

	private String mobile;

	private Long sceneId;

	private String ossBucketName;

	private String returnUrl;
	public InitFaceVerifyRequest() {
		super("Cloudauth", "2019-03-07", "InitFaceVerify", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getFaceContrastPicture() {
		return this.faceContrastPicture;
	}

	public void setFaceContrastPicture(String faceContrastPicture) {
		this.faceContrastPicture = faceContrastPicture;
		if(faceContrastPicture != null){
			putBodyParameter("FaceContrastPicture", faceContrastPicture);
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

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putQueryParameter("OuterOrderNo", outerOrderNo);
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

	public String getFaceContrastPictureUrl() {
		return this.faceContrastPictureUrl;
	}

	public void setFaceContrastPictureUrl(String faceContrastPictureUrl) {
		this.faceContrastPictureUrl = faceContrastPictureUrl;
		if(faceContrastPictureUrl != null){
			putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
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

	public String getOssObjectName() {
		return this.ossObjectName;
	}

	public void setOssObjectName(String ossObjectName) {
		this.ossObjectName = ossObjectName;
		if(ossObjectName != null){
			putQueryParameter("OssObjectName", ossObjectName);
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

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
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

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		if(returnUrl != null){
			putQueryParameter("ReturnUrl", returnUrl);
		}
	}

	@Override
	public Class<InitFaceVerifyResponse> getResponseClass() {
		return InitFaceVerifyResponse.class;
	}

}
