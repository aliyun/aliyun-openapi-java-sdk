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
public class ContrastSmartVerifyRequest extends RpcAcsRequest<ContrastSmartVerifyResponse> {
	   

	private String facePicFile;

	private String ip;

	private String certName;

	private String facePicString;

	private String mobile;

	private String userId;

	private String mode;

	private String certNo;

	private String outerOrderNo;

	private String facePicUrl;

	private String certType;

	private Long sceneId;
	public ContrastSmartVerifyRequest() {
		super("Cloudauth", "2020-06-18", "ContrastSmartVerify", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFacePicFile() {
		return this.facePicFile;
	}

	public void setFacePicFile(String facePicFile) {
		this.facePicFile = facePicFile;
		if(facePicFile != null){
			putBodyParameter("FacePicFile", facePicFile);
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

	public String getFacePicString() {
		return this.facePicString;
	}

	public void setFacePicString(String facePicString) {
		this.facePicString = facePicString;
		if(facePicString != null){
			putBodyParameter("FacePicString", facePicString);
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
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

	public String getFacePicUrl() {
		return this.facePicUrl;
	}

	public void setFacePicUrl(String facePicUrl) {
		this.facePicUrl = facePicUrl;
		if(facePicUrl != null){
			putBodyParameter("FacePicUrl", facePicUrl);
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

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putBodyParameter("SceneId", sceneId.toString());
		}
	}

	@Override
	public Class<ContrastSmartVerifyResponse> getResponseClass() {
		return ContrastSmartVerifyResponse.class;
	}

}
