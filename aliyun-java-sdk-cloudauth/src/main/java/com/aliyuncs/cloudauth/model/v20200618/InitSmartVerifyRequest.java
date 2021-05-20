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

package com.aliyuncs.cloudauth.model.v20200618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InitSmartVerifyRequest extends RpcAcsRequest<InitSmartVerifyResponse> {
	   

	private String idName;

	private String userId;

	private String certifyId;

	private String facePictureBase64;

	private String mode;

	private String certNo;

	private String outerOrderNo;

	private String certType;

	private String metaInfo;

	private String ocr;

	private String ossObjectName;

	private String facePictureUrl;

	private String ip;

	private String certName;

	private String mobile;

	private String idNo;

	private Long sceneId;

	private String callbackToken;

	private String ossBucketName;

	private String callbackUrl;
	public InitSmartVerifyRequest() {
		super("Cloudauth", "2020-06-18", "InitSmartVerify", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdName() {
		return this.idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
		if(idName != null){
			putBodyParameter("IdName", idName);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getCertifyId() {
		return this.certifyId;
	}

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
		if(certifyId != null){
			putBodyParameter("CertifyId", certifyId);
		}
	}

	public String getFacePictureBase64() {
		return this.facePictureBase64;
	}

	public void setFacePictureBase64(String facePictureBase64) {
		this.facePictureBase64 = facePictureBase64;
		if(facePictureBase64 != null){
			putBodyParameter("FacePictureBase64", facePictureBase64);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
		if(certNo != null){
			putBodyParameter("CertNo", certNo);
		}
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putBodyParameter("OuterOrderNo", outerOrderNo);
		}
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
		if(certType != null){
			putBodyParameter("CertType", certType);
		}
	}

	public String getMetaInfo() {
		return this.metaInfo;
	}

	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
		if(metaInfo != null){
			putBodyParameter("MetaInfo", metaInfo);
		}
	}

	public String getOcr() {
		return this.ocr;
	}

	public void setOcr(String ocr) {
		this.ocr = ocr;
		if(ocr != null){
			putBodyParameter("Ocr", ocr);
		}
	}

	public String getOssObjectName() {
		return this.ossObjectName;
	}

	public void setOssObjectName(String ossObjectName) {
		this.ossObjectName = ossObjectName;
		if(ossObjectName != null){
			putBodyParameter("OssObjectName", ossObjectName);
		}
	}

	public String getFacePictureUrl() {
		return this.facePictureUrl;
	}

	public void setFacePictureUrl(String facePictureUrl) {
		this.facePictureUrl = facePictureUrl;
		if(facePictureUrl != null){
			putBodyParameter("FacePictureUrl", facePictureUrl);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putBodyParameter("Ip", ip);
		}
	}

	public String getCertName() {
		return this.certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
		if(certName != null){
			putBodyParameter("CertName", certName);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putBodyParameter("Mobile", mobile);
		}
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
		if(idNo != null){
			putBodyParameter("IdNo", idNo);
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putBodyParameter("SceneId", sceneId.toString());
		}
	}

	public String getCallbackToken() {
		return this.callbackToken;
	}

	public void setCallbackToken(String callbackToken) {
		this.callbackToken = callbackToken;
		if(callbackToken != null){
			putBodyParameter("CallbackToken", callbackToken);
		}
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
		if(ossBucketName != null){
			putBodyParameter("OssBucketName", ossBucketName);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putBodyParameter("CallbackUrl", callbackUrl);
		}
	}

	@Override
	public Class<InitSmartVerifyResponse> getResponseClass() {
		return InitSmartVerifyResponse.class;
	}

}
