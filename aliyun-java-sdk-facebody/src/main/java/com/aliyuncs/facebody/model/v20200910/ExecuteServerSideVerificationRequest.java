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

package com.aliyuncs.facebody.model.v20200910;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecuteServerSideVerificationRequest extends RoaAcsRequest<ExecuteServerSideVerificationResponse> {
	   

	private String facialPictureData;

	private String sceneType;

	private String certificateNumber;

	private String certificateName;

	private String facialPictureUrl;
	public ExecuteServerSideVerificationRequest() {
		super("facebody", "2020-09-10", "ExecuteServerSideVerification", "facebody");
		setUriPattern("/viapi/thirdparty/realperson/execServerSideVerification");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFacialPictureData() {
		return this.facialPictureData;
	}

	public void setFacialPictureData(String facialPictureData) {
		this.facialPictureData = facialPictureData;
		if(facialPictureData != null){
			putBodyParameter("facialPictureData", facialPictureData);
		}
	}

	public String getSceneType() {
		return this.sceneType;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
		if(sceneType != null){
			putBodyParameter("sceneType", sceneType);
		}
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
		if(certificateNumber != null){
			putBodyParameter("certificateNumber", certificateNumber);
		}
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
		if(certificateName != null){
			putBodyParameter("certificateName", certificateName);
		}
	}

	public String getFacialPictureUrl() {
		return this.facialPictureUrl;
	}

	public void setFacialPictureUrl(String facialPictureUrl) {
		this.facialPictureUrl = facialPictureUrl;
		if(facialPictureUrl != null){
			putBodyParameter("facialPictureUrl", facialPictureUrl);
		}
	}

	@Override
	public Class<ExecuteServerSideVerificationResponse> getResponseClass() {
		return ExecuteServerSideVerificationResponse.class;
	}

}
